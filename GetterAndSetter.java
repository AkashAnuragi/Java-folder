public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();         // Created a pen object called p1.
        p1.SetColor("Orange");
        System.out.println(p1.GetColor());
        p1.SetTip(7);
        System.out.println(p1.GetTip());
        // p1.SetColor("Pink");
        p1.SetColor("Black"); 
        System.out.println(p1.GetColor());

        
    }
    
}

class Pen {
   private String color;
   private int tip;
    
    String GetColor(){
        return this.color;
    }

    int GetTip(){
        return this.tip;
    }

    void SetColor( String color) {
        this.color = color;
    }

    void SetTip(int tip) {
        this.tip = tip;
    }
}

