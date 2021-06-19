Feature: Validating Login function of Adactin Hotel

  Scenario Outline: Validating Adactin page Details with valid credential
    Given User is on Adactin Web Page
    When User enters "<userName>"and "<Password>"
    And should click login button
    And User Should enters"<Location>","<Hotels>","<RoomType>","<NoOfRoom>","<CheckIn>","<CheckOut>","<Adults>","<Children>"
    And User should click search button
    And User should click select button and continue button
    And User should book a hotel "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<ExpiryDate>","<ExpiryYear>","<ccv>"
    And User should click Book Now
    And User shouldget the OrderNo
    Then User sould get verify message

    Examples: 
      | userName    | Password    | Location | Hotels      | RoomType | NoOfRoom | CheckIn    | CheckOut   | Adults  | Children | firstName | lastName | billingAddress | creditCardNo     | creditCardType   | ExpiryDate | ExpiryYear | ccv |
      | neelakandan | neelakandan | Sydney   | Hotel Creek | Standard | 1 - One  | 24/04/2021 | 25/04/2021 | 1 - One | 1 - One  | Nithya    | Devi     | chennai        | 7654232312313234 | American Express | may        |       2025 | 2345 |
