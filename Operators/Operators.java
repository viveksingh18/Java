class Operators{
public static void main(String[] args){
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
//Unary Operator Example: ~ and !
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  

//Left Shift Operator
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  

//Right Shift Operator
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  

//Logical && vs Bitwise &
a=10;
b=5;
int e=20;
System.out.println(a<b&&a++<e);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<e);//false && true = false  
System.out.println(a);//11 because second condition is checked  

//Logical || and Bitwise |
System.out.println(a>b||a<e);//true || true = true  
System.out.println(a>b|a<e);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<e);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<e);//true | true = true  
System.out.println(a);//11 because second condition is checked  

//Ternary Operator
int min=(a<b)?a:b;  
System.out.println(min);  
    }
}