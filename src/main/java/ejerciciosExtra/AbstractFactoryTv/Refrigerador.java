package ejerciciosExtra.AbstractFactoryTv;

public class Refrigerador implements iElectronicos{
    private String marca;
    private boolean AI;
    private String modelo;
    private int precio;

    public Refrigerador() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAI() {
        return AI;
    }

    public void setAI(boolean AI) {
        this.AI = AI;
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

        System.out.println("---Refrigerador---");
        System.out.println("Marca:" +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Ingeligencia Artificial: "+AI);
        System.out.println("Precio: "+precio+"Bs.");
    }
}
