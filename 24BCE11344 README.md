# 🏥 Healthcare Patient Monitoring Dashboard

## 📌 Overview

This project is a **Healthcare Patient Monitoring System** designed to track patient vital parameters and generate alerts for abnormal conditions.
It integrates backend logic with a graphical user interface to provide real-time monitoring.

---

## 🎯 Objectives

* To monitor patient health parameters such as heart rate, temperature, and blood pressure
* To detect abnormal conditions using predefined thresholds
* To display patient data in a structured and user-friendly dashboard

---

## 🛠️ Technologies Used

* Java (Core + Advanced Concepts)
* Java Swing (GUI Development)
* Object-Oriented Programming (OOP)
* Collections Framework

---

## ✨ Features

* 📊 Displays multiple patients in a tabular format
* ❤️ Monitors vital parameters:

  * Heart Rate
  * Temperature
  * Blood Pressure
* 🚨 Alert System:

  * Detects abnormal conditions using backend logic
  * Displays **WARNING** status for critical patients
* 🎨 Color-coded dashboard:

  * 🔴 Red → Warning / Critical
  * 🟢 Green → Normal

---

## 🔗 System Architecture

* **Patient Class** → Stores patient details and vitals
* **AlertService** → Processes patient data and generates alerts
* **Dashboard UI** → Displays patient information and alert status

---

## 🧩 Key Components

* `Patient.java` → Data model
* `AlertService.java` → Business logic for alerts
* `DashboardUI.java` → Graphical User Interface

---

## ⚙️ How It Works

1. Patient data is created using the `Patient` class
2. The `AlertService` evaluates vitals against threshold values
3. The system assigns a status (**NORMAL / WARNING**)
4. The UI displays the data in a table with color-coded alerts

---

## ▶️ How to Run

1. Compile all Java files:

   ```bash
   javac *.java
   ```
2. Run the application:

   ```bash
   java DashboardUI
   ```

---

## 📸 Output

The system displays:

* Patient details in a table
* Real-time alert status
* Color-coded health conditions

---

## 👨‍💻 My Contribution

* Designed and developed the UI using Java Swing
* Integrated backend `AlertService` with the dashboard
* Implemented alert visualization using color-coded rendering
* Ensured proper display of patient vitals and status

---

## 🚀 Future Enhancements

* Real-time monitoring using multithreading
* Graphical charts for patient history
* Database integration (MySQL)
* Login authentication system

---

## 🔗 Project Repository

GitHub Link: https://github.com/AtharvSri-hash/Healthcare-Dashboard.git

---

## 📌 Conclusion

This project successfully demonstrates a **real-time healthcare monitoring system** by combining backend logic with an interactive user interface.
It provides an efficient way to track patient health and detect critical conditions.
