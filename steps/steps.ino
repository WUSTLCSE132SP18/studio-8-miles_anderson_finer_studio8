#include <Wire.h>
#include <SFE_MMA8452Q.h>

MMA8452Q accel;

void setup(){
  Serial.begin(9600);
  accel.init();
}

void loop(){
  if(accel.available()){
    accel.read();
    Serial.print(accel.x, 3);
    Serial.print(",");
    Serial.print(accel.y, 3);
    Serial.print(",");
    Serial.print(accel.z, 3);
    Serial.println(",");
  }
}

