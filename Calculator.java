public class Calculator { 


     public <T extends Number> double addition(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public <T extends Number> double subtraction(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }

    public <T extends Number> double multiplication(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public <T extends Number> double division(T x, T y) {
        return x.doubleValue() / y.doubleValue();
    }
}