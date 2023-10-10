package pp.fighter;

import java.util.Random;

public class Player {
    private int hp, armor, damage;
    private String name, className;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
    }

    public static void setTankClass(Player player) {
        player.className = "Tank";
        addArmorTo(player);
        player.damage = 40;
    }

    public static void setWizardClass(Player player) {
        player.className = "Wizard";
        addArmorTo(player);
        player.damage = 50;
    }

    public static void setRogueClass(Player player) {
        player.className = "Rogue";
        addArmorTo(player);
        player.damage = 75;
    }

    public static void setWretchClass(Player player) {
        player.className = "Wretch";
        addArmorTo(player);
        player.damage = 25;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + className + ")" +
                "\nHP: " + hp +
                "\nArmor: " + armor +
                "\nDamage: " + damage;
    }

    public int getHp() {
        return Math.max(0, hp);
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    private static void addArmorTo(Player p) {
        switch (p.className) {
            case "Tank" -> p.armor = 100;
            case "Wizard" -> p.armor = 25;
            case "Rogue" -> p.armor = 50;
            default -> p.armor = 0;
        }
    }

    public void attack(Player rPlayer) {
        if (damage > rPlayer.armor) {
            int temp = rPlayer.armor % damage;
            rPlayer.armor -= temp;
            rPlayer.hp -= damage - temp;
        } else {
            rPlayer.armor %= damage;
        }
    }

    public void status() {
        if (hp <= 0) System.out.println(name + " DIED ");
        else System.out.println("Still Alive");
    }
}
