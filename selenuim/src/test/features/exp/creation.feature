@tag_creation_compte
Feature: creation Compte Facebook
  En tant que utilisateur je doit creer un compte facebook

  @tag1_saisie_de_donnees
  Scenario: creation compte facebook valide avec genre femme ou homme
    Given ouvrir navigateur
    And saisir l adresse "https://www.facebook.com/"
    When cliquer sur le bouton creer compte
    And remplir le champ nom "kais"
    And remplire le champ prenom  "saied"
    And remlire l adresse email "azerty1234@gmail.com"
    And remlire le mail de confirmation "azerty1234@gmail.com"
    And saisir le mot de passe "azerty"
    And choisir le jour de naissance "11"
    And choisir le mois de naissance "10"
    And choisir l annee de naissance "1905"
    And choisir le genre  "Homme"
    And cliquer sur s inscrire
    Then verifier la connexion

  @tag2_cas_personnalise
  Scenario: creation compte facebook valide avec genre personnalise
    Given ouvrir navigateur
    And saisir l adresse "https://www.facebook.com/"
    When cliquer sur le bouton creer compte
    And remplir le champ nom "kais"
    And remplire le champ prenom  "saied"
    And remlire l adresse email "azerty1234@gmail.com"
    And remlire le mail de confirmation "azerty1234@gmail.com"
    And saisir le mot de passe "azerty"
    And choisir le jour de naissance "11"
    And choisir le mois de naissance "10"
    And choisir l annee de naissance "1905"
    When choisir genre "personnalise" et selectionner "1"
    Then verifier la connexion

  @tag2_cas_accepter
  Scenario Outline: cas d acceptance
    Given ouvrir navigateur
    And saisir l adresse "https://www.facebook.com/"
    When cliquer sur le bouton creer compte
    And remplir le champ nom "<nom>"
    And remplire le champ prenom  "<prenom>"
    And remlire l adresse email "<mail>"
    And remlire le mail de confirmation "<mail>"
    And saisir le mot de passe "<mdp>"
    And choisir le jour de naissance "<jdn>"
    And choisir le mois de naissance "<mdn>"
    And choisir l annee de naissance "<adn>"
    And choisir le genre  "<genre>"
    And cliquer sur s inscrire
    Then verifier la connexion 

    Examples: 
      | nom   | prenom | mail                     | mdp        | jdn | mdn | adn  | genre |
      | kais  | salah  | mohamed.salah54@gmail.fr | salah12345 |  15 |  12 | 2000 | Homme |
      | leila | fatma  | lailaaftma45@hotmail.fr  | fatma12578 |  30 |  10 | 1994 | femme |
