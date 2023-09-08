package main.model.domain;

public class Bebida extends Produto {

	private boolean gelada;
	private float tamanho;
	private String marca;
	
	@Override
	public String mostrarDetalhes() {
		return "Bebida da marca " + this.getMarca() + " de tamanho " + this.getTamanho() + (this.getGelada() ? " GELADO" : " QUENTE");
	}
	
	public Bebida() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bebida(boolean gelada, float tamanho, String marca) {
		super();
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public boolean getGelada() {
		return gelada;
	}
	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Bebida [gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}
	
	
}
