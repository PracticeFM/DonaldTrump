Feature: Log In 

@Bcamp
Scenario: Verify User Can log in

Given Open Application "<URL>"
Then Click on Sing In button
Then Click on Sign In Link
Then Enter User Email 
Then Enter User Password
Then Click on Sing In
Then Verify User Can log in 
