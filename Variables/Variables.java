class Variables{  
public static void main(String[] args){  
int a=10;  
int b=10;  
int c=a+b;  
System.out.println(c);  

//Type casting
float f=10.5f; 
a=(int)f; 
System.out.println(f);  
System.out.println(a);  

//Overflow  
a=130;  
b=(byte)a;  
System.out.println(a);  
System.out.println(b);  
}}  