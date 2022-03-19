package edu.eci.cvds.servlet.backingBean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Random;

@ManagedBean(name = "guessBean")
@ApplicationScoped

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

    public void setNumeroAdivinar() {
        Random random = new Random();
        int x = random.nextInt(11);
        this.numeroAdivinar = x;
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

    public void guess(int intento){

        numeroIntentos += 1;
        if(intento == numeroAdivinar){
            setEstado("Adivinó");
        }
        else{
            premioAcumulado -= 10000;
            setEstado("No adivinó");
        }
    }

    public void restart(){
        premioAcumulado = 100000;
        numeroIntentos = 0;
        setNumeroAdivinar();
        setEstado("No adivinó");
    }




}
