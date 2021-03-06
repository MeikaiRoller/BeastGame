package com.codebind;

public class BeastCreator {

    public static void create() {



        App.beastIndex.add(null);
        /**Just some code to remember how to make a new beast**/
        BlueDragon blueDragon = new BlueDragon("Blue Dragon", "Water", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(blueDragon);

        /**Red Dragon making**/
        RedDragon redDragon = new RedDragon("Red Dragon", "Fire", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(redDragon);

        WhiteDragon whiteDragon = new WhiteDragon("White Dragon", "Ice", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(whiteDragon);

        Argos argos = new Argos("Argos", "Radiant", "Magical", "Deer", 200, 200, 70, 200, 70, 100, 250, 140);
        App.beastIndex.add(argos);

        Albion albion = new Albion("Albion", "Holy", "Magical", "Albion", 230, 220, 70, 230, 60, 90, 200, 160);
        App.beastIndex.add(albion);
        albion.moveList.add(App.globalMoveIndex.get(7));

        Elbergast elbergast = new Elbergast("Elbergast", "Dark", "Demonic", "Giant", 300, 100, 200, 50, 100, 100, 200, 180);
        App.beastIndex.add(elbergast);
        elbergast.moveList.add(App.globalMoveIndex.get(8));

        for (int i = 1; i < App.beastIndex.size(); i++) {

            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(1));
            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(2));
            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(3));
        }
    }

}
