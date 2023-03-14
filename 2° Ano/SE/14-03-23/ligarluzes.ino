// C++ code
//
void setup()
{
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
}
int a=0;
int b=0;
int c=0;

void loop()
{ 
  
  for(a;a<=2;a++){
      //LED VERDE
      digitalWrite(13, HIGH);
      delay(100); // Wait for 1000 millisecond(s)   
      digitalWrite(13, LOW);
      delay(50); // Wait for 1000 millisecond(s)
  
      //LED AMARELO
      digitalWrite(12, HIGH);
      delay(100); // Wait for 1000 millisecond(s)
      digitalWrite(12, LOW);
      delay(50); // Wait for 1000 millisecond(s)
  
      //LED VERMELHO
      digitalWrite(11, HIGH);
      delay(100); // Wait for 1000 millisecond(s)
      digitalWrite(11, LOW);
      delay(50); // Wait for 1000 millisecond(s)
    }
  
  for(b; b<=2; b++){
      digitalWrite(11, HIGH);
      delay(100);
      digitalWrite(11, LOW);
      delay(50);
      
        digitalWrite(12, HIGH);
      delay(100);
      digitalWrite(12, LOW);
      delay(50);
        
        digitalWrite(13, HIGH);
      delay(100);
      digitalWrite(13, LOW);
      delay(50);
  }
  
  
  for(c ;c<=2; c++){
      digitalWrite(13, HIGH);
      digitalWrite(12, HIGH);
      digitalWrite(11, HIGH);
      delay(100);
      digitalWrite(13, LOW);
      digitalWrite(12, LOW);
      digitalWrite(11, LOW);
      delay(100);
  }
  
  
  
}