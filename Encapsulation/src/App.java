public class App {
    public static void main(String[] args) throws Exception {
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaing health = " + player.healthRemaining());

        // damage = 11;
        // player.health = 200;
        // player.loseHealth(damage);
        // System.out.println("Remaing health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
