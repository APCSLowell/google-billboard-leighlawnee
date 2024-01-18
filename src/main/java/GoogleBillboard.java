public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
public void setup()  
{  
  for(int i = 2; i<e.length() - 10; i++){
String digits = e.substring(i,i+10);
double ddNum = Double.parseDouble(digits);
if(isPrime(ddNum) == true){
System.out.println(ddNum);  
break;
}
}
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

 
