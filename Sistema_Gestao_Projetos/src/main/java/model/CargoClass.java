package model;

public class CargoClass {

	private String nome;

	private String obs;

	private String funcao;

	private double nalario_Base;

	private FuncionarioClass funcionarioClass;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getNalario_Base() {
		return nalario_Base;
	}

	public void setNalario_Base(double nalario_Base) {
		this.nalario_Base = nalario_Base;
	}

	public FuncionarioClass getFuncionarioClass() {
		return funcionarioClass;
	}

	public void setFuncionarioClass(FuncionarioClass funcionarioClass) {
		this.funcionarioClass = funcionarioClass;
	}

}
