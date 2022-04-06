package br.edu.uniesp.api.form;

import java.time.LocalDate;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.model.Usuario;

public class UsuarioCadastroForm {

	private String nomeCompleto;
	private LocalDate dataNascimento;
	private String email;
	private String senha;
	private String numero;
	private LocalDate validade;
	private String codigoSeguranca;
	private String nomeTitular;
	private String cpf;
	
	public Usuario criarUsuario() {
		return new Usuario(nomeCompleto, dataNascimento, email, senha, 
				new Cartao (numero, validade, codigoSeguranca, nomeTitular, cpf));
	}

}
