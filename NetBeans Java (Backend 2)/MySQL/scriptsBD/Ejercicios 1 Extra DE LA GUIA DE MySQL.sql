/*Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:*/

 -- A continuación, se deben realizar las siguientes consultas sobre la base de datos:

-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
USE nba;
SELECT * FROM nba.jugadores ORDER BY nombre ASC;	   

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
USE nba;
SELECT * FROM nba.jugadores WHERE posicion = 'C' AND peso > 200 ORDER BY nombre ASC;	   


-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
USE nba;
SELECT * FROM nba.equipos ORDER BY nombre ASC;

-- 4. Mostrar el nombre de los equipos del este (East).
USE nba;
SELECT * FROM nba.equipos WHERE Conferencia = 'East' ORDER BY nombre ASC;

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
USE nba;
SELECT * FROM nba.equipos WHERE Ciudad LIKE 'C%' ORDER BY nombre ASC;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
USE nba;
SELECT e.*, j.nombre FROM equipos e, jugadores j INNER JOIN equipos, jugadores;
SELECT E.nombre AS 'Equipo', J.nombre AS 'Jugadores' FROM equipos E, jugadores J LEFT JOIN equipos on jugadores; -- ver como seguir para que en lugar de INNER pueda utilizar LEFT JOIN.

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
USE nba;
SELECT * FROM nba.equipos WHERE nombre = 'Raptors' ORDER BY nombre ASC;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
USE nba;
SELECT * FROM nba.equipos WHERE nombre = 'Raptors' ORDER BY nombre ASC;

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
USE nba;
SELECT P.* , J.nombre FROM partidos P INNER JOIN jugadores J WHERE J.nombre = 'Pau Gasol' AND P.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
USE nba;
SELECT J.*, E.*  FROM jugadores J INNER JOIN estadisticas E WHERE E.puntos_por_partido ORDER BY codigo ASC;

-- 11. Mostrar el número de jugadores de cada equipo.
USE nba;
SELECT J.*, E.*  FROM jugadores J INNER JOIN equipos E WHERE J.nombre_equipo = E.nombre ORDER BY J.nombre_equipo ASC;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
USE nba;
SELECT J.*, E.*  FROM jugadores J INNER JOIN estadisticas E WHERE E.puntos_por_partido ORDER BY E.puntos_por_partido DESC;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT J.nombre_equipo, E.Conferencia, J.Altura  FROM jugadores J INNER JOIN equipos E WHERE E.Nombre ORDER BY J.Altura DESC;
SELECT J.*, J.nombre_equipo, E.Conferencia, J.Altura  FROM jugadores J INNER JOIN equipos E WHERE E.Nombre ORDER BY J.Altura DESC;

SELECT MAX(Altura), J.nombre_equipo, E.Conferencia FROM jugadores J INNER JOIN equipos E WHERE E.Nombre;

SELECT MAX(Altura) FROM jugadores J;

SELECT MAX(J.Altura) AS max_altura, J.nombre_equipo, E.Conferencia
FROM jugadores J
INNER JOIN equipos E ON J.nombre_equipo = E.Nombre
GROUP BY J.nombre_equipo, E.Conferencia;

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.


-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.