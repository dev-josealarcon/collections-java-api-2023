package collectionsJavaApi2023.main.map.pesquisa;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
		
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		return "EstoqueProdutos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}









	public String getNome() {
		return nome;
	}









	public void setNome(String nome) {
		this.nome = nome;
	}









	public double getPreco() {
		return preco;
	}









	public void setPreco(double preco) {
		this.preco = preco;
	}









	public int getQuantidade() {
		return quantidade;
	}









	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}








