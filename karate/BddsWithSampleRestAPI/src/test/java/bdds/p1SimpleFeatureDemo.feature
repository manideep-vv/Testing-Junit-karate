@mani
Feature: Hitting the web service endpoints to check if it is working or not
Background:
  Given url  apiUrl
  And karate.log( "var value is ",apiUrl)
  Scenario: Hit get api
    Given path '/getEmpNames'