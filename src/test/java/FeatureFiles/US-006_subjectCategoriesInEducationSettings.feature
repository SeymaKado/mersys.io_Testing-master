Feature: Subject Categories in Education Settings

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Education @Regression
  Scenario Outline: Adding, editing and deleting Subject Category in Education Settings
    And The user click on the element in SidebarLocators
      | educationButton   |
      | educationSetup    |
      | subjectCategories |
    And The user click on the element in ModalMenuLocators
      | addButton |
    And The user sending the keys in the ModalMenuLocators
      | nameInput | <categoryName> |
      | codeInput | <categoryCode> |
    And The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    And The user sending the keys in the ModalMenuLocators
      | searchInput | <categoryName> |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    And The user sending the keys in the ModalMenuLocators
      | nameInput | <newCategoryName> |
      | codeInput | <newCategoryCode> |
    And The user click on the element in ModalMenuLocators
      | inactivationButton |
      | saveButton         |
    And The message should be displayed
      | successMessage | success |

    When The user delete on the item in ModalMenuLocators
      | <newCategoryName> |
    Then The message should be displayed
      | successMessage | success |

    Examples:
      | categoryName | categoryCode | newCategoryName | newCategoryCode |
      | Sayisal      | 05           | Sozel           | 04              |
      | Teknik       | Math_T       | Pratik          | Hist_T          |
      | Hibrit       | Geo_T        | Online          | PE_T            |

