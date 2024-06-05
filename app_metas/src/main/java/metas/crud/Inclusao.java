package metas.crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inclusao extends Conexao {
	private PreparedStatement declaracao;

	public void incluirUsuario(String cpf, String nome, String senha, String email) throws SQLException {
		conectar();
		declaracao = getConexao().prepareStatement("INSERT INTO tb_usuario (cpf, nome, senha, email) VALUES (?,?,?,?)");
		declaracao.setString(1, cpf);
		declaracao.setString(2, nome);
		declaracao.setString(3, senha);
		declaracao.setString(4, email);
		declaracao.executeUpdate();
		fecharConexao();
	}

	public void incluirMeta(int id, String cpf, String tipo, double valor, double acumulado) throws SQLException {
		conectar();
		declaracao = getConexao()
				.prepareStatement("INSERT INTO tb_meta (cpf, tipo, valor, acumulado) VALUES (?,?,?,?)");
		declaracao.setString(1, cpf);
		declaracao.setString(2, tipo);
		declaracao.setDouble(3, valor);
		declaracao.setDouble(4, acumulado);
		declaracao.executeUpdate();
		fecharConexao();
	}

	public void incluirProgresso(int id, int id_meta, double valor) throws SQLException {
		conectar();
		declaracao = getConexao()
				.prepareStatement("INSERT INTO tb_progresso (id_meta, valor) VALUES (?,?)");
		declaracao.setInt(1, id_meta);
		declaracao.setDouble(2, valor);
		fecharConexao();
	}
}
