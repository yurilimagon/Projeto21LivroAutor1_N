/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Autor {
    //ATRIBUTOS
    private String nome;
    private int anoNasc;
    private String email;
    private Livro obra;
    
    //CONSTRUTORES
    //VAZIO
    public Autor() {
    }
    //CHEIO
    public Autor(String nome, int anoNasc, String email, Livro obra) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
        this.obra = obra;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }
}
