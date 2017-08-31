package model;

public class ClienteClass extends PessoaClass {

	private String nome_Fantasia;
	private int inscEst;
	private int inscMun;
	private ProjetoClass projetoClass;

	public String getNome_Fantasia() {
		return nome_Fantasia;
	}

	public void setNome_Fantasia(String nome_Fantasia) {
		this.nome_Fantasia = nome_Fantasia;
	}

	public int getInscEst() {
		return inscEst;
	}

	public void setInscEst(int inscEst) {
		this.inscEst = inscEst;
	}

	public int getInscMun() {
		return inscMun;
	}

	public void setInscMun(int inscMun) {
		this.inscMun = inscMun;
	}

	public ProjetoClass getProjetoClass() {
		return projetoClass;
	}

	public void setProjetoClass(ProjetoClass projetoClass) {
		this.projetoClass = projetoClass;
	}

}
