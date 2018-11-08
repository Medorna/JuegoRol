
public class principal {
    
    public static void main(String[] args){
    
        /*Random aleatorio = new Random();
        int n = aleatorio.nextInt(8);
        String[] nombre = {"Matias", "pepe", "pepe2", "pepe3",
        "cacona", "raul","berto", "miranda", "tango"};
        String nombreRandom1 = nombre[aleatorio.nextInt(nombre.length)];
        String nombreRandom2 = nombre[aleatorio.nextInt(nombre.length)];
        p1.nombre= nombreRandom1;
        p2.nombre=nombreRandom2;*/
        
        Player h1 = new Player("Bot uno", 100, 0);
        Player h2 = new Player ("Bot dos", 100, 0);
        
        System.out.println(h1.nombre+" VS "+h2.nombre);
   
        for(int i = 1; h1.hp>0 && h2.hp>0;i++){
            
            System.out.println("Round " +i);
            System.out.println("----------------------------");
            
            h1.atacar();
            h2.atacar();
            
            System.out.println("Bot uno ataco por: "+h1.atkPower+" de daño.");
            System.out.println("Bot uno ataco por: "+h2.atkPower+" de daño.");
            
            h1.hp = h1.hp-h2.atkPower;
            h2.hp = h2.hp-h1.atkPower;
            
            System.out.println("Bot uno HP: "+h1.hp);
            System.out.println("Bot dos HP: "+h2.hp);
            
            }
        if(h1.hp<=0){System.out.println(h2.nombre+" Ganador!");}
        else{System.out.println(h1.nombre+" Ganador!");}
        }
    }

