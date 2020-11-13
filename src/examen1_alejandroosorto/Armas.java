package examen1_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Armas
{
    private String tipoArmaS; //Para mostrar en toString
    private double porcentajeDaño;

    public Armas()
    {
    }

    public Armas(String tipoArmaS, double porcentajeDaño)
    {
        this.tipoArmaS = tipoArmaS;
        this.porcentajeDaño = porcentajeDaño;
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
