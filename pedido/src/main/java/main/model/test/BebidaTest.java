package main.model.test;

import java.util.ArrayList;
import java.util.List;

import main.model.domain.Bebida;

public class BebidaTest {

	public static void main(String[] args) {
		
		List<Bebida> bebidas = new ArrayList<>();
		bebidas.add(new Bebida(true, .500f, "CocaCola"));
		bebidas.add(new Bebida(true, .350f, "Skol"));
		bebidas.add(new Bebida(false, .500f, "ChocolateQuente"));

		bebidas.forEach(bebida -> System.out.println(bebida.mostrarDetalhes()));

	}

}
