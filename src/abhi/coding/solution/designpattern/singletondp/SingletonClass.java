package abhi.coding.solution.designpattern.singletondp;

//The singleton pattern is a design pattern that restricts the instantiation of a class to one object.

public class SingletonClass {
    private static SingletonClass obj ;
    //private constructor to force use of
    //getInstance() to create Singleton object
    private SingletonClass(){

    }
    // Only one thread can execute this at a time
    public static  SingletonClass getInstance(){
        if (obj==null){
            //to make thread safe
            synchronized (SingletonClass.class){
                if (obj==null){
                    obj=new SingletonClass();
                }

            }

        }
        return obj;
    }
}
