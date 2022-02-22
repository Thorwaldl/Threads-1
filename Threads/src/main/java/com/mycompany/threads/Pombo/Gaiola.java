/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.Pombo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utmgu
 */
public class Gaiola {

    public static int n = 15;
    private static List<Pessoa> pessoal = new ArrayList();

    public static void main(String[] args) {
        QuadroMensagens qm = new QuadroMensagens();
        Pombo pombo = new Pombo();
        qm.setP(pombo);
        //f.setC(c);
        for (int i = 0; i < n; i++) {
            Pessoa p = new Pessoa();
            p.setQm(qm);
            pessoal.add(p);
        }
        for (int i = 0; i < n; i++) {
            new Thread(pessoal.get(i)).start();
        }
    }
}
