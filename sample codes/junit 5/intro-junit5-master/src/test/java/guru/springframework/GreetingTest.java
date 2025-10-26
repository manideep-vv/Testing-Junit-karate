package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class GreetingTest {

    @Test
    void helloWorld() {
        Assertions.assertEquals(1,12,"both should be same");
    }
   static  Greeting greeting;
    @BeforeAll
    public static void init(){
        greeting=new Greeting();
    }
    @Test
    void testHelloWorld() {
        Assertions.assertThrows(RuntimeException.class,()->greeting.helloWorld("null"));
    }

    @Test
//    @EnabledIfSystemProperty(named = "java.specification.version",matches = "17")
    @EnabledIfEnvironmentVariable(named = "java.specification.version",matches = "18")
        void enabledIf() {
        System.out.println("i ran as condition got matched...");
    }
}