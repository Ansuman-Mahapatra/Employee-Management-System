# Employee Management System  
**A Complete Desktop-Based Employee Management System**  
Built using **Pure Java Swing + MySQL** – No frameworks, No web technology  

### Entry Point (Starting Class)
**`Splash.java`** → This is the first class that runs when you start the application  
(Splash → Login → Main Dashboard)

### Features
- Beautiful splash screen on launch
- Secure **Login System** (Username + Password)
- Full **CRUD Operations**: Add, View, Update, Delete employees
- Search employee by Employee ID
- Auto-generated unique Employee ID
- JDateChooser for Date of Birth selection
- JTable with live data from MySQL (using rs2xml)
- Responsive and modern GUI with custom icons
- All data permanently saved in MySQL database

### Technologies Used
- **Java SE** (Core Java)
- **Swing** – for complete GUI (JFrame, JPanel, JTable, etc.)
- **MySQL** – Database
- **JDBC** – For database connectivity
- **JCalendar** – Date picker component
- **rs2xml.jar** – To populate JTable from ResultSet

### Database & User Authentication
- Database Name: `emp`
- Table Name: `employee` (for employee records)
- Login authentication is **hardcoded** (for demo/college project purpose)

#### Default Login Credentials
| Role  | Username | Password |
|-------|----------|----------|
| Admin | `admin`  | `12345`  |
| User  |  `user`  | `user123`|

You can also **add more users directly into the database** if you modify the login logic later.

### Developed By  
**Ansuman**  
Java Desktop Application Developer  

A complete, production-like Employee Management System built single-handedly using pure Java Swing and MySQL.  
From splash screen to dynamic user authentication, every line of code, UI design, database structure, and feature has been crafted from scratch.

Proudly made with core Java  
2024

---
⭐ Star this repo if you found it helpful!  ⭐  
Feel free to fork, improve, and use it for your college projects or portfolio.