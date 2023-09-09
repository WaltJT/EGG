
/*2. Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio*/

const PI = Math.PI;
const radio = parseFloat(prompt("Ingrese el valor del radio de la circunferencia:"));

const area = PI * Math.pow(radio, 2);
const perimetro = 2 * PI * radio;

console.log(`Área: ${area}`);
console.log(`Perímetro: ${perimetro}`);