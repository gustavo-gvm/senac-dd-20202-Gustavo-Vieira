package model.vo;

import java.time.LocalDate;

public class Vacina {
	
	private int idVacina;
	private String pais;
	private int estagioPesquisa;
	private LocalDate dataInicioPesquisa;
	private Pesquisador pesquisador;
	
	public Vacina(int idVacina, String paisOrigem, int estagioPesquisa, LocalDate dataInicioPesquisa,
			Pesquisador pesquisador) {
		super();
		this.idVacina = idVacina;
		this.pais = paisOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisador = pesquisador;
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEstagioPesquisa() {
		return estagioPesquisa;
	}

	public void setEstagioPesquisa(int estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}

	public LocalDate getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}

	public void setDataInicioPesquisa(LocalDate dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	
}
