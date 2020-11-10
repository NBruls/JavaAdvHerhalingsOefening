package KnapzakProbleem.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCompareToTest {
    private Product p1 = new Product("p1", 30, 3000);

    @Test
    public void compareToShouldReturnCorrectValuesWhenComparingToObjects(){
        assertEquals(-1, p1.compareTo(new Product("p", 20, 2000)));
        assertEquals(1, p1.compareTo(new Product("p", 50, 5000)));
        assertEquals(0, p1.compareTo(new Product("p", 30, 3000)));
    }

}
