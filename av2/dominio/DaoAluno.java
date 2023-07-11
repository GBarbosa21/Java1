package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoAluno {
	static final String url = "jdbc:postgresql://localhost:5432/escola";
	
	public void inserir(String nome, int turma, int idade, String media) {
        String sql = "INSERT INTO public.aluno(nome, turma, idade, media) VALUES ('" + nome + "', '" + turma + "', '" + idade + "', " + media + ")";
   
        try {
            Connection conexao = DriverManager.getConnection(url, "postgres", "");
            PreparedStatement inclusao = conexao.prepareStatement(sql);
            inclusao.execute();
        }
        catch (SQLException e) {
            System.out.println("Nao foi possivel acessar o BD");
            System.out.println(e);
        }
    }
	 
}
