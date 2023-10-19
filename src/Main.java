import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombreCliente = getNonEmptyInput(scanner);
        System.out.print("Apellidos: ");
        String apellidosCliente = getNonEmptyInput(scanner);
        int edadCliente = 0;
        boolean validEdad = false;
        while (!validEdad) {
            try {
                System.out.print("Edad: ");
                edadCliente = Integer.parseInt(scanner.nextLine());
                validEdad = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero para la edad.");
            }
        }
        System.out.print("RUT: ");
        String rutCliente = getNonEmptyInput(scanner);

        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("Nombre: ");
        String nombreEmpresa = getNonEmptyInput(scanner);
        System.out.print("RUT: ");
        String rutEmpresa = getNonEmptyInput(scanner);
        System.out.print("Giro: ");
        String giroEmpresa = getNonEmptyInput(scanner);

        int totalVentas = 0;
        boolean validTotalVentas = false;
        while (!validTotalVentas) {
            try {
                System.out.print("Total de ventas: ");
                totalVentas = scanner.nextInt();
                validTotalVentas = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero para el total de ventas.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }

        double montoVentas = 0;
        //validacion de campo "montoVentas no venga vacio"
        boolean validMontoVentas = false;
        while (!validMontoVentas) {
            try {
                System.out.print("Monto en dinero de las ventas hechas: ");
                montoVentas = scanner.nextDouble();
                validMontoVentas = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para el monto de ventas.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }

        DatosFactura datosFactura = new DatosFactura(nombreCliente, apellidosCliente, edadCliente, rutCliente,
                nombreEmpresa, rutEmpresa, giroEmpresa);
        Ventas ventas = new Ventas(totalVentas, montoVentas);
        //Obtengo los valores con sus respectivos metodos
        double ivaAPagar = ventas.calcularIvaAPagar();
        double utilidades = ventas.calcularUtilidades();

        System.out.println("\nDatos de la factura:");
        System.out.println(datosFactura.toString());
        System.out.println("Monto en IVA a pagar: $" + ivaAPagar);
        System.out.println("Utilidades del mes: $" + utilidades);
    }

    private static String getNonEmptyInput(Scanner scanner) {
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error: Ingrese un valor no vacío.");
            }
        }
        return input;
    }
}