@login @Test
Feature: Login to EBMS Page

  This feature file contains steps to Navigate to EBMS portal

  @P1
  Scenario: User navigates to EBMS Portal
    Given The user is on EBMS Dashboard Page
    Then  The user validates below URL coming on the page
    """
    https://mibenefits-qua.ebms.com/administrator/dashboard
    """
    *     The user clicks on Membership tab
    Then  The user validates below URL coming on the page
    """
    https://mibenefits-qua.ebms.com/administrator/membership
    """

  @P1
  Scenario: User navigates to EBMS membership Portal
    Given The user is on EBMS MemberShip Page
    Then  The user validates below URL coming on the page
    """
    https://mibenefits-qua.ebms.com/administrator/membership
    """