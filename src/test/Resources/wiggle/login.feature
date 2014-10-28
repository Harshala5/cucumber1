Feature: Logging in  to the wiggle website
  As a customer
  I wants to log in to the wiggle website
  So that I can access the checkout sections of the site

  @login
  Scenario: Valid credentials
    Given I am on the wiggle login page
    When I am sign in with the email and password
    Then  I should be logged in

  @login_negative
  Scenario: Unregistered users
    Given I am on the wiggle login page
    When I am sign in with the email "unregisterd_user@wiggle.co.uk" and password "123Password"
    Then I should see the message "Sorry we could not log you in"
