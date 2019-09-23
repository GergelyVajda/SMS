/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author gergely.vajda
 */
public class SMSagy {
    private Integer ora;
    private Integer perc;
    private Integer telefonszam;
    private String uzenet;

    public void setOra(Integer ora) {
        this.ora = ora;
    }

    public void setPerc(Integer perc) {
        this.perc = perc;
    }

    public void setTelefonszam(Integer telefonszam) {
        this.telefonszam = telefonszam;
    }

    public void setUzenet(String uzenet) {
        this.uzenet = uzenet;
    }

    public Integer getOra() {
        return ora;
    }

    public Integer getPerc() {
        return perc;
    }

    public Integer getTelefonszam() {
        return telefonszam;
    }

    public String getUzenet() {
        return uzenet;
    }

    public SMSagy(Integer ora, Integer perc, Integer telefonszam, String uzenet) {
        this.ora = ora;
        this.perc = perc;
        this.telefonszam = telefonszam;
        this.uzenet = uzenet;
    }

    @Override
    public String toString() {
        return " " + ora + " " + perc + " " + telefonszam + " " + uzenet;
    }
}
