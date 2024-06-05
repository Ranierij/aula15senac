package metas.controle;

import java.sql.SQLException;

import metas.crud.Inclusao;

public class UsuarioControle {
	
	Inclusao in = new Inclusao();
	
	public void incluirUsuario(String cpf, String nome, String senha, String email) {
		try {
			in.incluirUsuario(cpf, nome, senha, email);
			
		} catch (SQLException erro) {
			System.out.println(erro);
		}
	}
}
