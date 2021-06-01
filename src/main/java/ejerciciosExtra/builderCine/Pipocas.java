package ejerciciosExtra.builderCine;

public class Pipocas {
    private String sabor;
    private int cantidad;
    private String tamano;

    public Pipocas(String sabor, int cantidad, String tamano) {
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.tamano = tamano;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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
