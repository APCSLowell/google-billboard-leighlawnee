public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
public void setup()  
{  
  String digits;
  for(int i = 0; i<e.length() - 12; i++){
digits = e.substring(2+i,12+i);
double ddNum = Double.parseDouble(digits);
if(isPrime(ddNum) == true){
System.out.println(ddNum);  
break;
}
}
}  
public void draw()  
{   
  //not needed for this assignment
}  
public boolean isPrime(double dNum)  
{   
  double num = dNum;
   if(num<2){
return false;
}else{
    for(int i = 2; i<=Math.sqrt(num); i++){
      if (num%i == 0){
       return false;
      }
    }
}
  return true;
}
