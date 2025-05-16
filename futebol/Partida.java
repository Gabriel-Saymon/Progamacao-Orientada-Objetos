import java.util.LinkedList;

public class Partida {
    private Time timeA;
    private Time timeB;
    private LinkedList<Lance> lances;

    public Partida(Time timeA, Time timeB)
    {
        this.timeA=timeA;
        this.timeB=timeB;
        this.lances = new LinkedList<>();
    }

    public Time getTimeA()
    {
        return this.timeA;
    }

    public Time getTimeB() {
        return this.timeB;
    }

    public void addLance(Lance l)
    {
        lances.add(l);
    }

    public int getNumeroGolsTimeA()
    {
        int nGolsTimeA=0;
        for(Lance lance : lances)
        {
            if (lance instanceof Gol)
            {
                Gol g=(Gol)lance;
                if (g.getSofredor()!=timeA) nGolsTimeA++;
            }
        }
        return nGolsTimeA;
    }

    public int getNumeroGolsTimeB()
    {
        int nGolsTimeB=0;
        for(Lance lance : lances)
        {
            if (lance instanceof Gol)
            {
                Gol g=(Gol)lance;
                if (g.getSofredor()!=timeB) nGolsTimeB++;
            }
        }
        return nGolsTimeB;
    }
}
