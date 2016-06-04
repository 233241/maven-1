package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created on 04.06.16.
 *
 * @author m
 */
@Component("eddie")
public class ClassA {
    @Autowired
    @Value("8")
    private int value;

    public int getValue() {
        return value;
    }
}
