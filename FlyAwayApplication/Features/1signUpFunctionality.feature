Feature: A user should be able to sign up 

Scenario: Sign Up Functionality

Given A user clicks on Login/SignUp link text in Landing page of flyaway application
When he clicks on Not a member? Signup button
And pass Email id as "<email>",Password as "<Password>",Confirm Password as "<Password>", Name as "<Name>", adress as "<Address>" and city as "<City>"
And click on Sign Up button
Then He should be able to see "Login to continue checking flights" message

Examples:

|email								|Password				|Name						|Address						|City					|
|vburugadda@cisco.com	|BhanuBK@99			|BhanuBK				|Jangareddygudem		|Lakkavaram		|