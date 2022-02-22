/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Pombo;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author utmgu
 */
public class Pombo {
    private boolean posado=true;
    public void entrega() throws InterruptedException {
        Random r = new Random();
        System.out.println("vai");
        setPosado(false);
        sleep(r.nextInt(5000)+3000);
        setPosado(true);
    }

    /**
     * @return the posado
     */
    public boolean isPosado() {
        return posado;
    }

    /**
     * @param posado the posado to set
     */
    public void setPosado(boolean posado) {
        this.posado = posado;
    }
}
