class MagicStick extends Weapon{
    int damage;
    MagicStick(int damage){
        this.damage = damage;
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
        System.out.println("You casted fireball!");
    }
    void ultimate(){
        System.out.println("You casted tsunami!");
    }
}