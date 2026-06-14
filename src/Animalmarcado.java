 public class Animal { 
  int weight*; 
  int height*; 
  double speed*; 

  ------------------
  | Animal() {       |
  |  weight = 50;    |
  |  height = 4;     |
  |  speed = 2;      |
  | }                |
  +------------------+

    ---------------------------------------
  | Animal( △int w△, △int h△, △int s△ ) { |
  |  weight = w;                          |
  |  h = height;                          |
  |  speed = s;                           |
  | }                                     |
  ---------------------------------------

 ( public <u>double</u> getTime( △double miles△ ) ) {
   return miles/speed; 
  } 

 ( public <u>int</u> getWeight() ) { 
   return weight; 
  } 

 ( public <u>int</u> getHeight() ) { 
   return height; 
  } 

 ( public <u>double</u> getSpeed() ) { 
   return speed;
  }
}
