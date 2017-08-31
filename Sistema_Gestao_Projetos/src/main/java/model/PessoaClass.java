package model;

import java.util.Date;

public class PessoaClass {

	private String nome;

	private String cnpj_cpf;

	private int rg;

	private String obs;

	private Date data_nasc;

	private String logradouroClass;

	private TelefoneClass telefoneClass;

	private EquipeParticipanteClass equipeParticipanteClass;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj_cpf() {
		return cnpj_cpf;
	}

	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getLogradouroClass() {
		return logradouroClass;
	}

	public void setLogradouroClass(String logradouroClass) {
		this.logradouroClass = logradouroClass;
	}

	public TelefoneClass getTelefoneClass() {
		return telefoneClass;
	}

	public void setTelefoneClass(TelefoneClass telefoneClass) {
		this.telefoneClass = telefoneClass;
	}

	public EquipeParticipanteClass getEquipeParticipanteClass() {
		return equipeParticipanteClass;
	}

	public void setEquipeParticipanteClass(EquipeParticipanteClass equipeParticipanteClass) {
		this.equipeParticipanteClass = equipeParticipanteClass;
	}

	
}
