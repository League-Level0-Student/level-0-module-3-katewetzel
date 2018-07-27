int X = 100;
int Y = 250;
int r = 400;
int z = 250;
int acceleration = 1;
void setup() {
  size(500,500);
}

void draw(){
  background(255,255,255);
  if(X<=250){
  for(int i=0;i<10;i++){
  noFill();
  ellipse(X++,Y,130,130);
    noFill();
  ellipse(X++,Y,10,10);
  ellipse(X++,Y,30,30);
  ellipse(X++,Y,50,50);
  ellipse(X++,Y,70,70);
  ellipse(X++,Y,90,90);
  ellipse(X++,Y,110,110);
  }
  } else if(X>=250){
  noFill();
  ellipse(X--,Y,130,130);
    noFill();
  ellipse(X--,Y,10,10);
  ellipse(X--,Y,30,30);
  ellipse(X--,Y,50,50);
  ellipse(X--,Y,70,70);
  ellipse(X--,Y,90,90);
  ellipse(X--,Y,110,110);
  }
  
  if(r>=250){
  for(int i=0;i<10;i++){
  noFill();
  ellipse(r--,Y,130,130);
    noFill();
  ellipse(r--,Y,10,10);
  ellipse(r--,Y,30,30);
  ellipse(r--,Y,50,50);
  ellipse(r--,Y,70,70);
  ellipse(r--,Y,90,90);
  ellipse(r--,Y,110,110);
  }
  } else if(r<=250){
  noFill();
  ellipse(r++,Y,130,130);
    noFill();
  ellipse(r++,Y,10,10);
  ellipse(r++,Y,30,30);
  ellipse(r++,Y,50,50);
  ellipse(r++,Y,70,70);
  ellipse(r++,Y,90,90);
  ellipse(r++,Y,110,110);
  }
}