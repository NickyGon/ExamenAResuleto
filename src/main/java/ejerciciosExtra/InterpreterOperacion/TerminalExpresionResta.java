package ejerciciosExtra.InterpreterOperacion;

public class TerminalExpresionResta extends AbstractExpresion {
    public TerminalExpresionResta(int length) {
        this.amountInt=length;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("restar")) {
            context.signo = -1;
            context.input = context.input.substring(this.amountInt);
        }
    }
}
