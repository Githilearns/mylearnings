Feature: Text Box Form Submission
  As a user
  I want to be able to enter my name in a text box and submit it
  So that I can see my entered name displayed on the page

  Scenario: Successfully submit full name in the text box
    Given the user is on the text box page
    Then the text box page should be displayed
    When the user enters their "John" in the Full Name text box
    And the user clicks the submit button
    Then the entered name should be displayed at the bottom of the page