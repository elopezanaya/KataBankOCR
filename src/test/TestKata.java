package test;

import org.junit.Before;

import com.kata.BankOCR;


public class TestKata
{


BankOCR kata;

@Before
public void setup(){
  kata = new BankOCR();
  
}

final String ZERO_CHAIN=   " _  _  _  _  _  _  _  _  _ ";
final String ZERO_CHAIN_A= "| || || || || || || || || |";
final String ZERO_CHAIN_B= "|_||_||_||_||_||_||_||_||_|";


final String UNO_CHAIN=    "                           ";
final String UNO_CHAIN_A=  "  |  |  |  |  |  |  |  |  |";
final String UNO_CHAIN_B=  "  |  |  |  |  |  |  |  |  |";


final String  TWO_CHAIN =   " _  _  _  _  _  _  _  _  _ ";
final String  TWO_CHAIN_A=  " _| _| _| _| _| _| _| _| _|";
final String  TWO_CHAIN_B=  "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";


final String  THREE_CHAIN =     " _  _  _  _  _  _  _  _  _ ";
final String  THREE_CHAIN_A =   " _| _| _| _| _| _| _| _| _|";
final String  THREE_CHAIN_B =   " _| _| _| _| _| _| _| _| _|";
 
final String  FOUR_CHAIN =     "                           ";
final String  FOUR_CHAIN_A =   "|_||_||_||_||_||_||_||_||_|";
final String  FOUR_CHAIN_B =   "  |  |  |  |  |  |  |  |  |";
  
  
final String  FIVE_CHAIN =   " _  _  _  _  _  _  _  _  _ ";
final String  FIVE_CHAIN_A = "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
final String  FIVE_CHAIN_B = " _| _| _| _| _| _| _| _| _|";

final String  SIX_CHAIN =     " _  _  _  _  _  _  _  _  _ ";
final String  SIX_CHAIN_A =   "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
final String  SIX_CHAIN_B =   "|_||_||_||_||_||_||_||_||_|";



 final String  SEVEN_CHAIN =    " _  _  _  _  _  _  _  _  _ ";
 final String  SEVEN_CHAIN_A =  "  |  |  |  |  |  |  |  |  |";
 final String  SEVEN_CHAIN_B =  "  |  |  |  |  |  |  |  |  |";
  
  
final String  EIGTH_CHAIN =     " _  _  _  _  _  _  _  _  _ ";
final String  EIGTH_CHAIN_A =   "|_||_||_||_||_||_||_||_||_|";
final String  EIGTH_CHAIN_B =   "|_||_||_||_||_||_||_||_||_|";
                           
final String  NINE_CHAIN =     " _  _  _  _  _  _  _  _  _ ";
final String  NINE_CHAIN_A =   "|_||_||_||_||_||_||_||_||_|";
final String  NINE_CHAIN_B =   " _| _| _| _| _| _| _| _| _|";
 
final String  SERIE_CHAIN =     "    _  _     _  _  _  _  _ ";
final String  SERIE_CHAIN_A =   "  | _| _||_||_ |_   ||_||_|";
final String  SERIE_CHAIN_B =   "  ||_  _|  | _||_|  ||_| _|";                                                 
 /*
@Test
public void tesCaseStory1_ZERO(){
  kata = new Kata() ;
  assertEquals("000000000", kata.getChainOfDigits(ZERO_CHAIN,ZERO_CHAIN_A,ZERO_CHAIN_B));
  
}



@Test
public void tesCaseStory1_ONE(){
   kata = new Kata();
  assertEquals("111111111", kata.getChainOfDigits(UNO_CHAIN,UNO_CHAIN_A,UNO_CHAIN_B));
  
}

@Test
public void tesCaseStory1_TWO(){
   kata = new Kata(); 
assertEquals("222222222", kata.getChainOfDigits(TWO_CHAIN,TWO_CHAIN_A,TWO_CHAIN_B));
  
}

@Test
public void tesCaseStory1_THREE(){
   kata = new Kata();
  assertEquals("333333333", kata.getChainOfDigits(THREE_CHAIN,THREE_CHAIN_A,THREE_CHAIN_B));
  
}
@Test
public void tesCaseStory1_FOUR(){
   kata = new Kata();
  assertEquals("444444444", kata.getChainOfDigits(FOUR_CHAIN,FOUR_CHAIN_A,FOUR_CHAIN_B));
  
}
@Test
public void tesCaseStory1_FIVE(){
   kata = new Kata();
  assertEquals("555555555", kata.getChainOfDigits(FIVE_CHAIN,FIVE_CHAIN_A,FIVE_CHAIN_B));
  
}
@Test
public void tesCaseStory1_SIX(){
   kata = new Kata();
  assertEquals("666666666", kata.getChainOfDigits(SIX_CHAIN,SIX_CHAIN_A,SIX_CHAIN_B));
  
}
@Test
public void tesCaseStory1_SEVEN(){
   kata = new Kata();
  assertEquals("777777777", kata.getChainOfDigits(SEVEN_CHAIN,SEVEN_CHAIN_A,SEVEN_CHAIN_B));
  
}

@Test
public void tesCaseStory1_EIGTH(){
   kata = new Kata();
  assertEquals("888888888", kata.getChainOfDigits(EIGTH_CHAIN,EIGTH_CHAIN_A,EIGTH_CHAIN_B));
  
}

@Test
public void tesCaseStory1_NINE(){
   kata = new Kata();
  assertEquals("999999999", kata.getChainOfDigits(NINE_CHAIN,NINE_CHAIN_A,NINE_CHAIN_B));
  
}


@Test
public void tesCaseStory1_SERIE(){
   kata = new Kata();
  assertEquals("123456789", kata.getChainOfDigits(SERIE_CHAIN,SERIE_CHAIN_A,SERIE_CHAIN_B));
  
}
*/
}
