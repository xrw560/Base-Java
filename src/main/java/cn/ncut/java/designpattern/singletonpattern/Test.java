package cn.ncut.java.designpattern.singletonpattern;

public class Test {

    public static class Abc {
        private Abc() {
        }
    }

    public class Cbd {
        public Cbd() {
            Abc n1, n2;
            n1 = new Abc();
            n2 = new Abc();
        }
    }

    public static void main(String[] args) {

        Abc n1, n2;
        n1 = new Abc();
    }
}
