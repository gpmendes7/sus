delimiter $$
create procedure gerarPacientes(in inicio int , in fim int)
begin
	declare v_contador int default inicio;
    
    declare v_copias int default 0;

    declare v_bairro text;
    declare v_cbo text;
    declare v_cep text;
    declare v_classificacaoFinal text;
    declare v_cnes text;
    declare v_cns, v_codigoCbo text;
    declare v_codigoClassificacaoFinal text;
    declare v_codigoComunidadeTradicional text;
    declare v_codigoCondicoes text;
    declare v_codigoEstadoTeste text;
    declare v_codigoEstrangeiro text;
    declare v_codigoEvolucaoCaso text;
    declare v_codigoPaisOrigem text;
    declare v_codigoProfissionalSaude text;
    declare v_codigoProfissionalSeguranca text;
    declare v_codigoResultadoTeste text; 
    declare v_codigoResultadoTesteSorologicoIgA text;
    declare v_codigoResultadoTesteSorologicoIgG text;
    declare v_codigoResultadoTesteSorologicoIgM text;
    declare v_codigoResultadoTesteSorologicoTotais text;
    declare v_codigoSexo text;
    declare v_codigoSintomas text;
    declare v_codigoTemCpf text;
    declare v_codigoTesteSorologico text;
    declare v_codigoTipoTeste text;
    declare v_codigoTipoTesteSorologico text;
    declare v_complemento text;
    declare v_comunidadeTradicional text;
    declare v_condicoes text;
    declare v_contemComunidadeTradicional text;
    declare v_cpf text;
    declare v_createdAt datetime(6);
    declare v_dataEncerramento datetime(6);
    declare v_dataInicioSintomas datetime(6);
	declare v_dataNascimento datetime(6);
	declare v_dataNotificacao datetime(6);
	declare v_dataTeste datetime(6);
	declare v_dataTesteSorologico datetime(6);
	declare v_descricaoRacaCor text;
	declare v_desnormalizarNome text;
    declare	v_email text;
	declare v_estado text;
	declare v_estadoIBGE text;
	declare v_estadoNotificacao text;
	declare v_estadoNotificacaoIBGE text;
	declare v_estadoTeste text;
	declare v_estrangeiro text;
	declare v_etnia text;
	declare v_evolucaoCaso text;
	declare v_idOrigem text;
	declare v_idade text;
	declare v_labCnes text;
	declare v_logradouro text;
	declare v_municipio text;
	declare v_municipioIBGE text;
	declare v_municipioNotificacao text;
	declare v_municipioNotificacaoIBGE text;
	declare v_nomeCompleto text;
	declare v_nomeCompletoDesnormalizado text;
	declare v_nomeMae text;
	declare v_notificadorCNPJ text;
	declare v_notificadorCpf text;
    declare v_notificadorEmail text;
	declare v_notificadorNome text;
	declare v_numero text;
	declare v_numeroNotificacao text;
	declare v_origem text;
	declare v_outrosSintomas text;
	declare v_pUsuario text;
	declare v_pUsuarioAlteracao text;
	declare v_paisOrigem text;
	declare v_passaporte text;
	declare v_profissionalSaude text;
	declare v_profissionalSeguranca text;
	declare v_racaCor text;
	declare v_resultadoTeste text;
	declare v_resultadoTesteSorologicoIgA text;
	declare v_resultadoTesteSorologicoIgG text;
	declare v_resultadoTesteSorologicoIgM text;
	declare v_resultadoTesteSorologicoTotais text;
	declare v_rpa text;
	declare v_sexo text;
	declare v_sintomas text;
	declare v_sourceId text;
	declare v_telefone text;
	declare v_telefoneContato text;
	declare v_testeSorologico text;
    declare v_timestampNotificacao text;
	declare v_tipoTeste text;
	declare v_tipoTesteSorologico text;
	declare v_updatedAt datetime(6);
	declare v_versaoFormulario text;
	declare v_paciente_id bigint;

    declare c_notificacoes cursor for (
		select bairro, cbo, cep, classificacaoFinal, cnes, cns, codigoCbo, codigoClassificacaoFinal,
			   codigoComunidadeTradicional, codigoCondicoes, codigoEstadoTeste, codigoEstrangeiro,
			   codigoEvolucaoCaso, codigoPaisOrigem, codigoProfissionalSaude, codigoProfissionalSeguranca,
			   codigoResultadoTeste, codigoResultadoTesteSorologicoIgA, codigoResultadoTesteSorologicoIgG,
			   codigoResultadoTesteSorologicoIgM, codigoResultadoTesteSorologicoTotais, codigoSexo, codigoSintomas,
			   codigoTemCpf, codigoTesteSorologico, codigoTipoTeste, codigoTipoTesteSorologico, complemento,
			   comunidadeTradicional, condicoes, contemComunidadeTradicional, cpf, createdAt, dataEncerramento,
			   dataInicioSintomas, dataNascimento, dataNotificacao, dataTeste, dataTesteSorologico,
			   descricaoRacaCor, desnormalizarNome, email, estado, estadoIBGE, estadoNotificacao, 
               estadoNotificacaoIBGE, estadoTeste, estrangeiro, etnia, evolucaoCaso, idOrigem,
			   idade, labCnes, logradouro, municipio, municipioIBGE, municipioNotificacao,
			   municipioNotificacaoIBGE, nomeCompleto, nomeCompletoDesnormalizado, nomeMae,
			   notificadorCNPJ, notificadorCpf, notificadorEmail, notificadorNome,
			   numero, numeroNotificacao, origem, outrosSintomas, pUsuario, pUsuarioAlteracao,
			   paisOrigem, passaporte, profissionalSaude, profissionalSeguranca, racaCor,
			   resultadoTeste, resultadoTesteSorologicoIgA, resultadoTesteSorologicoIgG,
			   resultadoTesteSorologicoIgM, resultadoTesteSorologicoTotais, rpa, sexo, sintomas, sourceId, 
               telefone, telefoneContato, testeSorologico, timestampNotificacao, tipoTeste, tipoTesteSorologico,
			   updatedAt, versaoFormulario
        from notificacao where id between inicio and fim
    );
    
    open c_notificacoes;
    
    repeat 
        fetch 
			c_notificacoes 
        into 
			   v_bairro, v_cbo, v_cep, v_classificacaoFinal, v_cnes, v_cns, v_codigoCbo, v_codigoClassificacaoFinal,
			   v_codigoComunidadeTradicional, v_codigoCondicoes, v_codigoEstadoTeste, v_codigoEstrangeiro,
			   v_codigoEvolucaoCaso, v_codigoPaisOrigem, v_codigoProfissionalSaude, v_codigoProfissionalSeguranca,
			   v_codigoResultadoTeste, v_codigoResultadoTesteSorologicoIgA, v_codigoResultadoTesteSorologicoIgG,
			   v_codigoResultadoTesteSorologicoIgM, v_codigoResultadoTesteSorologicoTotais, v_codigoSexo, v_codigoSintomas,
			   v_codigoTemCpf, v_codigoTesteSorologico, v_codigoTipoTeste, v_codigoTipoTesteSorologico, v_complemento,
			   v_comunidadeTradicional, v_condicoes, v_contemComunidadeTradicional, v_cpf, v_createdAt, v_dataEncerramento,
			   v_dataInicioSintomas, v_dataNascimento, v_dataNotificacao, v_dataTeste, v_dataTesteSorologico,
			   v_descricaoRacaCor, v_desnormalizarNome, v_email, v_estado, v_estadoIBGE, v_estadoNotificacao, 
               v_estadoNotificacaoIBGE, v_estadoTeste, v_estrangeiro, v_etnia, v_evolucaoCaso, v_idOrigem,
			   v_idade, v_labCnes, v_logradouro, v_municipio, v_municipioIBGE, v_municipioNotificacao,
			   v_municipioNotificacaoIBGE, v_nomeCompleto, v_nomeCompletoDesnormalizado, v_nomeMae,
			   v_notificadorCNPJ, v_notificadorCpf, v_notificadorEmail, v_notificadorNome,
			   v_numero, v_numeroNotificacao, v_origem, v_outrosSintomas, v_pUsuario, v_pUsuarioAlteracao,
			   v_paisOrigem, v_passaporte, v_profissionalSaude, v_profissionalSeguranca, v_racaCor,
			   v_resultadoTeste, v_resultadoTesteSorologicoIgA, v_resultadoTesteSorologicoIgG,
			   v_resultadoTesteSorologicoIgM, v_resultadoTesteSorologicoTotais, v_rpa, v_sexo, v_sintomas, v_sourceId, 
               v_telefone, v_telefoneContato, v_testeSorologico, v_timestampNotificacao, v_tipoTeste, v_tipoTesteSorologico,
			   v_updatedAt, v_versaoFormulario; 
        
        select count(p.numeroNotificacao) into v_copias
		from paciente p
		where p.nomeCompleto = v_nomeCompleto
		and (p.cpf = v_cpf or p.dataNascimento = v_dataNascimento);
        
        if v_contador <= fim and v_copias = 0  then
			insert into paciente (bairro, cbo, cep, classificacaoFinal, cnes, cns, codigoCbo, codigoClassificacaoFinal,
								  codigoComunidadeTradicional, codigoCondicoes, codigoEstadoTeste, codigoEstrangeiro,
								  codigoEvolucaoCaso, codigoPaisOrigem, codigoProfissionalSaude, codigoProfissionalSeguranca,
								  codigoResultadoTeste, codigoResultadoTesteSorologicoIgA, codigoResultadoTesteSorologicoIgG,
								  codigoResultadoTesteSorologicoIgM, codigoResultadoTesteSorologicoTotais, codigoSexo, codigoSintomas,
								  codigoTemCpf, codigoTesteSorologico, codigoTipoTeste, codigoTipoTesteSorologico, complemento,
								  comunidadeTradicional, condicoes, contemComunidadeTradicional, cpf, createdAt, dataEncerramento,
								  dataInicioSintomas, dataNascimento, dataNotificacao, dataTeste, dataTesteSorologico,
								  descricaoRacaCor, desnormalizarNome, email, estado, estadoIBGE, estadoNotificacao, 
								  estadoNotificacaoIBGE, estadoTeste, estrangeiro, etnia, evolucaoCaso, idOrigem,
								  idade, labCnes, logradouro, municipio, municipioIBGE, municipioNotificacao,
								  municipioNotificacaoIBGE, nomeCompleto, nomeCompletoDesnormalizado, nomeMae,
								  notificadorCNPJ, notificadorCpf, notificadorEmail, notificadorNome,
								  numero, numeroNotificacao, origem, outrosSintomas, pUsuario, pUsuarioAlteracao,
								  paisOrigem, passaporte, profissionalSaude, profissionalSeguranca, racaCor,
								  resultadoTeste, resultadoTesteSorologicoIgA, resultadoTesteSorologicoIgG,
								  resultadoTesteSorologicoIgM, resultadoTesteSorologicoTotais, rpa, sexo, sintomas, sourceId, 
								  telefone, telefoneContato, testeSorologico, timestampNotificacao, tipoTeste, tipoTesteSorologico,
								  updatedAt, versaoFormulario) 
			values (v_bairro, v_cbo, v_cep, v_classificacaoFinal, v_cnes, v_cns, v_codigoCbo, v_codigoClassificacaoFinal,
			        v_codigoComunidadeTradicional, v_codigoCondicoes, v_codigoEstadoTeste, v_codigoEstrangeiro,
				    v_codigoEvolucaoCaso, v_codigoPaisOrigem, v_codigoProfissionalSaude, v_codigoProfissionalSeguranca,
				    v_codigoResultadoTeste, v_codigoResultadoTesteSorologicoIgA, v_codigoResultadoTesteSorologicoIgG,
				    v_codigoResultadoTesteSorologicoIgM, v_codigoResultadoTesteSorologicoTotais, v_codigoSexo, v_codigoSintomas,
				    v_codigoTemCpf, v_codigoTesteSorologico, v_codigoTipoTeste, v_codigoTipoTesteSorologico, v_complemento,
				    v_comunidadeTradicional, v_condicoes, v_contemComunidadeTradicional, v_cpf, v_createdAt, v_dataEncerramento,
				    v_dataInicioSintomas, v_dataNascimento, v_dataNotificacao, v_dataTeste, v_dataTesteSorologico,
				    v_descricaoRacaCor, v_desnormalizarNome, v_email, v_estado, v_estadoIBGE, v_estadoNotificacao, 
				    v_estadoNotificacaoIBGE, v_estadoTeste, v_estrangeiro, v_etnia, v_evolucaoCaso, v_idOrigem,
				    v_idade, v_labCnes, v_logradouro, v_municipio, v_municipioIBGE, v_municipioNotificacao,
				    v_municipioNotificacaoIBGE, v_nomeCompleto, v_nomeCompletoDesnormalizado, v_nomeMae,
				    v_notificadorCNPJ, v_notificadorCpf, v_notificadorEmail, v_notificadorNome,
				    v_numero, v_numeroNotificacao, v_origem, v_outrosSintomas, v_pUsuario, v_pUsuarioAlteracao,
				    v_paisOrigem, v_passaporte, v_profissionalSaude, v_profissionalSeguranca, v_racaCor,
				    v_resultadoTeste, v_resultadoTesteSorologicoIgA, v_resultadoTesteSorologicoIgG,
				    v_resultadoTesteSorologicoIgM, v_resultadoTesteSorologicoTotais, v_rpa, v_sexo, v_sintomas, v_sourceId, 
				    v_telefone, v_telefoneContato, v_testeSorologico, v_timestampNotificacao, v_tipoTeste, v_tipoTesteSorologico,
				    v_updatedAt, v_versaoFormulario);
        end if;
        set v_contador = v_contador + 1;
    until v_contador > fim end repeat; 
    
    close c_notificacoes;
