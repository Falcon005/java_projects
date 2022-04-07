
package ballandcart;


public class Ball {
    private String color;
    private int mass;
    
    public Ball(){};
    public Ball(String color,int mass){
        this.color = color;
        this.mass = mass;
    }
    
    public void setterColor(String color){
        this.color = color;
    }
    public void setterMass(int mass){
        this.mass = mass;
    }
    public String getterColor(){
        return color;
    }
    public int getterMass(){
        return mass;
    }
}
