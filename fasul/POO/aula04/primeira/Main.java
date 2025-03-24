public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bem-vindo ao Sistema Solar ===\n");
        System.out.println("Descrição: " + Planeta.descricao() + "\n");

        // Criando alguns planetas
        Planeta terra = new Planeta("Terra", 12742, 5.972E24);
        Planeta marte = new Planeta("Marte", 6779, 6.417E23);
        Planeta jupiter = new Planeta("Júpiter", 139820, 1.898E27);

        // Imprimindo informações dos planetas
        System.out.println("--- Informações dos Planetas ---\n");
        terra.imprimir();
        System.out.println();
        marte.imprimir();
        System.out.println();
        jupiter.imprimir();
    }
}
