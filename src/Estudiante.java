public class Estudiante {
    public String Nombre;
    public String Apellido;
    public String Materia;
    public String Institucion;
    public  double notas[];


    public Estudiante(String Nombre, String Apellido, String Materia, String Institucion, double notas[]){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Materia = Materia;
        this.Institucion = Institucion;
        this.notas = notas;


    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String institucion) {
        Institucion = institucion;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public  double Calcularpromedio(){
        double suma= 0;
        for ( double promedio : notas){
            suma    += promedio;
        }
        return suma/notas.length;

    }


    public void Imprimirnotas(){
        System.out.println("  Las notas del estudiante "+ Nombre+ " son las siguientes: \n");
        for (double nota : notas){
            System.out.println(" Las notas son: "+nota+ ", ");
        }
    }


    public  void Imprimirdatos(){
        System.out.println("------------------------------------------------ \n");
        System.out.println("     Datos personales del estudiante             \n");
        System.out.println("------------------------------------------------ \n");
        System.out.println("Nombre: "+Nombre+"\n");
        System.out.println("Apellido: "+Apellido+"\n");
        System.out.println("Materia: "+Materia+"\n");
        System.out.println("Institucion: "+Institucion+"\n");
        System.out.println("Notas: "+notas+"\n");

    }



}