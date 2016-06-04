package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created on 04.06.16.
 *
 * @author m
 */
@Component
public class ClassB {
    @Autowired
    private ClassA aValue;
    @Value("1")
    private int intValue;
    @Value("b -> string")
    private String stringValue;

    public ClassA getaValue() {
        return aValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
