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
    public void masodikFeladat(){
        System.out.println("-Második feladat-");
        Integer legnagyobbOra=0;
        Integer legnagyobbPerc=0;
        for (int i = 0; i < memoria.size(); i++) {
                if (legnagyobbOra<memoria.get(i).getOra()) {
                legnagyobbOra=memoria.get(i).getOra();
            }
       }
        for (int i = 0; i < memoria.size(); i++) {
                if (legnagyobbPerc<memoria.get(i).getPerc()&&legnagyobbOra.equals(memoria.get(i).getOra())) {
                legnagyobbPerc=memoria.get(i).getPerc();
            }
       }
        for (int i = 0; i < memoria.size(); i++) {
            if (legnagyobbOra.equals(memoria.get(i).getOra())&&legnagyobbPerc.equals(memoria.get(i).getPerc())) {
                System.out.println(memoria.get(i).getUzenet());
            }
        }
    }
    public void harmadikFeladat(){
        System.out.println("-Harmadik feladat-");
        
    }

}
