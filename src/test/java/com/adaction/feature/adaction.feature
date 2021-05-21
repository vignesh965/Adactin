Feature: Hotel Booking in Adactin Application

Scenario: login
Given user Launch The Application
When user Enter The Username In Username Field 
And user Enter The Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page


Scenario: search hotel
When user Enter The Location
And user Enter The Hotel
And user Enter The Room Type
And user Enter The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Enter The Adults Per Room
And user Enter The Children Per Room
Then user Click On Search Button And It Navigates To Select Hotel

Scenario: select hotel
When user Select The Pick The Button
Then user Click On The Continue Button And It Navigates To Book A Hotel Page

Scenario: enter name
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Select The Drop Down Credit Card Type
And user Select The Drop Down Expiry Month
And user Select The Drop Down Expiry Year
And user Enter The CVV Number
Then user Click On The Book Now Button And It Navigates To Booked Itineracy 


Scenario: itineracy
When user Click The My Itineracy

Scenario: logout
When user Click The Logoff


 



























