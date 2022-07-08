@postproperty
Feature: Checking the user is able to Post Free Property Ad


    
    @SelltheLandpropertypostinthepostfreepropertyad
    Scenario: To verify the user is able to sell the post agricultureland property in post free property ad.
    Given User is on home page
    When I click on the post free property ad
    When Click on the Sell button
    And select the property details.
    And select the property type.
    And Enter the property location details.
    And Enter the details in property features.
    And Enter the deatils on your property area.
    And select the transaction type,property availability.
    And Enter the price details.
    Then Upload the land photos.
    Then Click on the Post property.
    
    @SelltheFlat/Apartmentpropertypostinthepostfreepropertyad
    Scenario: To verify the user is able to sell the post flat/apartment property in post free property ad.
    Given User is on home page
    When I click on the post free property ad
    When Click on the Sell button
    And Select the property details.
    And Select the property type.
    And Enter the property location details.
    And Enter the property features.
    And Enter the details on your property area.
    And Select the transaction type,property availability.
    Then Upload the land photos.
    Then Click on the post property.
    
    @RenttheLandpropertypostinthepostfreepropertyad
     Scenario: To verify the user is able to rent the post agricultural land property in the post free property ad.
     Given User is on home page
    When I click on the post free property ad
    When Click on the rent button 
    And Select the property details.
    And Select the property type.
    And Enter the property location details.
    And Enter the details on your property area.
    And Enter the rent/lease details.
    Then Upload the land photos.
    Then Click on the post property.
    
    @RenttheFlat/Apartmentpropertypostinthepostfreepropertyad
    Scenario: To verify the user is able to rent the post flat/apartment property in the post free property ad. 
    Given User is on home page
    When I click on the post free property ad
    When Click on the rent button 
    And Select the property details.
    And Select the property type.
    And Enter the property location deatails.
    And Select the property features.
    And Enter the details on your property area.
    And Select the transaction type,property availability.
    And Enter the rent/lease details.
    Then Upload the land photos.
    Then Click on the post property.