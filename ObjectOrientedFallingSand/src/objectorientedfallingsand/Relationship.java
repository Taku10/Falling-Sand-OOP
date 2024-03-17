
package objectorientedfallingsand;

/**
 *
 * @author tmadziwa
 */
public class Relationship {
    Particle firstParticle; 
    Particle secondParticle; 
    Particle newFirstParticle; 
    Particle newSecondParticle;
    
    public Relationship(Particle inFirstParticle, Particle inSecondParticle){
        firstParticle = inFirstParticle;
        secondParticle = inSecondParticle;
    }
    
    public Relationship(){
        firstParticle = newSecondParticle;
        secondParticle = newFirstParticle;
    }

    public Particle getFirstParticle() {
        return firstParticle;
    }

    public Particle getSecondParticle() {
        return secondParticle;
    }

    public Particle getNewFirstParticle() {
        return newFirstParticle;
    }

    public Particle getNewSecondParticle() {
        return newSecondParticle;
    }
    
    
    
    
    
    
    
    
}
