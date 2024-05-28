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
        System.out.println("                       Debito                       ");
        System.out.println("Se relalizo una Consulta el "+FechaActual);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("====================================");
    }


}
