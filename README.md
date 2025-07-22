
# 🏥 **Hospital Management System**

---

## 📖 **Description**

The **Hospital Management System** is a **Java-based application** that streamlines and automates day-to-day hospital operations.  
It offers functionality to manage **patients, rooms, departments, employees, ambulance tracking,** and **discharge processes**.

Built using **Java, MySQL, and JDBC**, the system securely stores and retrieves data through a **MySQL database** and includes secure **login/logout functionality** for authorized access.

---

## ✨ **Features**

- 🔐 Secure login and logout system  
- 🧾 Patient registration with full **CRUD (Create, Read, Update, Delete)** operations  
- 🏨 Room allocation and availability tracking  
- 🏥 Department management for hospital units (e.g., Cardiology, Orthopedics)  
- 👨‍⚕️ Employee management (Doctors, Nurses, Staff)  
- 🚑 Ambulance tracking and management  
- 📋 Discharge processing for admitted patients  

---

## 🛠️ **Technologies Used**

- ☕ **Java (JDK 8 or above)**  
- 🛢️ **MySQL (Database)**  
- 🔗 **JDBC (Java Database Connectivity)**  
- 💻 **Console-based User Interface (CLI)**  
- 🧠 **IntelliJ IDEA / Eclipse** (Recommended IDEs)  

---

## ▶️ **How to Run the Project**

---

### 🔧 **Prerequisites**

Make sure the following are installed on your system:

- ✅ Java JDK (version 8 or above)  
- ✅ MySQL Server installed and running  
- ✅ MySQL Workbench or MySQL CLI  
- ✅ Java-compatible IDE (IntelliJ IDEA / Eclipse) or terminal  

---

### 🛠️ **Steps**

#### 1️⃣ Clone or Download the Project

```bash
git clone https://github.com/yourusername/HospitalManagementSystem.git
cd HospitalManagementSystem
````

#### 2️⃣ Create the MySQL Database

```sql
CREATE DATABASE hospital_db;
```

(You can add `tables.sql` if provided or let your code create tables.)

#### 3️⃣ Configure Database in Code

Update database credentials in your code (e.g., `conn.java`):

```java
String url = "jdbc:mysql://localhost:3306/hospital_db";
String username = "root";
String password = "your_password";
```

---

#### 4️⃣ Compile and Run the Project

If using terminal:

```bash
javac *.java
java Main  # or whatever your main class is
```

If using IDE:

* Open the project
* Right-click the main file
* Click "Run"

