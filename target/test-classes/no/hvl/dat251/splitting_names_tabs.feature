#language: en
Feature: Splitte et navn i fornavn og etternavn
	bla... bla...

Scenario Outline: Ett fornavn og ett etternavn
	Given Navnet er "<navn>"
	When Vi splitter navnet
	Then Fornavnet blir "<fornavn>"
	And Etternavnet blir "<etternavn>"
	
Examples:

	|navn		|fornavn|etternavn	|
	|Per Hansen	|Per	|Hansen		|
	|Per Per Os	|Per Per|Os			|