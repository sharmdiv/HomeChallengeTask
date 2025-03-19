 N26 Pet Store API Task

## Project Description
This project provides a comprehensive API test automation solution for the Petstore Swagger API, focusing on the "pet" endpoints. The tests are implemented using TestNG and Rest Assured libraries to validate REST API functionality.

## Features
- CRUD Operations for Pet (Create, Read, Update, Delete)
- Positive and negative test cases
- Detailed validation of API responses (status codes, response bodies, headers)
- Error scenarios and performance testing
- Structured and reusable test code

## Prerequisites
Ensure the following tools and technologies are installed on your system:
- Java JDK 17+
- Maven 3.6.3+
- Stable Internet Connection
- Supported IDE (e.g., IntelliJ IDEA, Eclipse)

##Setup and Execution

Clone the respository from https://github.com/sharmdiv/Diva-Sharma 

### 2. Install Dependencies

Go to the folder DivaSharma_n26_API_Automation

Run the following command to install the required dependencies:
```bash
mvn clean install
```

### 3. Run Tests
Run All Tests
To execute all the test cases:
```bash
mvn test
```

Run a Specific Test Class
```bash
mvn test -Dtest=PetApiTest
```

(Also You Can Run Test Manually Using PetApiTest by Hitting the Run Button)

## Test Scenarios
The following 6 test scenarios are implemented, covering both positive and negative cases:

- Add a new pet (Create)
- Retrieve a pet by ID (Read)
- Update an existing pet (Update)
- Delete a pet (Delete)
- Retrieve a non-existing pet (Negative Case)
- Add a pet with invalid data (Negative Case)

## Technologies Used
- Java 17 – Programming language
- TestNG – Test framework for test execution and structure
- Rest Assured – API testing and validation library
- Maven – Build and dependency management tool
- Hamcrest – Assertions for response validation
- JSONPath – JSON parsing and validation
- Log4j – Logging framework

##  Troubleshooting
If the tests fail to run, try the following steps:

Verify the directory structure of the project.
-Reinstall dependencies using:
```bash
mvn clean install
```
-Confirm the Java version is JDK 17+ using:
```bash
java -version
```

-Ensure a stable internet connection for API requests.

### 🔧 Project Structure
Below is the project directory layout:
```bash
DivaSharma_n26_API_Automation/
├── src/
│   ├── main/                    # Placeholder for main source code (if needed)
│   └── test/
│       ├── java/
│       │   ├── baseUrl/         # Base URL configuration
│       │   │   └── PetStoreBaseUrl.java
│       │   ├── models/          # Data models for API payloads
│       │   │   └── Pet.java
│       │   └── tests/           # Test classes
│       │       └── PetApiTest.java
│       └── resources/           # TestNG XML configuration and additional resources
│           ├── README.md        # Project documentation
│           └── testng.xml       # TestNG suite configuration
├── target/                      # Build output directory
├── .gitignore                   # Files to exclude from version control
├── pom.xml                      # Maven project descriptor
└── External Libraries/          # Libraries and dependencies
```





