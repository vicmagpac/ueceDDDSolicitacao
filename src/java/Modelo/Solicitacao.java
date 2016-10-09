package Modelo;

import java.util.Date;

import Modelo.Status.NovaSolicitacao;
import Modelo.Status.IStatus;
import Modelo.Status.Status;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@EqualsAndHashCode(of = {"id", "funcionario"})
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @NotNull(message = "Informe o funcionário")
    @ManyToOne
    private Funcionario funcionario;
    
    @Temporal(TemporalType.DATE)
    private Date inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fim;
    
    @NotEmpty(message = "Informe o motivo")
    @Column(length = 255, nullable = false)
    private String motivo;
    
    @Column(length = 255)
    private String observacao;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status = Status.NovaSolicitacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void solicitar() {
        this.status.solicitar(this);
    }

    public void aprovar() {
        this.status.aprovar(this);
    }

    public void recusar() {
        this.status.recusar(this);
    }

    public void retornar(String observacao) {
        this.status.retornar(this, observacao);
    }
    
}