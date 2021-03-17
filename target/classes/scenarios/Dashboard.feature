Feature: Login EBMS

  This feature file contains steps to Login and navigate to EBMS tabs

  @P1
  Scenario: Login to EBMS Portal and navigate to membership Page
    Given The user launches the URL https://mibenefits-qua.ebms.com/
    When The user logins to the EBMS Portal using below credentials
      | username | miBenefitsTestAdmin |
      | password | m!83N3fiT$t35t      |
    Then  The user validates below URL coming on the page