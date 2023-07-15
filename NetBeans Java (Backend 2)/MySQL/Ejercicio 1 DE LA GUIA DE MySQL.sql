/* 1 Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos
“personal”, se creen las tablas y se inserten todos los datos en las tablas para que quede de la
siguiente manera: */

-- a) A continuación, realizar las siguientes consultas sobre la base de datos personal:

-- 1. Obtener los datos completos de los empleados.
USE Personal;
SELECT * FROM empleados;

-- 2. Obtener los datos completos de los departamentos.
SELECT * FROM departamentos;

-- 3. Listar el nombre de los departamentos.
SELECT P.nombre_depto ,P.*  FROM departamentos P ORDER BY P.nombre_jefe_depto ASC;

-- 4. Obtener el nombre y salario de todos los empleados.


-- 5. Listar todas las comisiones.


-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.


-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.


-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.


-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”


-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.


-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.


-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, 
-- más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.


-- 13. Muestra los empleados cuyo nombre empiece con la letra J.


-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.


-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.


-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.


-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.


-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”


-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.


-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.


-- 21. Mostrar el salario más alto de la empresa.


-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.


-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.


-- 24. Hallar el salario promedio por departamento. Consultas con Having


-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.


-- 26. Hallar los departamentos que no tienen empleados Consulta con Subconsulta


-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.