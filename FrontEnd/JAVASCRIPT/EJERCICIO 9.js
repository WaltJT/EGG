
/*9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring().*/

const frase = prompt("Ingrese una frase:");
const fraseConEspacios = frase.split('').join(' ');

console.log(fraseConEspacios);