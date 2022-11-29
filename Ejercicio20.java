import java.util.Scanner;

/**
*
*	Ejercicio 20,  Realiza un programa que diga si un número
* entero positivo introducido por teclado es capicúa. 
* Se permiten números de hasta 5 cifras.
* 
*	Nombre del archivo: Ejercicio20.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio20 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número.
		System.out.print("Por favor, introduce un número como maximo de 5 cifras: ");
		int n = datos.nextInt();
		
		boolean capicua = false;
		
		if (n < 10) {
			capicua = true;
		}
		if ((n >= 10) && (n < 100)){
			if((n / 10) == (n % 10)) {
				capicua = true;
			}
		}
		if ((n >= 100) && (n < 1000)){
			if((n / 100) == (n % 10)) {
				capicua = true;
			}
		}
		if ((n >= 1000) && (n < 10000)){
			if(((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
				capicua = true;
			}
		}
		if (n >= 10000){
			if(((n / 10000) == (n % 10)) && (((n / 1000) % 10) == ((n / 10) % 10))) {
				capicua = true;
			}
		}
		
		System.out.printf("¿El %s es capicua? %s", n, capicua);
		
	}
}
