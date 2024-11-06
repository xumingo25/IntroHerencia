package EjemploHerencia;

public class Profesor extends Persona{
    int aniosExperiencia;
    String tituloAcademico;

    public Profesor(String nombre, double estatura, int edad, boolean tieneSueno, boolean tieneHambre, int aniosExperiencia, String tituloAcademico) {
        super(nombre, estatura, edad, tieneSueno, tieneHambre);
        this.aniosExperiencia = aniosExperiencia;
        this.tituloAcademico = tituloAcademico;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "aniosExperiencia=" + aniosExperiencia +
                ", tituloAcademico='" + tituloAcademico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", tieneHambre=" + tieneHambre +
                ", tieneSueno=" + tieneSueno +
                ", edad=" + edad +
                '}';
    }
}
