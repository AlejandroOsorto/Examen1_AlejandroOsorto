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
public class Campistas extends Personas
{
    private String tipoCampista;
    private String estadoVida;

    public Campistas()
    {
        super();
    }

    public Campistas(String tipoCampista, String estadoVida, String nombre, int edad, String sexo, Armas arma)
    {
        super(nombre, edad, sexo, arma);
        this.tipoCampista = tipoCampista;
        this.estadoVida = estadoVida;
    }
    
    public void setTipoCampista(String tipoCampista)
    {
        this.tipoCampista = tipoCampista;
    }

    public String getTipoCampista()
    {
        return tipoCampista;
    }
    
    public void setEstadoVida(String estadoVida)
    {
        this.estadoVida = estadoVida;
    }

    public String getEstadoVidaS()
    {
        return estadoVida;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "Tipo de Campista:" + tipoCampista + "; Estado de Vida: " + estadoVida;
    }
    
    
}
