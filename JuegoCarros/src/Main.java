public class Main {
    public static void main(String[] args) {

        Toyota toyo = new Toyota();
        toyo.encenderMotor();
        toyo.avanzar();
        System.out.println("Velocidad maxima Toyota 1- "+toyo.getdVelocidadMax());

        Toyota toyo2 = new Toyota();
        toyo2.encenderMotor();
        toyo2.avanzar();
        toyo2.setdVelocidadMax(300);
        System.out.println("Velocidad maxima Toyota 2- "+toyo2.getdVelocidadMax());

        Nisan nis = new Nisan();
        nis.encenderMotor();
        nis.avanzar();

        System.out.println("Velocidad maxima  Nissan 1- "+nis.getdVelocidadMax());

        /*Auto auto1=new Auto();
        auto1.encenderMotor();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.frenar();
        auto1.frenar();
        auto1.frenar();
        auto1.frenar();
        auto1.frenar();
        */

    }
}