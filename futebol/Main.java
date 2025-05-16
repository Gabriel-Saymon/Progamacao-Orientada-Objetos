public class Main {
    public static void main(String[] args) {

        Time fla = new Time("Flamengo");
        Time vasco = new Time("Vasco");
        Partida p = new Partida(fla, vasco);

        Gol g = new Gol(10, vasco);
        p.addLance(g);

        Falta f = new Falta(20);
        p.addLance(f);

        System.out.println("O placar é "+
            p.getTimeA().getNome()+" "+p.getNumeroGolsTimeA()+" x "+
            p.getNumeroGolsTimeB()+" "+p.getTimeB().getNome());

        // Java também tem printf
        System.out.printf("O placar é %s %d x %d %s\n",
            p.getTimeA().getNome(),p.getNumeroGolsTimeA(),
            p.getNumeroGolsTimeB(),p.getTimeB().getNome());
        
    }
}
