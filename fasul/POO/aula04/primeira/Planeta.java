public class Planeta {

    // por atributo esta como static, isso significa que todos objetos
    // "compartilha" o mesmo atributo 
    static final double PI = 3.1415;

    String nome;
    int diametro;
    double massa;

    // por metodo ser static não precisamos instaciar o objeto para chamar ele
    static String descricao() {
        return "Um corpo celeste esférico que orbita uma estrela";
    }

    //Construtores 
    Planeta(String nome, int diametro, double massa) {
        this.nome = nome;
        this.diametro = diametro;
        this.massa = massa;
    }

    Planeta() {
        this("", 0, 0.0);
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
        System.out.println("Area da superfície:" + areaSuperficie());
    }
}