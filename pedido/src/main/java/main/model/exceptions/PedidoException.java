package main.model.exceptions;

public class PedidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PedidoException(String mensagem) {
		super(mensagem);
	}
}
