Feature: CRM 24 login option
  User Story: As a user, I should be able to login to the app
  Accounts: hr17

  @crm @smoke
  Scenario: User is able to check "Remember me on this computer" option
    Given User is on CRM24 login page
    When User sees "Remember me on this computer" option
    And User clicks on "Remember me on this computer" option
    Then User should be able to see the button checked
