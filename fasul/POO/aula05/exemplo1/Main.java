public class Main {
    public static void main(String[] args) {
        var aluno1 = new Aluno(1234, "Vinícius");
        var aluno2 = new Aluno(5555, "Thais");
        var aluno3 = new Aluno(4321, "Mariana");

        var turmaA = new Turma("TurmaA");
        turmaA.matricular(aluno1);
        turmaA.matricular(aluno2);

        var turmaB = new Turma("TurmaB");
        turmaB.matricular(aluno3);
        
        System.out.println(turmaA.qtdeAlunos); //Imprime 2
        System.out.println(turmaB.qtdeAlunos); //Imprime 1
    }
}