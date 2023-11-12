Feature: Position Transactions in Human Resources

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @HR @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Position to Human Resources
    And The user click on the element in SidebarLocators
      | humanResources |
      | humanSetup     |
      | humanPosition  |
    And The user click on the element in ModalMenuLocators
      | addButton |
    And The user sending the keys in the ModalMenuLocators
      | nameInput      | <name>      |
      | shortNameInput | <shortName> |
    And The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    And The user sending the keys in the ModalMenuLocators
      | searchInput | <name> |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    And The user sending the keys in the ModalMenuLocators
      | nameInput      | <newName>      |
      | shortNameInput | <newShortName> |
    And The user click on the element in ModalMenuLocators
      | inactivationButton |
      | saveButton         |
    And The message should be displayed
      | successMessage | success |

    When The user delete on the item in ModalMenuLocators
      | <newName> |
    Then The message should be displayed
      | successMessage | success |
    Examples:
      | name                | shortName | newName                    | newShortName |
      | Computer Teacher    | CT        | Mentoring Teacher          | Mnt_T        |
      | Mathematics Teacher | Math_T    | History Teacher            | Hist_T       |
      | Geography Teacher   | Geo_T     | Physical Education Teacher | PE_T         |
      | Art Teacher         | Art_T     | Biology Teacher            | Bio_T        |
      | Physics Teacher     | Phy_T     | Chemistry Teacher          | Chem_T       |










