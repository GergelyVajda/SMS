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
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private void megnyito() throws IOException{
        Integer hosszusag=0;
        String egysor;
        String ketsor;
        String[] ideiglenes=new String[3];
        try {
            FileReader buta=new FileReader("sms.txt");
            BufferedReader okos= new BufferedReader(buta);
            hosszusag=Integer.parseInt(okos.readLine());
            for (int i = 0; i < hosszusag; i++) {
                egysor=okos.readLine();
                ketsor=okos.readLine();
                ideiglenes=egysor.split(" ");
                SMSagy agy=new SMSagy(i, i, hosszusag, ketsor);
                
            }
            buta.close();
        } catch (FileNotFoundException ex) {
            System.out.println("A file nem található!");
        }
    }
    
}
