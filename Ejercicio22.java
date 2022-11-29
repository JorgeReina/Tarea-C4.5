import java.util.Scanner;

/**
*
*	Ejercicio 22,  Realiza un programa que, dado un día de la semana (de lunes a viernes) 
* y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. 
* Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da 
* por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
* 
*	Nombre del archivo: Ejercicio22.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio22 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un día de la semana y la hora con los minutos.
		System.out.print("Por favor, introduce un dia de la semana de Lunes a Viernes: ");
		String dia = datos.next();
		System.out.print("Por favor, introduce una hora: ");
		int hora = datos.nextInt();
		System.out.print("Por favor, introduce los minutos: ");
		int minutos = datos.nextInt();
		
	}
}
