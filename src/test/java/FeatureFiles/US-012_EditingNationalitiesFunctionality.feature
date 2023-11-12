Feature: Editing Nationalities Functionality

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Parameters @Education @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Nationalities
    Given The user click on the element in SidebarLocators
      | setup         |
      | parameters    |
      | nationalities |

    When The user click on the element in ModalMenuLocators
      | addButton |
    Then The user sending the keys in the ModalMenuLocators
      | nameInput | <nationalityName> |
    And The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    And The user sending the keys in the ModalMenuLocators
      | searchInput | <nationalityName> |
    And The user click on the element in ModalMenuLocators
      | searchButton |
    And Delayed click on edit button
      | editButton |
    And The user sending the keys in the ModalMenuLocators
      | nameInput | <newNationalityName> |
    And  The user click on the element in ModalMenuLocators
      | saveButton |
    And The message should be displayed
      | successMessage | success |

    Then The user delete on the item in ModalMenuLocators
      | <newNationalityName> |
    And The message should be displayed
      | successMessage | success |

    Examples:
      | nationalityName | newNationalityName |
      | British/*       | Swedish/*          |
      | Scottish/*      | Swiss/*            |
      | Irish/*         | Estonian/*         |
      | Welsh/*         | Latvian/*          |
      | Danish/*        | Austrian/*         |
      | Finnish/*       | Belgian/*          |
      | Norwegian/*     | French/*           |














