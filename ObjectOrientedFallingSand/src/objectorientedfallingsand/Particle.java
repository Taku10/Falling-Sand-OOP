package objectorientedfallingsand;

import java.awt.Color;
import java.util.ArrayList;


public class Particle
{
    // Fields go here.
    private String name;
    private Color  color;
    private ArrayList<Movement> movements;
   
    
    // Constructor(s) go here.
    public Particle(){
        name = "particle";
        color = Color.RED;
        movements = new ArrayList<>();
    }
    
   

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    // Methods go here.
    public String getName()
    {
        return name;
    }

    public void setMovements(ArrayList<Movement> movements) {
        this.movements = movements;
    }

    public ArrayList<Movement> getMovements() {
        return movements;
    }
    
    
    
    /**
     * method is a copy of the Particle object
     * @return - a new Particle object
     */
     public Particle clone(){
        Particle cloneParticle = new Particle();
        
        cloneParticle.setName(name);
        cloneParticle.setColor(color);
        cloneParticle.setMovements(movements);
        
        return cloneParticle;
        
    }
     
     public void addMovement(Movement movement){
         movements.add(movement);
     }
     
     public boolean isMoveable(){
         return !movements.isEmpty();
     } 
     
     public Movement getRandomMovement(){
         
         if(movements.isEmpty()){
             Movement setZero = new Movement(0,0);
             
             return setZero;
         } else{
              int randomDir = (int) (Math.random() * movements.size());
              return movements.get(randomDir);
              
         }
     } 
}
