@Story3
Feature:  Do a register in the webpage of Liberpool
  Scenario: The user try to create a liberpool account

    #@ignore
    Given As a user i need to obtain a Liberpool account
    When The user open the create account page
    And The user type the email "picassoa23@mail.com" and the password "Test557950"
    And the user complete the below data
      |Dato            |Valor         |
      |Nombres         |Alberto Daniel|
      |Apellido Paterno|Picasso       |
      |Apellido Materno|Gonzalez      |
    And The date of birth is selected as 23_05_1992
    And The gender is selected
    Then The liverpool account is created