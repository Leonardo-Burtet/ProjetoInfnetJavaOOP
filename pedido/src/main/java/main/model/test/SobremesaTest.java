package main.model.test;

import java.util.ArrayList;
import java.util.List;
import main.model.domain.Sobremesa;

public class SobremesaTest {

	public static void main(String[] args) {
		
		List<Sobremesa> sobremesas = new ArrayList<>();
		sobremesas.add(new Sobremesa(2, true, "Bolo de laranja"));
		sobremesas.add(new Sobremesa(1, false, "Salgado de presunto"));
		sobremesas.add(new Sobremesa(10, false, "Pão de queijo"));

		sobremesas.forEach(sobremesa -> System.out.println(sobremesa.mostrarDetalhes()));

	}

}
