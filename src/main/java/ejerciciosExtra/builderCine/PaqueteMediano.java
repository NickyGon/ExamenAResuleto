package ejerciciosExtra.builderCine;

public class PaqueteMediano extends Builder{

    @Override
    public void buildPipocas() {
        combo.setPipocas(new Pipocas("Mixto",3,"Grande"));
    }

    @Override
    public void buildRefrescos() {
        combo.setRefrescos(new Refrescos(false,2,"Mediano"));
    }

    @Override
    public void buildChocolate() {
        combo.setChocolates(new Chocolates("Breick",1,"Mediano"));
    }
}
