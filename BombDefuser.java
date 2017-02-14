package RedditProgChallenges;
import java.util.*;

public class BombDefuser {
    int state;
    
    public String defuseBomb(ArrayList<String> wires){
        
        if (wires.isEmpty()){
            return "Congratulations! You defused the bomb!";
        }
        
        String nextWire = wires.get(0);
        switch(state){
            
            case 0:
                if (nextWire.equals("red")){
                    state = 1;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("white")){
                    state = 2;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 1:
                if (nextWire.equals("red")){
                    state = 0;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("black")){
                    state = 4;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 2:
                if (nextWire.equals("white")){
                    state = 3;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("orange")){
                    state = 4;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 3:
                if (nextWire.equals("red")){
                    state = 0;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("black")){
                    state = 4;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 4:
                if (nextWire.equals("black")){
                    state = 4;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("green")){
                    state = 5;cutWire(wires);return(defuseBomb(wires));
                }
                if (nextWire.equals("orange")){
                    state = 6;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 5:
                if (nextWire.equals("orange")){
                    state = 7;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 6:
                if (nextWire.equals("green")){
                    state = 7;cutWire(wires);return(defuseBomb(wires));
                }
                else{
                    return bombExplosion();
                }
                
            case 7:
                return("Congratulations! You defused the bomb!");
        }
    return "Something wrong with the bomb";    
    }
    
    public String bombExplosion(){
        return "The bomb has exploded.";
    }
    
    public void cutWire(ArrayList<String> wires){
        wires.remove(0);
    }   
}
