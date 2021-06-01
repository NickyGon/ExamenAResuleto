package ejercicios.matriculaSingleton;

import java.util.ArrayList;
import java.util.List;

public class Ventanilla {
    private static Ventanilla instance=null;
    private RH rh;
    private List<Estudiante> lista=new ArrayList<Estudiante>();

    public Ventanilla(RH rh){
        this.rh=rh;
    }

    public static synchronized void makeInstance(RH rh){
        if (instance==null){
            instance=new Ventanilla(rh);
        }
    }

    public Ventanilla getInstance(RH rh){
        if (instance==null){
            makeInstance(rh);
        }
        return instance;
    }

    public synchronized void getEstudiantes(){


    }


}
