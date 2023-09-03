
/*5. Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.*/

const valor1 = parseFloat(prompt("Ingrese el primer valor:"));
const valor2 = parseFloat(prompt("Ingrese el segundo valor:"));
const operacion = prompt("Ingrese la operación ('S', 'R', 'M', 'D'):").toLowerCase();

let resultado;

switch (operacion) {
    case 's':
        resultado = valor1 + valor2;
        break;
    case 'r':
        resultado = valor1 - valor2;
        break;
    case 'm':
        resultado = valor1 * valor2;
        break;
    case 'd':
        resultado = valor1 / valor2;
        break;
    default:
        console.log("Operación no válida.");
}

if (resultado !== undefined) {
    console.log(`Resultado: ${resultado}`);
}