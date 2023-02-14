@Story1
Feature: Search Bar
  As a user i need to do some validations in Liverpool webpage

  #@ignore
  Scenario: Do a simple Search in the liverpool page.
    Given As a user i need to do a search about PayStation console
    When The user write "PlayStation 5" in the search bar.
    Then Multiple articule console otions are displayed.

  #@ignore
  Scenario: No articles found searching
    Given As a user i need to do a search without results
    When The user write "jfkejfwnfjknewnfr" in the search bar
    Then The message of non articles found is displayed

  #@ignore
  Scenario: Search by brand, physical characteristic, model
    Given As a user i need to do a search using multiple parameters
    When The user type "Consola portatil nintendo switch lite" in the search bar
    Then The fisrt search result is the finded product with the characteristics