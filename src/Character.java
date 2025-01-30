public class Character {
    private int health;
    private int stamina;
    private final int maxHealth = 100;
    private final int maxStamina = 50;

    public Character (){
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character created with "+ this.health +" health and "+ this.stamina +" stamina.");
    }

    protected void swingSword(){
        if(stamina > 0){
            this.stamina = this.stamina - 10;
            System.out.println("Character swings sword. Stamina is now "+ this.stamina +".");
        }else{
            System.out.println("Your character needs to cool down.");
            this.stamina = 0;
        }
    }

    protected void takeDamage(int damage){
        if(health > 0){
            this.health = this.health - damage;
            System.out.println("Character takes "+ damage + " damage. Health is now " + this.health + ".");
        }else{
            System.out.println("Character is dead.");
            this.health = 0;
        }
    }

    protected void rest(){
        this.health=this.maxHealth;
        this.stamina=this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character created with "+ this.health +" health and "+ this.stamina +" stamina.");
    }
}