end
$$
delimiter ;

drop procedure gerarPacientes;
truncate paciente;
select * from paciente;
select id, numeroNotificacao, nomeCompleto, cpf, dataNascimento, resultadoTeste from paciente where id between 1 and 10;
select id, numeroNotificacao, nomeCompleto, cpf, dataNascimento from notificacao limit 0, 10000;
select id, numeroNotificacao, nomeCompleto, cpf, dataNascimento from notificacao where id between 1000000 and 1000100;

select count(id) from paciente;

select id, numeroNotificacao, nomeCompleto, dataNascimento
from paciente 
where nomeCompleto = 'ANA PAULA DE SOUZA MARTINS'
and cpf = '079.215.877-63';

select id, paciente_id, numeroNotificacao, nomeCompleto, dataNascimento
from notificacao 
where nomeCompleto = 'ANA PAULA DE SOUZA MARTINS'
and cpf = '079.215.877-63';

select id, numeroNotificacao, nomeCompleto, dataNascimento
from paciente 
where id = 161623

select id, numeroNotificacao, nomeCompleto, dataNascimento
from paciente 
where id = 161631

select id, numeroNotificacao, nomeCompleto, dataNascimento
from paciente 
where id = 158846

select id, numeroNotificacao, nomeCompleto, dataNascimento
from paciente 
where id = 159846

select id, paciente_id, numeroNotificacao, nomeCompleto, dataNascimento
from notificacao 
where paciente_id = 161623

delimiter $$
create procedure gerarVariosPacientes(in inicio int, in fim int, in tam int)
begin
    declare v_lim1 int default inicio;
    declare v_lim2 int default inicio + tam - 1;
    
    repeat 
		call gerarPacientes(v_lim1, v_lim2);
        set v_lim1 = v_lim1 + tam;
        set v_lim2 = v_lim2 + tam;
    until v_lim2 > fim end repeat; 
end
$$
delimiter ;

drop procedure gerarVariosPacientes;

call gerarVariosPacientes(1, 1000, 100);
call gerarVariosPacientes(1001, 2000, 100);
call gerarVariosPacientes(2001, 3000, 100);
call gerarPacientes(3001, 3100);
call gerarPacientes(3101, 3200);
call gerarPacientes(3201, 3300);


delete from paciente;





