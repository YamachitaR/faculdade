public class Aula3{
    public static void main (String[] args){

        
        var exemplo = 1; // alter para 1, 2, 3 e 4, 

        switch (exemplo) {
            case 1:
                    System.out.println("Primeira condição");
                break;
            case 2:
                    System.out.println("Segunda condição");
                    // repare que não temos break veja o interessante quando colocamos 2
            case 3:
                    System.out.println("Terceira condição");
                break;
            default:
                System.out.println("Outra condição");
            break;
        }
    }
}