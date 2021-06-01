package ejercicios.interpreterIV;

public class Client {
    public static void main (String []args){
        String interpretar="I II III IV V VI VII VIII IX X";

        RomanInterpreter parser = new RomanInterpreter(interpretar);

        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);




    }
}
