package main.model.test;

import java.util.ArrayList;
import java.util.List;
import main.model.domain.Comida;

public class ComidaTest {

	public static void main(String[] args) {
		
		List<Comida> comidas = new ArrayList<>();
		comidas.add(new Comida(1000f, false, "Macarrão com pesto"));
		comidas.add(new Comida(.250f, true, "Salada de alface com tomate"));
		comidas.add(new Comida(1000f, true, "Feijão com Arroz"));
		comidas.forEach(comida -> System.out.println(comida.mostrarDetalhes()));

	}

}
