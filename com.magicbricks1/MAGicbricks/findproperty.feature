@findproperty
Feature: Checking the user is able to Find the Property value
    
    
    Scenario: To verify when the user is enter the correct data, options should be display.
    Given User is on home page
    When I click on the post free property ad
    When I click the find property value.
    And Enter the correct details in Locality name.
    Then Options should be displayed.
    
    Scenario: To verify when the user enters incorrect data display the one alert box.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the incorrect details in Locality name.
    Then Showing one alert box.
    

    Scenario: To verify the user is select the plot property option Enter the correct the details.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the Locality name.
    And select the plot property type.
    And Enter the correct details in Super Area.
    Then Click on the check now button.
    
    Scenario: To verify the user is select the plot property option enter the incorrect details.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the Locality name.
    And select the plot property type.
    And Enter the incorrect details in Super Area.
    Then Showing one alert box.
    
    Scenario: To verify the user is able to select the Flat property type.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the Locality name.
    And select the Flat property type and showing different options.
    And select the requirement of BHk types.
    And Click on the 1BHK and show different options.
    And Enter the details in the super area.
    And Click on the select Floor and choose any Floor.
    And Click on the open and choose any one requirement of your choice.
    Then Click on the check now.
    
    Scenario: To verify the user is able to select the Builder Floor type.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the Locality name.
    And select the Builder Floor type and showing different options.
    And select the requirement of BHK options.
    And Click on the 1BHK and showing different options.
    And Enter the details in super area.
    And Click on the select Floor and choose any Floor.
    And Click on the open and choose any one requirement of your choice.
    Then Click on the check now.
    
    Scenario: To verify the user is able to select the House/Villa type.
    Given User is on home page
    When I click on the post free property ad
    When I Click on the find property value.
    And Enter the Locality name.
    And select the House/Villa type and display the BHK options.
    And select the requirement of BHK options.
    And Click on the 1BHK and showing different options.
    And Enter the details in super area.
    And Click on the select Floor and choose any Floor.
    And Click on the open and choose any one requirement of your choice.
    Then Click on the check now.