class Bow extends Weapon{
    int cost;
    int damage;
    Bow(int cost, int damage){
        this.cost = cost;
        this.damage = damage;
    }
    int getCost(){
        return cost;
    }
    int getDamage(){
        return damage;
    }
    void setDamage(int damage){
        if(damage>=0){
            this.damage = damage;
        } else{
            System.out.println("Unsupported damage value!");
        }
    }
    @Override
    void attack(){
        System.out.println("You shot him in the knee");
    }
    void ultimate(){
        System.out.println("Your bow is on lightning");
    }
}

