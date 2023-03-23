package ejercicio1;

public abstract class Component {
    private String nombre;
    private int numeroHabitantes;
    private boolean ultimo;

    public Component(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }

    public abstract String showInfo();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void calcularHabitantes();
}
