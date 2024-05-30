package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class Clase_Abstractaa {
    Scanner entrada = new Scanner(System.in);
    String numero_cuenta,Ubicacion;
    protected int transacciones, retiro, deposito, transferencia, banco;
    private int saldo;  // Cambiado de static a instancia

    public void Operaciones() {
        
        int bandera = 0;
        int seleccion = 0;
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);
        do {
            do {
                System.out.println("====================================================");
                System.out.println("                                                    ");
                System.out.println("              B I E N V E N I D O    A              ");
                System.out.println("----------------------------------------------------");
                System.out.println("              GRUPO         FINANCIERO              ");
                System.out.println("               BBVA         BANCOMER                ");
                System.out.println("----------------------------------------------------");
                System.out.println(  " Fecha " + FechaActual);
                System.out.println(" Por favor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Hacer una transferencia.");
                System.out.println("    4. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar por favor");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                Clase_Abstractaa mensajero = new Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                Clase_Abstractaa mensajero = new Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                Clase_Abstractaa mensajero = new Transferencia();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("=================================================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("=================================================");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    public void Numero_cuenta() {
        numero_cuenta = entrada.nextLine();
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }

    public void Deposito() {
        deposito = entrada.nextInt();
    }

    public void Transferencia() {
        transferencia = entrada.nextInt();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getBanco() {
        return banco;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public abstract void Transacciones();
}
