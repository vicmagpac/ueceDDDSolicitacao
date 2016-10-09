package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@EqualsAndHashCode(of = {"id", "nome"})
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @NotEmpty(message = "Informe o nome do funcionario")
    @Column(length = 255, nullable = false)
    private String nome;
    
    private boolean chefe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isChefe() {
        return chefe;
    }

    public void setChefe(boolean chefe) {
        this.chefe = chefe;
    }
}
