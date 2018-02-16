//void setup (){
//  size (1920,1024);
//  background(0,0,0);
//}
//void draw (){
//  ellipse(100,100,50,25);
//  ellipse(200,100,50,25);
//  ellipse(150,200,30,50);
//  fill(255,255,255);
//  rect(15,15,15,15);
//  triangle(100,200,300,400,500,600);
//}

PImage unicorn;
PImage rainbow;
void setup(){
  size (1638,626);
  unicorn = loadImage ("e9c8fbd5c3df3dd0d76a96697c364fb7 (1).jpg");
  rainbow = loadImage("rainbow.png");
}
void draw (){
  if(mousePressed){
    background(rainbow);
    image(unicorn,mouseX,mouseY);
  }
}