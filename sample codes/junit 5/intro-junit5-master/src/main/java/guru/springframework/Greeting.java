package guru.springframework;

/**
 * Created by jt on 10/10/18.
 */
public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        if(name== null){
            throw new RuntimeException("name can not be null");
        }
        return HELLO + " " + name;
    }
}
