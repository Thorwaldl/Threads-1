/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Filosofos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utmgu
 */
public class Mesa {

    /**
     * @return the filosofos
     */
    public static List<Filosofo> getFilosofos() {
        return filosofos;
    }

    /**
     * @param aFilosofos the filosofos to set
     */
    public static void setFilosofos(List<Filosofo> aFilosofos) {
        filosofos = aFilosofos;
    }

    /**
     * @return the garfos
     */
    public static List<Garfo> getGarfos() {
        return garfos;
    }

    /**
     * @param aGarfos the garfos to set
     */
    public static void setGarfos(List<Garfo> aGarfos) {
        garfos = aGarfos;
    }
    
    private static List<Filosofo> filosofos = new ArrayList();
    private static List<Garfo> garfos = new ArrayList();
    private static int n = 3;
    
    public static void main(String[] args) {
        
        for (int i = 0; i < getN(); i++) {
            
            Filosofo f = new Filosofo();
            f.setNúmero(i);
            f.setFilosofos(filosofos);
            f.setGarfos(garfos);
            f.setN(n);
            Garfo g = new Garfo();
            g.setNumero(i);
            getFilosofos().add(f.getNúmero(), f);
            getGarfos().add(g.getNumero(), g);
        }
        for (int i = 0; i < getN(); i++) {
            new Thread(filosofos.get(i)).start();
            
        }
    }

    /**
     * @return the n
     */
    public static int getN() {
        return n;
    }

    /**
     * @param aN the n to set
     */
    public static void setN(int aN) {
        n = aN;
    }
}
