# VFISLKBatch2
    
https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-5.0.0-20210120.zip


Session Notes, java class folder contains java class files and selenium class folder contains selenium code added,




Task 21 – Sep 17, 2021 (Continuation of task 20)
1. Create a new java project
2. Create a package - com.voya.orangetest
3. Create a class - LoginTest
4. Create @BeforeMethod and @AfterMethod annotation for setup and close the browser
5. Create test method (@Test) with name as “validCredentialTest” inside the LoginTest with assertion of url
6. Create test method (@Test) with name as “invalidCredentialTest” inside the LoginTest with assertion of error message
7. Create package - “com.voya.orangepages”
8. Create class - LoginPage, DashboardPage
9. Create page methods inside the class - LoginPage 
	Methods - enterUsername(), enterPassword(), clickOnLogin
10. Call the page methods inside the LoginTest (@Test) 


Task 16 – Sep 20, 2021  - COMPLETE TASK 
1.	Navigate onto https://demo.openemr.io/b/openemr/interface/login/login.php?site=default
2. Update username as admin
3. Update password as pass
4. Click on the login button
5. Click on Patient/Client and Click on Patients
6. Click Add New Patient
7. Add the first name, last name
8. Update DOB as today's date
9. Update the Sex
10. Click on the create new patient button above the form
11. Click on confirm create new patient button.
12. Print the text from alert box  (if any error before handling alert add 5 sec wait)
13. Handle alert 
14. Close the Happy Birthday popup
15. Get the added patient name and print in the console.
