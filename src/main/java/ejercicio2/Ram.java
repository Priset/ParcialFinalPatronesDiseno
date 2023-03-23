package ejercicio2;

public class Ram extends Funcionalidad{
    private int capacidad;
    private String marca;
    private int costo;

    public Ram(ICelular celularBase, int capacidad, String marca, int costo) {
        super(celularBase);
        this.capacidad = capacidad;
        this.marca = marca;
        this.costo = costo;
    }

    @Override
    public void agregarFuncionalidad(){
        super.agregarFuncionalidad();
        System.out.println("*** Agregando Cargador al Celular ***");
        setPrecio(getPrecio()+costo);
        setMemoriaRam(getMemoriaRam()+capacidad);
        System.out.println("Caracteristicas del cargador.- ");
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Precio actualizado: "+getPrecio()+" Bs.");
        System.out.println("RAM actualizada: "+getMemoriaRam());
    }
}
