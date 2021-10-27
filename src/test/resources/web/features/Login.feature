Feature: Login

  @Smoke
  Scenario: Login exitoso
    Given el usuario esta en la web de Automation Practice
    When el usuario pulsa el botón Sign in
    And el usuario introduce su email "federicomarkevicz@gmail.com" y password "456fede"
    And el usuario pulsa el boton de login
    Then el usuario verifica que se enseña la pagina de Sign in