package examen1_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Armas
{
    private String tipoArma;
    private double porcentajeDaño;

    public Armas()
    {
    }

    public Armas(String tipoArma, double porcentajeDaño)
    {
        this.tipoArma = tipoArma;
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
        return tipoArma;
    }

    @Override
    public String toString()
    {
        return "Tipo de Arma: " + tipoArma + "; Porcentaje de Daño: " + porcentajeDaño;
    }
    
    
}
