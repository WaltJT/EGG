Algoritmo EjemploVector
	
	/// Llenar y mostrar un vector de numeros que ponga el usuario
	
	Definir vector, num, i Como Entero
	
	Dimension vector(5) /// Definimos el tamaño del vector en 5
	
	/// Usamos un Para, para pasar por todas las posiciones del vector
	/// Si nuestro vector es de tamaño 5 y empieza en 0, sus posiciones son 0 - 4
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		/// Pedimos los numeros en el Para, 
		/// de esa manera pedimos la cantidad exacta de numeros
		Escribir "Ingrese un numero para el subindice " i
		Leer num 
		
		/// Asignamos num a la posicion actual del vector,
		/// que depende de cual sea el valor de i
		vector(i) = num 
		
		
	Fin Para
	
	/// Usamos otro Para, para mostrar los elementos del vector
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		Escribir Sin Saltar "[" vector(i) "]"
		
	Fin Para
	
	
FinAlgoritmo
