package ejerciciosExtra.AbstractFactoryTv;

public class Microondas implements iElectronicos{
    private String marca;
    private int wattsDePotencia;
    private String modelo;
    private int precio;

    public Microondas() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getWattsDePotencia() {
        return wattsDePotencia;
    }

    public void setWattsDePotencia(int wattsDePotencia) {
        this.wattsDePotencia = wattsDePotencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crear() {

        System.out.println("---Microondas---");
        System.out.println("Marca:" +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Watts de potencia: "+wattsDePotencia);
        System.out.println("Precio: "+precio+"Bs.");
    }
}
