package pt.com.relogios.relogios.dtos;

import java.util.List;

import org.springframework.beans.BeanUtils;

import pt.com.relogios.relogios.entity.UsuarioEntity;

public class UsuarioDTO {

	private Long id;
	
	private String nome;
	
	private String login;
	
	private String password;
	
	private String email;
	
	
	public UsuarioDTO(UsuarioEntity entidade) {
		BeanUtils.copyProperties(entidade, this);
	}
	
	public UsuarioDTO() {}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
