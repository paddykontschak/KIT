Die [Abgabemodalitäten](https://github.com/paddykontschak/KIT/wiki/Abgabemodalit%C3%A4ten) beachten!
-----

## A Java - Compiler und Interpreter (5 Punkte)

Im folgenden sollen Sie kurze Programmbeispiele auf ihrem Computer kompilieren und ausführen.
Dabei kommt es manchmal zu Compiler- oder Laufzeitfehlern, oder einfach zu unerwartetem Verhalten.
Beschreiben Sie das Problem, das Sie erkennen, und erklären Sie jeweils dessen Ursache und falls möglich wie Sie es beheben würden.

### A.1 One by one

    public class OneByOne {
      public static void main (String [] args) {
        String one = "1";
        System .out. println (one / 1);
      }
    }

### A.2 A Million Squared

    public class AMillionSquared {
      public static void main (String [] args) {
        int a = 1000000;
        int b = 1000000;
        int c = a * b;
        System .out. println ("1000000 * 1000000 = " + c);
      }
    }

### A.3 Fragments of a Dozen

    public class FragmentsOfADozen {
      public static void main ( String [] args ) {
        int dozen = 12;
        int div = 12;
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
        System .out. println ( dozen + " % " + --div + " = " + dozen % div);
      }
    }

### A.4 Bytes You
    public class BytesYou {
      public static void main (String [] args) {
        byte a = 24;
        byte b = 7;
        byte c = a * b;
      }
    }

### A.5 To Be Precise ...
    public class ToBePrecise {
      public static void main (String [] args) {
        System .out. println (1 E300 * 1E20 == 1 / 0.0) ;
      }
    }

## B Java - API und Klassen (5 Punkte)

Eine Java - Installation geht einher mit der Installation einer umfangreichen Bibliothek von Klassen, die Ihnen eine umfassende Basisfunktionalität bereitstellt.

Die Klassen aus dem Paket java.lang sind in jedem Java - Programm automatisch vorhanden und benutzbar.
Verschaffen Sie sich einen Überblick über die Klassen auf der entsprechenden Seite der Java-API Dokumentation:
http://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html.

### B.1 Die Klasse `Circle`

Sehen Sie sich die Dokumentation der Klasse `Math` an.
Erweitern Sie die Klasse `RoundAndRound` aus dem Codebeispiel und berechnen Sie die verbleibenden Werte der Attribute der beiden Objekte `circle1` und `circle2`.
Benutzen Sie hierbei die Methode `Math.pow` und die Konstante `Math.PI`.
Geben Sie die Ergebnisse auf dem Bildschirm aus.

    class Circle {
        double radius;
        double diameter;
        double circumference;
        double area;
    }
    
    public class RoundAndRound {
        public static void main (String [] args) {
            Circle circle1 = new Circle ();
            circle1.radius = 5.1;
            
            // calculate the remaining attributes for circle1 here
            
            Circle circle2 = new Circle ();
            circle2.radius = 17.5;
            
            // calculate the remaining attributes for circle2 here
            
            System.out.println ("circle1.radius = " + circle1.radius );
            
            // add more output - commands here
        }
    }
    
### B.2 Die Klasse `Cone`

Fügen Sie der Datei RoundAndRound.java eine weitere Klasse hinzu.
Die Klasse heißt `Cone` und modelliert einen Kegel.
Fügen Sie dieser Klasse ein Attribut vom Typ `Circle` hinzu, welches die Grundfläche beschreibt.
Fügen Sie weitere Attribute hinzu für Höhe, Volumen und Oberfläche des Kegels.
Beachten Sie dabei, dass Ihr Programmcode auf Englisch verfasst sein muss.

Erstellen Sie in der `main`-Methode von RoundAndRound zwei neue Objekte vom Typ `Cone`.
Das Objekt `cone1` bekommt die Grundfläche `circle1` zugewiesen.
Das Objekt `cone2` bekommt die Grundfläche `circle2` zugewiesen.
Beide Objekte erhalten eine Höhe von 10:3.
Berechnen Sie die Werte der verbleibenden Attribute mithilfe von Methoden der Klasse `Math` und geben Sie die Ergebnisse auf dem Bildschirm aus.

------

### Note: 10/10
