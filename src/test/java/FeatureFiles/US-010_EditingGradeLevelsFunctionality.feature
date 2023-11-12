Feature: Editing Grade Levels Functionality

  Background:
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  @Parameters @GradeLevel @Education @Smoke @Regression
  Scenario Outline: Adding, editing and deleting Grade Levels
    Given The user click on the element in SidebarLocators
      | setup       |
      | parameters  |
      | gradeLevels |

    When The user click on the element in ModalMenuLocators
      | addButton |
    Then The user sending the keys in the ModalMenuLocators
      | nameInput      | <gradeName>      |
      | shortNameInput | <gradeShortName> |
      | orderInput     | <order>          |
      | maxAppCount    | <maxAppCount>    |
    And The user click on the element in ModalMenuLocators
      | nextGradeBox |
      | gradeOption  |
      | saveButton   |
    And The message should be displayed
      | successMessage | success |

    And The user click on the element in ModalMenuLocators
      | collocationButton |
      | collocationButton |
      | editButton        |
    And The user sending the keys in the ModalMenuLocators
      | nameInput      | <newGradeName>      |
      | shortNameInput | <newGradeShortName> |
      | orderInput     | <newOrder>          |
      | maxAppCount    | <newMaxAppCount>    |
    And The user click on the element in ModalMenuLocators
      | nextGradeBox       |
      | gradeOption2       |
      | inactivationButton |
      | saveButton         |
    And The message should be displayed
      | successMessage | success |

    Then Delayed click on delete button
      | deleteIcon   |
      | deleteButton |
    And The message should be displayed
      | successMessage | success |

    Examples:
      | gradeName           | gradeShortName | order | maxAppCount | newGradeName         | newGradeShortName | newOrder | newMaxAppCount |
      | Beginner            | BG             | 1     | 70          | Beginner2            | BG2               | 7        | 10             |
      | Elementary          | EL             | 2     | 60          | Elementary2          | EL2               | 6        | 20             |
      | Intermediate        | IN             | 3     | 50          | Intermediate2        | IN2               | 5        | 30             |
      | Advanced            | ADV            | 4     | 40          | Advanced2            | ADV2              | 4        | 40             |
      | Honors              | HN             | 5     | 30          | Honors2              | HN2               | 3        | 50             |
      | Gifted and Talented | GFT            | 6     | 20          | Gifted and Talented2 | GFT2              | 2        | 60             |
      | Technical           | TEC            | 7     | 10          | Technical2           | TEC2              | 1        | 70             |







