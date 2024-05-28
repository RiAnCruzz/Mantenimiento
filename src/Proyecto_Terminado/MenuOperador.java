package Proyecto_Terminado;
import java.util.Scanner;

public class MenuOperador extends Clase_Abstractaa {
    static Scanner entrada = new Scanner(System.in);
    private static String tarjeta;
    private static int nip;
    private static String cuenta;
    private static String nombre;

    @Override
    public void Transacciones() {
        System.out.println("====================================================");
        System.out.println("                                                    ");
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
    
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese el Nombre del Cliente:");
        String nombre = entrada.nextLine();
    
        System.out.println("Ingrese el Número de Cuenta:");
        String cuenta = entrada.nextLine();
    
        System.out.println("Ingrese el número de tarjeta:");
        String numeroTarjeta = entrada.nextLine();

        System.out.println("Ingrese el NIP:");
        int nip = entrada.nextInt();
    
        // Limpia el buffer de entrada
        entrada.nextLine();
    
        // Actualiza los datos del cliente en el objeto menuOperador
        menuOperador.setNombre(nombre);
        menuOperador.setCuenta(cuenta);
        menuOperador.setTarjeta(numeroTarjeta);
        menuOperador.setNip(nip);
    
        // Muestra los datos del cliente registrado
        System.out.println("Cliente registrado exitosamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Cuenta: " + cuenta);
        System.out.println("NIP: " + nip);
        System.out.println("Número de Tarjeta: " + MenuOperador.getTarjeta());
    
        // Regresa al menú principal
        System.out.println("====================================================");
        System.out.println("Presione enter para volver al menú principal...");
        entrada.nextLine();
        System.out.println("====================================================");
        menuOperador.Transacciones(); // Llamar al método Transacciones() para regresar al menú principal
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
