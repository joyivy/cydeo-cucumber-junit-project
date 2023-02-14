Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin.

  Scenario: Login as librarian

    Given user is on the login page of the library application
    When  user enters librarian usurname
    And user enters librarian password
    Then  user should see the dashboard


    Scenario: Login as student
      Given user is on the login page of the library application application
      When  user enters student usurname
      And user enters student password
      Then  user should see the dashboard