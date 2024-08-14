Feature: HomePage

  Scenario Template: apply loan

    Given user is on the login page
    When user click on getstarted
    Then user click on getstarted again
    Then user enter amount as <amount> and <loanperiod>
    Then user selects the investment type as <investmenttype>
    Then user enters minmum investment as <mininvestment> and maximum investment as <maxinvestment>
    Then user applies to bank <bankname> for loan
    Then user enters pan number as <pannumber> Date of Birth as <dob> Email address as <email> and phone number as <phno>
    Examples:
      | amount | loanperiod | investmenttype | mininvestment | maxinvestment | bankname           | pannumber  | dob        | email           | phno       |
      | 100000 | 7          | both           | 60000         | 1000000       | Lakshmi Vilas Bank | BAJPC4350M | 22.02.1993 | vivek@gmail.com | 6362777877 |





