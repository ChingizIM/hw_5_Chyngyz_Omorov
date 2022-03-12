package com.company;

public class Heroes {
    private int zdorovie;
    private int uron;
    private String sposobnost;

    public Heroes(int i, int i1, String sposobnost) {
    }

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

    public String getSposobnost() {
        return sposobnost;
    }

    public void setSposobnost(String sposobnost) {
        this.sposobnost = sposobnost;
    }

    public Heroes() {

    }

    public Heroes(int zdorovie, int uron) {
        this.zdorovie = zdorovie;
        this.uron = uron;

    }

    public void printInfo() {
        System.out.println(this.zdorovie + " " + this.uron + " " + this.sposobnost);



    }
}
