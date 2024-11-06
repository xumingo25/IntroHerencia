package EjemploHerencia;

public class App {
    public static void main(String[] args) {

        Tutor tutor = new Tutor ("Pedro",1.80,35,false,false,"Padre");
        double[] notas = {3,4,5,6,7};
        Alumno alumno = new Alumno("Juan",1.30,10,true,false,"4to basico","Escuela primaria nose que mas :D",notas,tutor);

        Profesor profesor = new Profesor("Peter",1.78,40,true,true,10,"PH D. Ciencia");

        System.out.println(tutor.toString());
        System.out.println(profesor.toString());
        System.out.println(alumno.toString());

    }
}
