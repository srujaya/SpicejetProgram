Project Title
Automated Testing of the SpiceJet Flight Booking System

Description
This project aims to develop an automated testing framework for the SpiceJet flight booking system using Java and Selenium WebDriver within the Eclipse IDE. The automation scripts will navigate through the SpiceJet website, perform various booking-related actions, and validate the functionality to ensure a seamless user experience.

Test Objectives
Automate Functional Testing: Develop scripts to automatically test the functionalities of the SpiceJet flight booking system.
Ensure Reliability: Verify that all features work as expected under different scenarios.
Enhance Efficiency: Reduce manual testing efforts by automating repetitive test cases.
Validate User Experience: Ensure that the booking process is smooth and error-free for users.
Preconditions
The user must be logged in to the SpiceJet ticket booking application.
The user must have access to the booking feature.
Demo URL
You can use the following URL for testing: https://www.spicejet.com/

Technologies Used
Programming Language: Java
Automation Tool: Selenium WebDriver
IDE: Eclipse
Build Tool: Maven
Testing Framework: TestNG/JUnit
Version Control: Git
Task Description
Set Up Selenium Project

Initialize a Selenium project in Java using Eclipse.
Configure Maven dependencies for Selenium and TestNG/JUnit.
Open Web Browser and Navigate

Write code to launch a web browser (e.g., Chrome) and navigate to SpiceJet Flight Booking System.
Validate Sign-Up Page

Automate the process of filling out mandatory and non-mandatory fields on the Sign-Up page.
Ensure proper validation messages are displayed for incorrect inputs.
Login Functionality

Automate logging in using a dummy email ID and password.
Handle popup fields that appear after clicking the Login button on the top of the page.
Search for Flights

Automate flight search by entering dummy origin and destination information.
Cover the following trip types:
One-way
Round Trip
Select Flight and Proceed to Booking

Automate selecting a flight from the search results.
Navigate to the booking page.
Fill Booking Form

Automate filling out the booking form with dummy passenger details and payment information.
Ensure all mandatory fields are correctly populated.
Verify Booking Success

Verify that the booking was successful by checking for a booking confirmation message on the resulting web page.
Validate Booking Page Fields

Automate validation of the following fields on the booking page:
Check-in
Flight Status
Manage Booking
Close Web Browser

Automate the process of closing the web browser once testing is complete.
Automate Test Suite Execution

Write scripts to run the test suite automatically on a regular basis (e.g., using cron jobs or Jenkins for CI/CD integration).
Test Cases
Positive Scenarios
Successful Login: Verify that a user can log in with valid credentials.
Flight Search: Verify that flights can be searched successfully with valid origin and destination.
One-way Trip Booking: Verify booking flow for one-way trips completes successfully.
Round Trip Booking: Verify booking flow for round trips completes successfully.
Form Validation: Ensure all mandatory fields accept valid inputs without errors.
Booking Confirmation: Confirm that a booking confirmation message appears after successful booking.
Field Validation: Ensure check-in, flight status, and manage booking features work as expected.
Negative Scenarios
Invalid Login: Attempt to log in with incorrect email or password and verify appropriate error messages.
Flight Search with Invalid Data: Search for flights with invalid origin or destination and verify error handling.
Incomplete Booking Form: Attempt to submit the booking form with missing mandatory fields and verify validation messages.
Invalid Payment Information: Enter incorrect payment details and verify that the system rejects the booking.
Navigation Errors: Attempt to navigate to restricted pages without proper authentication and verify access is denied.
Running the Test Suite Automatically
To run the test suite automatically on a regular basis, follow these steps:

Set Up Continuous Integration (CI)

Use a CI tool like Jenkins to schedule automated test runs.
Create a Jenkins Job

Configure a new Jenkins job linked to your Git repository.
Set build triggers (e.g., daily, weekly) as per requirements.
Configure Build Steps

Add build steps to install dependencies, compile the project, and execute test cases using Maven commands:
mvn clean install
mvn test
Post-build Actions

Configure post-build actions to archive test reports and notify stakeholders of test results.
Contributing
Contributions are welcome! Please follow these steps to contribute:

Fork the Repository
Create a Feature Branch
git checkout -b feature/YourFeature
Commit Your Changes
git commit -m "Add Your Feature"
Push to the Branch
git push origin feature/YourFeature
Create a Pull Request
