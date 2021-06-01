package ejercicios.factoryTiendaDeporte;

public class PelotaCreator extends Creator{
    @Override
    public Pelota crear() {
        Pelota pelota=new Pelota();
        pelota.setCodigo(1);
        pelota.setColor("Azul");
        pelota.setTamano("Grande");
        pelota.setGarantia("3 años");
        return pelota;
    }
}
