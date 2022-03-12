package com.company;

public class Boss {
    private int zdorovie;
    private int uron;
    private String zashita;

    public int getZdorovie() {
        return zdorovie;
    }

    public void setZdorovie(int zdorovie) {
        this.zdorovie = zdorovie;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }

    public String getZashita() {
        return zashita;
    }

    public void setZashita(String zashita) {
        this.zashita = zashita;
    }

    public void Boss() {

    }

    public void printInfo() {
        System.out.println(this.zdorovie + " " + this.uron + " " + this.zashita);
    }
}
