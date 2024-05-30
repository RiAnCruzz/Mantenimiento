package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;

//import Proyecto.ClasePadre_Abstracta;

public class Consulta extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){

        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
        setSaldo(2000);
 
        System.out.println("====================================================");
        System.out.println("                                                    ");
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("                     Debito                         ");
        System.out.println("Se relalizo una Consulta el : " + FechaActual);
        System.out.println("Tu saldo actual es          : " + getSaldo());
        System.out.println("----------------------------------------------------");
        System.out.println("  Presione enter para  volver al menú principal...  ");
        entrada.nextLine();
        System.out.println("====================================================");
        Clase_Abstractaa mesajero = new Consulta();
        mesajero.Operaciones();
    }


}
