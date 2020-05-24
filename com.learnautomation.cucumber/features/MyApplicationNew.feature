Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then User should be able to login successfully
    Then application should be closed

    Examples: 
      | username             | password  |
      | alex.kgec@gmail.com  | password  |
      | alex.kgec1@gmail.com | password1 |
      | alex.kgec2@gmail.com | password2 |
				
     
  