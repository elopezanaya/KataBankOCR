package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kata.CheckSum;

public class CheckSumTest

{

CheckSum checkSum;
@Before
public void setup(){
  
  checkSum= new CheckSum();
}

@Test
public void testCheckSum(){
  assertEquals(true,CheckSum.getChekSum("345882865"));
  
}


@Test
public void testCheckSum1(){
  assertEquals(true,CheckSum.getChekSum("777777177"));
  
}

@Test
public void testCheckSum2(){
  assertEquals(true,CheckSum.getChekSum("200800000"));
  
}

@Test
public void testCheckSum3(){
  assertEquals(true,CheckSum.getChekSum("333393333"));
  
}

@Test
public void testCheckSum4(){
  assertEquals(true,CheckSum.getChekSum("577777777"));
  
}


@Test
public void testCheckSum5(){
  assertEquals(true,CheckSum.getChekSum("577777777"));
  
}

@Test
public void testCheckSum6(){
  assertEquals(true,CheckSum.getChekSum("000000000"));
  
}
@Test
public void testCheckSum7(){
  assertEquals(true,CheckSum.getChekSum("903333333"));
  
}

//[90333]3333
@Test
public void testCheckSumCase4_EX1(){
 assertEquals(true,CheckSum.getAccurateAccountNumberWithValidCheckSum("111111111",0).size()>0);
  
}

@Test
public void testCheckSumCase4_EX2(){
 assertEquals(true,CheckSum.getAccurateAccountNumberWithValidCheckSum("777777777",0).size()>0);
  
}
@Test
public void testCheckSumCase4_EX3(){
 assertEquals(true,CheckSum.getAccurateAccountNumberWithValidCheckSum("200000000",0).size()>0);
  
}

@Test
public void testCheckSumCase4EX4(){
 assertEquals(true,CheckSum.getAccurateAccountNumberWithValidCheckSum("333333333",0).size()>0);
  
}
}
