public class Medicamento{

    String nome;
    String lote;
    int estoque = 0;

    public Medicamento(String nome, String lote){
        this.nome = nome;
        this.lote = lote;
    }

    public Medicamento(String nome, String lote, int estoque){
        this.nome = nome;
        this.lote = lote;
        this.estoque = estoque;
    }


    public void retirar(int quantidadeParaRetirar) {
        if (quantidadeParaRetirar > 0) {
            if (quantidadeParaRetirar <= this.estoque) {
                this.estoque -= quantidadeParaRetirar;
                System.out.println(quantidadeParaRetirar + " unidades retiradas de " + nome + ".");
            } else {
                System.out.println("Estoque insuficiente! Apenas " + this.estoque + " unidades disponíveis.");
            }
        } else {
            System.out.println("A quantidade a retirar deve ser positiva.");
        }
    }


    public boolean acabou() {
        return this.estoque == 0;
    }

  
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Número do lote: " + this.lote);
        System.out.println("Quantidade em estoque: " + this.estoque);
    }

}