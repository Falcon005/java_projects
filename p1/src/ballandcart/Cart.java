
package ballandcart;

import java.util.ArrayList;


public class Cart {
    ArrayList<Ball> balls = new ArrayList<>();
    
    public void addBalls(Ball ball){
        balls.add(ball);
        
        
    }
    
    public ArrayList<Ball> getBalls(){
        return balls;
    }
}
