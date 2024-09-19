Feature: Agregar productos al carrito de aliexpress

  Scenario: Yo como comprador en aliexpress
  quiero agregar una cantidad por 3 de determinado producto
    para validar que el precio sea el correcto

    Given que el usuario esta en el sitio web
    When intenta agregar productos al carrito
    Then verificara que el valor mostrado sea el correcto