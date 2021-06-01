package ejercicios.interpreterIV;

public class TerminalV extends AbstractExpresion{
    public TerminalV(int amountChar){
        this.amountChar=amountChar;
    }


    @Override
    public void interpreter(Context context) {
        if (context.input.length()>1){
            int sum=0;
            for (int i=0;i<context.input.substring(1,amountChar).length();i++){
                sum++;
            }
            context.output=context.output+(5+sum);
        }
        context.output=context.output+" ";
        context.input=context.input.substring(this.amountChar);
    }
}
