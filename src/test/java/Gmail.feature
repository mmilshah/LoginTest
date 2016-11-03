
  Feature: As a user
    I want to Login Gmail account

    Scenario: I am checking Login Functionality
      Given gmail url
      When i enter valid id and password
      And click on sign button
      Then I can access gmail account