@Legalservices
Feature: Checking the user is able to navigate the Legalservices
    
    Scenario: To verify when user Enter the valid details in the talk to experts.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the sell button
    And Click on the legal services.
    And Enter the valid details in Talk to experts.
    And Accept the privacy the policy details.
    Then Click on the Get a callback.
    
    Scenario: To verify when the user Enter the invalid details in the talk to experts.
    Given User is on home page
    When I click on the post free property ad
    When I click on the sell button
    And Click on the legal services.
    And Enter the Invalid details in Talk to experts.
    And Accept the privacy policy details.
    Then Click on the Get a callback.
    Then Showing an Alert box message to enter the valid data. 
