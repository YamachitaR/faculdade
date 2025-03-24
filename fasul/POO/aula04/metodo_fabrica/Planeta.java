public class Planeta {

    static final double PI = 3.1415;

    String nome;
    int diametro;
    double massa;

    public static String descricao() {
        return "Um corpo celeste esférico que orbita uma estrela";
    }

    // Construtor padrão e parametrizado
    private Planeta(String nome, int diametro, double massa) {
        this.nome = nome;
        this.diametro = diametro;
        this.massa = massa;
    }

    // 🔥 Método fábrica para criar planetas conhecidos
    public static Planeta criarTerra() {
        return new Planeta("Terra", 12742, 5.972E24);
    }

    public static Planeta criarMarte() {
        return new Planeta("Marte", 6779, 6.417E23);
    }

    public static Planeta criarJupiter() {
        return new Planeta("Júpiter", 139820, 1.898E27);
    }

    double raio() {
        return diametro / 2.0;
    }

    double areaSuperficie() {
        var raioAoQuadrado = raio() * raio();
        return 4 * PI * raioAoQuadrado;
    }

    void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Massa: " + massa);
        System.out.println("Raio: " + raio());
        System.out.println("Área da superfície: " + areaSuperficie());
    }
}
