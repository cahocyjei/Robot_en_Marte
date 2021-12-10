# Robot_en_Marte
La NASA nos ha contratado y como empresa llevaremos nuestro primer robot a Marte.
Nuestro robot se mueve 1 metro en cada dirección con el comando Izquierda (L) Derecha (R) Arriba (U)
Abajo (D).

La NASA prepara una lista de indicaciones para el movimiento del robot desde la base de carga en el
ejemplo marcada como punto 0.

Sin embargo están preocupados porque en caso de una emergencia el robot pueda regresar a tiempo a la
base de carga y quieren que evaluemos los planes de movimiento en un simulador, y les digamos la
cantidad de instrucciones máximas que deberíamos enviar al robot cuando se encuentre en su punto más
lejano para que pueda retornar a la base.

Calcule cuál es el número máximo de instrucciones que debería enviarse al robot para que en algún punto
del recorrido regrese a la base.

Input Format For Custom Testing
Primero ingresara un entero N definiendo la cantidad de planes que la NASA quiere evaluar, luego
existirán N líneas con las cadenas de instrucciones

Sample Case 0

Sample Input For Custom Testing

1

RUULLLDDDR

(https://user-images.githubusercontent.com/64546089/144723453-ee34415d-a9d5-44a2-bd60-e0aa68a90a5f.png)

Sample Output

4

Explanation

Ruta: RUULLLDDDR el robot se moverá como se ve en la imagen
Siguiendo esta ruta, el punto 6 sería el punto más lejano de la base, y necesitaría 4 instrucciones para
poder retornar a la base, (RDRD o RRDD o DDRR o DRDR).

Sample Case 1

Sample Input For Custom Testing

2

U

UUU

Sample Output

1

3
