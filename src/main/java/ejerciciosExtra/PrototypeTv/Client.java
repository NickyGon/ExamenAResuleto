package ejerciciosExtra.PrototypeTv;

public class Client {
    public static void main(String[]args) {
        Televisor televisor= new Televisor();
        televisor.setSerial("1028491219");
        televisor.setOs("Android");
        televisor.setVersionOS("11.0");
        televisor.setPulgadas(80);
        televisor.setResolucion(50);
        televisor.setPuertoHDMI(true);
        televisor.setPuertoUSB(4);
        televisor.setControlRemoto(false);

        //desde este punto cuentan los 5 clones

        Televisor tclone=(Televisor) televisor.clone();
        tclone.setSerial("1028491221");
        Televisor tclone2=(Televisor) televisor.clone();
        tclone2.setSerial("1028491222");
        Televisor tclone3=(Televisor) televisor.clone();
        tclone3.setSerial("1028491223");
        Televisor tclone4=(Televisor) televisor.clone();
        tclone4.setSerial("1028491224");
        Televisor tclone5=(Televisor) televisor.clone();
        tclone5.setSerial("1028491225");

        tclone.showTV();
        tclone2.showTV();
        tclone3.showTV();
        tclone4.showTV();
        tclone5.showTV();



    }
}
