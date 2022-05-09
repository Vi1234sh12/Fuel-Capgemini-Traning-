import java.io.FileInputStream;

class Demo {

static void div1()
{
    try {
    
     int a ;
     a = 10/0;
     
    }catch(ArithmeticException e)
    {
    System.out.println("Can not divide by zero ");
    }finally{
    System.out.println("Always Exexcuated ");
    }

}


static void div2()
{
try {

int a;
a = 10/2;
System.out.println(a);
}catch(ArithmeticException e){
System.out.println("Can not divide by zero ");
}finally{

System.out.println("Always Executed ");
}

}

static void div3()
{

try {

return ;
}catch(ArithmeticException e)
{
System.out.println("Can not divied by zero ");

}finally{
System.out.println("Always Executed ");

}
}


public static void main(String[] args){

div3();

}

}