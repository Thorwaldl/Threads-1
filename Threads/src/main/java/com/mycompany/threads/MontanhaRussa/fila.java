/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.MontanhaRussa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utmgu
 */
public class fila {

    private int nPessoas;
    private int cargaCarrinho = 5;
    private carrinho c;
    private static List<Pessoa> pessoa = new ArrayList();

    public void chegaPessoa(Pessoa p) throws InterruptedException {
        setnPessoas(getnPessoas() + 1);
        getPessoa().add(p);
        List<Pessoa> passageiros = new ArrayList();
        if (getnPessoas() >= getCargaCarrinho() && c.isEstacionado()) {
            System.out.println("entra");
            nPessoas = nPessoas - 5;
            for (int i = 0; i < cargaCarrinho; i++) {
                passageiros.add(pessoa.get(i));
            }
            c.viaja(passageiros);

        }
    }

    /**
     * @return the nPessoas
     */
    public int getnPessoas() {
        return nPessoas;
    }

    /**
     * @param nPessoas the nPessoas to set
     */
    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    /**
     * @return the cargaCarrinho
     */
    public int getCargaCarrinho() {
        return cargaCarrinho;
    }

    /**
     * @param cargaCarrinho the cargaCarrinho to set
     */
    public void setCargaCarrinho(int cargaCarrinho) {
        this.cargaCarrinho = cargaCarrinho;
    }

    /**
     * @return the c
     */
    public carrinho getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(carrinho c) {
        this.c = c;
    }

    /**
     * @return the pessoa
     */
    public static List<Pessoa> getPessoa() {
        return pessoa;
    }

    /**
     * @param aPessoa the pessoa to set
     */
    public static void setPessoa(List<Pessoa> aPessoa) {
        pessoa = aPessoa;
    }
}
