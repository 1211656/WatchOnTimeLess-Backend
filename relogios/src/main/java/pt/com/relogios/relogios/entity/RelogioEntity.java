package pt.com.relogios.relogios.entity;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.BeanUtils;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import pt.com.relogios.relogios.dtos.RelogioDTO;

@Entity
@Table(name = "JP_RELOGIO")
public class RelogioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String modelo;
	
	@Column(nullable=false)
	private String marca;
	
	@Column(nullable=false)
	private List<String> descricaoPrincipal;
	
	@Column(nullable=false)
	private long preco;
	
	@Column(nullable=false)
	private List<String> album;
	
	@Column(nullable=false)
	private String genero;
	
	@Column(nullable=false)
	private Long stock;
	
	
	
	
	
	public RelogioEntity(RelogioDTO dto) {
		BeanUtils.copyProperties(dto,this);
	}
	
	public RelogioEntity() {}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<String> getDescricaoPrincipal() {
		return descricaoPrincipal;
	}

	public void setDescricaoPrincipal(List<String> descricaoPrincipal) {
		this.descricaoPrincipal = descricaoPrincipal;
	}

	public long getPreco() {
		return preco;
	}

	public void setPreco(long preco) {
		this.preco = preco;
	}

	public List<String> getAlbum() {
		return album;
	}

	public void setAlbum(List<String> album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(album, descricaoPrincipal, genero, id, marca, modelo, preco, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RelogioEntity other = (RelogioEntity) obj;
		return Objects.equals(album, other.album) 
				&& Objects.equals(descricaoPrincipal, other.descricaoPrincipal) && Objects.equals(genero, other.genero)
				&& Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && preco == other.preco && Objects.equals(stock, other.stock);
	}

	
	
	
	
	
	
	
	
	
	

}
