package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transferencia extends Clase_Abstractaa {

    @Override
    public void Transacciones() {

        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
 
        System.out.print("Cuanto quieres Transferir: ");
        Transferencia();
        if (transferencia <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - transferencia);
            System.out.println("====================================");
            System.out.println("=================BBVA===============");
            System.out.println("				Debito				");
            System.out.println("Se relalizo una Consulta el "+FechaActual);
            System.out.println("A la cuenta "+numero_cuenta);
            System.out.println("transferiste : " + transferencia);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("====================================");
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente");
            System.out.println("=====================");
        } 			
    }
}