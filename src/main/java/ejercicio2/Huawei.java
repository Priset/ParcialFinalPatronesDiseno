package ejercicio2;

public class Huawei implements ICelular{
    private String modelo;
    private int precio;
    private double androidVersion;
    private int memoriaRam;
    private String store;
    private int numeroChips;
    private double buildVersion;

    public Huawei(String modelo, int precio, double androidVersion, int memoriaRam, String store, int numeroChips, double buildVersion) {
        this.modelo = modelo;
        this.precio = precio;
        this.androidVersion = androidVersion;
        this.memoriaRam = memoriaRam;
        this.store = store;
        this.numeroChips = numeroChips;
        this.buildVersion = buildVersion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(double androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public int getMemoriaRam() {
        return memoriaRam;
    }

    @Override
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void agregarFuncionalidad() {
        System.out.println("*** Inicializando agregación de funcionalidades ***");
        System.out.println("Caracteristicas actuales.- ");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Versión de android: "+getAndroidVersion());
        System.out.println("Memoria RAM: "+getMemoriaRam());
        System.out.println("Store: "+getStore());
        System.out.println("Número de chips: "+getNumeroChips());
        System.out.println("Build Version: "+getBuildVersion());
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getNumeroChips() {
        return numeroChips;
    }

    public void setNumeroChips(int numeroChips) {
        this.numeroChips = numeroChips;
    }

    public double getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(double buildVersion) {
        this.buildVersion = buildVersion;
    }
}
