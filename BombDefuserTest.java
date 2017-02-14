package RedditProgChallenges;
import java.util.*;

public class BombDefuserTest {
    
    public static void main(String[] args){
        
        BombDefuser defuser = new BombDefuser();
        ArrayList<String> bomb1 = new ArrayList(Arrays.asList("white","white","red","white","orange","black","black","green","orange"));
        String k = defuser.defuseBomb(bomb1);
        System.out.println(k);
        
        defuser = new BombDefuser();
        ArrayList<String> bomb2 = new ArrayList(Arrays.asList("white","white","green","orange","green"));
        k = defuser.defuseBomb(bomb2);
        System.out.println(k);
        
        defuser = new BombDefuser();
        ArrayList<String> bomb3 = new ArrayList(Arrays.asList("white","black","black","black","black","green","orange"));
        k = defuser.defuseBomb(bomb3);
        System.out.println(k);
    }
    
}
