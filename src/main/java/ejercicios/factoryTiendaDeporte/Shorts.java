package ejercicios.factoryTiendaDeporte;

public class Shorts implements iElementos{
    private int codigo;
    private String talla;
    private String estrechez;
    private String color;

    public Shorts(){

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

    public String getEstrechez() {
        return estrechez;
    }

    public void setEstrechez(String estrechez) {
        this.estrechez = estrechez;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void create() {
        System.out.println("---Shorts---");
        System.out.println("Codigo: "+codigo);
        System.out.println("Talla: "+ talla);
        System.out.println("Color: "+color);
        System.out.println("Nivel de Estrechez: " +estrechez);
    }
}
