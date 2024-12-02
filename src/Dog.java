public class Dog extends Animal{

    public static final double METERS_RUN_LIM = 500;
    public static final double METERS_SWIM_LIM = 10;

    public Dog(double metersToRun, double metersToSwim){
        ++counter;
        run(metersToRun);
        swim(metersToSwim);
    }

    @Override
    public void run(double meters){
        if(meters<METERS_RUN_LIM){
            System.out.println("Пес пробіг " + meters + " метрів");
        }
        else{
            System.out.println("Пес не може пробігти " + meters + " метрів");
        }
    }

    @Override
    public void swim(double meters){
        if(meters<METERS_SWIM_LIM){
            System.out.println("Пес проплив " + meters + " метрів");
        }
        else{
            System.out.println("Пес не може проплисти " + meters + " метрів");
        }
    }
}
