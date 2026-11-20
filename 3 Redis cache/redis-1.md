# Redis – Complete Notes with Practical Examples

## 1. What is Redis?

Redis (Remote Dictionary Server) is an in-memory data store used for storing data in RAM instead of relying on disk-based storage.

It is commonly used for:
- Caching
- Session management
- OTP storage
- Rate limiting
- Background job queues
- Real-time applications

**Example:**

Suppose an API fetches user details from MongoDB.

Without Redis:
1. User sends an API request.
2. Backend queries MongoDB.
3. MongoDB returns user details.
4. Backend sends the response.

With Redis:
1. User sends an API request.
2. Backend checks Redis first.
3. If data exists, Redis returns it.
4. Otherwise, backend fetches data from MongoDB.
5. Backend stores the result in Redis for future requests.

## 2. Redis vs MongoDB

| Redis | MongoDB |
|---|---|
| Primarily stores data in RAM | Primarily stores data on disk |
| Extremely fast data access | Suitable for persistent storage |
| Commonly used for caching | Commonly used as primary database |
| Supports TTL | Supports TTL indexes |
| Key-value data model | Document data model |

**Remember:** MongoDB is generally the permanent source of truth, while Redis is commonly used as a temporary, fast-access layer.

## 3. Redis Basic Commands

### SET – Store Data

```bash
SET username "Kirtan"
```

### GET – Retrieve Data

```bash
GET username
```

Output:
```bash
"Kirtan"
```

### DEL – Delete Data

```bash
DEL username
```

### EXISTS – Check Whether Key Exists

```bash
EXISTS username
```

### EXPIRE – Set Expiration Time

```bash
SET otp:987654 "123456"
EXPIRE otp:987654 60
```

The OTP automatically expires after 60 seconds.

### TTL – Check Remaining Expiration Time

```bash
TTL otp:987654
```

### INCR – Increment a Value

```bash
SET visits 0
INCR visits
INCR visits
```

Output:
```bash
2
```

## 4. Practical Example 1: API Caching

**Scenario:** An e-commerce application has a product API that receives thousands of requests.

Instead of querying MongoDB every time, cache the product details in Redis.

### Express.js Example

```javascript
const express = require("express");
const { createClient } = require("redis");

const app = express();

const redis = createClient({
    url: "redis://localhost:6379"
});

redis.on("error", (err) => console.log(err));

async function startServer() {
    await redis.connect();

    app.get("/products/:id", async (req, res) => {
        const productId = req.params.id;

        // 1. Check Redis cache
        const cachedProduct = await redis.get(
            `product:${productId}`
        );

        if (cachedProduct) {
            return res.json({
                source: "Redis",
                data: JSON.parse(cachedProduct)
            });
        }

        // 2. Fetch from MongoDB (example)
        const product = await Product.findById(productId);

        if (!product) {
            return res.status(404).json({
                message: "Product not found"
            });
        }

        // 3. Store in Redis for 5 minutes
        await redis.setEx(
            `product:${productId}`,
            300,
            JSON.stringify(product)
        );

        // 4. Return response
        res.json({
            source: "MongoDB",
            data: product
        });
    });

    app.listen(3000);
}

startServer();
```

**Execution:**

- First request → MongoDB fetch → Redis cache created.
- Second request → Redis fetch.
- After 5 minutes → Cache expires.
- Next request → MongoDB fetch again.

## 5. Practical Example 2: OTP Management

**Scenario:** A user requests an OTP for login.

Redis is useful because OTPs are temporary and should automatically expire.

```javascript
// Store OTP for 5 minutes

await redis.setEx(
    `otp:${mobileNumber}`,
    300,
    "123456"
);
```

### Verify OTP

```javascript
const storedOTP = await redis.get(
    `otp:${mobileNumber}`
);

if (!storedOTP) {
    return res.status(400).json({
        message: "OTP expired"
    });
}

if (storedOTP !== enteredOTP) {
    return res.status(400).json({
        message: "Invalid OTP"
    });
}

// Delete OTP after successful verification
await redis.del(`otp:${mobileNumber}`);

return res.json({
    message: "OTP verified successfully"
});
```

**Important:** In production, use cryptographically secure OTP generation, attempt limits, and appropriate protection for stored OTPs.

## 6. Practical Example 3: Rate Limiting

**Scenario:** Prevent users from sending too many requests to an API.

