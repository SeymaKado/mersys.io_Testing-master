Feature: Bank Account Configuration

  Background: Login
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @School @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Locations
    When The user click on the element in SidebarLocators
      | setup                |
      | schoolSetup          |
      | schoolSetupLocations |
    When The user click on the element in ModalMenuLocators
      | addButton |
    Then The user sending the keys in the ModalMenuLocators
      | nameInput      | <className>      |
      | shortNameInput | <classShortName> |
      | capacityInput  | <capacity>       |
    And The user click on the element in ModalMenuLocators
      | locationTypeSelect |
      | locationTypeOption |
    When The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    And The user click on the element in ModalMenuLocators
      | collocationButton |
      | collocationButton |
      | editButton        |
    When The user sending the keys in the ModalMenuLocators
      | nameInput      | <newClassName>      |
      | shortNameInput | <newClassShortName> |
      | capacityInput  | <newCapacity>       |
    Then The user click on the element in ModalMenuLocators
      | locationTypeSelect  |
      | locationTypeOption2 |
    And The user click on the element in ModalMenuLocators
      | inactivationButton |
      | saveButton         |
    And The message should be displayed
      | successMessage | success |

    And Delayed click on delete button
      | deleteIcon   |
      | deleteButton |
    And The message should be displayed
      | successMessage | success |

    Examples:
      | className   | classShortName | capacity | newClassName | newClassShortName | newCapacity |
      | Computer    | COMP-1         | 50       | Art          | ART-1             | 60          |
      | Mathematics | MATH-1         | 20       | Geography    | GEO-1             | 30          |
      | Geography   | GEO-1          | 30       | Mathematics  | MATH-1            | 20          |
      | Art         | ART-1          | 60       | Computer     | COMP-1            | 50          |