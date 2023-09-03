
/*7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

const limite = parseFloat(prompt("Ingrese un valor límite positivo:"));
let suma = 0;
let numero;

do {
    numero = parseFloat(prompt("Ingrese un número:"));
    suma += numero;
} while (suma <= limite);

console.log("La suma de los números introducidos superó el límite inicial.");
