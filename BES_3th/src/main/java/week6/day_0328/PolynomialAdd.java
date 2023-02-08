package week6.day_0328;

public class PolynomialAdd {

    public String solution(String polynomial) {
        String[] polynomialArray = polynomial.split(" ");

        int xValue = 0, constant = 0;
        for (String s: polynomialArray) {
            xValue += getXValue(s);
            constant += getConstant(s);
        }

        return formatString(xValue, constant);
    }

    private String formatString(final int xValue, final int constant) {
        if (xValue == 0) {
            return String.valueOf(constant);
        }

        if (xValue == 1) {
            if (constant == 0) {
                return "x";
            }
            return String.format("x + %d",constant);
        }
        if (constant == 0) {
            return String.format("%dx",xValue);
        }
        return String.format("%dx + %d", xValue, constant);
    }

    private int getConstant(String input) {
        if (!input.contains("x") && !input.contains("+")) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private int getXValue(String input) {
        int result = 0;

        if (input.contains("x")) {
            String number = input.replace("x", "");
            if ("".equals(number)) {
                return 1;
            }
            result = Integer.parseInt(number);
        }

        return result;
    }

}
