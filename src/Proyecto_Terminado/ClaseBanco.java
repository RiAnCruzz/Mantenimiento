package Proyecto_Terminado;

public class ClaseBanco extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
        int bancoID = 1;
        String ubicacion = "Mexico - MX";
        this.setBanco(bancoID);
        this.setUbicacion(ubicacion);
    }
}
