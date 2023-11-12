Feature: Department Configuration

  Background: Login
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @School @Departments @Smoke @Regression
  Scenario Outline: Adding, editing and deleting new department
    When The user click on the element in SidebarLocators
      | setup                  |
      | schoolSetup            |
      | schoolSetupDepartments |
    When The user click on the element in ModalMenuLocators
      | addButton |
    Then The user sending the keys in the ModalMenuLocators
      | nameInput | <departmentName> |
      | codeInput | <departmentCode> |
    When The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    When The user click on the element in ModalMenuLocators
      | collocationButton |
      | collocationButton |
      | editButton        |
    Then The user sending the keys in the ModalMenuLocators
      | nameInput | <newDepartmentName> |
      | codeInput | <newDepartmentCode> |
    When The user click on the element in ModalMenuLocators
      | inactivationButton |
      | saveButton         |
    Then The message should be displayed
      | successMessage | success |

    When Delayed click on delete button
      | deleteIcon   |
      | deleteButton |
    And The message should be displayed
      | successMessage | success |

    Examples:
      | departmentName  | departmentCode | newDepartmentName | newDepartmentCode |
      | IT department   | 001IT          | IT department1    | 001IT1            |
      | Accounting      | 003A           | Accounting1       | 003A1             |
      | Human Resources | 002H           | Human Resources1  | 002H1             |
      | Administration  | 004Adm         | Administration1   | 004Adm1           |