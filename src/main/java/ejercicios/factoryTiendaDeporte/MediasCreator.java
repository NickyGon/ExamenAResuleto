package ejercicios.factoryTiendaDeporte;

public class MediasCreator extends Creator{
    @Override
    public Medias crear() {

        Medias medias=new Medias();
        medias.setCodigo(1);
        medias.setColor("Gris");
        medias.setTalla("L");
        medias.setNumeroPares(4);
        return medias;
    }
}
