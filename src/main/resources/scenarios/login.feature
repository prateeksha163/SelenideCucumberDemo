@login @Test
Feature: Login EBMS

  This feature file contains steps to Login and navigate to EBMS tabs

@P1
  Scenario: Login to EBMS Portal and navigate to membership Page
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
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
  Scenario: The user Login to EBMS Portal and navigates to claims Page
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    *     The user clicks on Claims tab
    Then  The user validates below URL coming on the page
    """
    https://mibenefits-qua.ebms.com/administrator/claims
    """

  @P1
  Scenario: The user Login to EBMS Portal and clicks on Enrolment
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    *     The user clicks on Begin New Enrollment tab


  @P1
  Scenario Outline: The user clicks on multiple tabs coming in EBMS Portal
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    *     The user clicks on below <tab> in Dashboard Page
    Examples:
      | tab        |
      | Claims     |
      | Membership |

  @P1
  Scenario: The user Login to EBMS Portal and compares data in dashboard page and Membership page
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    Then The user clicks on EBMS > A&K Railroad Materials, Inc. - 00716 tab
    Then The user gets the values in block of business heading
    Then The user clicks on Cancel tab
    *     The user clicks on Membership tab
    Then The user clicks on EBMS > A&K Railroad Materials, Inc. - 00716 tab
    Then The user compares the values in Dashboard Page and membership page

  @P1
  Scenario: The user Login to EBMS Portal and validate the enrolment dropdown
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    *     The user clicks on Enrollments tab
    *     The following dropdown values should be visible in Enrollment
    |Ongoing Enrollments|
    |Open Enrollments   |





