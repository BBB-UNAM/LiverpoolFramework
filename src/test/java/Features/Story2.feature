@Story2
Feature: Do a searh with  brand =Samsumg, size = 48, and price = more than  $ 10 000

  #@ignore
  Scenario: Searching a Smart TV using different filters.
    Given As a user i need a search a product using the product characteristics
    When The user type  "Smart TV"  in the search bar
    And The user selects a SAMSUMG filter
    And The user selects a 43 PULGADAS filter
    And The user selects MAS DE $10 000 filter
    Then The tv with the characteristics selected is displayed as first option