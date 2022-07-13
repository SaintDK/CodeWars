package kyu_7.Two_fighters_one_winner;

public class Kata {


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        for (int i=0;fighter1.name == firstAttacker;i++) {
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {return fighter1.name;}
                if (fighter1.health <= 0) {return fighter2.name;}
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter2.health <= 0) {return fighter1.name;}
                if (fighter1.health <= 0) {return fighter2.name;}

        }
        for (int i=0;fighter2.name == firstAttacker;i++) {
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            if (fighter1.health <= 0) {return fighter2.name;}
            if (fighter2.health <= 0) {return fighter1.name;}
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            if (fighter1.health <= 0) {return fighter2.name;}
            if (fighter2.health <= 0) {return fighter1.name;}

        }

        return "";
    }
}