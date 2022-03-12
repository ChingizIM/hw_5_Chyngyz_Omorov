package com.company;

public class Main {


    public static void main(String args) {

        Heroes h1 = new Heroes();
        h1.setZdorovie(300);
        h1.setUron(50);
        h1.setSposobnost("letat");
        h1.printInfo();


        Heroes h2 = new Heroes(400, 30);
        {
            h2.printInfo();
        }

        Boss b = new Boss();
        b.setZdorovie(600);
        b.setUron(100);
        b.setZashita("Block");
        b.printInfo();

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getZdorovie() + " " +
                    createHeroes()[i].getUron() + " " + createHeroes()[i].getSposobnost());
        }
    }
    public static Heroes[] createHeroes() {
        Heroes chPauk = new Heroes(800,400);

        Heroes Thor = new Heroes(1000,800,"Molnia");

        Heroes Halk = new Heroes(1500,1400,"Besmertie");

        Heroes[]heroes = {chPauk, Thor, Halk};
        return heroes;
        }
    }









