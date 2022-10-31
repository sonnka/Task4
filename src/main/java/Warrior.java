public class Warrior extends Hero{


  public Warrior(String name, Integer health) {
    super(name, health);
  }

  @Override
  public void attackEnemy() {
    System.out.println("Warrior is attacking enemy!");
  }

  @Override
  public void attackEnemy(Enemy enemy){
    System.out.println("Warrior is attacking " + enemy.getClass().getName());
    enemy.takeDamage(15);
  }

  public void hitWithSword(Enemy enemy){
    System.out.println("Warrior is hit " + enemy.getClass().getName() + " with sword!");
    enemy.takeDamage(25);
  }
}
