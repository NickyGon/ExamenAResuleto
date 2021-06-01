package ejercicios.interpreterIV;

import java.util.ArrayList;
import java.util.List;

public class RomanInterpreter {
    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public RomanInterpreter(String word){
        this.interpretar(word);
    }

    public void interpretar(String numb){
        String input=numb;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            if(word.startsWith("I")){
                parseTree.add(new TerminalI(word.length()));

            } else if (word.startsWith("V")){
                parseTree.add(new TerminalV(word.length()));

            }else if (word.startsWith("X")){
                parseTree.add(new TerminaX(word.length()));
            }
        }

    }

    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }
}
