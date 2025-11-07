package es.edu.empresas.model;

public class Empresa {
    private int id;
    private String nombre;
    private String direccion;

    // TODO: constructor, getters, setters

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + direccion + ")";
    }
}
