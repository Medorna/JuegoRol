import java.util.Random;

public class Player {
    public String nombre;
    public int hp = 100;
    public int atkPower;
    
    Random random = new Random();
     
    public int atacar(){
        
        this.atkPower = random.nextInt(10); 
        return this.atkPower;
    }
    
    public Player(String nombre, int hp, int atkPower){
        
        this.nombre = nombre;
        this.hp = hp;
        
    }
   
}