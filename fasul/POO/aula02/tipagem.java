public class Aula2{
    public static void main (String[] args){

        int x = 10; // explicita pois estamos explicitando o tipo de variável 
 
        var nome = "Ricardo";  // implicita, pois sabemos o tipo de variável por causa do atributo

        System.out.printf("O valor de x é: %d%n", x);
        System.out.printf("O valor de x é: %s%n", nome);
    }
}