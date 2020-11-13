/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Personas
{
    private String nombre;
    private int edad;
    private String sexo;
    private Armas arma;

    public Personas()
    {
    }

    public Personas(String nombre, int edad, String sexo, Armas arma)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public Armas getArma()
    {
        return arma;
    }

    public void setArma(Armas arma)
    {
        this.arma = arma;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public String getSexo()
    {
        return sexo;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "; Edad: " + edad + "; Sexo: " + sexo + "; Arma: " + arma;
    }
    
    
}
