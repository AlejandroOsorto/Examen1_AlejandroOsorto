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
    private int sexo;
    private String sexoS; //Dependerá de la variable entera sexo, solo es para mostrar una cadena en el toString
    private Armas arma;

    public Personas()
    {
    }

    public Personas(String nombre, int edad, int sexo, Armas arma)
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

    public void setSexo(int sexo)
    {
        this.sexo = sexo;
        if (sexo == 1)
        {
            sexoS = "Masculino";
        }
        else if (sexo == 2)
        {
            sexoS = "Femenino";
        }
    }

    public String getSexo()
    {
        return sexoS;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "; Edad: " + edad + "; Sexo: " + sexoS + "; Arma: " + arma;
    }
    
    
}
