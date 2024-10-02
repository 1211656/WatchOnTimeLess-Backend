package pt.com.relogios.relogios.dtos;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.BeanUtils;
import pt.com.relogios.relogios.entity.RelogioEntity;




public class RelogioDTO {
	
	private Long id;
	
	private String modelo;
	
	private String marca;
	
	private List<String> descricaoPrincipal;
	
	private long preco;
	
	private List<String> album;

	private String genero;

	private Long stock;

	
	public RelogioDTO(RelogioEntity entidade) {
		BeanUtils.copyProperties(entidade, this);
	}
	
	public RelogioDTO() {}
	
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
		RelogioDTO other = (RelogioDTO) obj;
		return Objects.equals(album, other.album)
				&& Objects.equals(descricaoPrincipal, other.descricaoPrincipal) && Objects.equals(genero, other.genero)
				&& Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && preco == other.preco && Objects.equals(stock, other.stock);
	}
	
	
	
}
