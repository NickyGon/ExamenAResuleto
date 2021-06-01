package ejercicios.factoryTiendaDeporte;

public class Client {
    public static void main(String[]args){
       Creator creatorCamiseta=new CamisetaCreator();
       Creator creatorMedias=new MediasCreator();
       Creator creatorTenis=new TenisCreator();
       Creator creatorPelota=new PelotaCreator();
       Creator creatorShorts=new ShortsCreator();

       creatorCamiseta.crear().create();
       creatorPelota.crear().create();
       creatorMedias.crear().create();
       creatorTenis.crear().create();
       creatorShorts.crear().create();
    }
}
