package abhi.coding.solution.designpattern.singletondp;

public class RunningDesignPatternTest {
    public static void main(String[] args) {
        System.out.println("The hello world is working");
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                SingletonClass singletonClass=SingletonClass.getInstance();
                System.out.println("The thread one "+singletonClass);
            }
        };

        Thread threadtwo=new Thread(){
            @Override
            public void run() {
                super.run();
                SingletonClass singletonClass=SingletonClass.getInstance();
                System.out.println("The thread two "+singletonClass);
            }
        };
        thread.start();
        threadtwo.start();
    }
}
