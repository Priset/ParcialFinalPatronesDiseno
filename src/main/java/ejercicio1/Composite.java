package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    List<Component> componentList = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public String showInfo() {
        return "Nombre: " +getNombre()+ "\n" +"Número de habitantes: " +getNumeroHabitantes()+ "\n";
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void calcularHabitantes() {
        for (Component component : componentList){
            component.calcularHabitantes();
            this.setNumeroHabitantes(this.getNumeroHabitantes() + component.getNumeroHabitantes());
        }
        Helper.getInstance().add(this.showInfo());
        if(isUltimo()){
            Helper.getInstance().showInfo();
            Helper.getInstance().setNumeroHabitantesGlobal(Helper.getInstance().getNumeroHabitantesGlobal()+this.getNumeroHabitantes());
        }
    }
}
