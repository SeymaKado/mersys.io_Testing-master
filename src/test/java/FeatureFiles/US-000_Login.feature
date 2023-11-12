Feature: Login

  @Login @Smoke @Regression
  Scenario:  User attempts negative and positive login
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | loginTest | 4 |