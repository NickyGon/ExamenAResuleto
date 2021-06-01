package ejerciciosExtra.InterpreterOperacion;

public class TerminalExpresionSuma extends AbstractExpresion {
    public TerminalExpresionSuma(int length) {
        this.amountInt=length;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("sumar")) {
            context.signo = 1;
            context.input = context.input.substring(this.amountInt);
        }
    }
}
