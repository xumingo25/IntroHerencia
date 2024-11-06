package EjemploHerencia;

import java.util.Arrays;

public class Alumno extends Persona{
    String curso;
    String escuela;
    double[] notas;
    Tutor tutor;

    public Alumno(String nombre, double estatura, int edad, boolean tieneSueno, boolean tieneHambre, String curso, String escuela, double[] notas, Tutor tutor) {
        super(nombre, estatura, edad, tieneSueno, tieneHambre);
        this.curso = curso;
        this.escuela = escuela;
        this.notas = notas;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", escuela='" + escuela + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", tutor=" + tutor +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", edad=" + edad +
                ", tieneSueno=" + tieneSueno +
                ", tieneHambre=" + tieneHambre +
                '}';
    }
}
