package ltan.junit_test.test;

import ltan.junit_test.junit.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int add = calculator.add(1, 2);
        /*
        System.out.println(add);
        通过输出很难看出程序是否准确
        通过Assertions类的方法可以判断(期望的结果，运算的结果)
         */
        Assertions.assertEquals(3, add);
    }
    @BeforeEach
    public void init(){
        System.out.println("init...");
    }

    @AfterEach
    public void close(){
        System.out.println("closing...");
    }
}
