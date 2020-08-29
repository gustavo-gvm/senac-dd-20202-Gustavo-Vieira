package model.vo;

import java.time.LocalDate;

public class Pesquisador extends Paciente {
	
	private String instituicao;

	public Pesquisador(int id, String nome, LocalDate dataNascimento, String sexo, int cpf, int reacao, String instituicao) {
		super(id, nome, dataNascimento, sexo, cpf, reacao);
		this.instituicao = instituicao;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}