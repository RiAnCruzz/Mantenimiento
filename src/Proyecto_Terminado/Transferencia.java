package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transferencia extends Clase_Abstractaa {
    private String cuentaOrigen;
    private String cuentaDestino;
    private String tipoTransferencia;
    private int monto;

    public Transferencia(String cuentaOrigen, String cuentaDestino, String tipoTransferencia, int monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.tipoTransferencia = tipoTransferencia;
        this.monto = monto;
    }

    @Override
    public void Transacciones() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("Transferencia");
        System.out.println("Cuenta de origen: " + cuentaOrigen);
        System.out.println("Cuenta de destino: " + cuentaDestino);
        System.out.println("Tipo de transferencia: " + tipoTransferencia);
        System.out.println("Monto a transferir: " + monto);
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
