package org.example;

public class Animal {
    public String nombre;
    public String genero;
    public double peso;
    public Animal pareja;

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void encontrarPareja(Animal pareja) {
        this.pareja = pareja;
    }

    public Animal(){
    }
}
