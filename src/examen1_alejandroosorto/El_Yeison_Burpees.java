package examen1_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class El_Yeison_Burpees extends Personas
{
    private int cantPersonas;

    public El_Yeison_Burpees()
    {
        super();
    }

    public El_Yeison_Burpees(int cantPersonas, String nombre, int edad, String sexo, Armas arma)
    {
        super(nombre, edad, sexo, arma);
        this.cantPersonas = cantPersonas;
    }

    public int getCantPersonas()
    {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas)
    {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString()
    {
        return "Cantidad de Personas matadas: " + cantPersonas;
    }
    
    
}
