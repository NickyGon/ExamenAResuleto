package ejercicios.factoryTiendaDeporte;

public class Medias implements iElementos{
    private int codigo;
    private String talla;
    private int numeroPares;
    private String color;

    public Medias(){

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

    public int getNumeroPares() {
        return numeroPares;
    }

    public void setNumeroPares(int numeroPares) {
        this.numeroPares = numeroPares;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void create() {
        System.out.println("---Medias---");
        System.out.println("Codigo: "+codigo);
        System.out.println("Talla: "+ talla);
        System.out.println("Color: "+color);
        System.out.println("Numero de pares: "+numeroPares);
    }
}
