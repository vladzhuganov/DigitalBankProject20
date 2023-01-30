Feature: This feature will allow user to successfully create an account

  Background: Verify Sign Up Here link redirects the user to the Sign Up Page
    Given user open website
    Then user entered correct URL
    When user clicks on the sign up here link
    Then verify user is on the registration page

  Scenario Outline: Verify user is able to choose a proper title from the drop down window
    When user clicks on please select dropdown menu
   # When user click on "<Title>" field
    Then Verify user can see the drop down window with title option
    And user clicks on proper selection "<selection>"
    Then verify chosen selection appears in the "<Title>" field
    Examples:
      | Title | selection |
      | Ms.   | Ms.       |
      | Mr.   | Mr.       |
      | Mrs.  | Mrs.      |