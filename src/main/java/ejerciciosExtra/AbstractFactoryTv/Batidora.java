package ejerciciosExtra.AbstractFactoryTv;

public class Batidora implements iElectronicos{
    private String marca;
    private String modelo;
    private boolean bol;
    private int precio;

    public Batidora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isBol() {
        return bol;
    }

    public void setBol(boolean bol) {
        this.bol = bol;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crear() {

        System.out.println("---Batidora---");
        System.out.println("Marca:" +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Contiene bol: "+bol);
        System.out.println("Precio: "+precio+"Bs.");
    }
}
