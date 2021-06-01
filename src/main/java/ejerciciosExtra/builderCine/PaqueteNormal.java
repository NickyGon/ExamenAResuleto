package ejerciciosExtra.builderCine;

public class PaqueteNormal extends Builder{

    @Override
    public void buildPipocas() {
        combo.setPipocas(new Pipocas("Salado",2,"Normal"));
    }

    @Override
    public void buildRefrescos() {
        combo.setRefrescos(new Refrescos(false,1,"Mediano"));
    }

    @Override
    public void buildChocolate() {

    }
}
