# ImplementacionFintoc

Una aplicación para consumir de la API de Fintoc y mostrar los últimos movimientos de una cuenta.

## Funcionamiento

Una persona o negocio al asociar una cuenta bancaria con Fintoc obtiene un Link y a través de este la API de Fintoc puede acceder a los productos de la cuenta.
Para esta aplicación se utilizan datos de prueba otorgados por Fintoc por lo que ya se tiene un Link de prueba.

Utilizando este Link la primera vista de la aplicación se muestra el nombre asociado a este y una lista de botones para acceder a sus respectivos productos, mostrando el nombre del producto y su número de cuenta.

<img src="https://user-images.githubusercontent.com/15837691/219389127-38dc870c-3a60-422e-80b6-7e92982637b0.png" width=35% height=35%>

Accediendo a producto se muestra la siguiente vista con los detalles de esta y un botón para revisar a los últimos movimientos en un plazo que puede ser: todos, último año, últimos 6 meses y último mes.

<img src="https://user-images.githubusercontent.com/15837691/219389137-f37f7000-aec2-4208-b520-cbc0a786c667.png" width=35% height=35%>

La vista de los últimos movimientos muestra una tabla con la fecha, monto y descripción de estos y además una columna para acceder a los detalles de un movimiento es específico.

<img src="https://user-images.githubusercontent.com/15837691/219394369-d2d2fc8e-275d-4767-aabd-210a18939f8f.png" width=35% height=35%>

El detalle de un movimiento muestra los siguientes datos: Fecha, Fecha de transacción, Monto, Descripción, comentario y emisor o receptor en el caso respectivo.
Para emisores y receptores se muestra una sub tabla con: Cuenta, Rut, Nombre y Banco.

<img src="https://user-images.githubusercontent.com/15837691/219394375-d6fedf39-27a3-4ccb-8453-432c0c94f7c6.png" width=35% height=35%>
