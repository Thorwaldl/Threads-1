/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Pombo;

/**
 *
 * @author utmgu
 */
public class QuadroMensagens {
    private int nMensagem;
    private Pombo p ;
    public void adicionaMensagem(Pessoa p) throws InterruptedException{
        setnMensagem(getnMensagem() + 1);
        if(getnMensagem()>=20&&getP().isPosado()){
            nMensagem=nMensagem-20;
            getP().entrega();
        }
        p.escreve();
    }

    /**
     * @return the nMensagem
     */
    public int getnMensagem() {
        return nMensagem;
    }

    /**
     * @param nMensagem the nMensagem to set
     */
    public void setnMensagem(int nMensagem) {
        this.nMensagem = nMensagem;
    }

    /**
     * @return the p
     */
    public Pombo getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Pombo p) {
        this.p = p;
    }
}
