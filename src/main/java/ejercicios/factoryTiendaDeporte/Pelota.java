package ejercicios.factoryTiendaDeporte;

public class Pelota implements iElementos{
    private int codigo;
    private String tamano;
    private String garantia;
    private String color;

    public Pelota(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void create() {
        System.out.println("---Pelota---");
        System.out.println("Codigo: "+codigo);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Color: "+color);
        System.out.println("Garantia: " +garantia);
    }
}
