/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Pombo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utmgu
 */
public class Pessoa extends Thread {

    private QuadroMensagens qm;

    public void run() {
        System.out.println("ok");
        try {
            escreve();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void escreve() throws InterruptedException {
        System.out.println("escrevendo");
        Random r = new Random();
        sleep(r.nextInt(5000));
        getQm().adicionaMensagem(this);
    }

    /**
     * @return the qm
     */
    public QuadroMensagens getQm() {
        return qm;
    }

    /**
     * @param qm the qm to set
     */
    public void setQm(QuadroMensagens qm) {
        this.qm = qm;
    }
}
