#include <SoftwareSerial.h> //시리얼 통신 라이브러리 호출
#include <stdlib.h>
#define MAX 3000
int vib = 5; // 진동값 핀
int count = 0; 
//char tmp[10] = {0};
char c = '\n'; 
char r = '\r';
int blueTx=2;   //Tx (보내는핀 설정)
int blueRx=3;   //Rx (받는핀 설정)
SoftwareSerial mySerial(blueTx, blueRx);  //시리얼 통신을 위한 객체선언
String myString=""; //받는 문자열
String str="";  // 시리얼 포트에서 받는 문자열
void setup() {
  pinMode(vib, INPUT); // 진동 센서
  Serial.begin(9600);   //시리얼모니터 
  mySerial.begin(9600); //블루투스 시리얼 개방
 
}
 
void loop() {
  //
  int sensing =TP_init(); 
  char tmp[10];
    itoa(sensing,tmp,10);
    mySerial.write(tmp);
    mySerial.write(c);
    delay(50); // 수신 문자열 끊김 방지
    //if(myChar == '\0') Serial.println(myString);
 
}
int TP_init(){
  delay(10);
  long measurement=pulseIn (vib, HIGH);
  if(measurement > MAX) count++;
  return count;
}

