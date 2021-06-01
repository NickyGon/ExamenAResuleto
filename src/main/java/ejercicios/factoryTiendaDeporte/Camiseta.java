package ejercicios.factoryTiendaDeporte;

public class Camiseta implements iElementos{
    private int codigo;
    private String talla;
    private String marca;
    private String color;

    public Camiseta(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void create() {
        System.out.println("---Camiseta---");
        System.out.println("Codigo: "+codigo);
        System.out.println("Talla: "+ talla);
        System.out.println("Color: "+color);
        System.out.println("Marca: " +marca);
    }
}
