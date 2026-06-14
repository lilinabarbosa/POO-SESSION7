public class Animal  { 
  private int  weight;
  private int  height; 
  private double  speed; 
  
  Animal() { 
    weight = 50; 
    height = 4; 
    speed = 2;  
  }

  Animal(int w, int h, int s ) { 
    this.weight = w; 
    this.height = h; 
    this.speed = s;
  }

  public double getTime(double miles) {  
    return miles/speed;
  }

  public int getWeight() { 
    return weight; 
  }

  public int getHeight() { 
    return height; 
  } 

  public double getSpeed() { 
    return speed; 
  }

}






