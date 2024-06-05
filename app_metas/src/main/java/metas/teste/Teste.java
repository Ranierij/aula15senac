package metas.teste;

import metas.controle.UsuarioControle;

public class Teste {

	public static void main(String[] args) {
		UsuarioControle u = new UsuarioControle();
		//cpf, nome, senha, email
		u.incluirUsuario("12345678910", "Joao", "12345", "joao@exemplo.com");
		u.incluirUsuario("22345678910", "Maria", "12345", "maria@exemplo.com");
		u.incluirUsuario("32345678910", "Manoel", "12345", "manoel@exemplo.com");

	}

	
	

	}


