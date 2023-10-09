package collectionsJavaApi2023.main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}


	public void adicionarConvidadoSet(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c:convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				//Não vai ter mais por ser um Set - não admite elementos repetidos
				break;
			} else {
				System.out.println("Não existe convidado com esse codigo..");
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidado() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}


	public static void main(String[] args) {
		ConjuntoConvidados conjuntoconvidados = new ConjuntoConvidados();
		System.out.println("Existem "+ conjuntoconvidados.contarConvidado()+ " dentro do Set de Convidados.");
		
		
		conjuntoconvidados.adicionarConvidadoSet("Convidado 1" , 1234);
		conjuntoconvidados.adicionarConvidadoSet("Convidado 2" , 1235);
		conjuntoconvidados.adicionarConvidadoSet("Convidado 3" , 1235);
		conjuntoconvidados.adicionarConvidadoSet("Convidado 4" , 1236);
		
		conjuntoconvidados.exibirConvidados();
		
		System.out.println("Existem "+ conjuntoconvidados.contarConvidado()+ " dentro do Set de Convidados.");
		
		
		conjuntoconvidados.removerConvidadoPorCodigoConvite(1234);
		
		System.out.println("Existem "+ conjuntoconvidados.contarConvidado()+ " dentro do Set de Convidados.");

		conjuntoconvidados.exibirConvidados();
		
;	}

}
