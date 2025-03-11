# OpencartV121 - Automated Testing Framework

## 📌 Project Overview
OpencartV121 is an automated testing framework for the OpenCart e-commerce platform. This project enables automated functional testing of OpenCart applications using Selenium and TestNG. It ensures that critical workflows in OpenCart are tested efficiently, helping to maintain software quality.

## 🚀 Features
- Automated test execution using **Selenium WebDriver**
- Test orchestration with **TestNG**
- Generates **detailed HTML reports** for test execution
- Supports multiple browsers for cross-browser testing
- Modular and scalable test structure

## 🛠️ Technologies Used
- **Java** (Programming Language)
- **Selenium WebDriver** (Automation Framework)
- **TestNG** (Test Execution and Reporting)
- **Extent Reports** (Test Reporting)
- **Maven** (Dependency Management)
- **Jenkins** (CI/CD)

## 📂 Project Structure
```
OpencartV121/
│── src/
│ ├── main/  # Application code
│ ├── test/  # Test scripts
│── reports/  # Test execution reports
│── pom.xml  # Maven dependencies
│── testng.xml  # TestNG configuration
│── README.md  # Project documentation
```

## 📖 How to Set Up and Run Tests
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/VenkateshEnakonda7/OpencartV121.git
cd OpencartV121

mvn clean install
mvn test
