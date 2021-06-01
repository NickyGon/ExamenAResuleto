package ejerciciosExtra.builderCine;

public class Client {
    public static void main(String[]args) {
        CandyBar candyBar=new CandyBar();
        PaqueteMediano pm=new PaqueteMediano();
        PaqueteNormal pn=new PaqueteNormal();
        MegaPaquete mp=new MegaPaquete();

        candyBar.setBuilder(mp);
        candyBar.hacerCombo();
        Combo combo1= candyBar.getCombo();
        System.out.println("----"+mp.getClass().getSimpleName()+"----");
        combo1.showCombo();

        candyBar.setBuilder(pm);
        candyBar.hacerCombo();
        Combo combo2= candyBar.getCombo();
        System.out.println("----"+pm.getClass().getSimpleName()+"----");
        combo2.showCombo();

        candyBar.setBuilder(pn);
        candyBar.hacerCombo();
        Combo combo3= candyBar.getCombo();
        System.out.println("----"+pn.getClass().getSimpleName()+"----");
        combo3.showCombo();
    }
}
