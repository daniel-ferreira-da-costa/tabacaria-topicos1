package unitins.model;

import jakarta.persistence.Entity;

@Entity
public class Usuario extends DefaultEntity {

    private Pessoa dadosPessoais;
    private String login;
    private String senha;

    public Pessoa getdadosPessoais() {
        return dadosPessoais
;
    }

    public void setdadosPessoais(Pessoa dadosPessoais) {
        this.dadosPessoais
 = dadosPessoais
;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
