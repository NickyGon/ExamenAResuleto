package ejercicios.interpreterIV;

public class TerminaX extends AbstractExpresion{
    public TerminaX(int amountChar){
        this.amountChar=amountChar;
    }


    @Override
    public void interpreter(Context context) {
        int sum=0;
        if (context.input.length()>1){

            for (int i=0;i<context.input.substring(1,amountChar).length();i++){
                sum++;
            }

        }
        context.output=context.output+(10+sum);
        context.output=context.output+" ";
        context.input=context.input.substring(this.amountChar);
    }
}
