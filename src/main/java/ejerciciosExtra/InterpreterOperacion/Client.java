package ejerciciosExtra.InterpreterOperacion;

public class Client {
    public static void main(String[]args){
        String operacion="(1 sumar 2 restar 2 sumar 1 sumar 1)";
        OperationInterpreter interpreterOperaciones=new OperationInterpreter(operacion);
        System.out.println("Operacion: "+ operacion);
        System.out.println("Resultado: "+ interpreterOperaciones.interpretar());
    }
}
