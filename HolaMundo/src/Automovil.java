public class Automovil {

    private String motor;
    private String marca;
    private String color;

    public Automovil(String motor, String marca, String color) {
        this.motor = motor;
        this.marca = marca;
        this.color = color;
    }

    public String acelerar() {
        return "Acelerando  "+this.marca;
    }

    public String frenar() {
        return "Frenando  " + this.motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
