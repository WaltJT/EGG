/* 1 Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos
“personal”, se creen las tablas y se inserten todos los datos en las tablas para que quede de la
siguiente manera: */

-- a) A continuación, realizar las siguientes consultas sobre la base de datos personal:

-- 1. Obtener los datos completos de los empleados.
USE Personal;
SELECT * FROM empleados;

-- 2. Obtener los datos completos de los departamentos.
USE Personal;
SELECT * FROM departamentos;

-- 3. Listar el nombre de los departamentos.
USE Personal;
SELECT P.nombre_depto ,P.*  FROM departamentos P ORDER BY P.nombre_jefe_depto ASC;

-- 4. Obtener el nombre y salario de todos los empleados.
USE Personal;
SELECT E.Nombre ,E.Sal_emp  FROM empleados E ORDER BY E.Nombre ASC;

-- 5. Listar todas las comisiones.
USE Personal;
SELECT E.Nombre ,E.Sal_emp, E.Comision_emp  FROM empleados E ORDER BY E.Nombre ASC;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
USE Personal;
SELECT E.Nombre ,E.Sal_emp, E.Comision_emp, E.Cargo_emp  FROM empleados E WHERE E.Cargo_emp = 'Secretaria' ORDER BY E.Nombre ASC;

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
USE Personal;
SELECT E.Nombre ,E.Sal_emp, E.Comision_emp, E.Cargo_emp  FROM empleados E WHERE E.Cargo_emp = 'Vendedor' ORDER BY E.Nombre ASC;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
USE Personal;
SELECT E.Nombre , E.Cargo_emp, E.Sal_emp  FROM empleados E ORDER BY Sal_emp ASC;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
USE Personal;
SELECT D.*  FROM Departamentos D WHERE D.Ciudad = 'Ciudad Real' ORDER BY D.Nombre_jefe_depto ASC;

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
USE Personal;
SELECT E.Nombre AS 'Nombre', E.cargo_emp AS 'Cargo' FROM empleados E;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
USE Personal;
-- A la siguiente Query le falta agregar que no tome "registros" duplicados, la Query que le sigue debajo si agrega esa indicación.
SELECT E.*,D.* FROM Empleados E, Departamentos D INNER JOIN Empleados, Departamentos WHERE D.id_depto = '2000' AND E.id_depto = '2000' ORDER BY E.Comision_emp ASC; 

SELECT E.*, D.* FROM Empleados E INNER JOIN Departamentos D ON E.id_depto = D.id_depto WHERE D.id_depto = '2000' AND E.id_emp NOT IN (SELECT id_emp FROM Empleados GROUP BY id_emp HAVING COUNT(*) > 1) ORDER BY E.Comision_emp ASC;

-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, 
-- más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.
USE Personal;
SELECT E.*, D.*, (E.sal_emp + E.comision_emp + 500) AS 'Total_pagar' FROM Empleados E INNER JOIN Departamentos D ON E.id_depto = D.id_depto WHERE D.id_depto = '3000' AND E.id_emp NOT IN (SELECT id_emp FROM Empleados GROUP BY id_emp HAVING COUNT(*) > 1) ORDER BY E.Comision_emp ASC;

-- 13. Muestra los empleados cuyo nombre empiece con la letra J.
USE Personal;
SELECT E.* FROM Empleados E WHERE E.nombre LIKE 'J%' ORDER BY E.Cargo_emp ASC;

-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
USE Personal;
SELECT E.nombre, E.sal_emp, E.comision_emp, (E.sal_emp + E.comision_emp + 500) AS 'Total_pagar' FROM Empleados E WHERE E.comision_emp > 1000 ORDER BY E.nombre ASC;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
USE Personal;
SELECT E.nombre, E.sal_emp, E.comision_emp, (E.sal_emp + E.comision_emp + 500) AS 'Total_pagar' FROM Empleados E WHERE E.comision_emp = 0 ORDER BY E.nombre ASC;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
USE Personal;
SELECT E.* FROM Empleados E WHERE E.comision_emp > E.sal_emp  ORDER BY E.nombre ASC;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
USE Personal;
SELECT E.* FROM Empleados E WHERE E.comision_emp <= (0.3 * E.sal_emp) ORDER BY E.nombre ASC;

-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
USE Personal;
SELECT E.* FROM Empleados E WHERE E.nombre NOT LIKE '%MA%' ORDER BY E.nombre ASC;

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o "Mantenimiento".
USE Personal;
SELECT D.* FROM departamentos D WHERE D.nombre_depto IN ('Ventas', 'Investigación', 'Mantenimiento') ORDER BY D.nombre_depto ASC;

-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
USE Personal;
SELECT D.* FROM departamentos D WHERE D.nombre_depto NOT IN ('Ventas', 'Investigación', 'Mantenimiento') ORDER BY D.nombre_depto ASC;

-- 21. Mostrar el salario más alto de la empresa.
USE personal;
SELECT MAX(sal_emp) FROM Empleados;

-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
USE personal;
SELECT MAX(nombre) FROM Empleados;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
USE personal;
SELECT MAX(sal_emp) AS salario_maximo, MIN(sal_emp) AS salario_minimo, MAX(sal_emp) - MIN(sal_emp) AS DIF_SALARIO FROM Empleados;

-- 24. Hallar el salario promedio por departamento. Consultas con Having.
USE personal;

SELECT d.id_depto,  
       d.nombre_depto AS 'NOMBRE_DEPTO',
       AVG(e.sal_emp) AS 'SALARIO_PROMEDIO'
FROM empleados e
INNER JOIN departamentos d
ON d.id_depto = e.id_depto
GROUP BY id_depto
HAVING AVG(sal_emp);

-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
USE personal;

SELECT D.nombre_depto, COUNT(*) AS numero_empleados
FROM departamentos D
INNER JOIN empleados E ON D.id_depto = E.id_depto
GROUP BY D.nombre_depto
HAVING COUNT(*) > 3;

-- 26. Hallar los departamentos que no tienen empleados Consulta con Subconsulta
USE personal;

SELECT D.*, E.*
FROM departamentos D, empleados E
WHERE E.id_emp NOT IN (SELECT DISTINCT E.id_emp FROM empleados E);

SELECT D.*, E.*, D.nombre_depto AS numero_empleados
FROM departamentos D
INNER JOIN empleados E ON D.id_depto = E.id_emp
WHERE E.id_emp IS NULL;  -- WHERE id_depto NOT IN (SELECT id_depto FROM departamentos);

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.

-- ***Pagina 47 Ejercicios 2 de MySQL***