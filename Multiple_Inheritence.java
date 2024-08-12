// Multiple Inhertance can implement by the use of interfaces.

public class Multiple_Inheritence {
    public static void main(String[] args) {
        Goats g1 = new Goats();
        Lions l1 = new Lions();
        Bears b1 = new Bears();
        g1.definition();
        g1.eats();
        l1.eats();
        b1.eats();
        
    }
}

interface Herbivores {
    void definition();
    void eats();
}

interface Carnivores {
    void definition();
    void eats();
}


class Goats implements Herbivores{
    public void definition(){
        System.out.println("These animals eat plants as their primary food source. Examples include deer, goats, and zebras.");
    }

    public void eats() {
        System.out.println(" Goat eats grass.");
    }
}

class Lions implements Carnivores{
    public void definition(){
        System.out.println("These animals eat other animals, often the meat of herbivores. Examples include lions, tigers, and dogs.");
    }

    public void eats() {
        System.out.println(" lions eats Other Animals.");
    }
}

class Bears implements Herbivores,Carnivores{
    public void definition(){
        System.out.println("These animals eat both plants and animals, as well as insects. Examples include humans, bears, and crow.");
    }

    public void eats() {
        System.out.println(" Bears  eats Both plans and animals.");
    }
}


