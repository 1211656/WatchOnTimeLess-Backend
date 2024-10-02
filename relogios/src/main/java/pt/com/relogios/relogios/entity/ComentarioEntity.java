package pt.com.relogios.relogios.entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import pt.com.relogios.relogios.dtos.ComentarioDTO;


@Entity
@Table(name = "JP_COMENTARIO")
public class ComentarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(nullable=false)
	private String description;
	
	@Column
	private Long relogioId;
	
	@Column
	private Long usuarioId;
	 
	
	
	
	public ComentarioEntity(ComentarioDTO dto) {
		BeanUtils.copyProperties(dto,this);
	}
	
	public ComentarioEntity() {}

	
	

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
		return Objects.hash(description, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComentarioEntity other = (ComentarioEntity) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id);
	}
	
	
	
}
