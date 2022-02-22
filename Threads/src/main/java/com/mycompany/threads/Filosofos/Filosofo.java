/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Filosofos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utmgu
 */
public class Filosofo extends Thread {

    /**
     * @return the número
     */
    public int getNúmero() {
        return número;
    }

    /**
     * @param número the número to set
     */
    public void setNúmero(int número) {
        this.número = número;
    }

    /**
     * @return the filosofos
     */
    public List<Filosofo> getFilosofos() {
        return filosofos;
    }

    /**
     * @param aFilosofos the filosofos to set
     */
    public void setFilosofos(List<Filosofo> aFilosofos) {
        filosofos = aFilosofos;
    }

    /**
     * @return the garfos
     */
    public List<Garfo> getGarfos() {
        return garfos;
    }

    /**
     * @param aGarfos the garfos to set
     */
    public void setGarfos(List<Garfo> aGarfos) {
        garfos = aGarfos;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    private static List<Filosofo> filosofos = new ArrayList();
    private static List<Garfo> garfos = new ArrayList();
    private int número;
    private int n;
    
    public void run(){
        System.out.println("ok1");
        try {
            pensa();
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void come() throws InterruptedException {
        Random r = new Random();
        System.out.println("fome"+número);
        pegaGarfo();
        System.out.println("garfos");
        sleep(r.nextInt(1000));
        largaGarfo();
        System.out.println("nham"+número);
        pensa();
        
    }

    public void pensa() throws InterruptedException {
        Random r = new Random();
        sleep(r.nextInt(1000));
        System.out.println("hummm....");
        come();
    }

    public void pegaGarfo() throws InterruptedException {
        if (número != 0) {
            if (!getGarfos().get(número).isOcupado() && !getGarfos().get(número - 1).isOcupado()) {
                getGarfos().get(número).setOcupado(true);
                getGarfos().get(número - 1).setOcupado(true);

            }else{
                pensa();
            }
        } else {
            if (!getGarfos().get(número).isOcupado()
                &&
                !getGarfos().get(n-1).isOcupado()) {
                getGarfos().get(número).setOcupado(true);
                getGarfos().get(número).setOcupado(true);
            }else{
                pensa();
            }
        }
    }

    public void largaGarfo() {
        if (número != 0) {
            getGarfos().get(número).setOcupado(false);
            getGarfos().get(número - 1).setOcupado(false);

        } else {
            getGarfos().get(número).setOcupado(false);
            getGarfos().get(n-1).setOcupado(false);
        }

    }

}
