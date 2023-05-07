package testprofesores;
class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoT;
    private String cedula;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoT() {
        return sueldoT;
    }

    public void CalcularSueldoT() {
        this.sueldoT = sueldoBasico + (sueldoBasico*0.2);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + ", sueldoT=" + sueldoT + ", cedula=" + cedula +  '}';
    }
    
}
public class TestProfesores {

    public static void main(String[] args) {
       Profesores profesor1 = new Profesores("Ana","Vega",700,"1104641327");
       profesor1.CalcularSueldoT();
        System.out.println(profesor1);
    }
    
}
