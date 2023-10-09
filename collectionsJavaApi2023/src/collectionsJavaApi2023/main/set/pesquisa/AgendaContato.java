package collectionsJavaApi2023.main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	
	private Set<Contato> contatoSet;
		

	public AgendaContato() {
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContato (String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibircontato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for(Contato c: contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c: contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}


	public static void main(String[] args) {
		AgendaContato agendaContatos = new AgendaContato();
		
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 11111);
		
		
		agendaContatos.exibircontato();
		
		System.out.println(agendaContatos.pesquisarPorNome("Maria"));
		
		System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Maria Silva", 5555));

	}

}
