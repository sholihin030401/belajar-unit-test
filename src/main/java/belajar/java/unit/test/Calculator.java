package belajar.java.unit.test;

public class Calculator {

    public Integer divide(Integer first, Integer second){
        if (second == 0){
            throw new IllegalArgumentException("can't divide by zero");
        } else {
            return first / second;
        }
    }

    public Integer add(Integer numFirst, Integer numSecond){
        return numFirst + numSecond;
    }
}
