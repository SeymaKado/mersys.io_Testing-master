Feature: Editing Discounts Functionality

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Parameters @Finance @Banking @Discounts @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Discounts
    Given The user click on the element in SidebarLocators
      | setup      |
      | parameters |
      | discounts  |
    When The user click on the element in ModalMenuLocators
      | addButton |
    Then The user sending the keys in the ModalMenuLocators
      | discountDescription | <discountDescription> |
      | codeInput           | <discountCode>        |
      | discountPriority    | <discountPriority>    |
    And The user click on the element in ModalMenuLocators
      | inactivationButton |
      | inactivationButton |
      | saveAndCloseButton |
    And The message should be displayed
      | successMessage | success |

    And The user sending the keys in the ModalMenuLocators
      | searchDescInput | <discountDescription> |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    And The user sending the keys in the ModalMenuLocators
      | discountDescription | <newDiscountDescription> |
      | codeInput           | <newDiscountCode>        |
      | discountPriority    | <newDiscountPriority>    |
    And  The user click on the element in ModalMenuLocators
      | inactivationButton |
      | inactivationButton |
      | saveAndCloseButton |
    And The message should be displayed
      | successMessage | success |

    Then The user sending the keys in the ModalMenuLocators
      | searchDescInput | <newDiscountDescription> |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on delete button
      | deleteIcon   |
      | deleteButton |
    And The message should be displayed
      | successMessage | success |

    Examples:
      | discountDescription | discountCode | discountPriority | newDiscountDescription | newDiscountCode | newDiscountPriority |
      | DESC1               | DC1          | 10               | DESC7                  | DC7             | 70                  |
      | DESC2               | DC2          | 20               | DESC6                  | DC6             | 60                  |
      | DESC3               | DC3          | 30               | DESC5                  | DC5             | 50                  |
      | DESC4               | DC4          | 40               | DESC4                  | DC4             | 40                  |
      | DESC5               | DC5          | 50               | DESC3                  | DC3             | 30                  |
      | DESC6               | DC6          | 60               | DESC2                  | DC2             | 20                  |
      | DESC7               | DC7          | 70               | DESC1                  | DC1             | 10                  |







