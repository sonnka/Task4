public abstract class Hero {

  private String name;
  private Integer health;

  public Hero(String name, Integer health) {
    this.name = name;
    this.health = health;
  }

  public Integer getHealth() {
    return health;
  }

  public String getName() {
    return name;
  }

  public abstract void attackEnemy();

  public abstract void attackEnemy(Enemy enemy);

  public boolean isDead(){
    if (health < 0) {
      System.out.println("Hero is dead....");
      return true;
    }else{
      System.out.println("Hero is still alive....");
      return false;
    }
  }

  public void takeDamage(int power){
    health -= power;
    isDead();
  }
}
