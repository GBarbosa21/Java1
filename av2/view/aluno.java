package view;

public class aluno {
    private int idade, turma;
    private String nome, media;
   
    public aluno(String nome, int turma, int idade, String media) {
        this.nome = nome;
        this.turma = turma;
        this.idade = idade;
        this.media = media;
    }

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

    
    
}
