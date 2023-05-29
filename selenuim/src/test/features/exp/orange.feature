
@tag
Feature: authentification au site orange 
  en tant que utilisateur je doit authentifier au site quatre fois faux et vrai 
  
  @tag1_authentifier_avec_données_valides
  Scenario: authentification avec des données valides 
  
    Given ouvrir le navigateur
    And saisir l URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    
    When remplire le champs username "admin"
    And remplire le champs password "admin123"
    And cliquer sur le bouton login
    
    #Then verifier le text "Yamini Pitta" 
    Then verifier le dashboard est ouvert
  
  
  @tag1
  Scenario Outline: authentification avec des données invalides
   
    Given ouvrir le navigateur
    And saisir l URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    
    When remplire le champs username "<NomUtilisateur>" 
    And remplire le champs password "<MotDePasse>"
    And cliquer sur le bouton login 
    
    Then verifier le text "<Message>"


    Examples: 
      | NomUtilisateur  | MotDePasse | Message             |         
      | admin           | admin1234  | Invalid credentials |          
      | adminn          | admin123   | Invalid credentials |
      | adminn          | admin1234  | Invalid credentials |
