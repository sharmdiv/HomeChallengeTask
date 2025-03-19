# Monefy - Appium Automation

Appium Mobile Automation framework by Sagar Biradar.

This is a Appium with Java framework. This framework is built on Maven which leverages TestNG as Testing framework.

## Requirement

* [JDK 1.8](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/download.cgi)
* [nodejs](https://nodejs.org/en/download/)
* [Appium Server](https://appium.io/docs/en/about-appium/intro/#getting-started)

## Installation/Setup

* **JDK installation**
  * After JDK installation, add JAVA_HOME as environment variable. 
  * Add PATH variable as JAVA_HOME/bin.
* **Maven installation**
  * Download Maven binary file.
  * Extract the folder and add folder path as MAVEN_HOME under environment variable.
  * Add MAVEN_HOME/bin under environment path variable.
* **Appium installation**
  * Install nodejs.
  * Run `npm install -g appium` to install Appium.

## Project Details

* This project uses Maven as build dependency tool.
* It consists of Page Object Model as Design pattern.
* It also uses Page Factory mechanism for Page Objects which comes from Selenium APIs.
* For Test Execution Reporting, framework consumes ExtentReports.
* This framework is scaled to run tests both on Android as well as iOS platforms.


## Test Execution

* Clone the repository. 
* Open Terminal/cmd.
* Navigate to root folder.
* Tests are getting executed based on the class and parameter name provided under `testSuite.xml` file. This xml file provides a parameter to select platform(Android/iOS) on which the test cases can be executed
* Execute command `mvn clean test`

## Test Execution Report

* After tests get executed, `index.html` file will be generated under project root folder which can be opened using system web browser
* TestNG `emailable-report.html` report can be found under target/surefire-reports