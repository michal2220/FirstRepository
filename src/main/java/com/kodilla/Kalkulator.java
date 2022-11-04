package com.kodilla;

public class Kalkulator {

    public static void main(String args[]) {

        Calculator calculator = new Calculator(1, 2);
        int adding = calculator.addAtoB();
        System.out.println(adding);
        int subtracting = calculator.subtractAfromB();
        System.out.println(subtracting);

    }
}

    class Calculator {

        public int a;
        public int b;

        public Calculator(int a, int b) {

            this.a = a;
            this.b = b;

        }

        public int addAtoB() {

            int sum = a + b;
            return sum;

        }

        public int subtractAfromB() {

            int subtract = this.b - this.a;
            return subtract;

        }
    }
