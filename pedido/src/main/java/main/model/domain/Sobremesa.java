package main.model.domain;

public class Sobremesa extends Produto {
  
	private float quantidade;
	private boolean doce;
	private String informacao;
	
	@Override
	public String mostrarDetalhes() {
		return "Sobremesa " + this.getInformacao() + " com quantidade total de " + this.getQuantidade() + (this.getDoce() ? " DOCE" : " SALGADO");
	}
	
	public Sobremesa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Sobremesa(float quantidade, boolean doce, String informacao) {
		super();
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacao;
	}

	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	public boolean getDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	@Override
	public String toString() {
		return "Sobremesa [quantidade=" + quantidade + ", doce=" + doce + ", informacao=" + informacao + "]";
	}
	
	
}
