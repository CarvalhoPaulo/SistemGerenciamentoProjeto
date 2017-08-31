package model;

import java.util.Date;

public class FuncionarioClass extends PessoaClass {

	private Date data_contratacao;

	private Date data_recisao;

	private String ctps;

	private int matricula;

	private CargoClass cargoClass;

	private HistoricoSalarioClass historicoSalarioClass;

	private Usuario usuario;

	private EquipeProjetoClass equipeProjetoClass;

	public Date getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(Date data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

	public Date getData_recisao() {
		return data_recisao;
	}

	public void setData_recisao(Date data_recisao) {
		this.data_recisao = data_recisao;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public CargoClass getCargoClass() {
		return cargoClass;
	}

	public void setCargoClass(CargoClass cargoClass) {
		this.cargoClass = cargoClass;
	}

	public HistoricoSalarioClass getHistoricoSalarioClass() {
		return historicoSalarioClass;
	}

	public void setHistoricoSalarioClass(HistoricoSalarioClass historicoSalarioClass) {
		this.historicoSalarioClass = historicoSalarioClass;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public EquipeProjetoClass getEquipeProjetoClass() {
		return equipeProjetoClass;
	}

	public void setEquipeProjetoClass(EquipeProjetoClass equipeProjetoClass) {
		this.equipeProjetoClass = equipeProjetoClass;
	}

}
