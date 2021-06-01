package ejerciciosExtra.SingletonPeaje;


public class Administrador {
    public Administrador(){Cabina.getInstance();}
    public void pagarPeaje(int cantidad, Vehiculo vehiculo){
        Cabina.getInstance().info("Pagando un peaje");
        Cabina.getInstance().pagoPeaje(cantidad,vehiculo);
    }
    public void consultarMonto(){
        Cabina.getInstance().info("Retornando base de datos");
        Cabina.getInstance().getTotal();
    }

}
