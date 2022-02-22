/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.MontanhaRussa;

import static java.lang.Thread.sleep;
import java.util.List;
import java.util.Random;

/**
 *
 * @author utmgu
 */
public class carrinho {
    private boolean estacionado=true;
    public void viaja(List<Pessoa> passageiros) throws InterruptedException{
        estacionado=false;
        Random r = new Random();
        sleep(5000+r.nextInt(1000));
        System.out.println("vrummm");
        esvazia(passageiros);
        estacionado=true;
    }
    
    public void esvazia(List<Pessoa> passageiros) throws InterruptedException{
                for (int i = 0; i < passageiros.size(); i++) {
                passageiros.get(i).espera();
                System.out.println("ebaaaa");
            }
    }
    
    

    /**
     * @return the estacionado
     */
    public boolean isEstacionado() {
        return estacionado;
    }

    /**
     * @param estacionado the estacionado to set
     */
    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
}
