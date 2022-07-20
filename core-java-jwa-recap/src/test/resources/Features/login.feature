Feature: user validation

  Scenario Outline: check whether login is successful or not with valid credentials
    Given user is an login page
    When user enters <username> and <password>
    And user clicks on submit button
    Then user is navigated to the home page

    Examples: 
      | username        | password     |
      | "standard_user"   | "secret_sauce" |
      | "locked_out_user" | "secret_sauce" |
      | "problem_user"    | "secret_sauce" |
      | "daniel"          | "richard"      |
      | "tufail"          | "ahmed"        |
