public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

         King k = new King();
         k.moves();
    }  
}
 interface Chessplayer {
    void moves();
 }

 class Queen implements Chessplayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal(in all  drins. ) ");
    }
 }

 class Rook implements Chessplayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right ");
    }
 }

 class King implements Chessplayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal(by 1 step.) ");
    }
 }