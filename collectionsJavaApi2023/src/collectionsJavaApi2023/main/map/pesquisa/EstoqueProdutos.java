package collectionsJavaApi2023.main.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;
	
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calculaValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
			}
		}
		return valorTotalEstoque;
	}


	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco()> maiorPreco) {
					produtoMaisCaro= p;
				}
			}			
		}
		return produtoMaisCaro;
	}
	
	


	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Produto A",  5.0, 10);
		estoque.adicionarProduto(2L, "Produto B",  10.0, 5);
		estoque.adicionarProduto(3L, "Produto C",  15.0, 2);
		estoque.adicionarProduto(3L, "Produto C",  20.0, 2);
		
		estoque.exibirProdutos();
		
		System.out.println("valor total do estoque R$"+estoque.calculaValorTotalEstoque());
		System.out.println("Produto mais caro: "+ estoque.obterProdutoMaisCaro());
		
		
	}
}
