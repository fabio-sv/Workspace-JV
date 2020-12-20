package modulo08.livePOO;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Modulo orientação Objeto");
        produto1.setValorProduto(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setNome("Móduo de Spring Boot");
        produto2.setId(3L);
        produto2.setValorProduto(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setNome("Móduo de Angular");
        produto3.setId(3L);
        produto3.setValorProduto(BigDecimal.valueOf(300));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso formação Java");
        venda.setEnderecaoEntrega("Entrega por Email");
        venda.setId(10L);
        venda.setNomeCliente("Jane");
        venda.setValorVenda(BigDecimal.valueOf(197.00));

        venda.getProdutoList().add(produto1);
        venda.getProdutoList().add(produto2);// Não consigo fazer validações
        venda.addProduto(produto3); // posso fazer validações

        System.out.println("Valor da variável total: " + venda.getValorVenda());


    }
}
