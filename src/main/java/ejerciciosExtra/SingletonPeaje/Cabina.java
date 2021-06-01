package ejerciciosExtra.SingletonPeaje;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cabina {
    private static Cabina instance=null;
    private int monto;
    private Map<String,Integer> listaPago;
    private Map<String,Vehiculo> listaFinal;

    private Cabina(){
        monto=0;
        listaPago =new HashMap<String,Integer>();
        listaFinal=new HashMap<String, Vehiculo>();
        System.out.println("Iniciando la sesión de la cabina");}

    public static synchronized void makeInstance(){
        if(instance==null){
            instance=new Cabina();
        }
    }
    public static Cabina getInstance(){
        if(instance==null)
            makeInstance();
        return instance;
    }

    public void info(String info){System.out.println("INFO> "+info);}

    public synchronized void pagoPeaje(int amount,Vehiculo vehiculo){
        monto=monto+amount;
        if (listaPago.containsKey(vehiculo.getPlaca())) {
             int suma=listaPago.get(vehiculo.getPlaca()) + amount;
            listaPago.put(vehiculo.getPlaca(), suma);
        } else {
            listaPago.put(vehiculo.getPlaca(), amount);
        }
        listaFinal.put(vehiculo.getPlaca(),vehiculo);
        System.out.println("El vehiculo "+vehiculo.getPlaca()+" paga "+amount+"Bs.");
    }

    public synchronized void getTotal(){
        System.out.println("Monto acumulado en el sistema de peaje de esta ventanilla: "+monto+"Bs.");
        System.out.println("Vehiculos registrados: ");
        for (Map.Entry<String,Integer> entry:listaPago.entrySet()) {
            System.out.println("Placa: "+entry.getKey()+". Marca: "+listaFinal.get(entry.getKey()).getModelo()+". Color: "+listaFinal.get(entry.getKey()).getColor()+". Monto pagado en total: "+entry.getValue()+"Bs.");
        }
    }


}
