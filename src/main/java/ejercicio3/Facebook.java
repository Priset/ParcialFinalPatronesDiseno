package ejercicio3;

public class Facebook implements IRedSocial{
    @Override
    public void integracion(ISistemaControl sistemaControl) {
        System.out.println("*** Integración con Facebook ***");
        System.out.println("Mostrando datos del sistema de control.- ");
        System.out.println("Nombre: "+sistemaControl.getNombre());
        System.out.println("Capacidad: "+sistemaControl.getCapacidad());
        System.out.println("Estudiantes: ");
        for(Estudiante estudiante : sistemaControl.getEstudiantes()){
            System.out.println(estudiante.getNombre() + ", ");
        }
        System.out.println("Requisitos: "+sistemaControl.getRequisitos());
        System.out.println("**********************************************");
    }
}
