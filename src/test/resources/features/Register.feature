Feature: Register Functionality
  @Positive
  Scenario: Ensure user successfully register new account
    Given user is at register page
    When user inputs email
    And user inputs phone number
    And user inputs password
    And user re-inputs password
    And user inputs First Name
    And user inputs Last Name
    And user inputs Kabupaten or Kota
    And user clicks Daftar button
    Then user is directed to OTP verification page
    And user can see OTP via Whatsapp
    And user can see OTP via Message






