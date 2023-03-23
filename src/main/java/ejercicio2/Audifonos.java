package ejercicio2;

public class Audifonos extends Funcionalidad{
    private int costo;
    private String marca;

    public Audifonos(ICelular celularBase, int costo, String marca) {
        super(celularBase);
        this.costo = costo;
        this.marca = marca;
    }

    @Override
    public void agregarFuncionalidad(){
        super.agregarFuncionalidad();
        System.out.println("*** Agregando Audifonos al Celular ***");
        setPrecio(getPrecio()+costo);
        System.out.println("Caracteristicas de los audifonos.- ");
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Precio actualizado: "+getPrecio()+" Bs.");
    }
}
