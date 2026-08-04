### Video Notes: Why No One Talks About AdonisJS
#### Channel: Chai aur Code
#### Video Link:  https://youtu.be/N6TBNpZLn3c?si=hNR6rfG9RTLqcJ_C

#### Speaker: Hitesh Choudhary

**Knowledge Date:** February 26, 2026

## 📌 Introduction to AdonisJS
AdonisJS is a TypeScript-first web framework for Node.js designed to build robust back-end applications and APIs. Hitesh compares it to the "Adonis" of Greek mythology—something beautiful and powerful that unfortunately remains under the radar in the current JavaScript ecosystem [01:02].

Key Characteristics:
Batteries Included: Unlike Express.js, which is minimal, AdonisJS provides almost everything out of the box (routing, middleware, authentication, etc.) [03:21].

Opinionated Structure: It follows a pattern similar to Laravel (PHP) or Ruby on Rails, where common problems are already "solved" by the framework [03:37].

Type Safety: Built with TypeScript from the ground up, ensuring a great developer experience [03:14].

🛠 Core Features (Out of the Box)
AdonisJS simplifies backend development by providing built-in solutions for:

Lucid ORM: An active record ORM that is powerful and standard for the framework [04:44].

Authentication (Auth): Supports Session-based, API tokens, and Basic Auth without manual setup [06:04].

Validation: Uses VineJS for high-performance schema validation [04:50].

Ally (Social Auth): Provides easy integration for Google, Twitter, GitHub, and LinkedIn login [11:00].

Mailing: Built-in support for sending emails with drivers like Mailtrap [05:29].

Security: Comes with built-in protection against common web vulnerabilities (via Shield) [11:00].

🚀 Getting Started
To initialize a new project, use the following command:

Bash
npm init adonisjs@latest
Starter Kits available:
Web Kit: For traditional server-rendered apps.

API Kit: Optimized for building REST APIs with access token guards [07:31].

Inertia Kit: For building single-page apps using Vue or React within the Adonis ecosystem [08:01].

📂 Architecture & Folder Structure
AdonisJS uses a standardized structure [12:34]:

bin/: Contains entry points for the server and console.

app/: Holds Controllers, Exceptions, Middleware, Models, and Validators.

Dependency Injection (IoC): Like NestJS or Spring, Adonis uses Inversion of Control to manage dependencies, making code more testable and scalable [08:35].

🧐 Why is it not more popular?
Hitesh discusses potential reasons for its lower visibility compared to Next.js or Express [05:36]:

Market Dominance: Express and Next.js dominate tutorials and corporate mindshare.

ORM Preference: Modern developers often prefer Prisma or Drizle over Lucid ORM [05:52].

Database Support: While it excels with SQL, many beginners start with MongoDB, which isn't the primary focus of Adonis [12:10].

Marketing: It may need more visibility through community tutorials and documentation "Dark Mode" (jokingly mentioned) [02:23].

💡 Final Thoughts
AdonisJS is ideal for Application Engineers who want to focus on business logic rather than wiring up basic infrastructure. It offers high speed of development once the initial learning curve is crossed [13:53].


### Deep Dive: AdonisJS 
# Detailed Study Notes: AdonisJS (from Chai aur Code)

## 📌 Framework Overview

AdonisJS is a **full-stack, opinionated web framework** for Node.js. It is designed to provide a cohesive developer experience by including everything needed to build a production-ready backend.

* **Philosophical Roots:** Highly inspired by Laravel (PHP) and Ruby on Rails.
* **Primary Language:** TypeScript-first (provides excellent intellisense and type safety).
* **Main Goal:** To move away from the "fragmented" approach of Express (where you have to pick every library yourself) toward a "standardized" approach.

---

## 🛠 Key Built-in Features

### 1. Lucid ORM (Data Layer)

* **Active Record Pattern:** Similar to Laravel's Eloquent.
* **Database Support:** Handles migrations, factories, and seeds out of the box.
* **Standardization:** While some modern developers use Prisma/Drizzle, Lucid is the native, deeply integrated way to handle SQL in Adonis.

### 2. Authentication System (Adonis Auth)

One of the strongest selling points. It solves the "User Auth" problem on day one:

* **Session Guard:** For traditional web apps (cookies/sessions).
* **Access Token Guard:** For SPAs or Mobile Apps (Opaque tokens).
* **Basic Auth:** For simple internal tools.
* **Social Auth (Adonis Ally):** Built-in drivers for Google, GitHub, Twitter, LinkedIn, and Facebook.

### 3. Integrated Tooling

* **VineJS:** A high-speed validation library used to validate incoming request data.
* **Edge:** A powerful template engine for server-side rendering (SSR).
* **Shield:** A security middleware layer to protect against CSRF, XSS, and other common attacks.
* **Mailing:** Built-in mailer with support for various drivers (SMTP, Mailgun, SES).

---

## 📂 Project Architecture

AdonisJS uses a **Standardized Folder Structure** to ensure that every Adonis project looks the same, making it easier for teams to collaborate:

* **`app/Controllers/`**: Logic for handling HTTP requests.
* **`app/Models/`**: Database schemas and relationships via Lucid.
* **`app/Middleware/`**: Functions that run before the request reaches the controller.
* **`app/Validators/`**: Schema definitions for data validation.
* **`config/`**: Centralized configuration for the database, auth, mail, etc.
* **`start/routes.ts`**: The central file where all application URLs are defined.

---

## ⚙️ Core Concepts

### Dependency Injection (DI) & IoC Container

Like NestJS or Spring, AdonisJS uses an **Inversion of Control (IoC) container**.

* It manages how classes and dependencies are instantiated.
* This makes testing much easier because you can "swap" real services with "mocks" during tests.

### Edge Cases & Native Testing

* **Japa:** Adonis comes with a built-in testing suite based on Japa.
* **Browser Testing:** Supports full end-to-end browser testing out of the box.

---

## 🚀 Getting Started Commands

To create a new project:

```bash
npm init adonisjs@latest

```

**Starter Kit Options:**

1. **Web:** Includes Edge templates and session-based auth.
2. **API:** Minimal setup focused on JSON responses and token auth.
3. **Slim:** The bare-bones version for advanced users.

---

## 📝 Critical Analysis: Why is it "Under-discussed"?

Despite its power, AdonisJS faces challenges in the mainstream JavaScript community:

1. **The "Express" Habit:** Most tutorials focus on Express/Node/MongoDB, so beginners rarely branch out.
2. **Marketing:** It lacks the massive corporate marketing budget of frameworks like Next.js (Vercel).
3. **SQL Focus:** It is heavily optimized for SQL (PostgreSQL, MySQL, SQLite). Since many JS developers start with NoSQL (MongoDB), they find the transition to a strict SQL-based ORM like Lucid intimidating.
4. **Opinionated Nature:** Developers who like to "hand-pick" every small library (e.g., choosing their own logger, auth, and router) may find Adonis too restrictive.

---

## 💡 Summary for Developers

If you are tired of setting up the same boilerplate for every project (JWT, Database connections, Validation, Emailing) and want a framework that "just works" with a professional structure, **AdonisJS** is the most mature choice in the Node.js ecosystem. It is especially ideal for **Application Engineers** who want to focus on business logic rather than wiring up basic infrastructure. The initial learning curve is worth it for the long-term productivity gains.
