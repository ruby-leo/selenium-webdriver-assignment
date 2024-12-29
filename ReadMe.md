# StarAgile - Selenium WebDriver Assignment

### Frameworks and Libraries used
- Selenium WebDriver 4: For browser automation
- Language: Java
- Cucumber BDD:  To describe scenarios and implement test cases
- Page Factory pattern: To layout page objects
- Allure reports: For reporting test results
- Maven: Build tool
- Parallel test case execution: Done using Maven Sure Fire Plugin

### Assignment links and notes
- Assignment 1 [Feature file link](/src/test/resources/features/F01ClickLink.feature)
- Assignment 2 [Feature file link](/src/test/resources/features/F02LoginFunctionPOM.feature)
- Assignment 3 [Feature file link](/src/test/resources/features/F03DropdownFunction.feature)
- Assignment 4 [Feature file link](/src/test/resources/features/F04RegistrationFunctionality.feature)
- Assignment 5 - Added screenshots to all the testcases (Both Pass and Fail cases) and attached it to the Allure Report. Related code is [here](/src/test/java/StepDefinitions/Hooks.java#L27).

Kindly note that one of the test cases (related to registration function with invalid input) failed due to a bug in the app.
### Test Report
Test report is present [here](/allure-report/index.html). This file can be downloaded and opened with any browser to see the results. Alternatively, I have also attached screenshot of the test report below.
![Alt text](/src/test/resources/Allure%20Report%20Screenshot.png?raw=true "Title")

### Command to run the test cases
mvn clean test