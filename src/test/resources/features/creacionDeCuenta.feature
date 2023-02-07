##

@creacionDeCuenta
Feature: Yo como usuario quiero registrarme, iniciar sesion y agregar productos al carrito

  @registrarUsuario
  Scenario Outline: Realizar registro exitoso del usuario
    Given El usuario abre la App Móvil Éxito
    When Hace Tap en el boton registrarse
    And Ingresa los datos requeridos
      | Nombres   | Apellidos   | NumeroDocumento   | Celular   | CorreoElectronico   |
      | <Nombres> | <Apellidos> | <NumeroDocumento> | <Celular> | <CorreoElectronico> |

    And Hace Tap en confirmar
    And Ingresa la contraseña
      | Contrasenna   |
      | <Contrasenna> |

    Then Se crea el usuario exitosamente
    And Cierra sesion

    Examples:
      | Nombres  | Apellidos | NumeroDocumento | Celular    | CorreoElectronico      | Contrasenna  |
      | Federico | Martinez  | 1000644444      | 3188466090 | daliduque@hotmail.com | Cambio23+ |

  @iniciarSesion
  Scenario Outline: Iniciar sesion exitosamente
    Given El usuario abre la App Móvil Éxito
    When Hace Tap en el boton ingresar
    And Ingresa el correo y la contraseña
      | CorreoElectronico   | Contrasenna   |
      | <CorreoElectronico> | <Contrasenna> |

    And Hace Tap en ingresar
    Then Inicia sesion exitosamente

    Examples:
      | CorreoElectronico      | Contrasenna  |
      | daliduque@hotmail.com | Cambio23+ |

  @agregarProductoCarrito
  Scenario Outline: Agregar un producto al carrito
    Given El usuario inicio sesion en la App Móvil Éxito
      | CorreoElectronico   | Contrasenna   |
      | <CorreoElectronico> | <Contrasenna> |
    And Busca el producto
      | Producto   |
      | <Producto> |

    When Agrega el producto al carrito
    Then Valida que el producto se haya agregado exitosamente

    Examples:
      | Producto     |  CorreoElectronico      | Contrasenna  |
      | Jagermeister |  daliduque@hotmail.com | Cambio23+ |










