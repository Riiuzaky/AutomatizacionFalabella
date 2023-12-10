#author: Jonathan Cruz
#date: 04/12/2023

  Feature: buy object
    I as a client need add object to car for buy.

  @LoginSuccessFully
  Scenario: add object to car
    Given the user navigates to the page falabella
    When add xbox series S to car
    Then should see the main page