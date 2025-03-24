public class Aula3{
    public static void main (String[] args){

        var matrizQuadrada = new int[][] {
            {1,2,3,4,5},
            {10,20,30,0,40},
            {100, 200, 300, 400, 500}
        };

        // repare que o break esta parado o primeiro bloco
        // isso ocorre pois estamos referido externo
        externo:
        for (int i = 0; i < matrizQuadrada.length; i++) {
            System.out.println();
            for (var numero : matrizQuadrada[i]) {
                System.out.print(numero + " ");
                if (numero == 0) {
                    break externo;
                }
            }
        }
    }
}