import java.util.Scanner;

/**
 * 
 * Ejercicio 25, La tienda online BanderaDeEspaña.es vende banderas personalizadas de la 
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio 
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de 
 * euro el centímetro cuadrado.
 * 
 * Nombre del archivo: Ejercicio25.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio25 {
	public static void main(String[] args) {
		 
		 Scanner datos = new Scanner(System.in);
		 
		 System.out.print("Introduzca la altura de la bandera en cm: ");
		 int altura = datos.nextInt();
		 
		 System.out.print("Ahora introduzca la anchura: ");
		 int anchura = datos.nextInt();
		 
		 System.out.print("¿Quieres escudo bordado? (s/n): ");
		 String bordado = datos.next();
		 
		 int cm2 = altura * anchura;
		 
		 double precio = cm2 * 0.01;
		 
		 double escudo = 0;
		 
		 double envio = 3.25;
		 
		 String texto = "";
		 
		if (bordado.equals("s")) {
      texto = "Con escudo:";
      escudo = 2.50;
    } else {
      texto = "Sin escudo:";
      escudo = 0;
    }
			
			double total = precio + escudo + envio;
		 
		 System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		 System.out.printf("Bandera de %s cm2: %s Euros\n", cm2, precio);
		 System.out.println(texto + " " + escudo + "Euros");
		 System.out.printf("Gastos de envio: %s Euros\n", envio);
		 System.out.printf("Total: %.2f Euros", total);
		 
 }
}
