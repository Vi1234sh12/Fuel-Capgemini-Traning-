/*

Design pattern 

*/

interface Car {

public void assemble();
}

class BasicCar implements Car {

@Override 
public void assemble()
{
System.out.print("Basic car ");

}

}

class CarDecorator implements car {
protected Car car;

public CarDecorator(Car c)
{
this.car = c ;
}

@Override
public void assemble()
{
this.car.assemble();
}

}


class SportsCar extends CarDecorator {
public SportsCar(Car c) {
   super(c);
}

@Override
public void assemble(){
super.assemble();
System.out.println("Adding Feature of Sports Car .");
}
}


class LuxuryCar extends CarDecorator {
public LuxuryCar(Car c)
{
super(c);
}

@Override
public void assemble()
{
super.assemble();
System.out.println("Adding Feature of Luxury car .");
}
}

class Demo {
public static void main(String[] args)
{

BasicCar c1 = new BasicCar();
SportsCar sport = new SportsCar(c1);
sport.assemble();

}
}