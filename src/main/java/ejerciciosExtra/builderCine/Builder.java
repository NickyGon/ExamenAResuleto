package ejerciciosExtra.builderCine;

public abstract class Builder {
    protected Combo combo;
    public Combo getCombo(){return combo;}
    public void hacerCombo(){combo=new Combo();}

    public abstract void buildPipocas();
    public abstract void buildRefrescos();
    public abstract void buildChocolate();

}
