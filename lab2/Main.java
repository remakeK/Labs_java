public class Main {
    public static void main(String[] args) {
        Sword mySword = new Sword(5, 1);
        Bow myBow = new Bow(3, 2);
        myBow.attack();
        myBow.ultimate();
        System.out.println(mySword.getCost());
        System.out.println(mySword.getDamage());
        mySword.attack();
        mySword.ultimate();
        System.out.println(Sword.count);
    }
}

