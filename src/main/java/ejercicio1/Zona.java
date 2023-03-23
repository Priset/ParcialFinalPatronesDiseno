package ejercicio1;

public class Zona extends Component{
    private boolean poa;

    public Zona(String nombre, boolean poa, int habitantes) {
        super(nombre);
        setNumeroHabitantes(habitantes);
        this.poa = poa;
    }

    public boolean isPoa() {
        return poa;
    }

    public void setPoa(boolean poa) {
        this.poa = poa;
    }

    @Override
    public String showInfo() {
        return "\tNombre: "+ getNombre() + "\n"+ "\tNúmero de habitantes: " + getNumeroHabitantes() + "\n" + "\tRealización de POA: " + isPoa()+ "\n";
    }

    @Override
    public void add(Component component) {}

    @Override
    public void remove(Component component) {}

    @Override
    public void calcularHabitantes() {
        Helper.getInstance().add(this.showInfo());
    }
}
