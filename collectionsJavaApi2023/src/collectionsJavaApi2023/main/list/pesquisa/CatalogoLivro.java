package collectionsJavaApi2023.main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
	private List<Livro> livroList;
	
	public CatalogoLivro() {
		this.livroList = new ArrayList<>()	;
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		
		List<Livro> livrosPorAutor = new ArrayList<>();
		//Se lista Livro está vazia
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	
	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anofinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anofinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;		
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;		
	}
	
	
	
	public static void main(String[] args) {
		CatalogoLivro catalogoLivro = new CatalogoLivro();
		
		catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogoLivro.pesquisaPorIntervaloAnos(2020,2022));
		System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));
		
	}
	
	
	
	
	
}
