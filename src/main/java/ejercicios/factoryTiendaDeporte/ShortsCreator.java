package ejercicios.factoryTiendaDeporte;

public class ShortsCreator extends Creator{
    @Override
    public Shorts crear() {

        Shorts shorts=new Shorts();
        shorts.setCodigo(1);
        shorts.setColor("Negro");
        shorts.setTalla("M");
        shorts.setEstrechez("Bajo");
        return shorts;
    }
}
