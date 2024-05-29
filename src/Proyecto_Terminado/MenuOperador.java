package Proyecto_Terminado;
import java.util.Locale;
import java.util.Scanner;

public class MenuOperador extends Clase_Abstractaa {
    static Scanner entrada = new Scanner(System.in);
    static Locale Ubicacion = Locale.getDefault();
    private static String tarjeta;
    private static int nip;
    private static String cuenta;
    private static String nombre;
    int bancoID = 1;

    @Override
    public void Transacciones() {
        System.out.println("====================================================");
        System.out.println("ID : " + bancoID + "                                   " + Ubicacion.getDisplayCountry() + " - " + Ubicacion.getCountry());
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
        System.out.println("====================================================");
        System.out.print("Ingrese el Nombre del Cliente:");
        String nombre = entrada.nextLine();
    
        System.out.print("Ingrese el Número de Cuenta:");
        String cuenta = entrada.nextLine();
    
        System.out.print("Ingrese el número de tarjeta:");
        String numeroTarjeta = entrada.nextLine();

        System.out.print("Ingrese el NIP:");
        int nip = entrada.nextInt();
        entrada.nextLine();
    
        menuOperador.setNombre(nombre);
        menuOperador.setCuenta(cuenta);
        menuOperador.setTarjeta(numeroTarjeta);
        menuOperador.setNip(nip);
    
        System.out.println("----------------------------------------------------");
        System.out.println("Cliente registrado exitosamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Cuenta: " + cuenta);
        System.out.println("NIP: " + nip);
        System.out.println("Número de Tarjeta: " + MenuOperador.getTarjeta());
    
        // Regresa al menú principal
        System.out.println("====================================================");
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
