
package estudiante;

class EntidadEstudiantes{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    
    public EntidadEstudiantes() {}

    public EntidadEstudiantes(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
        
    public double getPromedio(){
        return promedio;
    }
    
    public void CalcularPromedio(){
        this.promedio = (nota1 + nota2 + nota3)/3;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", promedio=" + promedio + '}';
    }
public class Estudiante {
    public static void main(String[] args) {
       Estudiante estudiante1 = new Estudiante("Isaac",6,10,10,universidad1);
        estudiante1.CalcularPromedio();
        System.out.println(estudiante1);
    }
    
}
