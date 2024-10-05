# parcial-pro
primer parcial programación - 192433 
CountDigits:

Entrada del número: El usuario introduce un número entero, que puede ser positivo o negativo
Función countDigits:
si el número es negativo, se convierte a su valor absoluto usando Math.abs()
En el caso especial del número 0, la función devuelve 1 (ya que el 0 es un solo dígito)
Luego, el programa cuenta los dígitos dividiendo el número por 10 repetidamente hasta que se convierte en 0
Salida: imprime el número de dígitos del entero ingresado
Ejemplos :
Entrada : 12345, Salida: 5
Entrada : 987654321, Salida: 9
Entrada : -1234, Salida: 4

CountWords:

Entrada: El usuario introduce una cadena de texto que puede contener espacios adicionales
Función countWords:
Uso trim() para eliminar los espacios adicionales al principio y al final de la cadena
Si la cadena está vacía después de eliminar los espacios, devuelve 0
Utilizo split("\\s+") para dividir la cadena en palabras,\\s+ significa "uno o más espacios", ignorando así los espacios entre palabras
Salida: Imprime el número de palabras encontradas en la cadena
Ejemplos:
Entrada: "Hola, este es un ejemplo." → Salida: 5
Entrada: " Este texto tiene espacios adicionales " → Salida: 5
Entrada: " " → Salida: 0
Este programa analiza correctamente los espacios adicionales y cuenta 
