
public class Triangulo {
    private Ponto a, b, c;

    public Triangulo(Ponto a, Ponto b, Ponto c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetro() {
        return a.distancia(b) + b.distancia(c) + c.distancia(a);
    }
}
