package ejerciciosExtra.builderCine;

public class Combo {
    private Pipocas pipocas;
    private Refrescos refrescos;
    private Chocolates chocolates;

    public Combo(){}

    public Pipocas getPipocas() {
        return pipocas;
    }

    public void setPipocas(Pipocas pipocas) {
        this.pipocas = pipocas;
    }

    public Refrescos getRefrescos() {
        return refrescos;
    }

    public void setRefrescos(Refrescos refrescos) {
        this.refrescos = refrescos;
    }

    public Chocolates getChocolates() {
        return chocolates;
    }

    public void setChocolates(Chocolates chocolates) {
        this.chocolates = chocolates;
    }

    public void showCombo(){
        System.out.println(pipocas.getCantidad()+" envases de pipocas tamaño "+pipocas.getTamano()+" sabor "+pipocas.getSabor());
        System.out.println(refrescos.getCantidad()+" vasos de refresco tamaño "+ refrescos.getTamano()+". Recargables: "+ refrescos.decide());
        if (chocolates!=null){
            System.out.println(chocolates.getCantidad()+" barras de chocolate tamaño "+chocolates.getTamano()+ " de "+chocolates.getMarca());
        }


    }
}
