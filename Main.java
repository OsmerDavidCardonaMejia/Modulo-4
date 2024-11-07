//Osmer David Cardona Mejia
//NC:202410050140

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar)
        {
            System.out.println("Menu:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion)
            {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();

                    Empleado empleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(empleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:
                    gestor.mostrarEmpleados();
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saliendo del sistema de gestion de empleados.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo por favor.");
                    break;
            }
        }

        scanner.close();
    }
}

