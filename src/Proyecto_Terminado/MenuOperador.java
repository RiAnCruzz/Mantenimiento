package Proyecto_Terminado;
import java.util.Scanner;

public class MenuOperador extends Clase_Abstractaa {

    static Scanner entrada = new Scanner(System.in);
    private static String tarjeta;
    private static int nip;
    private static String cuenta;
    private static String nombre;
    private static String domicilio;
    private static String tipo;

    Clase_Abstractaa operador = new MenuCliente();

    @Override
    public void Transacciones() {
        System.out.println("====================================================");
        System.out.println("              B I E N V E N I D O    A              ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Salir");
        System.out.println("----------------------------------------------------");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                Main.main(null);
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                break;
        }
    }

    public static void registrarCliente() {
        MenuOperador menuOperador = new MenuOperador();
        entrada.nextLine();
        System.out.println("         R E G I S T R A R    C L I E N T E         ");
        System.out.println("----------------------------------------------------");
        System.out.println("              GRUPO         FINANCIERO              ");
        System.out.println("               BBVA         BANCOMER                ");
        System.out.println("----------------------------------------------------");
        System.out.println("      D A T O S       D E L      C L I E N T E      ");
        System.out.println("----------------------------------------------------");

        System.out.print("Ingrese el Número de Cuenta:");
        String cuenta = entrada.nextLine();
        System.out.print("Ingrese el Nombre del Cliente:");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el domicilio del cliente:");
        String domicilio = entrada.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        System.out.print("1-Cuenta de Ahorro 2-Cuenta de Cheques:");
        tipo = entrada.nextLine();
        while (!tipo.equals("1") && !tipo.equals("2")) {
            System.out.println("Ingrese el tipo de cuenta:");
            System.out.print("1-Cuenta de Ahorro 2-Cuenta de Cheques:");
            tipo = entrada.nextLine();

            if (tipo.equals("1")) {
                System.out.println("Ha seleccionado Cuenta de Ahorro.");
            } else if (tipo.equals("2")) {
                System.out.println("Ha seleccionado Cuenta de Cheques.");
            } else {
                System.out.println("Tipo de cuenta no válido. Seleccione 1 para Cuenta de Ahorro o 2 para Cuenta de Cheques.");
            }
        }
        System.out.print("Ingrese el número de tarjeta:");
        String numeroTarjeta = entrada.nextLine();
        System.out.print("Ingrese el NIP:");
        int nip = entrada.nextInt();
        entrada.nextLine();
    
        menuOperador.setCuenta(cuenta);
        menuOperador.setNombre(nombre);
        menuOperador.setDomicilio(domicilio);
        menuOperador.setTipo(tipo);
        menuOperador.setTarjeta(numeroTarjeta);
        menuOperador.setNip(nip);
        menuOperador.setSaldo(500);

    
        System.out.println("----------------------------------------------------");
        System.out.println("         C L I E N T E    R E G I S T R A D O       ");
        System.out.println("----------------------------------------------------");
        System.out.println("Número de Cuenta : " + MenuOperador.getCuenta());
        System.out.println("Nombre           : " + MenuOperador.getNombre());
        System.out.println("Domicilio        : " + MenuOperador.getDomicilio());
        System.out.println("Tipo de cuenta   : " + MenuOperador.getTipo());
        System.out.println("Número de Tarjeta: " + MenuOperador.getTarjeta());

        System.out.println("----------------------------------------------------");
        System.out.println("  Presione enter para  volver al menú principal...  ");
        entrada.nextLine();
        System.out.println("====================================================");
        menuOperador.Transacciones(); 
    }
    
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public static String getCuenta() {
        return cuenta;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public static String getDomicilio() {
        return domicilio;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getTipo() {
        return tipo;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public static String getTarjeta() {
        return tarjeta;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    public static int getNip() {
        return nip;
    }
}
