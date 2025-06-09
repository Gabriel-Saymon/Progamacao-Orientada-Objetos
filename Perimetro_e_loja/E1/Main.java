
public class Main {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Uso: java Main x1 y1 x2 y2 x3 y3");
            return;
        }

        try {
            Ponto p1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
            Ponto p2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
            Ponto p3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

            Triangulo t = new Triangulo(p1, p2, p3);
            System.out.printf("Perímetro do triângulo: %.2f%n", t.perimetro());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter argumentos para números.");
        }
    }
}
