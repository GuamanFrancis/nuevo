import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[3];

        System.out.println("Comprobando que si se actualize  \n");
        for ( int i =0 ; i<3 ; i++){
            System.out.println("El sistema solo permite el ingreso de datos de  3 estudiantes  \n");

                System.out.println("Ingrese el nombre del "+ (i +1 ) +" estudiante \n");
               String Nombre = scanner.nextLine();
                System.out.println("Ingrese el apellido del "+ (i +1 ) +" estudiante \n");
                String Apellido = scanner.nextLine();
                System.out.println("Ingrese el nombre de la  materia  \n");
                String Materia = scanner.nextLine();
                System.out.println("Ingrese el nombre de la institucion  \n");
                String Institucion = scanner.nextLine();
                double[] notas = new double[5];
                for ( int j = 0 ; j< 5 ; j++){

                    System.out.println("Ingrese la "+(j+1)+" nota: ");
                    notas[j]= scanner.nextDouble();

                    estudiantes[i] = new Estudiante(Nombre,Apellido, Materia,Institucion,notas);
                }
        }
            for ( Estudiante estudiante : estudiantes){
                estudiante.Imprimirdatos();
                estudiante.Imprimirnotas();
                System.out.println("El promdio del estudiante es "+estudiante.Calcularpromedio());
            }

    }
}