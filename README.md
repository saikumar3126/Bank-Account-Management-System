# 🏦 Bank Management System

## 📌 Project Overview

The **Bank Management System** is a Java-based application developed to manage basic banking and customer account operations efficiently.

The project uses **Core Java, JDBC, and MySQL** to demonstrate how a Java application can connect with a relational database and perform database operations.

The main objective of this project is to provide a simple and structured system for managing customer accounts, account details, balances, and banking transactions.

## 🎯 Objectives

- Manage customer bank account information.
- Create and store new bank accounts.
- Retrieve and display account details.
- Manage account balances.
- Perform database operations using JDBC.
- Maintain banking data in a MySQL database.
- Demonstrate CRUD operations using Java and SQL.

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Application development |
| JDBC | Connecting Java with MySQL |
| MySQL | Database management |
| SQL | Database operations |
| Eclipse IDE | Development environment |
| MySQL Workbench | Database development and testing |
| Git & GitHub | Version control and project hosting |

## ✨ Key Features

### 👤 Account Management
- Create a new bank account.
- Store customer information.
- Store account type and balance.
- View existing account details.


## Account table
<img width="1615" height="826" alt="Screenshot 2026-10-04 184207" src="https://github.com/user-attachments/assets/4a0185da-e965-4ba4-aa24-8798adcb3b61" />


### 💰 Balance Management
- Maintain account balance.
- Retrieve the current account balance.
- Support future implementation of deposit and withdrawal operations.

### 🗄️ Database Management
- Store account information in MySQL.
- Use SQL queries for database operations.
- Connect the Java application to MySQL using JDBC.
- Use `PreparedStatement` for executing SQL queries.


## 🏗️ Project Architecture

The project follows a simple layered structure:

```text
Java Application
       ↓
   DAO Layer
       ↓
      JDBC
       ↓
    MySQL

## Project Structure
Bank-Account-Management-System
│
├── src
│   └── com.bank
│       ├── Account.java
│       ├── AccountDAO.java
│       ├── Customer.java
│       ├── DBConnection.java
│       ├── TestAccount.java
│       ├── Testconnection.java
│       └── Transaction.java
│
└── README.md

## Data base
The project can be extended by connecting the account table with a transactions table to maintain transaction history.

## Transaction table

 <img width="1021" height="530" alt="Screenshot 2026-10-04 184228" src="https://github.com/user-attachments/assets/aba3528b-4ff2-4c9f-8b58-53027e1add58" />

## Project result

<img width="1373" height="350" alt="Screenshot 2026-10-04 184744" src="https://github.com/user-attachments/assets/c623d856-a1b7-433e-ae79-0532e6468f72" />
