package model;

import java.util.Date;

public class AtaClass {

	private int codigo;

	private Date inicio;

	private Date fim;

	private String local;

	private String descricao;

	private EquipeParticipanteClass equipeParticipanteClass;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EquipeParticipanteClass getEquipeParticipanteClass() {
		return equipeParticipanteClass;
	}

	public void setEquipeParticipanteClass(EquipeParticipanteClass equipeParticipanteClass) {
		this.equipeParticipanteClass = equipeParticipanteClass;
	}

	public ProjetoClass getProjetoClass() {
		return projetoClass;
	}

	public void setProjetoClass(ProjetoClass projetoClass) {
		this.projetoClass = projetoClass;
	}

	private ProjetoClass projetoClass;

}
