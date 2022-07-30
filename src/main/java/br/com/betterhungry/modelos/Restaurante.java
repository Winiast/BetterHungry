package br.com.betterhungry.modelos;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;

public class Restaurante {

    private String nomeFantasia;
    private String cnpj;
    private String senha;
    private String endereco;
    private LocalDate dataDeIngresso;

    public Restaurante(String nomeFantasia, String cnpj, String senha, String endereco) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.senha = senha;
        this.endereco = endereco;
        this.dataDeIngresso = LocalDate.now();
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeIngresso() {
        return dataDeIngresso;
    }

}
