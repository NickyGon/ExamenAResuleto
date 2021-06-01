package ejerciciosExtra.builderCine;

public class Chocolates {
    private String marca;
    private int cantidad;
    private String tamano;

    public Chocolates(String marca, int cantidad, String tamano) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

}
