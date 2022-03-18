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
    private int intentos;

    public Guess() {
        setNumeroAdivinar();

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
        int x = random.nextInt(10);
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
        intentos += 1;
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
        intentos = 0;
        setNumeroAdivinar();
        setEstado("No adivinó");
    }



}