package arithmetic;

public enum Operation {
    PLUS {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(double a, double b) {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        }
    };

    public abstract double apply(double a, double b);

    public static Operation from(String token) {
        switch (token.trim().toLowerCase()) {
            case "plus": case "+":   return PLUS;
            case "minus": case "-":  return MINUS;
            case "times": case "*":  return TIMES;
            case "divide": case "/": return DIVIDE;
            default:
                throw new IllegalArgumentException("Invalid operation: " + token);
        }
    }
}
