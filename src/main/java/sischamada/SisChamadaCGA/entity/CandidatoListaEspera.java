package sischamada.SisChamadaCGA.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TB_LISTA_ESPERA")
public class CandidatoListaEspera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @CsvBindByName(column = "NU_ETAPA")
    private String nomeEtapa;
    @CsvBindByName(column = "NO_CAMPUS")
    private String nomeCampus;
    @CsvBindByName(column = "CO_IES_CURSO")
    private String codigoCurso;
    @CsvBindByName(column = "DS_TURNO")
    private String turno;
    @CsvBindByName(column = "DS_FORMACAO")
    private String grauAcademico;
    @CsvBindByName(column = "QT_VAGAS_CONCORRENCIA")
    private Integer quantDeVagas;
    @CsvBindByName(column = "CO_INSCRICAO_ENEM")
    private String numInscricaoEnem;
    @CsvBindByName(column = "NO_INSCRITO")
    private String nomeCandidato;
    @CsvBindByName(column = "NO_SOCIAL")
    private String nomeSocial;
    @CsvBindByName(column = "NU_CPF_INSCRITO")
    private String numCpf;
    @CsvBindByName(column = "NO_IES", required = true)
    private String nomeInstituicaoEnsinoSuperior;
    @CsvBindByName(column = "DT_NASCIMENTO")
    @CsvDate(value = "yyyy-MM-dd HH:mm:ss")
    private LocalDate dataNascimento;
    @CsvBindByName(column = "TP_SEXO")
    private Character sexo;
    @CsvBindByName(column = "NU_RG")
    private String numRG;
    @CsvBindByName(column = "NO_MAE")
    private String nomeMae;
    @CsvBindByName(column = "DS_LOGRADOURO")
    private String logradouro;
    @CsvBindByName(column = "NU_ENDERECO")
    private String numEndereco;
    @CsvBindByName(column = "DS_COMPLEMENTO")
    private String complemento;
    @CsvBindByName(column = "SG_UF_INSCRITO")
    private String ufInscrito;
    @CsvBindByName(column = "NO_MUNICIPIO")
    private String nomeMunicipio;
    @CsvBindByName(column = "NO_BAIRRO")
    private String nomeBairro;
    @CsvBindByName(column = "NU_CEP")
    private String numCep;
    @CsvBindByName(column = "NU_FONE1")
    private String numFone1;
    @CsvBindByName(column = "NU_FONE2")
    private String numFone2;
    @CsvBindByName(column = "DS_EMAIL")
    private String email;
    @CsvBindByName(column = "NU_NOTA_L")
    private Double notaLinguagem;
    @CsvBindByName(column = "NU_NOTA_CH")
    private Double notaCienciasHumana;
    @CsvBindByName(column = "NU_NOTA_CN")
    private Double notaCienciasNatural;
    @CsvBindByName(column = "NU_NOTA_M")
    private Double notaMatematica;
    @CsvBindByName(column = "NU_NOTA_R")
    private Double notaRedacao;
    @CsvBindByName(column = "CO_CURSO_INSCRICAO")
    private String codigoCursoInscricao;
    @CsvBindByName(column = "ST_OPCAO")
    private String opcaoCursoInscricao;
    @CsvBindByName(column = "NO_MODALIDADE_CONCORRENCIA")
    private String opcaoDeParticipacao;
    @CsvBindByName(column = "ST_BONUS_PERC")
    private String statusBonusPerc;
    @CsvBindByName(column = "QT_BONUS_PERC")
    private String quantidadeDeBonusPerc;
    @CsvBindByName(column = "NO_ACAO_AFIRMATIVA_BONUS")
    private String nomeAcaoAfirmativaBonus;
    @CsvBindByName(column = "NU_NOTA_CANDIDATO")
    private Double notaCandidato;
    @CsvBindByName(column = "NU_NOTACORTE_CONCORRIDA")
    private Double notaCorteConcorrida;
    @CsvBindByName(column = "NU_CLASSIFICACAO")
    private String classificacao;
    @CsvBindByName(column = "DS_MATRICULA")
    private String matricula;
    @CsvBindByName(column = "DT_OPERACAO")
    private String dataOperacao;
    @CsvBindByName(column = "CO_IES")
    private Integer codInstituicaoDeEnsinoSuperior;
    @CsvBindByName(column = "NO_IES")
    private String nomeInstituicaoDeEnsinoSuperior;
    @CsvBindByName(column = "SG_IES")
    private String siglaInstituicaoDeEnsinoSuperior;
    @CsvBindByName(column = "SG_UF_IES")
    private String siglaEstadoInstituicaoDeEnsinoSuperior;
    @CsvBindByName(column = " ST_LEI_OPTANTE")
    private String leiOptante;
    @CsvBindByName(column = " ST_LEI_RENDA")
    private String leiDeRenda;
    @CsvBindByName(column = " ST_LEI_ETNIA_P")
    private String leiDeEtiniaPP;
    @CsvBindByName(column = " ST_LEI_ETNIA_I")
    private String leiDeEtiniaI;

}
