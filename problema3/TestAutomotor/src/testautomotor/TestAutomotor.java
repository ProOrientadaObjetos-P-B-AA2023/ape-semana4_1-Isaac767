package testautomotor;

class Automotor{
    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
   
    public Automotor() {
    }

    public Automotor(String cedula, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public double getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = 2023-this.anioFabricacion;
        this.valorMatricula = this.valorMatricula*0.0002;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedula=" + cedula + ", marcaVehiculo=" + marcaVehiculo + ", anioFabricacion=" + anioFabricacion + ", valorVehiculo=" + valorVehiculo + ", valorMatricula=" + valorMatricula + '}';
    }
    
}

public class TestAutomotor {
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("1104641657","Hyundai",2007,22500);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);
    }
    
}