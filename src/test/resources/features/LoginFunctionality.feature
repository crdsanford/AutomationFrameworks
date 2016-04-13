Feature: ThinkGeek Login Functionality

  Background: 
    Given as a non validated user
    When browse to the application
    Then ThinkGeek Home page should show with title "ThinkGeek | Join In. Geek Out."

  @functional
  Scenario: 1. Valid User Valid Password
    When user clicks Login Link
    Then Login Page should show with title "Account Login | ThinkGeek"
    When user enters "csbaritone@gmail.com" as user name
    And user enters "*Wizard1687*" as password
    And user clicks Login Button
    Then welcome message "HAI, HANDSOME CHUCK[]YOUR ACCOUNT" should show

  @smoke
  Scenario: 2. Valid User Invalid Password
    When user clicks Login Link
    Then Login Page should show with title "Account Login | ThinkGeek"
    When user enters "csbaritone@gmail.com" as user name
    And user enters "*Wizard1492*" as password
    And user clicks Login Button
    Then invalid email or password message "OOPS! You have supplied an invalid login. Please try again." should show

  @smoke
  Scenario Outline: 3. Invalid User In/Valid Password
    When user clicks Login Link
    Then Login Page should show with title "Account Login | ThinkGeek"
    When user enters "<email>" as user name
    And user enters "<password>" as password
    And user clicks Login Button
    Then invalid email or password message "OOPS! You have supplied an invalid login. Please try again." should show

    Examples: 
      | email                 | password         |
      | csbaritone1@gmail.com | *Wizard1687*     |
      | siputosi@gmail.com    | invalid password |
      |                       |                  |

  @functional
  Scenario: 4 DropDown Login Valid User Valid Password
    When user mouses over Login Link
    Then dropdown login input boxes should show
    When user enters "csbaritone@gmail.com" in email input box
    And user enters "*Wizard1687*" in password input box
    And user clicks Go Button
    Then Login Page should show with title "Account Login | ThinkGeek"
    And welcome message "HAI, HANDSOME CHUCK[]YOUR ACCOUNT" should show
