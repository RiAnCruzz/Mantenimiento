package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Clase_Abstractaa {
	String numero_cuenta;
    protected int transacciones, retiro, deposito,transferencia;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
        String Nombre = "";
        do {
            do {
                System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                System.out.println(" Fecha " + FechaActual);
                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Hacer una transferencia");
                System.out.println("    5. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);
            
            if(seleccion == 1){
            	Clase_Abstractaa mensajero = new Consulta();
                mensajero.Transacciones();
            }else if(seleccion == 2){
            	Clase_Abstractaa mensajero = new Retiro();
                mensajero.Transacciones();
            } else if(seleccion == 3){
            	Clase_Abstractaa mensajero = new Deposito();
                mensajero.Transacciones();
            } else if(seleccion == 4){
            	Clase_Abstractaa mensajero = new Transferencia();
                mensajero.Transacciones();
            } else if(seleccion == 5){
                System.out.println("=================================================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("=================================================");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    public void Numero_cuenta(){
    	 numero_cuenta = entrada.nextLine();
    }
	public void Retiro(){
        retiro = entrada.nextInt();
    }
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    public void Transferencia(){
        transferencia = entrada.nextInt();
    }

    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public abstract void Transacciones();


}
