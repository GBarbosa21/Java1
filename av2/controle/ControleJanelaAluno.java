package controle;

import dominio.DaoAluno;
import view.aluno;

public class ControleJanelaAluno {

	private aluno al = new aluno (null, 0, 0, null);
	private DaoAluno daoAl = new DaoAluno();
	
	public void incluirAluno(String nome, int turma, int idade, String media) {
        al.setNome(nome);
        al.setTurma(turma);
        al.setIdade(idade);
        al.setMedia(media);
       
        daoAl.inserir (nome, turma, idade, media);
    }
	
}
