package br.com.projeto2.aajjl.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Agendamento")
@NoArgsConstructor
@Getter
@Setter
public class Agendamento {

    //atributos do sistema
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    //Atributo para Atendimento Ativo ou Concluido
    private Boolean concluido;

    //User do agendamento(quem atende)
    private User user;

    //Paciente do agendamento(Quem é atendido)
    private Paciente pacinete;

    //Atributos do agendamento em si
    private Turno turno;
    //Data
    private Integer dia;
    private String mes;
    private Integer ano;

    private String observacao;
    private String motivoDoAtendimento;
    private Prioridade prioridade;

    //Construtor
    public Agendamento(Boolean concluido, User user, Paciente pacinete,
                       Turno turno, Integer dia, String mes, Integer ano,
                       String observacao, String motivoDoAtendimento,
                       Prioridade prioridade) {

        this.concluido = concluido;
        this.user = user;
        this.pacinete = pacinete;
        this.turno = turno;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.observacao = observacao;
        this.motivoDoAtendimento = motivoDoAtendimento;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "concluido=" + concluido +
                ", user=" + user +
                ", pacinete=" + pacinete +
                ", turno=" + turno +
                ", dia=" + dia +
                ", mes='" + mes + '\'' +
                ", ano=" + ano +
                ", observacao='" + observacao + '\'' +
                ", motivoDoAtendimento='" + motivoDoAtendimento + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
