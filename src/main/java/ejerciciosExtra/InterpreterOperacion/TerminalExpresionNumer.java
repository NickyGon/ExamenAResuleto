package ejerciciosExtra.InterpreterOperacion;

public class TerminalExpresionNumer extends AbstractExpresion {
    public TerminalExpresionNumer(int length) {
        this.amountInt=length;
    }

    @Override
    public void interpreter(Context context) {
        context.output=context.output+(Integer.parseInt(context.input.substring(0,this.amountInt))*context.signo);
        context.input=context.input.substring(this.amountInt);
    }
}
