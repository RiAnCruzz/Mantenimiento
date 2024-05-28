package Proyecto_Terminado;

//import Proyecto.Clase_Abstractaa;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposito extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
 
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("===================================");
        System.out.println("=================BBVA===============");
        System.out.println("Se relalizo una Consulta el "+FechaActual);
        System.out.println("				Debito				");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("===================================");
    }
    
}