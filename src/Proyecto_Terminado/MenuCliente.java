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
        System.out.println("Ingrese su Nombre:	(Catalina)");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nombre.equals("C") && Num_cuenta.equals("2") && Nip==8) {
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

