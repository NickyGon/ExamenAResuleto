package ejercicios.interpreterIV;

public class TerminalI extends AbstractExpresion{
    public TerminalI(int amountChar){
        this.amountChar=amountChar;
    }


    @Override
    public void interpreter(Context context) {
        if (context.input.length()>1 && context.input.charAt(1)=='V'){
            context.output=context.output+"4";
        } else if (context.input.length()>1 && context.input.charAt(1)=='X') {
            context.output=context.output+"9";
        }else{
            int sum=0;
            for (int i=0;i<amountChar;i++){
                sum++;
            }
            context.output=context.output+sum;
        }
        context.output=context.output+" ";
        context.input=context.input.substring(this.amountChar);
    }
}
