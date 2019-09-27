/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gergely.vajda
 */
public class SMSeljaras {

    private List<SMSagy> memoria;

    public SMSeljaras() {
        this.memoria = new ArrayList<>();
    }

    public List<SMSagy> getMemoria() {
        return memoria;
    }

    public void megnyito() throws IOException {
        Integer hosszusag = 0;
        String egysor;
        String ketsor;
        String[] ideiglenes = new String[3];
        try {
            FileReader buta = new FileReader("sms.txt");
            BufferedReader okos = new BufferedReader(buta);
            hosszusag = Integer.parseInt(okos.readLine());
            for (int i = 0; i < hosszusag; i++) {
                egysor = okos.readLine();
                ketsor = okos.readLine();
                ideiglenes = egysor.split(" ");
                SMSagy agy = new SMSagy(Integer.parseInt(ideiglenes[0]), Integer.parseInt(ideiglenes[1]), Integer.parseInt(ideiglenes[2]), ketsor);
                memoria.add(agy);
            }
            buta.close();
        } catch (FileNotFoundException ex) {
            System.out.println("A file nem található!");
        }

    }

    public void masodikFeladat() {
        System.out.println("-Második feladat-");
        Integer legnagyobb = 0;
        Integer legnagyobbHely = 0;
        for (int i = 0; i < memoria.size(); i++) {
            if (memoria.get(i).getOra() * 60 + memoria.get(i).getPerc() > legnagyobb) {
                legnagyobb = memoria.get(i).getOra() * 60 + memoria.get(i).getPerc();
                legnagyobbHely = i;
            }
        }
        System.out.println(memoria.get(legnagyobbHely).getUzenet());
    }

    public void harmadikFeladat() {
        System.out.println("-Harmadik feladat-");
        Integer hosszusag = 0;
        Integer rovidseg = Integer.MAX_VALUE;
        Integer leghosszabbHely = 0;
        Integer legrovidebbHely = 0;
        for (int i = 0; i < memoria.size(); i++) {

            if (memoria.get(i).getUzenet().length() > hosszusag) {
                hosszusag = memoria.get(i).getUzenet().length();
                leghosszabbHely = i;
            }
        }
        for (int i = 0; i < memoria.size(); i++) {
            
            if (memoria.get(i).getUzenet().length() < rovidseg) {
                rovidseg = memoria.get(i).getUzenet().length();
                legrovidebbHely= i;
            }
        }
        System.out.println("Leghosszabb: ");
        System.out.println(memoria.get(leghosszabbHely).getOra()+" "+memoria.get(leghosszabbHely).getPerc()+" "+memoria.get(leghosszabbHely).getTelefonszam());
        System.out.println(memoria.get(leghosszabbHely).getUzenet());
        System.out.println("Legrövidebb: ");
        System.out.println(memoria.get(legrovidebbHely).getOra()+" "+memoria.get(legrovidebbHely).getPerc()+" "+memoria.get(legrovidebbHely).getTelefonszam());
        System.out.println(memoria.get(legrovidebbHely).getUzenet());
    }
    public void negyedikFeladat(){
        
        for (int i = 0; i < memoria.size(); i++) {
            if () {
                
            }
        }
    }

}
