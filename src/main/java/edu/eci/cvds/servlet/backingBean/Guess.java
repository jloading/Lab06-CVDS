package edu.eci.cvds.servlet.backingBean;

public class Guess {
    private int numeroAdivinar;
    private int numeroIntentos;
    private int premioAcumulado;
    private String estado;

    public Guess() {
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public int getPremioAcumulado() {
        return premioAcumulado;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public void setPremioAcumulado(int premioAcumulado) {
        this.premioAcumulado = premioAcumulado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
