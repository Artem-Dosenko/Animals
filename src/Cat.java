public class Cat extends Animal{
    public static final double METERS_RUN_LIM = 200;

    public Cat(double metersToRun){
        ++counter;
        run(metersToRun);
        swim(0);
    }

    @Override
    public void run(double meters){
        if(meters<METERS_RUN_LIM){
            System.out.println("Кіт пробіг " + meters + " метрів");
        }
        else{
            System.out.println("Кіт не може пробігти " + meters + " метрів");
        }
    }

    @Override
    public void swim(double meters){
        System.out.println("Кіт не вміє плавати");
    }
}
