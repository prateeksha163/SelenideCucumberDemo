@login @Test
Feature: Login and navigating to dashboard page

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

