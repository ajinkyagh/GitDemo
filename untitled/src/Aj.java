class Car
{
    private String type=null;
    public Car()
    {
        this.type="Maruti";
    }
    public Car(String type)
    {
        this.type=type;
    }
    public static void main(String arg[])
    {
        Car car=new Car();
        car=new Car("Honda");
        System.out.print(car.type);
    }
}