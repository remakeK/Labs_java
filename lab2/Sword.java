class Sword extends Weapon{
    private final int cost;
    private int damage;
    static int count;
    Sword(int cost, int damage){
        this.cost = cost;
        this.damage = damage;
        count++;
    }
    int getCost(){
        return cost;
    }
    int getDamage(){
        return damage;
    }
    void setDamage(int damage){
        if(damage>=0) {
            this.damage = damage;
        }else{
            System.out.println("Unsupported damage value!");
        }
    }
    @Override
    void attack() {
        System.out.println("Your sharpness made the enemy bleed");
    }
    void ultimate(){
        System.out.println("Your sword is on fire right now!");
    }
}


