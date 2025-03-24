public class Aula3{
    public static void main (String[] args){
        var idade = 10;
        
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }


        if (idade < 14) {
            System.out.println("Criança");
        } else if (idade < 18){
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}