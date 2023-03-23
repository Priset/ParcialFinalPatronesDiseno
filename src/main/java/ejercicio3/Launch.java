package ejercicio3;

public class Launch {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Jhon", "467S98DF");
        Estudiante est2 = new Estudiante("Raul", "SD6F549");
        Estudiante est3 = new Estudiante("Alberto", "54987SDF");
        Estudiante est4 = new Estudiante("Jose", "44D8F7SD8F");
        Estudiante est5 = new Estudiante("Roman", "5498SDF");
        Estudiante est6 = new Estudiante("Valentina", "789F7SD");
        Estudiante est7 = new Estudiante("Arturo", "1321F8DS");
        Estudiante est8 = new Estudiante("Renan", "789FDSF");
        Estudiante est9 = new Estudiante("Renata", "1D5AS9D8");

        SistemaEscuela sistemaEscuela = new SistemaEscuela("Los Pinos", 300,
                new Estudiante[]{est1,est2,est3}, "Tener 51 de promedio como minimo para pasar de año.");

        SistemaColegio sistemaColegio = new SistemaColegio("Cervantes", 200,
                new Estudiante[]{est4,est5,est6}, "Tener 70 de promedio como minimo para acceder a beneficios.");

        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad("UPB", 1000,
                new Estudiante[]{est7,est8,est9}, "Tener 95 de promedio como minimo para entrar al cuadro de honor.");

        sistemaEscuela.setRedSocial(new Twitter());
        sistemaColegio.setRedSocial(new Facebook());
        sistemaUniversidad.setRedSocial(new WhatsApp());

        sistemaEscuela.integrarRedSocial();
        sistemaColegio.integrarRedSocial();
        sistemaUniversidad.integrarRedSocial();
    }
}
