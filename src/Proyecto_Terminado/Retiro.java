package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Retiro extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
        int tipo = 1;
        System.out.println("====================================================");
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");

        System.out.println("                     Retiro                         ");
        System.out.println("Cuenta: " );
        System.out.println("Tipo: " + tipo);
        System.out.print("Monto a retirar: ");
        Retiro();

        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("Retiraste : " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("====================================");
        } else {
            System.out.println("====================================================");
            System.out.println("                Saldo insuficiente.                 ");
            System.out.println("====================================================");
        }
        System.out.println("Fecha y hora: " + FechaActual);
        System.out.println("----------------------------------------------------");

    }
}
