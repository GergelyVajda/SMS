/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gergely.vajda
 */
public class SMS {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMSeljaras eljaras=new SMSeljaras();
        try {
            eljaras.megnyito();
            eljaras.masodikFeladat();
        } catch (IOException ex) {
            System.out.println("Az eljárásban hiba!");
        }
    }
    
}
