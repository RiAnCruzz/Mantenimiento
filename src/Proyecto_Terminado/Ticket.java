package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;

//import Proyecto.ClasePadre_Abstracta;

public class Ticket extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){

        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
 
        System.out.println("====================================================");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("Fecha Hora");
        System.out.println("----------------------------------------------------");
        System.out.println("                       Debito                       ");
        System.out.println("Numero de cliente      : ");
        System.out.println("Numero de banco        : ");
        System.out.println("Numero de banco        : ");
        System.out.println("Tipo de transaccion    : ");
        System.out.println("Monto de la operacion  : ");
        System.out.println("----------------------------------------------------");
        System.out.println("  Presione enter para  volver al menú principal...  ");
        entrada.nextLine();
        System.out.println("====================================================");

    }


}
