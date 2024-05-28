package Proyecto_Terminado;
import java.util.Scanner;

public class MenuOperador extends Clase_Abstractaa{
	static Scanner entrada = new Scanner(System.in);

    @Override
    public void Transacciones() {
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Salir");
        System.out.println("----------------------------------------------------");
        int opcion = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                break;
        }
    }

    public static void registrarCliente() {
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese el Nombre del Cliente:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el Número de Cuenta:");
        String numCuenta = entrada.nextLine();
        System.out.println("Ingrese el NIP:");
        int nip = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer de entrada

        // Validar el NIP y registrar el cliente si es válido
        if (nombre.equals("Catalina") && numCuenta.equals("23140972") && nip == 8002) {
            System.out.println("Cliente registrado exitosamente:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Número de Cuenta: " + numCuenta);
            System.out.println("NIP: " + nip);
            // Aquí puedes agregar la lógica para registrar el cliente en tu sistema
        } else {
            System.out.println("Datos incorrectos. Cliente no registrado.");
        }
        System.out.println("----------------------------------------------------");
    }
}
