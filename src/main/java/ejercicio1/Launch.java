package ejercicio1;

public class Launch {
    public static void main(String[] args) {
        Zona zona1 = new Zona("Zona Norte", true, 170);
        Zona zona2 = new Zona("Zona Sur", true, 200);
        Zona zona3 = new Zona("Zona Centro", false, 430);
        Zona zona4 = new Zona("Zona Achocalla", false, 120);

        Composite urbanizacion1 = new Composite("La Florida");
        Composite urbanizacion2 = new Composite("San Alberto");

        urbanizacion1.add(zona1);
        urbanizacion1.add(zona2);
        urbanizacion2.add(zona3);
        urbanizacion2.add(zona4);


        Composite departamento1 = new Composite("Santa Cruz");
        Composite departamento2 = new Composite("La Paz");

        departamento1.add(urbanizacion1);
        departamento2.add(urbanizacion2);

        Composite pais = new Composite("Bolivia");

        pais.add(departamento1);
        pais.add(departamento2);

        pais.setUltimo(true);
        pais.calcularHabitantes();
        System.out.println("Total de Habitantes: "+ Helper.getInstance().getNumeroHabitantesGlobal());
    }
}
