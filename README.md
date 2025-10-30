# RCPIT Smart Canteen System

A full-stack, multi-role web application designed to modernize the ordering process at the R. C. Patel Institute of Technology (RCPIT) canteen. This project digitizes the entire workflow, from browsing the menu to placing orders and managing them, creating an efficient and user-friendly experience for students, canteen staff, and administrators.

---

## ✨ Project Overview & Key Features

This application addresses the common inefficiencies of a traditional canteen system, such as long queues and manual order tracking. By creating a complete digital ecosystem, it streamlines operations and enhances the user experience. The system is built on a robust multi-role architecture, providing a unique and secure interface for each type of user.

### 👤 **Customer**
- **User Authentication**: Secure registration and login system.
- **Dynamic Menu Browsing**: Customers can explore a visually rich menu, complete with high-quality images, detailed descriptions, prices, and real-time availability status ("In Stock" / "Out of Stock").
- **Seamless Ordering**: An interactive shopping cart allows users to add multiple quantities of items and see their bill update instantly.
- **Flexible Order Types**: Users can choose between **"Pickup"** from the canteen or **"On-Campus Delivery"** to a specific location like the library or a department building.
- **Order History & Feedback**: A personal dashboard allows customers to view their past orders and provide a rating (1-5 stars) and a comment for each item, helping the administration monitor food quality.

### 🧑‍🍳 **Canteen Staff**
- **Live Order Dashboard**: A real-time dashboard that uses **Server-Sent Events (SSE)** to instantly display new incoming orders as they are placed, complete with a notification alert, eliminating the need for manual page refreshing.
- **Order Workflow Management**: Staff can update an order's status through a clear workflow: `Placed` ➡️ `Preparing` ➡️ `Completed`.
- **Delivery Coordination**: For delivery orders, staff can view the customer's specified location and assign the order to an available delivery person from a dropdown list.

### 🚚 **Delivery Person**
- **Dedicated Delivery Dashboard**: A separate, simplified dashboard that shows only the orders assigned to the logged-in delivery person.
- **Clear Delivery Information**: Each order card clearly displays the customer's name, the delivery location, and the items to be delivered.
- **Delivery Status Updates**: The delivery person can update the order's status through its own workflow: `Assigned` ➡️ `Out for Delivery` ➡️ `Delivered`.

### 👨‍💼 **Administrator**
- **Comprehensive Oversight**: Admins have full access to all features available to the Canteen Staff, allowing them to monitor live operations.
- **Menu & Availability Control**: A dedicated "Manage Menu" dashboard where admins can toggle the availability of any food item and view the **average user rating** for each dish, complete with color-coding for quick quality assessment.
- **User Management**: A secure dashboard to create new user accounts and assign specific roles (`Staff`, `Delivery`, `Admin`), ensuring proper access control across the system.

---

## 🛠️ Technology Stack

This project is a full-stack Java web application built with a focus on industry-standard technologies and best practices.

- **Backend**:
  - **Java 8**
  - **Spring MVC 5.x** (with Annotation-based Configuration)
  - **Hibernate 5.x** (as the JPA provider for Object-Relational Mapping)
  - **Server-Sent Events (SSE)** for real-time, unidirectional server-to-client communication.
- **Frontend**:
  - **JSP (JavaServer Pages)** with **JSTL** for dynamic content rendering.
  - **Bootstrap 5** for a responsive, mobile-first, and modern user interface.
  - **JavaScript** for client-side interactivity and asynchronous operations.
  - **GSAP (GreenSock Animation Platform)** for high-performance, professional animations and page transitions.
- **Database**:
  - **MySQL / MariaDB**
- **Server**:
  - **Apache Tomcat**
- **Build & Dependency Management**:
  - **Apache Maven**

---

## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites
- Java Development Kit (JDK) 1.8 or higher
- Apache Maven 3.x
- Apache Tomcat 7.0 or higher
- A running MySQL or MariaDB database server (e.g., via XAMPP)

### Installation & Setup
1. **Clone the Repository**:
   ```bash
   git clone [https://github.com/YourUsername/smart-canteen-system.git](https://github.com/YourUsername/smart-canteen-system.git)
   ```
2. **Create the Database**:
   - Access your database management tool (e.g., phpMyAdmin).
   - Create a new, empty database and name it `canteenDB`.
3. **Configure the Application**:
   - Open the project in your preferred IDE (e.g., Eclipse IDE for Enterprise Java Developers).
   - Navigate to `src/main/java/com/rcpit/config/WebAppConfig.java`.
   - In the `dataSource()` method, update the database URL, username, and password to match your local database credentials.
4. **Build the Project**:
   - Right-click the project in your IDE and select **Run As -> Maven build...**.
   - Set the goal to `clean install` and run the build.
5. **Run the Application**:
   - Right-click the project again and select **Run As -> Run on Server**.
   - Choose your configured Tomcat server.
   - The application will launch in your browser, and you can access it at `http://localhost:8080/canteensys/`.
