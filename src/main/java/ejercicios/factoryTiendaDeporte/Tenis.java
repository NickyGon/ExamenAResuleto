package ejercicios.factoryTiendaDeporte;

public class Tenis implements iElementos{
    private int codigo;
    private int tallaPie;
    private String marca;
    private String color;

    public Tenis(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public int getTallaPie() {
        return tallaPie;
    }

    public void setTallaPie(int tallaPie) {
        this.tallaPie = tallaPie;
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
        System.out.println("---Tenis---");
        System.out.println("Codigo: "+codigo);
        System.out.println("Talla de Pie: "+ tallaPie);
        System.out.println("Color: "+color);
        System.out.println("Marca: " +marca);
    }
}
