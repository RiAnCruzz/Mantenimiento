package Proyecto_Terminado;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transferencia extends Clase_Abstractaa {


    @Override
    public void Transacciones() {
        Scanner entrada = new Scanner(System.in);

        Transferencia();   

        Date Fecha = new Date();     
        SimpleDateFormat FechaFor = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaTicket = FechaFor.format(Fecha);

        if (transferencia <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - transferencia);
            System.out.println("====================================================");
            System.out.println("              B I E N V E N I D O    A              ");
            System.out.println("----------------------------------------------------");
            System.out.println("              GRUPO         FINANCIERO              ");
            System.out.println("               BBVA         BANCOMER                ");
            System.out.println("----------------------------------------------------");
            System.out.println("                   Transferencia                    ");
            System.out.println("Se relalizo una Consulta "+ FechaTicket);
            System.out.println("A la cuenta :             "+numero_cuenta);
            System.out.println("transferiste : " + transferencia);
            System.out.println("Tu saldo actual es: " + getSaldo());
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
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente");
            System.out.println("=====================");
       
    
        }


    }


}
