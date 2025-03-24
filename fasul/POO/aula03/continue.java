public class Aula3{
    public static void main (String[] args){
        var numeros = new int[] {10,2,23,11,14,17,6,13};
        
        for (var numero : numeros) {
            //Se o número é impar
            if (numero % 2 == 1) {
                continue; //Pule para o próximo número
            }
            System.out.println(numero);
        }
    }
}