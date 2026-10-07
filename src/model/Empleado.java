package com.nomina.modelo;

public class Empleado {
    public int id;
    public String nombre;
    public double sueldoBase;
    public double horasTrabajadas;
    public double horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, double sueldoBase, double horasTrabajadas, double horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }
    public double getHorasTrabajadas() { return horasTrabajadas; }
    public double getHorasExtras() { return horasExtras; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }
    public void setHorasTrabajadas(double horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }
    public void setHorasExtras(double horasExtras) { this.horasExtras = horasExtras; }

    public String aTexto() {
        return id + "|" + nombre + "|" + sueldoBase + "|" + horasTrabajadas + "|" + horasExtras;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase 
                + ", horasTrabajadas=" + horasTrabajadas + ", horasExtras=" + horasExtras + "]";
    }
}