package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paciente {
	
	@Id
	private Long id;
	private Date dataNascimento;
	private Date dataNotificacao;
	private Date dataInicioSintomas;
	private Date dataTeste;
	@Column(columnDefinition="TEXT")
	private String pUsuario;
	@Column(columnDefinition="TEXT")
	private String estrangeiro;
	@Column(columnDefinition="TEXT")
	private String profissionalSaude;
	@Column(columnDefinition="TEXT")
	private String profissionalSeguranca;
	@Column(columnDefinition="TEXT")
	private String cbo;
	@Column(columnDefinition="TEXT")
	private String cpf;
	@Column(columnDefinition="TEXT")
	private String cns;
	@Column(columnDefinition="TEXT")
	private String nomeCompleto;
	@Column(columnDefinition="TEXT")
	private String nomeMae;
	@Column(columnDefinition="TEXT")
	private String paisOrigem;
	@Column(columnDefinition="TEXT")
	private String sexo;
	@Column(columnDefinition="TEXT")
	private String racaCor;
	@Column(columnDefinition="TEXT")
	private String etnia;
	@Column(columnDefinition="TEXT")
	private String cep;
	@Column(columnDefinition="TEXT")
	private String passaporte;
	@Column(columnDefinition="TEXT")
	private String logradouro;
	@Column(columnDefinition="TEXT")
	private String numero;
	@Column(columnDefinition="TEXT")
	private String complemento;
	@Column(columnDefinition="TEXT")
	private String bairro;
	@Column(columnDefinition="TEXT")
	private String estado;
	@Column(columnDefinition="TEXT")
	private String municipio;
	@Column(columnDefinition="TEXT")
	private String telefoneContato;
	@Column(columnDefinition="TEXT")
	private String telefone;
	@Column(columnDefinition="TEXT")
	private String sintomas;
	@Column(columnDefinition="TEXT")
	private String outrosSintomas;
	@Column(columnDefinition="TEXT")
	private String condicoes;
	@Column(columnDefinition="TEXT")
	private String estadoTeste;
	@Column(columnDefinition="TEXT")
	private String tipoTeste;
	@Column(columnDefinition="TEXT")
	private String testeSorologico;
	private Date dataTesteSorologico;
	@Column(columnDefinition="TEXT")
	private String resultadoTeste;
	@Column(columnDefinition="TEXT")
	private String tipoTesteSorologico;
	@Column(columnDefinition="TEXT")
	private String resultadoTesteSorologicoIgA;
	@Column(columnDefinition="TEXT")
	private String resultadoTesteSorologicoIgG;
	@Column(columnDefinition="TEXT")
	private String resultadoTesteSorologicoIgM;
	@Column(columnDefinition="TEXT")
	private String resultadoTesteSorologicoTotais;
	@Column(columnDefinition="TEXT")
	private String numeroNotificacao;
	@Column(columnDefinition="TEXT")
	private String cnes;
	@Column(columnDefinition="TEXT")
	private String estadoNotificacao;
	@Column(columnDefinition="TEXT")
	private String municipioNotificacao;
	@Column(columnDefinition="TEXT")
	private String origem;
	@Column(columnDefinition="TEXT")
	private String nomeCompletoDesnormalizado;
	private Date createdAt;
	private Date updatedAt;
	@Column(columnDefinition="TEXT")
	private String sourceId;
	@Column(columnDefinition="TEXT")
	private String idade;
	@Column(columnDefinition="TEXT")
	private String classificacaoFinal;
	@Column(columnDefinition="TEXT")
	private String evolucaoCaso;
	private Date dataEncerramento;
	@Column(columnDefinition="TEXT")
	private String descricaoRacaCor;
	@Column(columnDefinition="TEXT")
	private String pUsuarioAlteracao;
	@Column(columnDefinition="TEXT")
	private String rpa;
	@Column(columnDefinition="TEXT")
	private String idOrigem;
	@Column(columnDefinition="TEXT")
	private String desnormalizarNome;
	@Column(columnDefinition="TEXT")
	private String timestampNotificacao;
	@Column(columnDefinition="TEXT")
	private String estadoIBGE;
	@Column(columnDefinition="TEXT")
	private String estadoNotificacaoIBGE;
	@Column(columnDefinition="TEXT")
	private String municipioIBGE;
	@Column(columnDefinition="TEXT")
	private String municipioNotificacaoIBGE;
	@Column(length = 80)
	private String notificadorCpf;
	@Column(length = 80)
	private String notificadorEmail;
	@Column(length = 80)
	private String notificadorNome;
	@Column(columnDefinition="TEXT")
	private String notificadorCNPJ;
	@Column(columnDefinition="TEXT")
	private String codigoClassificacaoFinal;
	@Column(columnDefinition="TEXT")
	private String codigoEvolucaoCaso;
	@Column(columnDefinition="TEXT")
	private String codigoEstadoTeste;
	@Column(columnDefinition="TEXT")
	private String labCnes;
	@Column(columnDefinition="TEXT")
	private String codigoCondicoes;
	@Column(columnDefinition="TEXT")
	private String codigoResultadoTeste;
	@Column(columnDefinition="TEXT")
	private String codigoSintomas;
	@Column(columnDefinition="TEXT")
	private String email;
	@Column(columnDefinition="TEXT")
	private String comunidadeTradicional;
	@Column(columnDefinition="TEXT")
	private String contemComunidadeTradicional;
	@Column(columnDefinition="TEXT")
	private String versaoFormulario;
	@Column(columnDefinition="TEXT")
	private String codigoResultadoTesteSorologicoIgM;
	@Column(columnDefinition="TEXT")
	private String codigoResultadoTesteSorologicoIgG;
	@Column(columnDefinition="TEXT")
	private String codigoTipoTesteSorologico;
	@Column(columnDefinition="TEXT")
	private String codigoTesteSorologico;
	@Column(columnDefinition="TEXT")
	private String codigoTipoTeste;
	@Column(columnDefinition="TEXT")
	private String codigoProfissionalSeguranca;
	@Column(columnDefinition="TEXT")
	private String codigoProfissionalSaude;
	@Column(columnDefinition="TEXT")
	private String codigoTemCpf;
	@Column(columnDefinition="TEXT")
	private String codigoSexo;
	@Column(columnDefinition="TEXT")
	private String codigoEstrangeiro;
	@Column(columnDefinition="TEXT")
	private String codigoCbo;
	@Column(columnDefinition="TEXT")
	private String codigoPaisOrigem;
	@Column(columnDefinition="TEXT")
	private String codigoResultadoTesteSorologicoTotais;
	@Column(columnDefinition="TEXT")
	private String codigoResultadoTesteSorologicoIgA;
	@Column(columnDefinition="TEXT")
	private String codigoComunidadeTradicional;
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<Notificacao> notificacoes;
	
	public Paciente() {
		notificacoes = new ArrayList<>();
	}

	public Paciente(Date dataNascimento, Date dataNotificacao, Date dataInicioSintomas, Date dataTeste, String pUsuario,
			String estrangeiro, String profissionalSaude, String profissionalSeguranca, String cbo, String cpf,
			String cns, String nomeCompleto, String nomeMae, String paisOrigem, String sexo, String racaCor,
			String etnia, String cep, String passaporte, String logradouro, String numero, String complemento,
			String bairro, String estado, String municipio, String telefoneContato, String telefone, String sintomas,
			String outrosSintomas, String condicoes, String estadoTeste, String tipoTeste, String testeSorologico,
			Date dataTesteSorologico, String resultadoTeste, String tipoTesteSorologico,
			String resultadoTesteSorologicoIgA, String resultadoTesteSorologicoIgG, String resultadoTesteSorologicoIgM,
			String resultadoTesteSorologicoTotais, String numeroNotificacao, String cnes, String estadoNotificacao,
			String municipioNotificacao, String origem, String nomeCompletoDesnormalizado, Date createdAt,
			Date updatedAt, String sourceId, String idade, String classificacaoFinal, String evolucaoCaso,
			Date dataEncerramento, String descricaoRacaCor, String pUsuarioAlteracao, String rpa, String idOrigem,
			String desnormalizarNome, String timestampNotificacao, String estadoIBGE, String estadoNotificacaoIBGE,
			String municipioIBGE, String municipioNotificacaoIBGE, String notificadorCpf, String notificadorEmail,
			String notificadorNome, String notificadorCNPJ, String codigoClassificacaoFinal, String codigoEvolucaoCaso,
			String codigoEstadoTeste, String labCnes, String codigoCondicoes, String codigoResultadoTeste,
			String codigoSintomas, String email, String comunidadeTradicional, String contemComunidadeTradicional,
			String versaoFormulario, String codigoResultadoTesteSorologicoIgM, String codigoResultadoTesteSorologicoIgG,
			String codigoTipoTesteSorologico, String codigoTesteSorologico, String codigoTipoTeste,
			String codigoProfissionalSeguranca, String codigoProfissionalSaude, String codigoTemCpf, String codigoSexo,
			String codigoEstrangeiro, String codigoCbo, String codigoPaisOrigem,
			String codigoResultadoTesteSorologicoTotais, String codigoResultadoTesteSorologicoIgA,
			String codigoComunidadeTradicional) {
		super();
		this.dataNascimento = dataNascimento;
		this.dataNotificacao = dataNotificacao;
		this.dataInicioSintomas = dataInicioSintomas;
		this.dataTeste = dataTeste;
		this.pUsuario = pUsuario;
		this.estrangeiro = estrangeiro;
		this.profissionalSaude = profissionalSaude;
		this.profissionalSeguranca = profissionalSeguranca;
		this.cbo = cbo;
		this.cpf = cpf;
		this.cns = cns;
		this.nomeCompleto = nomeCompleto;
		this.nomeMae = nomeMae;
		this.paisOrigem = paisOrigem;
		this.sexo = sexo;
		this.racaCor = racaCor;
		this.etnia = etnia;
		this.cep = cep;
		this.passaporte = passaporte;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.municipio = municipio;
		this.telefoneContato = telefoneContato;
		this.telefone = telefone;
		this.sintomas = sintomas;
		this.outrosSintomas = outrosSintomas;
		this.condicoes = condicoes;
		this.estadoTeste = estadoTeste;
		this.tipoTeste = tipoTeste;
		this.testeSorologico = testeSorologico;
		this.dataTesteSorologico = dataTesteSorologico;
		this.resultadoTeste = resultadoTeste;
		this.tipoTesteSorologico = tipoTesteSorologico;
		this.resultadoTesteSorologicoIgA = resultadoTesteSorologicoIgA;
		this.resultadoTesteSorologicoIgG = resultadoTesteSorologicoIgG;
		this.resultadoTesteSorologicoIgM = resultadoTesteSorologicoIgM;
		this.resultadoTesteSorologicoTotais = resultadoTesteSorologicoTotais;
		this.numeroNotificacao = numeroNotificacao;
		this.cnes = cnes;
		this.estadoNotificacao = estadoNotificacao;
		this.municipioNotificacao = municipioNotificacao;
		this.origem = origem;
		this.nomeCompletoDesnormalizado = nomeCompletoDesnormalizado;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.sourceId = sourceId;
		this.idade = idade;
		this.classificacaoFinal = classificacaoFinal;
		this.evolucaoCaso = evolucaoCaso;
		this.dataEncerramento = dataEncerramento;
		this.descricaoRacaCor = descricaoRacaCor;
		this.pUsuarioAlteracao = pUsuarioAlteracao;
		this.rpa = rpa;
		this.idOrigem = idOrigem;
		this.desnormalizarNome = desnormalizarNome;
		this.timestampNotificacao = timestampNotificacao;
		this.estadoIBGE = estadoIBGE;
		this.estadoNotificacaoIBGE = estadoNotificacaoIBGE;
		this.municipioIBGE = municipioIBGE;
		this.municipioNotificacaoIBGE = municipioNotificacaoIBGE;
		this.notificadorCpf = notificadorCpf;
		this.notificadorEmail = notificadorEmail;
		this.notificadorNome = notificadorNome;
		this.notificadorCNPJ = notificadorCNPJ;
		this.codigoClassificacaoFinal = codigoClassificacaoFinal;
		this.codigoEvolucaoCaso = codigoEvolucaoCaso;
		this.codigoEstadoTeste = codigoEstadoTeste;
		this.labCnes = labCnes;
		this.codigoCondicoes = codigoCondicoes;
		this.codigoResultadoTeste = codigoResultadoTeste;
		this.codigoSintomas = codigoSintomas;
		this.email = email;
		this.comunidadeTradicional = comunidadeTradicional;
		this.contemComunidadeTradicional = contemComunidadeTradicional;
		this.versaoFormulario = versaoFormulario;
		this.codigoResultadoTesteSorologicoIgM = codigoResultadoTesteSorologicoIgM;
		this.codigoResultadoTesteSorologicoIgG = codigoResultadoTesteSorologicoIgG;
		this.codigoTipoTesteSorologico = codigoTipoTesteSorologico;
		this.codigoTesteSorologico = codigoTesteSorologico;
		this.codigoTipoTeste = codigoTipoTeste;
		this.codigoProfissionalSeguranca = codigoProfissionalSeguranca;
		this.codigoProfissionalSaude = codigoProfissionalSaude;
		this.codigoTemCpf = codigoTemCpf;
		this.codigoSexo = codigoSexo;
		this.codigoEstrangeiro = codigoEstrangeiro;
		this.codigoCbo = codigoCbo;
		this.codigoPaisOrigem = codigoPaisOrigem;
		this.codigoResultadoTesteSorologicoTotais = codigoResultadoTesteSorologicoTotais;
		this.codigoResultadoTesteSorologicoIgA = codigoResultadoTesteSorologicoIgA;
		this.codigoComunidadeTradicional = codigoComunidadeTradicional;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public List<Notificacao> getNotificacoes() {
		return notificacoes;
	}
	
	public boolean ehCopia(Paciente p) {
		boolean temMesmoNomeCompleto = this.getNomeCompleto() != null && this.getNomeCompleto().equals(p.getNomeCompleto());
		boolean temMesmoCpf = this.getCpf() != null && this.getCpf().equals(p.getCpf());
		boolean temMesmaDataNascimento = this.getDataNascimento() != null && this.getDataNascimento().equals(p.getDataNascimento());
		boolean temMesmoId = this.getId() != null && this.getId().equals(p.getId());
		return  temMesmoNomeCompleto && (temMesmoCpf || temMesmaDataNascimento) && !temMesmoId;
	}
	

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", nomeCompleto="
				+ nomeCompleto + "]";
	}

	
	
}
