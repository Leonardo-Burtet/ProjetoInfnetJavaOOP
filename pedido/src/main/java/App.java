

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Locale;

import main.model.domain.Bebida;
import main.model.domain.Comida;
import main.model.domain.Pedido;
import main.model.domain.Produto;
import main.model.domain.Sobremesa;
import main.model.domain.Solicitante;

public class App {

	public static void main(String[] args) {

        /* ======== REGISTRAR PRODUTOS ========*/
        Produto[] produtos = new Produto[16];
        produtos[0]     = new Sobremesa(2, true, "Sobremesa 1");
        produtos[1]     = new Bebida(true, .500f, "Chá 1");
        produtos[2]     =  new Bebida(true, .500f, "Chá 2");
        produtos[3]     =  new Bebida(true, .500f, "Chá 3");
        produtos[4]     =  new Bebida(true, .500f, "Suco 1");
        produtos[5]     =  new Bebida(true, .500f, "Suco 2");
        produtos[6]     = new Comida(1000f, false, "Macarrão 1");
        produtos[7]     = new Comida(1000f, false, "Macarrão 2");
        produtos[8]     = new Comida(1000f, false, "Macarrão 3");
        produtos[9]     = new Comida(1000f, false, "Macarrão 4");
        produtos[10]    = new Sobremesa(2, true, "Bolo 1");
        produtos[11]    = new Sobremesa(2, true, "Bolo 2");
        produtos[12]    = new Sobremesa(2, true, "Bolo 3");
        produtos[13]    =  new Bebida(true, .500f, "Refri 1");
        produtos[14]    =  new Bebida(true, .500f, "Refri 2");
        produtos[15]    = new Bebida(true, .500f, "Refri 3");


        /* ======== LER ARQUIVO FAKE DE PEDIDO ========*/
        String path_in = "./input.txt";
        try (BufferedReader br = new BufferedReader ( new FileReader(path_in))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


        /* ======== CRIAR PEDIDOS ========*/
        Solicitante c1 = new Solicitante("Leonardo Burtet", "12345211155", "teste@teste.br");
        Pedido p1 = new Pedido("Pedido cliente 1", c1);
        p1.adicionarProduto(produtos[8]);
        p1.adicionarProduto(produtos[6]);
        p1.adicionarProduto(produtos[15]);
        p1.adicionarProduto(produtos[15]);
        p1.adicionarProduto(produtos[1]);
        p1.removerProduto(2);

     
        Solicitante c2 = new Solicitante("Jose Alves", "11111122260", "teste@souumteste.com");
        Pedido p2 = new Pedido("Pedido cliente 2", c2);
        p2.adicionarProduto(produtos[0]);
        p2.adicionarProduto(produtos[4]);
        p2.adicionarProduto(produtos[3]);
        p2.adicionarProduto(produtos[12]);

       
        Solicitante c3 = new Solicitante("Ricardo Lopes", "32154625680", "ricardo@lopes.com");
        Pedido p3 = new Pedido("Pedido cliente 3", c3);
        p3.adicionarProduto(produtos[13]);
        p3.adicionarProduto(produtos[10]);

        
        /* ======== GERAR ARQUIVO DE PEDIDO ========*/
        String[] lines = new String[] {p1+"\n", p2+"\n", p3+"\n"};
        String path_out = "./output.txt";
        try (BufferedWriter bw = new BufferedWriter ( new FileWriter (path_out))) {
            for ( String line : lines) {
                bw.write(line);
                bw.newLine ();
            }
            System.out.println("ARQUIVO GERADO");
        } catch ( IOException e) {
            e .printStackTrace ();
        }
    }
	}

