package csv;

public class PacienteCSV {
	
	private String cpf;
	private String nomeCompleto;
	private String dataNascimento;
	private String municipioNotificacao;
	private String racaCor;
	
	public PacienteCSV() {
	
	}

	public PacienteCSV(String cpf, String nomeCompleto, 
			           String dataNascimento, String municipioNotificacao, 
			           String racaCor) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.municipioNotificacao = municipioNotificacao;
		this.racaCor = racaCor;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getMunicipioNotificacao() {
		return municipioNotificacao;
	}


	public void setMunicipioNotificacao(String municipioNotificacao) {
		this.municipioNotificacao = municipioNotificacao;
	}

	public String getRacaCor() {
		return racaCor;
	}

	public void setRacaCor(String racaCor) {
		this.racaCor = racaCor;
	}
}