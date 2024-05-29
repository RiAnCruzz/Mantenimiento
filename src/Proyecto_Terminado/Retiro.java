package Proyecto_Terminado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Retiro extends Clase_Abstractaa {
    
	private String cuenta;
    private String tipo;
    private int monto;

    Scanner entrada = new Scanner(System.in);

    public Retiro(String cuenta, String tipo, int monto) {
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.monto = monto;
    }

    @Override
    public void Transacciones() {
        Date Fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String FechaActual = sdf.format(Fecha);

        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto a retirar: " + monto);
        System.out.println("Fecha y hora: " + FechaActual);
        System.out.println("====================================");

        if (monto <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - monto);
            System.out.println("Retiraste : " + monto);
            System.out.println("Tu saldo actual es: " + getSaldo());
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente.");
            System.out.println("=====================");
        }
    }
}
