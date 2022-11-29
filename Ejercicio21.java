import java.util.Scanner;

/**
*
*	Ejercicio 21,  Calcula la nota de un trimestre de la asignatura Programación.
* El programa pedirá las dos notas que ha sacado el alumno
* en los dos primeros controles.
* 
*	Nombre del archivo: Ejercicio21.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio21 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca las notas del examen.
		System.out.print("Por favor, introduce la nota del primer examen: ");
		double n1 = datos.nextDouble();
		System.out.print("Por favor, introduce la nota del segundo examen: ");
		double n2 = datos.nextDouble();
		
		//Calculamos la meida
		double media = (n1 + n2) / 2;
		
		String recuperacion;
		
		//Definimos las sentencias 'if' nos dira la media.
		if (media < 5 ){
			System.out.print("La media es menor que 5");
			System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			recuperacion = datos.next();
			if (recuperacion.equals("apto")) {
				media = 5;
				System.out.printf("Tu nota de programción es un %s", media);
			} else {
				System.out.printf("Tu nota de programción es un %s", media);
			}
		} else {
			System.out.printf("Tu nota de programción es un %s", media);
		}
		
	}
}
