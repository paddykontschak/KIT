## A (10 Punkte)

### A.1 Konstruktoren und Methoden

Im letzten Übungsblatt (in Teil B.1) haben Sie etwas umständlich die Attribute von je zwei Objekten der Klasse `Circle` errechnet und ausgegeben.
Kopieren Sie die Klasse `Circle` aus dem letzten Übungsblatt und speichern Sie sie in einer eigenen Datei.
Fügen Sie der Klasse Circle einen Konstruktor hinzu, der den Radius als Argument entgegen nimmt, und der sämtliche Attribute initialisiert.
Fügen Sie dieser Klasse weiterhin eine Methode hinzu, welche alle Attribute des Kreises auf der Konsole ausgibt.

Kopieren Sie die Klasse `Cone` aus dem letzten Übungsblatt und speichern Sie sie in einer eigenen Datei.
Fügen Sie der Klasse `Cone` zwei Konstruktoren hinzu, von denen der erste Radius und Höhe und er zweite ein `Circle`-Objekt und die Höhe entgegen nimmt.
Beide Konstruktoren initialisieren die Attribute der Klasse `Cone` vollständig.
Organisieren Sie die Konstruktoren so, dass ein Konstruktor den anderen benutzt.
Fügen Sie dieser Klasse weiterhin eine Methode hinzu, welche alle Attribute des Kegels auf der Konsole ausgibt.

Um nachträglich Werte aktualisieren zu können, erweitern Sie die Klasse `Circle` um die Methoden `setRadius` und `setDiameter` und die Klasse `Cone` um die Methoden `setRadius` und `setHeight`.
Beachten Sie dabei die Abhängigkeiten unter den Attributen und aktualisieren Sie sämtliche geänderten Attributwerte.

Schreiben Sie eine neue Klasse `RoundAndRound` mit einer `main`-Methode. Erstellen Sie dort drei Objekte der Klasse `Circle` und zwei Objekte der Klasse `Cone`.
Verwenden Sie dabei jeden Konstruktor und jede der `set`-Methoden mindestens einmal.
Geben Sie die Ergebnisse auf der Konsole aus.

> **Neues Werkzeug in der Kiste**
> 
> Welche Vorteile ergeben sich aus der Verwendung von Konstruktoren und `set`-Methoden? Schreiben Sie Ihre Antwort als Kommentar in die Datei `RoundAndRound.java`.

### A.2 Getter

Erstellen Sie eine neue Klasse `Circle2` auf Basis der Klasse `Circle` aus Teil A.1.
Löschen Sie alle Attribute außer `radius` und schreiben Sie dafür entsprechende `get`-Methoden (also z.B. `getDiameter`), die die entsprechenden Größen aus dem Radius direkt berechnen.
Ersetzen Sie alle verbleibenden Zugriffe auf die ehemals vorhandenen Attribute durch die neuen `get`-Methoden.
Konvertieren Sie auf analoge Weise die Klassen `Cone` und `RoundAndRound` zu `Cone2` und `RoundAndRound2`.

> **Getter und Setter**
>
> Vergleichen Sie die beiden Lösungen aus Teil A.1 und A.2. Was ist der Vorteil von Ansatz A.2? Schreiben Sie Ihre Antwort als Kommentar in die Datei `RoundAndRound2.java`.
