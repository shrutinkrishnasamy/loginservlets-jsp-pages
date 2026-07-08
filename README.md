# Login Servlets & JSP Pages

A simple Java Web Application that demonstrates user authentication using **Servlets**, **JSP**, **Sessions**, and **Cookies**. This project is designed for beginners to understand Java EE web development concepts and can be deployed on Apache Tomcat.

## Features

- User Login
- User Registration
- Session Management
- Cookie Management
- JSP Pages
- Java Servlets
- Form Validation
- Logout Functionality

## Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- HTML5
- CSS3
- Apache Tomcat 10
- Eclipse IDE
- Jakarta Servlet API

## Project Structure

```
LoginServlets-JSP-Pages/
│
├── src/
│   └── Java Servlet Files
│
├── WebContent/
│   ├── index.jsp
│   ├── login.jsp
│   ├── register.jsp
│   ├── home.jsp
│   └── WEB-INF/
│
├── web.xml
└── README.md
```

## Project Modules

- Login Servlet
- Register Servlet
- Session Example
- Cookie Example
- JSP Pages
- Logout Servlet

## Session Management

The application stores the logged-in user's information using **HttpSession**.

Example:

```java
HttpSession session = request.getSession();
session.setAttribute("email", email);
```

## Cookie Management

The application also demonstrates how to create and retrieve cookies.

Create Cookie

```java
Cookie cookie = new Cookie("email", username);
response.addCookie(cookie);
```

Read Cookie

```java
Cookie[] cookies = request.getCookies();

for(Cookie c : cookies){
    if(c.getName().equals("email")){
        out.println(c.getValue());
    }
}
```

## How to Run

1. Clone the repository

```bash
git clone https://github.com/shrutinkrishnasamy/loginservlets-jsp-pages.git
```

2. Import the project into Eclipse.

3. Configure Apache Tomcat 10.

4. Add the project to the Tomcat server.

5. Start the server.

6. Open your browser and visit

```
http://localhost:8080/<ProjectName>/
```

## Screenshots

You can add screenshots of:

- Login Page
- Registration Page
- Home Page
- Session Example
- Cookie Example

## Learning Outcomes

This project helps understand:

- Java Servlets
- JSP
- Request & Response Objects
- HttpSession
- Cookies
- Form Handling
- Request Dispatcher
- Page Navigation
- MVC Basics

## Future Improvements

- Database Integration (MySQL)
- Password Encryption
- Email Verification
- Forgot Password
- Remember Me
- Bootstrap UI
- JDBC Integration
- Role-Based Login

## Author

**Shrutin Krishnasamy**

- GitHub: https://github.com/shrutinkrishnasamy

---
⭐ If you found this project useful, consider giving it a star!
