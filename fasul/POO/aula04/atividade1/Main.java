public class Main {
    public static void main(String[] args) {
        Medicamento paracetamol = new Medicamento("Paracetamol", "Lote123", 50);

        System.out.println("=== Controle de Medicamentos ===");
        paracetamol.imprimir();

        // Retirando unidades do estoque
        paracetamol.retirar(10);
        paracetamol.imprimir();

        paracetamol.retirar(50); // Tentativa de retirar mais do que o disponível

        // Verificando se o medicamento acabou
        System.out.println("O medicamento acabou? " + paracetamol.acabou());

        // Retirando todo o estoque
        paracetamol.retirar(40);
        System.out.println("O medicamento acabou? " + paracetamol.acabou());
    }
}
