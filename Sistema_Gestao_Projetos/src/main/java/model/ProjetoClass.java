package model;

import java.util.Date;

public class ProjetoClass {

	private String nome;

	private Date data_inicio;

	private String descricao;

	private TecnologiaClass tecnologiaClass;

	private ClienteClass clienteClass;

	private EquipeProjetoClass equipeProjetoClass;

	private AtaClass ataClass;

	private RequisitoClass requisitoClass;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TecnologiaClass getTecnologiaClass() {
		return tecnologiaClass;
	}

	public void setTecnologiaClass(TecnologiaClass tecnologiaClass) {
		this.tecnologiaClass = tecnologiaClass;
	}

	public ClienteClass getClienteClass() {
		return clienteClass;
	}

	public void setClienteClass(ClienteClass clienteClass) {
		this.clienteClass = clienteClass;
	}

	public EquipeProjetoClass getEquipeProjetoClass() {
		return equipeProjetoClass;
	}

	public void setEquipeProjetoClass(EquipeProjetoClass equipeProjetoClass) {
		this.equipeProjetoClass = equipeProjetoClass;
	}

	public AtaClass getAtaClass() {
		return ataClass;
	}

	public void setAtaClass(AtaClass ataClass) {
		this.ataClass = ataClass;
	}

	public RequisitoClass getRequisitoClass() {
		return requisitoClass;
	}

	public void setRequisitoClass(RequisitoClass requisitoClass) {
		this.requisitoClass = requisitoClass;
	}

	
}
