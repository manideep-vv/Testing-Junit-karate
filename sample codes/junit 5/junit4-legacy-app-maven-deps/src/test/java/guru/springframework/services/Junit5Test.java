package guru.springframework.services;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Test {
    @BeforeEach
    public void Junit5Test() {
        System.out.println("In junit 5 before each ");
    }


    @Test
    public void equals() {
        System.out.println("In junit 5 test method");
    }
}
