package model;

public class TecnologiaClass {

	private String nome;

	private String versao;

	private String obs;

	private String proprietario;

	private ProjetoClass projetoClass;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public ProjetoClass getProjetoClass() {
		return projetoClass;
	}

	public void setProjetoClass(ProjetoClass projetoClass) {
		this.projetoClass = projetoClass;
	}

}