For example, allow a maximum of 5 login attempts per minute per IP address.

```javascript
async function rateLimiter(req, res, next) {
    const ip = req.ip;

    const key = `rate-limit:${ip}`;

    const requests = await redis.incr(key);

    if (requests === 1) {
        await redis.expire(key, 60);
    }

    if (requests > 5) {
        return res.status(429).json({
            message: "Too many requests. Try again later."
        });
    }

    next();
}

app.post("/login", rateLimiter, loginController);
```

**How it works:**

- First request → Counter = 1.
- Second request → Counter = 2.
- Fifth request → Counter = 5.
- Sixth request → Request blocked.
- After 60 seconds → Counter expires.

Note: For production, use an atomic rate-limiting algorithm or a maintained rate-limiting library to handle concurrent requests and avoid expiration races.

## 7. Practical Example 4: Session Management

**Scenario:** A user logs into an application, and multiple backend servers need to access the same session.

Redis provides shared session storage.

```javascript
await redis.setEx(
    "session:user123",
    3600,
    JSON.stringify({
        userId: "user123",
        role: "admin",
        isLoggedIn: true
    })
);
```

Retrieve session:

```javascript
const session = await redis.get(
    "session:user123"
);

if (!session) {
    return res.status(401).json({
        message: "Session expired"
    });
}

const userSession = JSON.parse(session);
```

The session expires automatically after one hour.

## 8. Practical Example 5: Background Job Queues

**Scenario:** An e-commerce application needs to send order confirmation emails.

Instead of making the user wait for email delivery, add the task to a queue.

Common Node.js libraries:
- BullMQ
- Bull

### Producer

```javascript
const { Queue } = require("bullmq");

const emailQueue = new Queue("email-queue", {
    connection: {
        host: "localhost",
        port: 6379
    }
});

await emailQueue.add("send-order-email", {
    email: "user@example.com",
    orderId: "ORD101"
});
```

### Worker

```javascript
const { Worker } = require("bullmq");

const worker = new Worker(
    "email-queue",
    async (job) => {
        console.log("Sending email:", job.data.email);

        // Call email service here
    },
    {
        connection: {
            host: "localhost",
            port: 6379
        }
    }
);
```

**Execution:**

1. User places an order.
2. Backend saves the order in MongoDB.
3. Backend adds an email job to Redis.
4. Worker picks up the job.
5. Worker sends the email.
6. Job is marked completed.

## 9. Important Redis Data Types

| Data Type | Use Case |
|-----------|----------|
| String | OTP, tokens, counters |
| List | Simple queues |
| Set | Unique users, unique values |
| Sorted Set | Leaderboards, rankings |
| Hash | User/session objects |
| Stream | Event processing |

Example:

```bash
# String
SET name "Kirtan"

# List
LPUSH notifications "Order placed"

# Set
SADD activeUsers "user1" "user2"

# Hash
HSET user:101 name "Kirtan" role "developer"

# Sorted Set
ZADD leaderboard 100 "player1"
```

## 10. Important Redis Concepts

### TTL (Time To Live)
Defines how long a key should exist before automatically expiring.

### Cache Hit
Requested data is found in Redis.

### Cache Miss
Requested data is not found in Redis, so the backend fetches it from the primary database or another source.

### Cache Invalidation
Removing or updating outdated cached data when the original database changes.

Example:

```javascript
await Product.findByIdAndUpdate(productId, updateData);

// Invalidate old cache
await redis.del(`product:${productId}`);
```

### Persistence
Redis supports persistence mechanisms:
- RDB: Point-in-time snapshots.
- AOF: Logs write operations.

Redis is primarily an in-memory data store, but it can persist data to disk.

## 11. Redis Alternatives

| Technology | Description |
|------------|-------------|
| Valkey | Open-source Redis-compatible data store |
| KeyDB | Multithreaded Redis-compatible database |
| DragonflyDB | High-performance in-memory data store |

## 12. When Should You Use Redis?

Use Redis when:
- Your API repeatedly fetches the same data.
- Your database experiences high read traffic.
- You need temporary OTP storage.
- You need shared sessions across servers.
- You need distributed rate limiting.
- You need background job processing.

Avoid adding Redis unnecessarily to small applications that do not have these requirements.

---

Redis is a high-performance in-memory data store that helps backend applications improve response times, reduce database load, manage temporary data, and process asynchronous jobs.