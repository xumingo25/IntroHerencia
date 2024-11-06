package EjemploHerencia;

public class Persona {
    protected String nombre;
    protected double estatura;
    protected int edad;
    protected boolean tieneSueno;
    protected boolean tieneHambre;

    public Persona(String nombre, double estatura, int edad, boolean tieneSueno, boolean tieneHambre) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.tieneSueno = tieneSueno;
        this.tieneHambre = tieneHambre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneSueno() {
        return tieneSueno;
    }

    public void setTieneSueno(boolean tieneSueno) {
        this.tieneSueno = tieneSueno;
    }

    public boolean isTieneHambre() {
        return tieneHambre;
    }

    public void setTieneHambre(boolean tieneHambre) {
        this.tieneHambre = tieneHambre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", edad=" + edad +
                ", tieneSueno=" + tieneSueno +
                ", tieneHambre=" + tieneHambre +
                '}';
    }
}
