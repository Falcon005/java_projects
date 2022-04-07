
package ballandcart;

import java.util.ArrayList;
import java.util.Scanner;


public class BallAndCart {
    public static Cart cart = new Cart();
    
    public static void main(String[] args) {
        Ball b1 = new Ball("red",10);
        Ball b2 = new Ball("red",10);
        Ball b3 = new Ball("blue",20);
        Ball b4 = new Ball("yellow",30);
        Ball b5 = new Ball("red",10);
        
        
        cart.addBalls(b1);
        cart.addBalls(b2);
        cart.addBalls(b3);
        cart.addBalls(b4);
        cart.addBalls(b5);
        finalResult();
        
//        ArrayList<Ball> ballsInCart = cart.getBalls();
//        for(Ball b:ballsInCart){
//            System.out.println(b.getterColor());
//        }
    }
    
    public static void finalResult(){
        System.out.println("Choose  a color of ball in number: ");
        System.out.println("1: red\n2: blue\n3: yellow");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int countTheColor = 0;
        int sumOfMasses = 0;
        switch(number){
            case 1 ->{ 
                
                ArrayList<Ball> ballsInCart =cart.getBalls();
                for(Ball ball:ballsInCart){
                    sumOfMasses += ball.getterMass();
                 
                    if(ball.getterColor().equals("red")){
                        countTheColor += 1;
                    }
                }
                System.out.println("You chose the " + "red" + ". The number of "+"red" + " balls in cart is "+countTheColor);
                System.out.println("The mass of balls is " + sumOfMasses);
            }
            case 2 ->{ 
                ArrayList<Ball> ballsInCart =cart.getBalls();
                for(Ball ball:ballsInCart){
                    sumOfMasses += ball.getterMass();
                    
                    if(ball.getterColor().equals("blue")){
                        countTheColor += 1;
                    }
                }
                System.out.println("You chose the " + "blue" + ". The number of "+"blue" + " balls in cart is "+countTheColor);
                System.out.println("The mass of balls is " + sumOfMasses);
            }
            case 3 ->{ 
                
                ArrayList<Ball> ballsInCart =cart.getBalls();
                for(Ball ball:ballsInCart){
                    sumOfMasses += ball.getterMass();
                    
                    if(ball.getterColor().equals("yellow")){
                        countTheColor += 1;
                    }
                }
                System.out.println("You chose the " + "yellow" + ". The number of "+"yellow" + " balls in cart is "+countTheColor);
                System.out.println("The mass of balls is " + sumOfMasses);
            }
            
        }
    }
    
}
