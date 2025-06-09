
public class Ponto {
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto outro) {
        double dx = this.x - outro.x;
        double dy = this.y - outro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
