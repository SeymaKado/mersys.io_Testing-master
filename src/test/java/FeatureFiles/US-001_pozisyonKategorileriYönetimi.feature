Feature: Position Categories Management

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @HR @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Position Categories
    Then The user click on the element in SidebarLocators
      | humanResources          |
      | humanSetup              |
      | humanPositionCategories |
    And The user adds data named "<name>" to the relevant section
    When The message should be displayed
      | successMessage | success |
    Then The user replaces the data named "<name>" with the data named "<newName>" in the relevant section
    And The message should be displayed
      | successMessage | success |
    When The user deletes the data named "<newName>" in the relevant section
    Then The message should be displayed
      | successMessage | success |
    Examples:
      | name      | newName   |
      | QA Tester | QA Lead   |
      | Dev Op    | Developer |
      | Developer | Dev Lead  |