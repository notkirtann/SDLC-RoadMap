# Video Notes: Do You Really Know Postman?

**Date:** February 26, 2026

**Channel:** Chai aur Code

**Speaker:** Hitesh Choudhary

**Video Link:** [Do you really know postman?](https://www.google.com/search?q=https://youtu.be/4-DmsxM347k)

---

## 🚀 Beyond the Basics

Most developers use Postman only for simple "Request-Response" cycles in a new tab. However, its true power lies in automation, documentation, and production-level testing [[01:23](http://www.youtube.com/watch?v=4-DmsxM347k&t=83)]. Postman is an industry standard used by over 30 million developers, including front-end, back-end, and QA testers [[02:00](http://www.youtube.com/watch?v=4-DmsxM347k&t=120)].

---

## 🛠️ Key Postman Features

### 1. Request Types & Collections

* **Beyond HTTP:** Postman supports HTTP (GET, POST, etc.), GraphQL, gRPC, and WebSockets/Socket.io [[05:55](http://www.youtube.com/watch?v=4-DmsxM347k&t=355)].
* **Organization:** Always group your requests into **Collections** and **Folders**. This keeps routes (like Auth or E-commerce) organized and shareable with team members [[08:14](http://www.youtube.com/watch?v=4-DmsxM347k&t=494)].
* **Console:** Use the Postman Console (often overlooked) to see exact request/response headers and debug network issues [[06:45](http://www.youtube.com/watch?v=4-DmsxM347k&t=405)].

### 2. Variables & Dynamic Placeholders

* **Environment Variables:** Instead of hardcoding URLs (e.g., `api.freeapi.app/v1`), set them as variables (e.g., `{{baseUrl}}`). This allows you to switch between Local, Dev, and Prod environments instantly [[08:50](http://www.youtube.com/watch?v=4-DmsxM347k&t=530)].
* **Built-in Random Variables:** Postman has reserved variables (starting with `$`) to generate fake data for testing:
* `{{$guid}}`: Unique ID.
* `{{$randomEmail}}`: Random email address.
* `{{$randomPassword}}`: Random password.
* `{{$randomAvatarImage}}`: Random image URL [[16:19](http://www.youtube.com/watch?v=4-DmsxM347k&t=979)].



### 3. Pre-request Scripts (The Power of JS)

Before a request is sent, you can write pure JavaScript in the **Pre-request Script** tab to manipulate data or set variables [[19:08](http://www.youtube.com/watch?v=4-DmsxM347k&t=1148)].

* **Example:** Use `pm.variables.set("varName", value)` to store data dynamically.
* **Custom Logic:** You can write functions to pick a random role (e.g., Admin vs. User) from an array or generate a specific string pattern for usernames [[20:43](http://www.youtube.com/watch?v=4-DmsxM347k&t=1243)].

---

## 🧪 Automated Testing

Postman can automatically generate and run tests using its AI-powered "Postbot" or manual scripting [[10:35](http://www.youtube.com/watch?v=4-DmsxM347k&t=635)].

* **Validation:** You can check for status codes (200 OK), response time, or specific fields in the JSON body [[27:03](http://www.youtube.com/watch?v=4-DmsxM347k&t=1623)].
* **Collection Runner:** Run an entire collection of hundreds of requests in one click to verify that a new code change hasn't broken existing APIs [[27:39](http://www.youtube.com/watch?v=4-DmsxM347k&t=1659)].

---

## 📄 Code Generation & Documentation

* **Instant Snippets:** Click the "Code" icon on the right to get ready-to-use snippets in `Fetch`, `Axios`, `cURL`, `Python`, etc. [[09:43](http://www.youtube.com/watch?v=4-DmsxM347k&t=583)].
* **Documentation:** Postman supports **Markdown** syntax. You can describe your endpoints, parameters, and response types so that front-end developers can understand the API without asking you [[10:50](http://www.youtube.com/watch?v=4-DmsxM347k&t=650)].

---

## 💡 Industry Practice Tip

When testing, use random emails for registration to avoid "Email already exists" errors. However, keep passwords hardcoded (e.g., `Test123@123`) for easier manual login verification across different environments [[18:13](http://www.youtube.com/watch?v=4-DmsxM347k&t=1093)].

---

*Summary of advanced Postman techniques to improve backend development and testing workflows.*