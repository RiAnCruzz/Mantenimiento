package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;

//import Proyecto.ClasePadre_Abstracta;

public class Ticket extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){

        Date Fecha = new Date();
        SimpleDateFormat FechaFor = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaTicket = FechaFor.format(Fecha);

        Date Hora = new Date();
        SimpleDateFormat HoraFor = new SimpleDateFormat("HH:mm:ss");
        String HoraTicket = HoraFor.format(Hora);



        //otener id de banco y pais
        System.out.println("====================================================");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------PAIS--------------------------");
        System.out.println("                                                    ");
        System.out.println(  "ID cajero              : "+banco);
        System.out.println(  "Fecha                  : "+FechaTicket);
        System.out.println(  "Hora                   : "+HoraTicket);
        System.out.println("----------------------------------------------------");
        System.out.println("Numero de cliente      : ");
        System.out.println("Tipo de transaccion    : ");
        System.out.println("Monto de la operacion  : ");
        System.out.println("----------------------------------------------------");
        System.out.println("  Presione enter para  volver al menú principal...  ");
        entrada.nextLine();
        System.out.println("====================================================");

    }


}
