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
public class Brinquedo {

    public static int n = 12;
    private static List<Pessoa> pessoa = new ArrayList();

    public static void main(String[] args) {
        carrinho c = new carrinho();
        fila f = new fila();
        f.setC(c);
        for (int i = 0; i < n; i++) {
            Pessoa p = new Pessoa();
            p.setF(f);
            pessoa.add(p);
        }
        for (int i = 0; i < n; i++) {
            new Thread(pessoa.get(i)).start();
            System.out.println("ko"+n);
        }

    }
}
