package ejerciciosExtra.SingletonPeaje;

public class Client {
    public static void main(String[]args) {

        Administrador administrador=new Administrador();
        administrador.pagarPeaje(15,new Vehiculo("1LP","Susuki","Rojo"));
        administrador.pagarPeaje(30,new Vehiculo("2LP","Camaro","Azul"));
        administrador.pagarPeaje(20,new Vehiculo("3LP","Toyota","Verde"));
        administrador.pagarPeaje(10,new Vehiculo("4LP","Chevrolet","Gris"));
        administrador.pagarPeaje(5,new Vehiculo("5LP","Susuki","Negro"));
        administrador.pagarPeaje(7,new Vehiculo("6LP","Toyota","Rojo"));
        //clones para demostrar inclonabilidad
        administrador.pagarPeaje(8,new Vehiculo("1LP","Susuki","Rojo"));
        administrador.pagarPeaje(9,new Vehiculo("2LP","Camaro","Azul"));
        administrador.consultarMonto();


    }
}
