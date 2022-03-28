Feature: A user should be able to Book available Flights

Scenario: Flight Booking Functionality

Given A user click on Login/SignUp link text in Landing page of flyaway application
When he pass email as "<email>" and Password as "<Password>"
And click on login button he will be successfully navigated to Dashboard page
And he click on Home 
And click on first available flight he will navigate to confirmation page
And if he click on Click to complete booking
Then he should be able to see " FLYAWAY - BOOKING CONFIRMATION " message

Examples:

|email									|Password				|
|vburugadda12@cisco.com	|BhanuBK3				|