package ejerciciosExtra.AbstractFactoryTv;

public class FabricaElectronicos {
    enum Electronicos{
        MICROONDAS,TV,RADIO,BATIDORA,REFRIGERADOR;
    }

    public static iElectronicos make(Electronicos type){
        iElectronicos electronico;
        switch (type){
            case TV :
                electronico=new Televisor();
                ((Televisor)electronico).setMarca("LG");
                ((Televisor)electronico).setModelo("NanoCell");
                ((Televisor)electronico).setNumeroPulgadas(55);
                break;
            case RADIO:
                electronico=new Radio();
                ((Radio)electronico).setMarca("Sony");
                ((Radio)electronico).setModelo("Boombox");
                ((Radio)electronico).setBluetooth(true);
                break;
            case BATIDORA:
                electronico=new Batidora();
                ((Batidora)electronico).setMarca("Oster");
                ((Batidora)electronico).setModelo("Planetaria");
                ((Batidora)electronico).setBol(false);
                break;
            case MICROONDAS:
                electronico=new Microondas();
                ((Microondas)electronico).setMarca("Whirpool");
                ((Microondas)electronico).setModelo("Grill");
                ((Microondas)electronico).setWattsDePotencia(700);
                break;
            case REFRIGERADOR:
                electronico=new Refrigerador();
                ((Refrigerador)electronico).setMarca("Samsung");
                ((Refrigerador)electronico).setModelo("Side by Side");
                ((Refrigerador)electronico).setAI(true);
                break;
            default:
                electronico=null;
                break;
        }
        return electronico;
    }
}
