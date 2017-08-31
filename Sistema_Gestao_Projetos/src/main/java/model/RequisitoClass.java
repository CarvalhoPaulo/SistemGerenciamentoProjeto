package model;

public class RequisitoClass {

	private int codigo;

	private String nome;

	private String descricao;

	private String risco;

	private TipoRequisitoClass tipoRequisitoClass;

	private RegradeNegocioClass regradeNegocioClass;

	private ProjetoClass projetoClass;

	private TipoRisco tipoRisco;

	private Prioridade prioridade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public TipoRequisitoClass getTipoRequisitoClass() {
		return tipoRequisitoClass;
	}

	public void setTipoRequisitoClass(TipoRequisitoClass tipoRequisitoClass) {
		this.tipoRequisitoClass = tipoRequisitoClass;
	}

	public RegradeNegocioClass getRegradeNegocioClass() {
		return regradeNegocioClass;
	}

	public void setRegradeNegocioClass(RegradeNegocioClass regradeNegocioClass) {
		this.regradeNegocioClass = regradeNegocioClass;
	}

	public ProjetoClass getProjetoClass() {
		return projetoClass;
	}

	public void setProjetoClass(ProjetoClass projetoClass) {
		this.projetoClass = projetoClass;
	}

	public TipoRisco getTipoRisco() {
		return tipoRisco;
	}

	public void setTipoRisco(TipoRisco tipoRisco) {
		this.tipoRisco = tipoRisco;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

}
