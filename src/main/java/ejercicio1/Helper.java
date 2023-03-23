package ejercicio1;

import java.util.Stack;

public class Helper {
    private Stack<String> imprimir = new Stack<>();
    private int numeroHabitantesGlobal = 0;

    private static Helper instance;

    private Helper() {}

    public static Helper getInstance() {
        if (instance == null){
            instance = new Helper();
        }
        return instance;
    }

    public void add(String info) {
        imprimir.push(info);
    }
    public void showInfo(){
        while (!imprimir.isEmpty()){
            System.out.println(imprimir.pop());
        }
    }

    public int getNumeroHabitantesGlobal(){
        return numeroHabitantesGlobal;
    }

    public void setNumeroHabitantesGlobal(int numeroHabitantesGlobal){
        this.numeroHabitantesGlobal = numeroHabitantesGlobal;
    }
}
