package ejercicios.fabricaCelulares;

public class Client {
    public static void main(String[]args){
        Celular celular=new Celular();
        celular.setOrigen("Bolivia");
        celular.setPeso(60);
        celular.setCamara(new Camara(10,"5mp"));
        celular.setTamano("Grande");
        celular.setModelo("A1");
        celular.setImei("10001");

        //SE contará como el primero de los cinco al primer clon 10002

        Celular celular1=(Celular) celular.clone();
        celular1.setImei("10002");
        celular1.show();

        Celular celular2=(Celular) celular.clone();
        celular2.setImei("10003");
        celular2.show();

        Celular celular3=(Celular) celular.clone();
        celular3.setImei("10004");
        celular3.show();

        Celular celular4=(Celular) celular.clone();
        celular4.setImei("10005");
        celular4.show();

        Celular celular5=(Celular) celular.clone();
        celular5.setImei("10006");
        celular5.show();


    }

}
