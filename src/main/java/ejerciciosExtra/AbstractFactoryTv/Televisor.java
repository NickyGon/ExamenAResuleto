package ejerciciosExtra.AbstractFactoryTv;

public class Televisor implements iElectronicos{
    private String marca;
    private int numeroPulgadas;
    private String modelo;
    private int precio;

    public Televisor() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPulgadas() {
        return numeroPulgadas;
    }

    public void setNumeroPulgadas(int numeroPulgadas) {
        this.numeroPulgadas = numeroPulgadas;
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
        System.out.println("---Televisor---");
        System.out.println("Marca:" +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Numero de pulgadas: "+numeroPulgadas);
        System.out.println("Precio: "+precio+"Bs.");
    }
}
