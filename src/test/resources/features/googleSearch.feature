Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever I want, and see relevant information

  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google

  Scenario: User searches title verification
    Given User is on Google home page
    When user searches for apple
    Then User should see apple in the title


  Scenario: User searches title verification
    Given User is on Google home page
    When user searches for "wooden spoon"
    Then User should see "wooden spoon" in the title