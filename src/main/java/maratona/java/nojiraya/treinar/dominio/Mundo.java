package maratona.java.nojiraya.treinar.dominio;

import java.util.Arrays;

public abstract class Mundo {
    protected String nome;
    Personagem[] personagens;

    public Mundo(String nome) {
        this.nome = nome;
        this.personagens = personagens;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personagem[] getPersonagens() {
        return personagens;
    }

    public void setPersonagens(Personagem[] personagens) {
        this.personagens = personagens;
    }
}
