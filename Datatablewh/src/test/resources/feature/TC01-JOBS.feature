Feature: Create job page with Automation in orange HRM
Background: Common Steps
   Given user lunch the chrome browser
   When user opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Scenario: TC01 JOBS record
    And User navigate the user creditionals
    |Username|Password|
    |Admin|admin123|
     Then browse to Jobs page
    |Job|Jobdec|Jobnote|
    |c1|cdec|cnote|
    |c2|cdec2|cnote2|
    |ca3|cdec3|cnote3|
    
    When click to logiut button
    Then close the browser
       