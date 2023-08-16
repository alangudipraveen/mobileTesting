Feature: Validation of Trivango App

Scenario: Validation of vertical Scroll of Trivango App
 	Given User navigates to the Trivango App with "Android Emulator" and "Android" and "10" and "com.trivago" and "com.trivago.ft.main.frontend.MainActivity"
 	When User click on the search icon
 	And User enters the "Delhi" in Search box
 	Then User performs the vertical scroll
 