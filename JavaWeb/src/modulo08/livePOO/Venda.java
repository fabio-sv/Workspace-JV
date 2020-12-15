package modulo08.livePOO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private long id;
    private String desscricaoVenda;
    private String nomeCliente;
    private String enderecaoEntrega;
    private BigDecimal valorVenda;

    private List<Produto> produtoList = new ArrayList<Produto>();

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void addProduto (Produto produto){
        this.produtoList.add(produto);
    }

    public double totalVenda (){
        double total = 0;
        for (Produto produto : produtoList) {
            total = total + produto.getValorProduto().doubleValue();

        }
        return total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesscricaoVenda() {
        return desscricaoVenda;
    }

    public void setDescricaoVenda(String desscricaoVenda) {
        this.desscricaoVenda = desscricaoVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecaoEntrega() {
        return enderecaoEntrega;
    }

    public void setEnderecaoEntrega(String enderecaoEntrega) {
        this.enderecaoEntrega = enderecaoEntrega;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", desscricaoVenda='" + desscricaoVenda + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecaoEntrega='" + enderecaoEntrega + '\'' +
                ", valorVenda=" + valorVenda +
                ", produtoList=" + produtoList +
                '}';
    }
}
