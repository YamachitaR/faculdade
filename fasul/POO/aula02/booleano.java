public class Aula2{
    public static void main (String[] args){

        boolean v1 = true, v2 = true;
        boolean f1 = false, f2 = false;

        System.out.println("Comparação com E (&&)");
        System.out.println(v1 && v2); //Imprime true, ambos verdadeiros
        System.out.println(v1 && f2); //Imprime false, f2 é falso
        System.out.println(f1 && v2); //Imprime false, f1 é falso
        System.out.println(f1 && f2); //Imprime false, ambos falsos

        System.out.println("Comparação com OU (||)");
        System.out.println(v1 || v2); //Imprime true, ambos verdadeiros
        System.out.println(v1 || f2); //Imprime true, v1 é verdadeiro
        System.out.println(f1 || v2); //Imprime true, v2 é verdadeiro
        System.out.println(f1 || f2); //Imprime false, ambos falsos

        System.out.println("Negação com !");
        System.out.println(!v1); //Imprime false, pois v1 é true
        System.out.println(!f1); //Imprime true, pois f1 é false
    }
}