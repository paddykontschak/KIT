## A Java - Compiler und Interpreter (5 Punkte)

Im folgenden sollen Sie kurze Programmbeispiele auf ihrem Computer kompilieren und ausführen. Dabei kommt es manchmal zu Compiler- oder Laufzeitfehlern, oder einfach zu unerwartetem Verhalten. Beschreiben Sie das Problem, das Sie erkennen, und erklären Sie jeweils dessen Ursache und falls möglich wie Sie es beheben würden.

### A.1 One by one

    public class OneByOne {
      public static void main ( String [] args ) {
        String one = "1";
        System .out. println (one / 1);
      }
    }

### A.2 A Million Squared

    public class AMillionSquared {
      public static void main ( String [] args ) {
        int a = 1000000;
        int b = 1000000;
        int c = a * b;
        System .out. println (" 1000000 * 1000000 = " + c);
      }
    }

### A.3 Fragments of a Dozen

    public class FragmentsOfADozen {
      public static void main ( String [] args ) {
        int dozen = 12;
        int div = 12;
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div); System .out. println ( dozen + " % " + --div + " = " + dozen % div);
      }
    }

### A.4 Bytes You
    public class BytesYou {
      public static void main ( String [] args ) {
        byte a = 24;
        byte b = 7;
        byte c = a * b;
      }
    }

### A.5 To Be Precise ...
    public class ToBePrecise {
      public static void main ( String [] args ) {
        System .out. println (1 E300 * 1E20 == 1 / 0.0) ;
      }
    }
