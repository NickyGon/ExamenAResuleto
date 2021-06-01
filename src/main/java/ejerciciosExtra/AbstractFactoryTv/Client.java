package ejerciciosExtra.AbstractFactoryTv;

public class Client {
    public static void main(String[]args){
        Batidora batidora=(Batidora) FabricaElectronicos.make(FabricaElectronicos.Electronicos.BATIDORA);
        batidora.setPrecio(229);
        batidora.crear();
        Televisor televisor=(Televisor) FabricaElectronicos.make(FabricaElectronicos.Electronicos.TV);
        televisor.setPrecio(4399);
        televisor.crear();
        Refrigerador refrigerador=(Refrigerador) FabricaElectronicos.make(FabricaElectronicos.Electronicos.REFRIGERADOR);
        refrigerador.setPrecio(2600);
        refrigerador.crear();
        Microondas microondas=(Microondas) FabricaElectronicos.make(FabricaElectronicos.Electronicos.MICROONDAS);
        microondas.setPrecio(999);
        microondas.crear();
        Radio radio=(Radio) FabricaElectronicos.make(FabricaElectronicos.Electronicos.RADIO);
        radio.setPrecio(619);
        radio.crear();
    }


}
