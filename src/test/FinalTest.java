package test;



import org.junit.Before;
import org.junit.Test;

import com.kata.BankOCR;

import static org.junit.Assert.*;

public class FinalTest
{


String AMB_EX1= "  _  _  _  _  _  _  _  _  _ ";
String AMB_EX1_A="|_||_||_||_||_||_||_||_||_|";
String AMB_EX1_B="|_||_||_||_||_||_||_||_||_|";
                           
                           
String AMB_EX2=  " _  _  _  _  _  _  _  _  _ ";
String AMB_EX2_A="|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
String AMB_EX2_B=" _| _| _| _| _| _| _| _| _|";
                           
//=> 555555555 AMB ['555655555', '559555555']
String AMB_EX3=  " _  _  _  _  _  _  _  _  _ ";
String AMB_EX3_A="|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
String AMB_EX3_B="|_||_||_||_||_||_||_||_||_|";
                           
//=> 666666666 AMB ['666566666', '686666666']
String AMB_EX4=  " _  _  _  _  _  _  _  _  _ ";
String AMB_EX4_A="|_||_||_||_||_||_||_||_||_|";
String AMB_EX4_B=" _| _| _| _| _| _| _| _| _|";
                           
//=> 999999999 AMB ['899999999', '993999999', '999959999']
String AMB_EX5=  "    _  _  _  _  _  _     _ ";
String AMB_EX5_A="|_||_|| || ||_   |  |  ||_ ";
String AMB_EX5_B="  | _||_||_||_|  |  |  | _|";
                           
//=> 490067715 AMB ['490067115', '490067719', '490867715']
String AMB_EX6=  "    _  _     _  _  _  _  _ ";
String AMB_EX6_A=" _| _| _||_||_ |_   ||_||_|";
String AMB_EX6_B="  ||_  _|  | _||_|  ||_| _|";
                           
//=> 123456789
String AMB_EX7=  " _     _  _  _  _  _  _    ";
String AMB_EX7_A="| || || || || || || ||_   |";
String AMB_EX7_B="|_||_||_||_||_||_||_| _|  |";
                           
//=> 000000051
String AMB_EX8=  "    _  _  _  _  _  _     _ ";
String AMB_EX8_A="|_||_|| ||_||_   |  |  | _ ";
String AMB_EX8_B="  | _||_||_||_|  |  |  | _|";



//3  4  5  8  8  2  8  6  5
String AMB_EX9=  " _     _  _  _  _  _  _  _ ";
String AMB_EX9_A=" _||_||_ |_||_| _||_||_ |_ ";
String AMB_EX9_B=" _|  | _||_||_||_ |_||_| _|";

BankOCR kata;
@Before
public void setup(){
  kata = new BankOCR();
  
}



@Test
public void AMB_EX2(){
   kata = new BankOCR();
  assertEquals("555555555 AMB", kata.getChainOfDigits(AMB_EX2,AMB_EX2_A,AMB_EX2_B));
  
}
@Test
public void AMB_EX3(){
   kata = new BankOCR();
  assertEquals("666666666 AMB", kata.getChainOfDigits(AMB_EX3,AMB_EX3_A,AMB_EX3_B));
  
}
@Test
public void AMB_EX4(){
   kata = new BankOCR();
  assertEquals("999999999 AMB", kata.getChainOfDigits(AMB_EX4,AMB_EX4_A,AMB_EX4_B));
  
}
@Test
public void AMB_EX5(){
   kata = new BankOCR();
  assertEquals("490067715 AMB", kata.getChainOfDigits(AMB_EX5,AMB_EX5_A,AMB_EX5_B));
  
}
@Test
public void AMB_EX6(){
   kata = new BankOCR();
  assertEquals("?23456789 AMB", kata.getChainOfDigits(AMB_EX6,AMB_EX6_A,AMB_EX6_B));
  
}
@Test
public void AMB_EX7(){
   kata = new BankOCR();
  assertEquals("0?0000051 AMB", kata.getChainOfDigits(AMB_EX7,AMB_EX7_A,AMB_EX7_B));
  
}
@Test
public void AMB_EX8(){
   kata = new BankOCR();
  assertEquals("49086771? AMB", kata.getChainOfDigits(AMB_EX8,AMB_EX8_A,AMB_EX8_B));
  
}

@Test
public void AMB_EX9(){
   kata = new BankOCR();
  assertEquals("345882865", kata.getChainOfDigits(AMB_EX9,AMB_EX9_A,AMB_EX9_B));
  
}

}