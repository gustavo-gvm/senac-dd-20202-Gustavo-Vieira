package model.vo;

import java.time.LocalDate;

public class Pessoa extends Paciente {

	private boolean voluntario;
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(int id, String nome, LocalDate dataNascimento, String sexo, int cpf, int reacao, boolean voluntario) {
		super(id, nome, dataNascimento, sexo, cpf, reacao);
		this.voluntario = voluntario;
	}
	
	public boolean isVoluntario() {
		return voluntario;
	}

	public void setVoluntario(boolean voluntario) {
		this.voluntario = voluntario;
	}
	
}
