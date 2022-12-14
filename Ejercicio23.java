import java.util.Scanner;

/**
 * 
 * Ejercicio 22, Escribe un programa que calcule el precio final de un producto según
 * su base imponible .
 * 
 * Nombre del archivo: Ejercicio23.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
 public class Ejercicio23 {
	 public static void main(String[] args) {
		 
		 //Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca una serie de parámetros.
		System.out.print("Introduzca la base imponible: ");
		double baseImponible = datos.nextDouble();
		 
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String iva = datos.next();
		
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String codigo = datos.next();
		
		//Mostamos la base imponible.
		System.out.printf("Base imponible %12s\n", baseImponible);
		
		//Definimos las variables para el iva y hacemos el switch para definir cada tipo de iva.
		double ivaDato = 0;
		int numeroIva = 0;
		
		switch (iva) {
			case "general":
				ivaDato = baseImponible * 0.21;
				numeroIva = 21;
				break;
			case "reducido":
				ivaDato = baseImponible * 0.10;
				numeroIva = 10;
				break;
			case "superreducido":
				ivaDato = baseImponible * 0.04;
				numeroIva = 4;
				break;
			default:
				System.out.print("Lo siento, la opción elegida no es valida.\n");
		}
		
		//Definimos las variables del precio con IVA y del descuento.
		double precioIva = baseImponible + ivaDato;
		double descuento = 0;
		
		//Hacemos el switch para elegir cada opción de descuento.
		switch (codigo) {
			case "nopro":
				descuento = 0;
				break;
			case "mitad":
				descuento = precioIva / 2;
				break;
			case "meno5":
				descuento = precioIva - 5;
				break;
			case "5porc":
				descuento = precioIva * 0.05;
				break;
			default:
				System.out.print("Lo siento, la opción elegida no es valida.\n");
		}
		
		
		double total = precioIva - descuento;
		
		System.out.printf("IVA (%s) %18s\n", numeroIva, ivaDato);
		System.out.printf("Precio con IVA %12s\n", precioIva);
		System.out.printf("Cód. promo. (%s): -%5s\n", codigo, descuento);
		System.out.printf("TOTAL %21s", total);
		 
	 }
 }
