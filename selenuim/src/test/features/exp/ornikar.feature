
@tag
Feature: verification d obtention de tarif 
  en tant que utilisateur je doit verifier si l utilisateur est inscrit chez ornicar pour un code de conduite 

  @tag1
  Scenario: verification d inscription
  
    Given ouvrir  chrome
    And acceder a l url "https://www.ornikar.com/assurance-auto"
    
    When cliquer sur le bouton accepter tous les cookies 
    When cliquer sur le boutton j obtiens mon tarif
    And cliquer sur le bouton non 
    And cliquer sur le bouton rechercher par plaque
    And remplir le champs plaque "DQ326HS" 
    And cliquer sur le bouton confirmer
    
    Then verifier le nom du plaque
    
