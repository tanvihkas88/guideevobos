Feature: Search functionality
  AS a user I want to test search functionality

  @sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘new’ link
    Then I navigate to ‘new Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make   | model    | location           | price    |
      | Audi   | A1       | New South Wales    | $40,000  |
      | BMW    | 3 Series | Queensland         | $30,000  |
      | Ford   | Escape   | Victoria           | $50,000  |
      | Honda  | Civic    | Northern Territory | $40,000  |
      | MG     | 6 Plus   | New South Wales    | $ 40,000 |
      | Nissan | Aura     | Victoria           | $ 40,000 |

    @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make1>"
    And I select model "<model1>"
    And I select location "<location1>"
    And I select price "<price1>"
    And I click on Show used vehicle
    Then I should see the make "<make1>" in results

    Examples:
      | make1   | model1    | location1           | price1    |
      | Audi   | A1       | New South Wales    | $40,000  |
      | BMW    | 3 Series | Queensland         | $30,000  |
      | Ford   | Escape   | Victoria           | $50,000  |
      | Honda  | Civic    | Northern Territory | $40,000  |
      | MG     | 6 Plus   | New South Wales    | $ 40,000 |
      | Nissan | Aura     | Victoria           | $ 40,000 |



