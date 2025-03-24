public class Aula1 {
    static class StaticAtributo { // Torna a classe interna estática
        static int ano = 10; // Atributo estático
    }

    public static void main(String[] args) {
        StaticAtributo a = new StaticAtributo(); // Declaração e inicialização de 'a'
        StaticAtributo b = new StaticAtributo(); // Declaração e inicialização de 'b'

        System.out.println("A: " + a.ano); // Acessa diretamente o atributo estático
        a.ano = 20; // Atualiza o valor de 'ano' por meio de 'a' (reflete para todas as instâncias)
        System.out.println("B: " + b.ano); // Verifica o valor atualizado
    }
}