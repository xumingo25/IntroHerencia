package EjemploHerencia;

public class Tutor extends Persona{
    private String parentesco; //

    public Tutor(String nombre, double estatura, int edad, boolean tieneSueno, boolean tieneHambre, String parentesco) {
        super(nombre, estatura, edad, tieneSueno, tieneHambre);
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "parentesco='" + parentesco + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", edad=" + edad +
                ", tieneSueno=" + tieneSueno +
                ", tieneHambre=" + tieneHambre +
                '}';
    }
}
