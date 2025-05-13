Feature: Create PAY Record Automation in orange HRM

Background: Common Steps
    #Given User START chrome browser
    When User OPEN URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "priya2" 
    When CLICK on logout button
    #Then CLOSE Browser
    
@FIRST
Scenario: TC01 
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "priya3" 
    When CLICK on logout button
    #Then CLOSE Browser
    
@SECOND    
Scenario: TC01 
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "priya4" 
    When CLICK on logout button
    #Then CLOSE Browser
@FIRST      
Scenario: TC01 
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "priya5" 
    When CLICK on logout button
    #Then CLOSE Browser