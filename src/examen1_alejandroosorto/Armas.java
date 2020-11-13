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
public class Armas
{
    private int tipoArma;
    private String tipoArmaS; //Para mostrar en toString
    private double porcentajeDaño;

    public Armas()
    {
    }

    public Armas(int tipoArma, double porcentajeDaño)
    {
        this.tipoArma = tipoArma;
        this.porcentajeDaño = porcentajeDaño;
    }
    
    public void setTipoArma(int tipoArma)
    {
        this.tipoArma = tipoArma;
        switch (tipoArma)
        {
            case 1:
            {
                tipoArmaS = "Hacha";
            } break;
            case 2:
            {
                tipoArmaS = "Pistola";
            } break;
            case 3:
            {
                tipoArmaS = "Bate";
            } break;
            case 4:
            {
                tipoArmaS = "Pala";
            } break;
            case 5:
            {
                tipoArmaS = "Sierra Electrica";
            } break;
            case 6:
            {
                tipoArmaS = "A Puños";
            } break;
            
        }
        
    }

    public double getPorcentajeDaño()
    {
        return porcentajeDaño;
    }

    public void setPorcentajeDaño(double porcentajeDaño)
    {
        this.porcentajeDaño = porcentajeDaño;
    }

    public String getTipoArma()
    {
        return tipoArmaS;
    }

    @Override
    public String toString()
    {
        return "Tipo de Arma: " + tipoArmaS + "; Porcentaje de Daño: " + porcentajeDaño;
    }
    
    
}
