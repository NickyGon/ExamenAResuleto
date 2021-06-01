package ejerciciosExtra.builderCine;

public class MegaPaquete extends Builder{

    @Override
    public void buildPipocas() {
        combo.setPipocas(new Pipocas("Salado",4,"ExtraGrande"));
    }

    @Override
    public void buildRefrescos() {
        combo.setRefrescos(new Refrescos(true,3,"Extragrande"));
    }

    @Override
    public void buildChocolate() {
        combo.setChocolates(new Chocolates("El Ceibo",2,"Grande"));
    }
}
