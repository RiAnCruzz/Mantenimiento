package Proyecto_Terminado;
import java.util.Scanner;

public class Transferencia extends Clase_Abstractaa {


    @Override
    public void Transacciones() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("Transferencia");
        System.out.println("Cuenta de origen: ");
        String cuentaOrigen = entrada.nextLine();
        System.out.println("Cuenta de destino: ");
        String cuentaDestino = entrada.nextLine();
        System.out.println("Tipo de transferencia: " );
        String tipoTransferencia = entrada.nextLine();
        System.out.println("Monto a transferir: ");
        String monto = entrada.nextLine();
        System.out.println("====================================");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Generar ticket");
        System.out.println("2. Volver al menú principal");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                Ticket ticket = new Ticket();
                ticket.Transacciones();
                break;
            case 2:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }


}
