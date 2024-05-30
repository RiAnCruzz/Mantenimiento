package Proyecto_Terminado;

import java.util.Scanner;

public class Main{

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean accesoConcedido = false;
        
        while (!accesoConcedido) {
            System.out.println("====================================================");
            //System.out.println("ID : " + banco.getBanco() +  "                                   " + banco.getUbicacion());
            System.out.println("              B I E N V E N I D O    A              ");
            System.out.println("----------------------------------------------------");
            System.out.println("              GRUPO         FINANCIERO              ");
            System.out.println("               BBVA         BANCOMER                ");
            System.out.println("----------------------------------------------------");
            System.out.println("       POR FAVOR INGRESA TU NUMERO DE TARJETA       ");   
            String Tarjeta = entrada.nextLine();

            if (Tarjeta.equals("11")) {
                System.out.println("       POR FAVOR INGRESA TU CLAVE DE OPERADOR       ");
                String clave = entrada.nextLine();
                if (clave.equals("1994")) {
                    System.out.println("====================================================");
                    Clase_Abstractaa operador = new MenuOperador();
                    operador.Transacciones();
                    accesoConcedido = true;
                } else {
                    MensajeError();
                }
            } else if(Tarjeta.equals("666")) {
                System.exit(0);
            } else if (Tarjeta.equals(MenuOperador.getTarjeta())) {
                System.out.println("====================================================");
                Clase_Abstractaa cliente = new MenuCliente();
                cliente.Transacciones();
                accesoConcedido = true;
            } else {
                MensajeError();
            }
        }
    }

    public static void MensajeError() {
        System.out.println("====================================================");
        System.out.println("  Alguno de sus datos es erroneo,  intente denuevo  ");
        System.out.println("====================================================");
    }




}
