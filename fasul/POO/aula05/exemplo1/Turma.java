public class Turma {
    String nome;
    Aluno alunos[] = new Aluno[20];
    int qtdeAlunos = 0;

    Turma(String nome) {
        this.nome = nome;
    }
    
    boolean matricular(Aluno aluno) {
        //Testamos se a turma está cheia
        if (qtdeAlunos == alunos.length) {
            return false;
        }
        
        alunos[qtdeAlunos] = aluno; //Associa o aluno a turma
        qtdeAlunos = qtdeAlunos + 1; //Adiciona um aluno
        return true;
    }
}

