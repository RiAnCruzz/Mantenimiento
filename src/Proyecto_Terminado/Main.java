package Proyecto_Terminado;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("                                                    ");
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("       POR FAVOR INGRESA TU NUMERO DE TARJETA       ");
        String Tarjeta = entrada.nextLine();
        if(Tarjeta.equals("1010101010101010")) {
            System.out.println("====================================================");
            Clase_Abstractaa operador = new MenuOperador();
            operador.Transacciones();
        } else if (Tarjeta.equals(MenuOperador.getTarjeta())) {
            System.out.println("====================================================");
            Clase_Abstractaa cliente = new MenuCliente();
            cliente.Transacciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
        }
    }
}

