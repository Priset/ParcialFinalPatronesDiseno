package ejercicio2;

public class Launch {
    public static void main(String[] args) {
        ICelular xiaomi = new Xiaomi("Xiaomi",1500,15.2,8,"Calacoto",1,5.6);
        xiaomi = new Cargador(xiaomi,60,"Xiaomi",38);
        xiaomi = new Audifonos(xiaomi,100,"Samsung");
        xiaomi = new Ram(xiaomi,4,"HP",70);

        xiaomi.agregarFuncionalidad();

        System.out.println("*********************************************");

        ICelular android = new Android("Samsung",3000,18.5,16,"Miraflores",2,10.6);
        android = new Cargador(android,200,"Samsung",50);
        android = new Audifonos(android,150,"Samsung");
        android = new Ram(android,4,"Lenovo",300);

        android.agregarFuncionalidad();

        System.out.println("*********************************************");

        ICelular huawei = new Huawei("Huawei",2500,10.2,4,"Sopocachi",2,8.6);
        huawei = new Cargador(huawei,90,"Xiaomi",60);
        huawei = new Audifonos(huawei,50,"Xiaomi");
        huawei = new Ram(huawei,8,"Samsung",150);

        huawei.agregarFuncionalidad();
    }
}
