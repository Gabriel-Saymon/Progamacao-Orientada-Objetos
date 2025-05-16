public class Gol extends Lance {

    private Time sofredor;

    public Gol(int minuto, Time sofredor)
    {
        super(minuto);
        this.sofredor=sofredor;
    }

    public Time getSofredor()
    {
        return this.sofredor;
    }
    
}
