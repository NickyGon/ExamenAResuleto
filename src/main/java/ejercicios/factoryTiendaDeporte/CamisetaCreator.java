package ejercicios.factoryTiendaDeporte;

public class CamisetaCreator extends Creator{
    @Override
    public Camiseta crear() {
        Camiseta camiseta=new Camiseta();
        camiseta.setCodigo(1);
        camiseta.setColor("Rojo");
        camiseta.setTalla("M");
        camiseta.setMarca("Adidas");
        return camiseta;
    }
}
