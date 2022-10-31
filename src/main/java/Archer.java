public class Archer extends Hero{

  public Archer(String name, Integer health) {
    super(name, health);
  }

  @Override
  public void attackEnemy() {
    System.out.println("Archer is attacking enemy!");
  }

  @Override
  public void attackEnemy(Enemy enemy){
    System.out.println("Archer is attacking  " + enemy.getClass().getName());
    enemy.takeDamage(5);
  }

  public void shoot(Enemy enemy){
    System.out.println("Archer shot " + enemy.getClass().getName());
    enemy.takeDamage(15);
  }
}
