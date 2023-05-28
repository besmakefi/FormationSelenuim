

@tag
Feature: authentification 
  en tantque utilisateur je doit authentifier par un login et mot de mdp valide

  @test 
  Scenario: authentification valide 
  
    Given ouvrir navigateur chrome    
    And  saisir url 
    When saisir mail     
    And  saisir password	   
    And  cliquer sur connexion   
    Then verifier la page home  
       

 