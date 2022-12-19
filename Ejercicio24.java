import java.util.Scanner;

/**
 * 
 * Ejercicio 24, Escribe un programa que genere la nómina (bien desglosada) 
 * de un empleado según las siguientes condiciones.
 * 
 * Nombre del archivo: Ejercicio24.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio24 {
	public static void main(String[] args) {
		
		//Definimos la clase datos
		Scanner datos = new Scanner(System.in);
		 
		System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int puesto = datos.nextInt();
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dias = datos.nextInt();
    
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = datos.nextInt();
    
    double sueldo = 0;
    
    switch(puesto) {
      case 1: // Programador junior
        sueldo = 950;
        break;
      case 2: // Programador senior
        sueldo = 1200;
        break;
      case 3: // jefe de proyecto
        sueldo = 1600;
        break;
      default:
        System.out.println("No ha elegido correctamente el sueldo base.");
    }
    
    double sueldoDietas = dias * 30;

    double sueldoBruto = sueldo + sueldoDietas;

    double irpf = 0;
    
    if (estadoCivil == 1) {
      irpf = 25;
    } else if (estadoCivil == 2) {
      irpf = 20;
    } else {
      System.out.println("No ha elegido correctamente el estado civil.");
    }

		 double irpfTotal = (sueldoBruto * irpf) / 100;
		 
		 System.out.println();
		 System.out.printf("Sueldo Base: %7.2f Euros\n", sueldo);
		 System.out.printf("Dietas (%s viajes): %7.2f Euros\n", dias, sueldoDietas);
		 System.out.println();
		 System.out.printf("Sueldo bruto: %7.2f Euros\n", sueldoBruto);
		 System.out.printf("Retención IRPF (%s): %7.2f Euros\n", irpf, irpfTotal);
		 System.out.println();
		 System.out.printf("Sueldo neto: %7.2f Euros\n", sueldoBruto - irpfTotal);
		 
 }
}
