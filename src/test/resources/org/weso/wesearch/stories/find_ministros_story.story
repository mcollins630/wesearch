User wants to find "Ministros nacidos en Chile"

Narrative:
In order to find "Ministros" that were born in "Chile" 
As a User of BCN
I want to incrementally find and select the necessary Matters (Ministros) and 
 properties ("nacido_en") and Value_selectors ("Location").

Scenario: 
An ontology is loaded with "Ministros" and "Personas"

Given the ontology src/test/resources/ontoTest2.owl
When I ask for matters with ""
Then I should get matter Ministro 
And I should get matter Person

When I ask for matters with Minist
Then I should get matter Ministro
And I should not get matter Person
