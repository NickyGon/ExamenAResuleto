package ejerciciosExtra.builderCine;

public class CandyBar {
    private Builder builder;
    public Combo getCombo(){return builder.getCombo();}
    public void setBuilder(Builder builder){this.builder=builder;}

    public void hacerCombo(){
        this.builder.hacerCombo();
        this.builder.buildPipocas();
        this.builder.buildRefrescos();
        this.builder.buildChocolate();
    }
}
