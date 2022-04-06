package br.edu.uniesp.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniesp.api.dto.UsuarioDTO;
import br.edu.uniesp.api.form.UsuarioCadastroForm;
import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.CartaoRepository;
import br.edu.uniesp.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private CartaoRepository cartaoRepository;
	
	public UsuarioDTO salvar(UsuarioCadastroForm form) {
		
		Usuario usuario = form.criarUsuario();
		cartaoRepository.save(usuario.getCartao());
		usuarioRepository.save(usuario);
		

		return new UsuarioDTO(usuario);
	}
	

}
