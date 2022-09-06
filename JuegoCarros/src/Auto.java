public class Auto {
    private String sPlaca;
    private double dVelocidadMax=180;
    private boolean bEncendidoMotor=false;
    private boolean bMovimiento=false;
    private boolean bLuces=false;
    private double bDistanciaDeFrenado=10;
    private double dVelocidadActual=0;
    private double dAceleracion=15;

    public Auto(){

    }
    public void encenderMotor(){
        System.out.println("Motor encendido");
        bEncendidoMotor=true;
    }
    public void apagarMotor(){
        System.out.println("Motor apagado");
        bEncendidoMotor=false;
    }
    public void avanzar(){
        if(bEncendidoMotor){
            if(dVelocidadActual<=dVelocidadMax) {
                dVelocidadActual = dVelocidadActual + dAceleracion;
            }
            else {
                dVelocidadActual=180;
            }
        }
        System.out.println("Avance - Velocidad = "+dVelocidadActual);
    }
    public void frenar(){
        System.out.println("Frenando....");
        if(bEncendidoMotor){
            if(dVelocidadActual>=bDistanciaDeFrenado) {
                dVelocidadActual = dVelocidadActual - dAceleracion;
            }else {
                dVelocidadActual=0;
            }
        }
        System.out.println("Avance - Velocidad = "+dVelocidadActual);
    }
    public void frenarHastaDetener(){
        while(dVelocidadActual>0){
            frenar();
        }
    }
    public void acelerarAlMax(){
        //como acelerar al maximo
        while(dVelocidadActual<1800){
            acelerarAlMax();
        }
    }

    public String getsPlaca() {
        return sPlaca;
    }

    public void setsPlaca(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public double getdVelocidadMax() {
        return dVelocidadMax;
    }

    public void setdVelocidadMax(double dVelocidadMax) {
        this.dVelocidadMax = dVelocidadMax;
    }

    public boolean isbEncendidoMotor() {
        return bEncendidoMotor;
    }

    public void setbEncendidoMotor(boolean bEncendidoMotor) {
        this.bEncendidoMotor = bEncendidoMotor;
    }

    public boolean isbMovimiento() {
        return bMovimiento;
    }

    public void setbMovimiento(boolean bMovimiento) {
        this.bMovimiento = bMovimiento;
    }

    public boolean isbLuces() {
        return bLuces;
    }

    public void setbLuces(boolean bLuces) {
        this.bLuces = bLuces;
    }

    public double getbDistanciaDeFrenado() {
        return bDistanciaDeFrenado;
    }

    public void setbDistanciaDeFrenado(double bDistanciaDeFrenado) {
        this.bDistanciaDeFrenado = bDistanciaDeFrenado;
    }

    public double getdVelocidadActual() {
        return dVelocidadActual;
    }

    public void setdVelocidadActual(double dVelocidadActual) {
        this.dVelocidadActual = dVelocidadActual;
    }

    public double getdAceleracion() {
        return dAceleracion;
    }

    public void setdAceleracion(double dAceleracion) {
        this.dAceleracion = dAceleracion;
    }
}
