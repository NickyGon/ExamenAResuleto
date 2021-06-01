package ejerciciosExtra.AbstractFactoryTv;

public class Radio implements iElectronicos{
    private String marca;
    private boolean bluetooth;
    private String modelo;
    private int precio;

    public Radio() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
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

        System.out.println("---Radio---");
        System.out.println("Marca:" +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Precio: "+precio+"Bs.");
    }
}
