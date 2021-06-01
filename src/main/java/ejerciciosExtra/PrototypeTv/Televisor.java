package ejerciciosExtra.PrototypeTv;

public class Televisor implements iTelevisor{
    private String os;
    private String versionOS;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertoUSB;
    private boolean controlRemoto;
    private String serial;

    public Televisor(){}

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVersionOS() {
        return versionOS;
    }

    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertoUSB() {
        return puertoUSB;
    }

    public void setPuertoUSB(int puertoUSB) {
        this.puertoUSB = puertoUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Object clone() {
        Televisor televClone=new Televisor();
        televClone.setOs(this.os);
        televClone.setVersionOS(this.versionOS);
        televClone.setPulgadas(this.pulgadas);
        televClone.setResolucion(this.resolucion);
        televClone.setPuertoHDMI(this.puertoHDMI);
        televClone.setPuertoUSB(this.puertoUSB);
        televClone.setControlRemoto(this.controlRemoto);
        televClone.setSerial(this.serial);
        return televClone;
    }

    public void showTV(){
        System.out.println("********TELEVISOR SMART********");
        System.out.println("Serial: "+serial);
        System.out.println("Sistema operativo: "+os+" versión "+versionOS);
        System.out.println("Resolución: "+resolucion+ ", de "+pulgadas+" pulgadas");
        System.out.println("Puertos externos: "+puertoUSB+" puertos USB. Puertos HDMI: "+puertoHDMI);
        System.out.println("Control remoto: "+controlRemoto);
    }
}
