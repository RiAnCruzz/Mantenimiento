package Proyecto_Terminado;
import java.util.Scanner;

public class MenuCliente extends Clase_Abstractaa{

	static Scanner entrada = new Scanner(System.in);

    @Override
    public void Transacciones() {
        System.out.println("====================================================");
        System.out.println("                                                    ");
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("              POR FAVOR INGRESA TU NIP              ");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nip == MenuOperador.getNip()) {
        	System.out.println("====================================================");
            Clase_Abstractaa cliente = new Consulta();
            cliente.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }
    }
}

