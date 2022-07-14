# Final Project Mobile Automation Test with Katalon
Mobile Automation Test as a submission for Hacktiv8's QA Automation with Katalon Final Project. <br>
This repository is (3/3) of a 3-part final project. <br>

Be sure to check out my other submissions: <br>
- [API Test Automation](https://github.com/hafidzfg/fp-btdp-api-testing) 
- [Web Test Automation](https://github.com/hafidzfg/fp-btdp-web-test)

## Made by:

Name: **Hafidz Firmansyah Ghufara** <br>
ParticipantID: **KSAT006ONL008**

## Resources:
- [Bank App demo](/APK/)
- Tools: Katalon Studio/Groovy

## Additional documentation
- **Test plan**: [Test Plan Web Automation Test](/documentation/Mobile_Automation_Test_Plan.docx)
- **Test scenario**: [Test Scenario Web Automation Test](/documentation/Mobile_Automation_Test_Scenario.xlsx)

## Test Environment
- Katalon Studio 8.3.5 build 208
- Java 1.8
- Appium 1.22.3
- Windows 11
- (Emulated) Samsung Galaxy S10/Android 9.0

## Concepts implemented
- Manual & script test case creation
- Mobile UI Testing
- Conditional (if-else) statement
- Test Case chaining/Call test case

## Test Cases
Here are several functionalities that are tested
1. User Credentials: <br>
- Create a profile (1 test case/UC 001) <br>
- Login (1 test case/UC 002) <br>
- Logout (1 test case/UC 003) <br>
2. Bank Accounts: <br>
- Add 1st bank account (1 test case/AC 001) <br>
- Add 2nd bank account (1 test case/AC 002) <br>
3. Transaction: <br>
- Add a new payee (1 test case/TR 001) <br>
- Make a payment (1 test case/TR 002) <br>
- Make a transfer (1 test case/TR 003) <br>

## Test Suites
- TS 001 User Credentials <br>
Consists of register profile, login, and logout related test cases
- TS 002 Accounts <br>
Consists of bank account related test cases
- TS 003 Transaction <br>
Consists of transaction related test cases

## Additional Notes
To ensure every test case work as intended, here are the flow of how the project should be executed:
1. TS 001 User Credentials:
- UC 001 Create a profile
- UC 002 Login to app
- UC 003 Verify logout
2. TS 002 Accounts:
- AC 001 Add 1st bank account
- AC 002 Add 2nd bank account
3. TS 003 Transaction:
- TR 001 Add a new payee
- TR 002 Make a new payment
- TR 003 Make a transfer

Each precondition is explained in **Test scenario**: [Test Scenario Web Automation Test](/documentation/Mobile_Automation_Test_Scenario.xlsx)
