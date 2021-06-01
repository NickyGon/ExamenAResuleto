package ejercicios.fabricaCelulares;

public class Celular implements iCelular{
    private String modelo;
    private String tamano;
    private int peso;
    private Camara camara;
    private String imei;
    private String origen;


    public Celular(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        Celular celular=new Celular();
        celular.setModelo(this.modelo);
        celular.setTamano(this.tamano);
        celular.setPeso(this.peso);
        celular.setCamara(this.camara);
        celular.setImei(this.imei);
        celular.setOrigen(this.origen);
        return celular;
    }
    public void show(){
        System.out.println("---Celular---");
        System.out.println("Modelo: "+modelo);
        System.out.println("Peso: "+peso);
        System.out.println("Camara. Foco: "+camara.getFoco()+". Lente: "+camara.getLente());
        System.out.println("IMEI: "+imei);
        System.out.println("Origen: "+origen);
    }
}
