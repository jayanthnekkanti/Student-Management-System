# Student Management System (Java Full Stack)

A full-stack Java web application built using **Spring MVC**, **Hibernate**, and **MySQL** for managing student details.  
The system allows CRUD operations on students and integrates **social profiles (LinkedIn, GitHub, etc.)** to enrich student information.  

This project was developed as part of a **Java Full Stack Internship** to gain hands-on experience with modern Java frameworks.

---

## Features
- User-friendly interface for managing student records.
- Add, update, delete, and view student details.
- Integration of social profiles like **LinkedIn**, **GitHub**, etc.
- Follows **MVC architecture** with **Spring MVC**.
- ORM mapping and database handling using **Hibernate**.
- Database: **MySQL**.

---

## Technologies & Dependencies

### Backend:
- **Java 8+**
- **Spring MVC**
- **Hibernate ORM**
- **Servlet API**
- **JDBC**

### Frontend:
- **HTML5, CSS3, JavaScript**
- **Bootstrap** (optional)

### Database:
- **MySQL 5.7+**

### Tools & Build:
- **Eclipse IDE (Enterprise Edition)**
- **Apache Tomcat 9+**
- **Maven (for dependency management)**

---

## Project Structure
src/main/java → Java source files (Controllers, DAO, Services, Entities)
src/main/webapp → JSP pages, CSS, JS, static resources
WEB-INF/web.xml → Deployment descriptor
pom.xml → Maven dependencies

2. Import into Eclipse
Open Eclipse IDE (Enterprise Edition).
Go to File > Import > Existing Maven Projects.
Select the cloned project folder.
Eclipse will auto-detect and import Maven dependencies.


3. Configure Database
 i.Create a MySQL database: CREATE DATABASE student_management;
ii.Update database credentials in META-INF Folder(persistence.xml) :
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/student_management</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">your_password</property>

4. Run the Project
Right-click the project in Eclipse.
Select Run As > Run on Server.
Before choosing Apache Tomcat server download the apache tomcar server of version 9
Choose Apache Tomcat server version 9 while adding it to the server
 Run manually it goes to the web browser other
or
Access the app in your browser: http://localhost:8080/StudentManagementSystem






