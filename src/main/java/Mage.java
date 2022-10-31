public class Mage extends Hero {


  public Mage(String name, Integer health) {
    super(name, health);
  }

  @Override
  public void attackEnemy() {
    System.out.println("Mage is attacking enemy!");
  }

  @Override
  public void attackEnemy(Enemy enemy){
    System.out.println("Mage is attacking " + enemy.getClass().getName());
    enemy.takeDamage(20);
  }

  public void bewitch(Enemy enemy){
    System.out.println("Mage bewitched " + enemy.getClass().getName());
    enemy.takeDamage(30);
  }
}
