# Bug Analysis POC using Sentry for React

| **Author**  | **Created on** | **Version** | **Last updated by** | **Last edited on** | **Reviewer**       |
|------------|---------------|-------------|----------------------|---------------------|-------------------|
| Aman Raj  | 07-03-2025    | Version 1   | Aman Raj             | 07-03-2025         | Siddharth Pawar  |

---

## Table of Contents
1. [Introduction](#1-introduction)  
2. [Why Use Sentry?](#2-why-use-sentry)  
3. [Setting Up React Application](#3-setting-up-react-application)  
4. [Setting Up Sentry](#4-setting-up-sentry)  
   - [4.1 Create a Sentry Account](#41-create-a-sentry-account)  
   - [4.2 Install Sentry SDK and Initialize](#42-install-sentry-sdk-and-initialize)  
5. [Testing for Bugs](#5-testing-for-bugs)  
   - [5.1 Triggering an Error](#51-triggering-an-error)  
   - [5.2 Viewing Errors in Sentry Dashboard](#52-viewing-errors-in-sentry-dashboard)  
6. [Conclusion](#6-conclusion)  
7. [Contact Information](#7-contact-information)  
8. [References](#8-references)  

---

## 1. Introduction  
[Sentry](https://sentry.io/) is an error-tracking tool that provides real-time monitoring, debugging insights, and stack traces for applications. It helps developers identify and fix issues efficiently.

---

## 2. Why Use Sentry?  
- **Real-time Monitoring** - Detect errors as they occur.  
- **Detailed Debugging Insights** - View error stack traces, request metadata, and logs.  
- **Supports Multiple Platforms** - Works with React, Node.js, Python, and more.  
- **CI/CD Integration** - Can be used with GitHub, Jira, Slack, etc.  

---

## 3. Setting Up React Application  
For setting up our React Application i.e. Frontend Server for our OT-MS Understanding project please follow this Link [Frontend Doc](https://github.com/Snaatak-Skyops/Documentation/blob/eec3174c783c51f363a335ac55aa3eab1c0cf5a3/OT%20MS%20Understanding/Application/Frontend/Documentation/README.md)

---

## 4. Setting Up Sentry  

### 4.1 Create a Sentry Account  
1. Go to **[Sentry's official website](https://sentry.io/)**.  
2. Sign up and create a new project.  
3. Select **React** as the platform.  
4. Copy the **DSN (Data Source Name)** from the project settings.  

### 4.2 Install Sentry SDK and Initialize  
1. Install the Sentry SDK in your React project:  
   ```sh
   npm install @sentry/core@6.19.7
   ```
   In our case we are installing specific version of Sentry because our project uses older version of webpack.
2. Update `src/index.js` to initialize Sentry:  

   ```javascript
   import * as Sentry from "@sentry/react";
   // Initialize Sentry
   Sentry.init({
     dsn: "<your-dsn>", // Replace with your actual DSN from Sentry Dashboard
     tracesSampleRate: 1.0, // Captures 100% of transactions for performance monitoring
   });
   ```

---

## 5. Testing for Bugs  

### 5.1 Triggering an Error  
To verify Sentry integration, add an error button inside your **React component (`App.react.js`)**:  
Add below code in any of the React Component for testing sentry:
```javascript
   <button onClick={() => { throw new Error("This is your first error!"); }}>
```
Now, re-start your application.

### 5.2 Viewing Errors in Sentry Dashboard  
1. Log in to your Sentry Dashboard.  
2. Navigate to **Issues → Your Project**.  
3. Locate the error message. 
4. Click on the issue to view:
   - Stack traces
   - Request details
   - System info
   - Debugging insights  

Example of error tracking in Sentry Dashboard:
<img width="1470" alt="Screenshot 2025-03-07 at 9 54 01 AM" src="https://github.com/user-attachments/assets/b77aa687-861c-4df1-93fe-0300f28e05e4" />

---

## 6. Conclusion  
Sentry provides real-time error detection, allowing developers to identify and resolve issues as soon as they occur. It offers detailed debugging insights, including stack traces, request metadata, and system information, making troubleshooting more efficient. Additionally, Sentry integrates with DevOps tools like GitHub, Jira, and Slack, enhancing collaboration and workflow automation.  

---

## 7. Contact Information  
| **Name**  | **Email**                       |
|-----------|---------------------------------|
| Aman Raj  | aman.raj@mygurukulam.co        |

---

## 8. References  
| **Resource**           | **Link**  |
|----------------------|-----------|
| Sentry Documentation | [Link](https://docs.sentry.io/platforms/javascript/guides/react/) |
