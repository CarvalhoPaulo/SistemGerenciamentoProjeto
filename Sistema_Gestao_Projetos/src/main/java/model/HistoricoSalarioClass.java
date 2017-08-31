package model;

import java.util.Date;

/**
 * Controle de Gastos
 * 
 */
public class HistoricoSalarioClass {

	private double salario;

	private Date data;

	private FuncionarioClass funcionarioClass;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public FuncionarioClass getFuncionarioClass() {
		return funcionarioClass;
	}

	public void setFuncionarioClass(FuncionarioClass funcionarioClass) {
		this.funcionarioClass = funcionarioClass;
	}

}
