Feature: Busqueda en la web Automation practice

  @Smoke @Fede
  Scenario Outline: busqueda de articulos
    Given el usuario esta en la web de Automation Practice
    When el usuario busca la palabra "<articulo>"
    And el usuario da clik en el boton de buscar
    Then el usuario verifica que se muestra la pagina con <articulo>

    Examples:
    |articulo|
    |dresses|
    |blouses|

  @Smoke @Fede
  Scenario: Ordenamiento de la busqueda
    Given el usuario esta en la web de Automation Practice
    When  el usuario busca la palabra "dresses"
    And el usuario da clik en el boton de buscar
    And el usuario ordena los productos de menor a mayor precio
    Then el usuario verifica que se ordeno de menor a mayor precio

   

