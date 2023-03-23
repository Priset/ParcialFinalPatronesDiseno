package ejercicio2;

public abstract class Funcionalidad implements ICelular{
    private ICelular celularBase;

    public Funcionalidad(ICelular celularBase) {
        this.celularBase = celularBase;
    }

    @Override
    public int getPrecio() {
        return celularBase.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        celularBase.setPrecio(precio);
    }

    @Override
    public int getMemoriaRam() {
        return celularBase.getMemoriaRam();
    }

    @Override
    public void setMemoriaRam(int memoriaRam) {
        celularBase.setMemoriaRam(memoriaRam);
    }

    @Override
    public void agregarFuncionalidad() {
        celularBase.agregarFuncionalidad();
    }
}
