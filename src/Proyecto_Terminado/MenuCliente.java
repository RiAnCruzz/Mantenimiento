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
        	System.out.println("===============================================");
        	//System.out.print(Nombre);
            Clase_Abstractaa mesajero = new Consulta();
            mesajero.setSaldo(1700);
            mesajero.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }
    }
    public String getNombre(){
        return getNombre();
    }

}

