# Video Notes: What is CI/CD Pipeline?

**Date:** February 26, 2026

**Channel:** Apna College

**Speaker:** Shradha Khapra

**Video Link:** [What is CI/CD Pipeline? | Simply Explained](https://www.google.com/search?q=https://youtu.be/gLptmcuCx6Q)

---

## 🚀 Introduction to CI/CD

CI/CD stands for **Continuous Integration** and **Continuous Delivery/Deployment**. It is a core concept of DevOps aimed at automating the steps of software development to increase reliability and speed.

### Why do we need it?

In the early days, software development processes were **manual**, leading to:

* **Integration Hell:** Conflicts when merging code from multiple developers [[07:54](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=474)].
* **Manual Errors:** Humans tend to make mistakes during testing and deployment [[04:31](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=271)].
* **Time Consumption:** Manually re-performing hundreds of tests for every small change is inefficient [[04:42](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=282)].
* **Infrequent Releases:** Code freezes and manual steps prevent fast delivery to users [[08:44](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=524)].

---

## 🛠️ The CI/CD Breakdown

### 1. Continuous Integration (CI)

CI focuses on the **Build** and **Test** stages [[05:18](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=318)].

* **Automated Build:** Whenever a developer pushes code to a branch, a script automatically creates "Build Files" (like `.apk` for Android or binaries for Node.js) [[02:04](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=124)].
* **Automated Testing:** Runs unit tests, integration tests, and regression tests immediately to ensure new changes don't break existing features [[02:24](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=144)].
* **Significance:** Errors are discovered early (at every commit) rather than at the end of the project [[10:08](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=608)].

### 2. Continuous Delivery vs. Continuous Deployment (CD)

* **Continuous Delivery:** The code is automatically built, tested, and deployed to a **Staging Environment**. However, it requires a **manual approval** (by a manager or lead) before it is deployed to the Production environment [[05:53](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=353)].
* **Continuous Deployment:** There is **no manual approval**. Once the code passes all automated tests, it is immediately deployed to the Production environment [[14:24](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=864)].

---

## 🏗️ Deployment Environments

1. **Dev (Development):** Accessible only to developers for initial coding.
2. **Staging:** A "Pre-production" environment used for demos (to CTOs/Managers) and end-to-end testing (security, smoke, alpha/beta tests) [[03:25](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=205)].
3. **Prod (Production):** The live environment accessible to all end-users [[03:30](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=210)].

---

## 🔧 Popular CI/CD Tools

* **GitHub Actions:** (Released 2019) Highly intuitive and native to GitHub. Great for beginners [[12:12](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=732)].
* **Jenkins:** (Released 2011) An older, highly customizable job orchestrator, but slightly harder to maintain [[12:40](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=760)].
* **Others:** CircleCI, Travis CI, GitLab CI/CD, and Bamboo [[11:51](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=711)].

---

## 📉 Deployment Strategies (Zero Down-Time)

Even with automation, bugs can reach production. These strategies help manage risks:

* **Blue-Green Deployment:** Two identical environments (Blue = Current, Green = New). Traffic is switched to Green; if something breaks, it is immediately routed back to Blue [[15:53](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=953)].
* **Canary Deployment:** New features are rolled out to a tiny percentage (5-10%) of users first. If successful, the rollout expands to everyone [[16:45](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=1005)].
* **Rolling Deployment:** The new version is deployed instance-by-instance across the server fleet until all servers are updated [[17:34](http://www.youtube.com/watch?v=gLptmcuCx6Q&t=1054)].

---

*Summary of core DevOps principles for building scalable and reliable applications.*