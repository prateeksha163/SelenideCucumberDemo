@login @Test
Feature: Login and navigating to membership page

@P1
Scenario: User navigates to EBMS membership Portal
Given The user is on EBMS MemberShip Page
Then  The user validates below URL coming on the page
    """
    https://mibenefits-qua.ebms.com/administrator/membership
    """