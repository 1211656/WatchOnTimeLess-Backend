	package pt.com.relogios.relogios.dtos;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import pt.com.relogios.relogios.entity.ComentarioEntity;
import pt.com.relogios.relogios.entity.RelogioEntity;


public class ComentarioDTO {
	
	
	private Long id;
	private String description;
	private Long relogioId;
	private Long usuarioId;
	
	
	public ComentarioDTO(ComentarioEntity entidade) {
		BeanUtils.copyProperties(entidade, this);
	}
	
	public ComentarioDTO() {}
	
	

	public Long getRelogioId() {
		return relogioId;
	}

	public void setRelogioId(Long relogioId) {
		this.relogioId = relogioId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, relogioId, usuarioId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComentarioDTO other = (ComentarioDTO) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(relogioId, other.relogioId) && Objects.equals(usuarioId, other.usuarioId);
	}
	
	
	
}
