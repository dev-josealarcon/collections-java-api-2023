package collectionsJavaApi2023.main.list.operacoesBasicas;

public class Tarefa {
	//Atributo
	private String descricao;
	
	//construtor
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	//Get
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return  descricao ;
	}
	
	
	
	
	
}
