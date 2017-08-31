package model;

public class TelefoneClass {

	private String DDD;

	private String numero;

	private PessoaClass pessoaClass;

	private TipoTelefoneClass tipoTelefoneClass;

	public String getDDD() {
		return DDD;
	}

	public void setDDD(String dDD) {
		DDD = dDD;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public PessoaClass getPessoaClass() {
		return pessoaClass;
	}

	public void setPessoaClass(PessoaClass pessoaClass) {
		this.pessoaClass = pessoaClass;
	}

	public TipoTelefoneClass getTipoTelefoneClass() {
		return tipoTelefoneClass;
	}

	public void setTipoTelefoneClass(TipoTelefoneClass tipoTelefoneClass) {
		this.tipoTelefoneClass = tipoTelefoneClass;
	}

}
