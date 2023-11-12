Feature: Adding New Fields to the Admin Panel

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Parameters @Fields @Smoke
  Scenario Outline: Adding, editing and deleting New Fields to the Admin Panel
    Then The user click on the element in SidebarLocators
      | setup      |
      | parameters |
      | fields     |
    And The user click on the element in ModalMenuLocators
      | addButton |
    When The user sending the keys in the ModalMenuLocators
      | nameInput | <name> |
      | codeInput | <code> |
    Then Adding New Fields to the Admin Panel
      | fieldTypesOptions |
      | <optionsLoc>      |
      | saveButton        |
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
      | codeInput | <newCode> |
    Then Editing Fields to the Admin Panel
      | fieldTypesOptions |
      | <newOptionsLoc>   |
      | saveButton        |
    And The message should be displayed
      | successMessage | success |

    When The user delete on the item in ModalMenuLocators
      | <newName> |
    Then The message should be displayed
      | successMessage | success |


    Examples:
      | name  | code | optionsLoc        | newName | newCode | newOptionsLoc     |
      | type1 | NU   | numberOption      | type11  | COMP2   | textOption        |
      | type2 | TXT  | textOption        | type12  | MF2     | memoFieldOption   |
      | type3 | INT  | integerOption     | type13  | LGC2    | logicalOption     |
      | type4 | LOV  | listOfValueOption | type14  | DT2     | dateOption        |
      | type5 | DT   | dateOption        | type15  | LOV2    | listOfValueOption |
      | type6 | LGC  | logicalOption     | type16  | INT2    | integerOption     |
      | type7 | MF   | memoFieldOption   | type17  | TXT2    | textOption        |
      | type8 | COMP | compositeOption   | type18  | NU2     | compositeOption   |
