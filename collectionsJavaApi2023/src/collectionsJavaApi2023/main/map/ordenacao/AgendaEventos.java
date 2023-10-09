package collectionsJavaApi2023.main.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;


public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);		
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
	// Set<LocalDate> dataSet = eventosMap.keySet(); //Retorna o Set con todas as keys
	//	Collection<Evento> values = eventosMap.values();//Retorna valores de uma coleção 
	//	eventosMap.get(eventosMap); //Não funciona porque não tenho a chave
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData=null;
		Evento proximoEvento=null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data "+ proximaData);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 9), "Evento 3", "Atração 3");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "Evento 3", "Atração 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 3", "Atração 3");
		
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}

}
