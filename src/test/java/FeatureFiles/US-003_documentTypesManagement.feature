Feature: Document Types Management

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Docs @Smoke
  Scenario Outline: Adding, editing and deleting Document Types
    Then The user click on the element in SidebarLocators
      | setup         |
      | parameters    |
      | documentTypes |
    And The user click on the element in ModalMenuLocators
      | addButton |
    When The user sending the keys in the ModalMenuLocators
      | nameInput | <name> |
    Then The user click on the element in ModalMenuLocators
      | stage        |
      | <stageTypes> |
    And Pressing ESC
    When The user sending the keys in the ModalMenuLocators
      | description | <descriptionText> |
    Then The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    When The user sending the keys in the ModalMenuLocators
      | searchInput | <name> |
    Then The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    When The user sending the keys in the ModalMenuLocators
      | nameInput | <newName> |
    Then The user click on the element in ModalMenuLocators
      | stage         |
      | <stageTypes2> |
    And Pressing ESC
    When The user sending the keys in the ModalMenuLocators
      | description | <descriptionText2> |
    Then The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    When The user delete on the item in ModalMenuLocators
      | <newName> |
    Then The message should be displayed
      | successMessage | success |


    Examples:
      | stageTypes  | name  | newName | stageTypes2 | descriptionText | descriptionText2 |
      | studentReg  | type1 | type6   | dismissal   | type1 added     | type6 added      |
      | examination | type2 | type5   | contract    | type2 added     | type5 added      |
      | employment  | type3 | type4   | certificate | type3 added     | type4 added      |
      | certificate | type4 | type3   | employment  | type4 added     | type3 added      |
      | contract    | type5 | type2   | examination | type5 added     | type2 added      |
      | dismissal   | type6 | type1   | studentReg  | type6 added     | type1 added      |

