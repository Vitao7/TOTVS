package notasalunos;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {
        int quantidadeAlunos =3;
        Aluno[] alunos = new Aluno[quantidadeAlunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < quantidadeAlunos; i++){
            Aluno aluno = new Aluno();
            aluno.nome = leitor.lerString("Digite o nome do aluno: ");
            aluno.notas[0] = leitor.lerDecimal("Digite a nota 1 do aluno: ");
            aluno.notas[1] = leitor.lerDecimal("Digite a nota 2 do aluno: ");
            aluno.notas[2] = leitor.lerDecimal("Digite a nota 3 do aluno: ");
            alunos[i] = aluno; //Quando o laço rodar, o que está no laço será preenchido aqui
        }

        for(Aluno aluno : alunos){
            System.out.printf("O aluno %s teve a média %.2f \n", aluno.nome, aluno.calcularMedia());
        }
    }
}
