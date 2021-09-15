# VFISLKBatch2
    
    Testng setup
   https://1drv.ms/u/s!AmN6x7VqmTjwggaacC-GOhh5fVn3?e=VC9359
    
    
    
    ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://nasscom.in/");
    
    

https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm



ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());


Session Notes, java class folder contains java class files and selenium class folder contains selenium code added,

ChromeDriver - 93.0 - https://chromedriver.storage.googleapis.com/93.0.4577.15/chromedriver_win32.zip
  
  
Task 18 – Sep 11, 12, 2021
Task 1 
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
12. Print the text from alert box (if any error before handling alert add 5 sec wait)
13. Handle alert 
14. Close the Happy Birthday popup
15. Get the added patient name and print in the console.
  
  
Task 2 (this task will be bit complicated so give a try otherwise we can do it in session) 
1.	Navigate onto https://www.royalcaribbean.com/account/signin
2.	Click Create an account
3.	First Name as Dennis 
4.	Last Name as Rich
5.	Select Month as April  
6.	Day as 4
7.	Year as 1990
8.	Country as India
9.	Leave email address as blank
10.	Enter password as pass@123
11.	Select as “What was your first car's make or model?”
12.	Type any answer
13.	Accept the terms and condition 
14.	Click done 











