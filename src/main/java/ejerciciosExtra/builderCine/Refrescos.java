package ejerciciosExtra.builderCine;

public class Refrescos {
    private boolean recargaIlimitada;
    private int cantidad;
    private String tamano;

    public Refrescos(boolean recargaIlimitada, int cantidad, String tamano) {
        this.recargaIlimitada = recargaIlimitada;
        this.cantidad = cantidad;
        this.tamano = tamano;
    }

    public boolean isRecargaIlimitada() {
        return recargaIlimitada;
    }

    public void setRecargaIlimitada(boolean recargaIlimitada) {
        this.recargaIlimitada = recargaIlimitada;
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
    public String decide(){
        if (recargaIlimitada){
            return "Si";
        } else{
            return "No";
        }
    }
}
