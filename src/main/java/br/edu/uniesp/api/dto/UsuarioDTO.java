package br.edu.uniesp.api.dto;

import java.time.LocalDate;

import javax.persistence.Entity;

import br.edu.uniesp.api.model.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private String email;

	public UsuarioDTO(String nomeCompleto, LocalDate dataNascimento, String email) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nomeCompleto = usuario.getNomeCompleto();
		this.dataNascimento = usuario.getDataNascimento();
		this.email = usuario.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
