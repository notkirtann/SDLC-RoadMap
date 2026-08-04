# Comprehensive Notes: JWT vs. Sessions

**Date:** February 26, 2026

**Channel:** Chai aur Code

**Speaker:** Hitesh Choudhary

**Video Link:** [What is JWT token and JWT vs Sessions](https://www.google.com/search?q=https://youtu.be/xrj3zzaqODw)

---

## 🔑 Prerequisite Concepts

Before diving into JWT, it is essential to understand two foundational principles:

### 1. Public-Private Key Cryptography

* **Public Key:** Distributed freely. It can encrypt data but not decrypt it.
* **Private Key:** Must be kept secret on the server. Only this key can decrypt data encrypted by the corresponding public key [[02:27](http://www.youtube.com/watch?v=xrj3zzaqODw&t=147)].

### 2. Statefulness vs. Statelessness

* **Stateful (Sessions):** The server keeps a record of the user's state in a database or file. Every request requires a database lookup to verify the user [[03:23](http://www.youtube.com/watch?v=xrj3zzaqODw&t=203)].
* **Stateless (JWT):** The server does not store session data. The "state" is carried within the token itself. If the token is valid, the user is authenticated [[03:11](http://www.youtube.com/watch?v=xrj3zzaqODw&t=191)].

---

## 🧩 What is a JSON Web Token (JWT)?

JWT is an open industry standard (RFC 7519) for representing "claims" between two parties [[05:15](http://www.youtube.com/watch?v=xrj3zzaqODw&t=315)]. It is a long, encoded string divided into three parts separated by dots (`.`):

1. **Header (Red):** Defines the token type (JWT) and the hashing algorithm used (e.g., HS256) [[06:41](http://www.youtube.com/watch?v=xrj3zzaqODw&t=401)].
2. **Payload (Purple):** Contains the actual data or "claims." Common fields include `sub` (Subject/User ID), `name`, `email`, and `iat` (Issued At) [[06:46](http://www.youtube.com/watch?v=xrj3zzaqODw&t=406)].
3. **Signature (Blue):** Ensures the token hasn't been tampered with. It is created by hashing the encoded header, encoded payload, and a **Secret Key** known only to the server [[06:52](http://www.youtube.com/watch?v=xrj3zzaqODw&t=412)].

---

## 🛡️ Authentication vs. Authorization

* **Authentication:** Verifying who you are (e.g., logging in with a username/password) [[10:29](http://www.youtube.com/watch?v=xrj3zzaqODw&t=629)].
* **Authorization:** Verifying what you are allowed to do (e.g., can this user access the Admin Dashboard?) [[10:45](http://www.youtube.com/watch?v=xrj3zzaqODw&t=645)].
* **JWT Use Case:** JWT is primarily an **authorization** mechanism but is widely used for authentication because it allows users to access multiple microservices without logging into each one individually [[11:09](http://www.youtube.com/watch?v=xrj3zzaqODw&t=669)].

---

## 🔄 JWT vs. Sessions: The Comparison

| Feature | Sessions (Stateful) | JWT (Stateless) |
| --- | --- | --- |
| **Storage** | Server-side (DB or Memory) | Client-side (Local Storage/Cookies) |
| **Verification** | Requires an extra Database call for every request [[23:03](http://www.youtube.com/watch?v=xrj3zzaqODw&t=1383)] | Verified instantly by the server using its Secret Key [[20:42](http://www.youtube.com/watch?v=xrj3zzaqODw&t=1242)] |
| **Scalability** | Harder; requires session synchronization across servers | Easier; any server with the Secret Key can verify the token |
| **Efficiency** | Slower due to I/O operations (DB calls) [[23:39](http://www.youtube.com/watch?v=xrj3zzaqODw&t=1419)] | Faster and more lightweight [[21:05](http://www.youtube.com/watch?v=xrj3zzaqODw&t=1265)] |

---

## 🔐 Security & Expiration

### How to store JWT safely?

* **Local Storage:** Common but vulnerable to Cross-Site Scripting (XSS) attacks [[14:15](http://www.youtube.com/watch?v=xrj3zzaqODw&t=855)].
* **HTTP-Only Cookies:** More secure as they cannot be accessed by client-side JavaScript [[14:36](http://www.youtube.com/watch?v=xrj3zzaqODw&t=876)].

### Token Expiration & Refresh Tokens

* **Access Tokens:** Usually have a very short lifespan (e.g., 15 minutes) for security [[15:00](http://www.youtube.com/watch?v=xrj3zzaqODw&t=900)].
* **Refresh Tokens:** Stored in the database and given to the user. When the Access Token expires, the client uses the Refresh Token to request a new one without forcing the user to log in again [[17:30](http://www.youtube.com/watch?v=xrj3zzaqODw&t=1050)].

---

*Summary of JWT architecture and its advantages over traditional session management.*