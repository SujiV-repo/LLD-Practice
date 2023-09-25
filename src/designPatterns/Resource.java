package designPatterns;

public class Resource {
    private static Resource instance = null;
    private Resource(){

    }

    //here we are using double checked locking to make the instance thread safe
    public static Resource getInstance(){
        if(instance == null){
            synchronized (Resource.class){
                if(instance == null){
                    instance = new Resource();
                }
            }
        }
        return instance;
    }
}
