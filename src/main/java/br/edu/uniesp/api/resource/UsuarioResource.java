package br.edu.uniesp.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.uniesp.api.dto.UsuarioDTO;
import br.edu.uniesp.api.form.UsuarioCadastroForm;
import br.edu.uniesp.api.service.UsuarioService;

@RestController
@RequestMapping("/rest/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @PostMapping(value = "/cadastrar", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<UsuarioDTO> cadastrar(@RequestBody UsuarioCadastroForm form){
        UsuarioDTO usuario = service.salvar(form);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
}
