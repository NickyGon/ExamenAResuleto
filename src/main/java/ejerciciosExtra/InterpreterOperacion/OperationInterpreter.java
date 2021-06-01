package ejerciciosExtra.InterpreterOperacion;

import java.util.ArrayList;
import java.util.List;

public class OperationInterpreter extends AbstractExpresion{
    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;


    public OperationInterpreter(String word){this.interpret(word);}

    public void interpret(String words){
        String input = words;
        input=input.replace("(","");
        input=input.replace(")","");
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "sumar":
                    parseTree.add(new TerminalExpresionSuma(word.length()));
                    break;
                case "restar":
                    parseTree.add(new TerminalExpresionResta(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpresionNumer(word.length()));
                    break;
            }
        }
    }

    public int interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(Context context) {


    }
}
