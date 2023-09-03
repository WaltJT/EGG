
/*10. Escribir una función flecha que reciba una palabra y la devuelva al revés.*/

const revertirPalabra = palabra => palabra.split('').reverse().join('');

const palabraIngresada = prompt("Ingrese una palabra:");
const palabraRevertida = revertirPalabra(palabraIngresada);

console.log(`Palabra revertida: ${palabraRevertida}`);
