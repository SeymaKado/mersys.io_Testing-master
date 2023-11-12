Feature: Organizing Bank Accounts Functionality

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |


  @Parameters @Finance @Banking @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Organizing Bank Accounts
    Given The user click on the element in SidebarLocators
      | setup        |
      | parameters   |
      | bankAccounts |
    When The user click on the element in ModalMenuLocators
      | addButton |
    Then User data sent to ModalMenuLocators will be generated using JavaFaker
      | nameInput | fullName |
      | ibanInput | IBAN     |
    And The user click on the element in ModalMenuLocators
      | currencyComboBox |
      | <currencyType>   |
      | saveButton       |
    Then The message should be displayed
      | successMessage | success |

    And User data sent to ModalMenuLocators will be generated using JavaFaker
      | searchInput | fullNameSearch |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    And User data sent to ModalMenuLocators will be generated using JavaFaker
      | nameInput | fullName |
      | ibanInput | IBAN     |
    And The user click on the element in ModalMenuLocators
      | currencyComboBox   |
      | <currencyType>     |
      | inactivationButton |
      | saveButton         |
    Then The message should be displayed
      | successMessage | success |

    When The user deletes an item in ModalMenuLocators, generated using JavaFaker
    Then The message should be displayed
      | successMessage | success |

    Examples:
      | currencyType |
      | EURO         |
      | GBP          |
      | KGS          |
      | KZT          |
      | PKR          |
      | TRY          |
      | TZS          |
      | USD          |




