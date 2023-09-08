package main.model.domain;

public class Comida extends Produto {
	
	private float peso;
	private boolean vegano;
	private String ingredientes;
	
	@Override
	public String mostrarDetalhes() {
		return "Comida com os ingredientes " + this.getIngredientes() + " peso de " + this.getPeso() + (this.vegano ? " COMIDA VEGANA" : " COMIDA NÃO VEGANA");
	}
	
	public Comida(float peso, boolean vegano, String ingredientes) {
		super();
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isVegano() {
		return vegano;
	}
	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String toString() {
		return "Comida [peso=" + peso + ", vegano=" + vegano + ", ingredientes=" + ingredientes + "]";
	}
	
}
