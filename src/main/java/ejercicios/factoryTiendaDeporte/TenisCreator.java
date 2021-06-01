package ejercicios.factoryTiendaDeporte;

public class TenisCreator extends Creator{
    @Override
    public Tenis crear() {
        Tenis tenis=new Tenis();
        tenis.setCodigo(1);
        tenis.setColor("Blanco");
        tenis.setTallaPie(39);
        tenis.setMarca("Bata");
        return tenis;
    }
}
