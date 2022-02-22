/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.MontanhaRussa;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utmgu
 */
public class Pessoa extends Thread{
    private fila f;
    public void run(){
        try {
            espera();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void espera() throws InterruptedException{
        Random r = new Random();
        System.out.println("z...z...z...");
        sleep(r.nextInt(10000));
        f.chegaPessoa(this);
    }

    /**
     * @return the f
     */
    public fila getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(fila f) {
        this.f = f;
    }
}
