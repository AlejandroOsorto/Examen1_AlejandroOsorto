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
    private int tipoCampista;
    private String tipoCampistaS; //Depende de la variable tipoCampista, solo es para mostrar una cadena en el toString
    private boolean estadoVida;
    private String estadoVidaS; //Depende de la variable estadoVida, solo es para mostrar una cadena en el toString

    public Campistas()
    {
        super();
    }

    public Campistas(int tipoCampista, boolean estadoVida, String nombre, int edad, int sexo, Armas arma)
    {
        super(nombre, edad, sexo, arma);
        this.tipoCampista = tipoCampista;
        this.estadoVida = estadoVida;
    }
    
    public void setTipoCampista(int tipoCampista)
    {
        this.tipoCampista = tipoCampista;
        
        if (tipoCampista == 1)
        {
            tipoCampistaS = "Supervisor";
        }
        else if (tipoCampista == 2)
        {
            tipoCampistaS = "Campista";
        }
    }

    public String getTipoCampista()
    {
        return tipoCampistaS;
    }
    
    public void setEstadoVida(boolean estadoVida)
    {
        this.estadoVida = estadoVida;
        if (estadoVida == true)
        {
            estadoVidaS = "Vivito";
        }
        else
        {
            estadoVidaS = "En el otro mundo(Muerto)";
        }
    }

    public String getEstadoVidaS()
    {
        return estadoVidaS;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "Tipo de Campista:" + tipoCampistaS + "; Estado de Vida: " + estadoVidaS;
    }
    
    
}
