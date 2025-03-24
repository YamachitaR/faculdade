public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bem-vindo ao Sistema Solar ===\n");
        System.out.println("Descrição: " + Planeta.descricao() + "\n");

        // Criando planetas usando o método fábrica
        Planeta terra = Planeta.criarTerra();
        Planeta marte = Planeta.criarMarte();
        Planeta jupiter = Planeta.criarJupiter();

        // Imprimindo informações dos planetas
        System.out.println("--- Informações dos Planetas ---\n");
        terra.imprimir();
        System.out.println();
        marte.imprimir();
        System.out.println();
        jupiter.imprimir();
    }
}
