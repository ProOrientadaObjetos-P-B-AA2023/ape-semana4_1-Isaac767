package testcheque;
class Cheque{
    private String nombre;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque() {
    }

    public Cheque(String nombre, String nombreBanco, double valorCheque) {
        this.nombre = nombre;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void CalcularComision() {
        this.comision = this.valorCheque*0.00003;
    }

    @Override
    public String toString() {
        return "Cheque{" + "nombre=" + nombre + ", nombreBanco=" + nombreBanco + ", valorCheque=" + valorCheque + ", comision=" + comision + '}';
    }
    
}  
public class TestCheque {
    public static void main(String[] args) {
       Cheque cheque1 = new Cheque("Steven Isaac","Banco de Loja",1500);
       cheque1.CalcularComision();
        System.out.println(cheque1);
    }
    
}
