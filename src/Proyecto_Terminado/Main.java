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
        String Targeta = entrada.nextLine();
        if(Targeta.equals("1010101010101010")) {
            System.out.println("====================================================");
            Clase_Abstractaa operador = new MenuOperador();
            operador.Transacciones();
        }/*else if (Targeta.equals(getNombre())){
            System.out.println("====================================================");
            Clase_Abstractaa mesajero = new MenuCliente();
            mesajero.Operaciones();
        }*/else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }

    }
    /*private static Object getNombre() {
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }*/
}

