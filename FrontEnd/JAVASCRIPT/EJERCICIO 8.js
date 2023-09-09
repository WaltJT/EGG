
/*8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos.*/

let numeros = [];
let numero = parseInt(prompt("Ingrese un número entero (0 para terminar):"));

while (numero !== 0) {
    numeros.push(numero);
    numero = parseInt(prompt("Ingrese otro número entero (0 para terminar):"));
}

if (numeros.length > 0) {
    const maximo = Math.max(...numeros);
    const minimo = Math.min(...numeros);
    const suma = numeros.reduce((acc, curr) => acc + curr, 0);
    const promedio = suma / numeros.length;

    console.log(`Máximo: ${maximo}`);
    console.log(`Mínimo: ${minimo}`);
    console.log(`Promedio: ${promedio}`);
} else {
    console.log("No se ingresaron números.");
}