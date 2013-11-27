## A Semi-Fibonacci-Zahlen (3 Punkte)

Schreiben Sie ein Programm namens `SFib`, das als Argument eine Zahl `n` entgegen nimmt und dann in einer Schleife Komma-separiert die ersten n Zahlen der Semi-Fibonacci Folge ausgibt.
Arbeiten Sie ohne Rekursion. Benutzen Sie ein Array als Gedächtnis. Die Semi-Fibonacci Folge wird folgendermaßen rekursiv definiert:

         {1                   falls n = 1
    f(n) {f(n / 2)            falls n gerade
         {f(n - 1) + f(n -2)  sonst

Sie finden sie auch in der On-Line Encyclopedia of Integer Sequences unter http://oeis.org/A030067.

## B Matrix-Operationen (7 Punkte)

Laden Sie sich die Klasse von unserer Homepage herunter und schreiben Sie sie entsprechend der Dokumentation fertig.
Ändern Sie nichts außer dem Inhalt der Methoden.
Verschiedene Erläuterungen zu den Matrix-Operationen finden Sie auf Wikipedia und im Anhang dieses Blattes.

## C Mehr Freunde (10 Punkte)

Dokumentieren Sie die Klassen aus der Friendbook-Aufgabe vom letztem Blatt mit JavaDoc-Kommentaren.

### C.1 Arrays und Schleifen

Erweitern Sie die `Friendbook`-Klasse.
Schreiben Sie sie so um, dass sie mit einem Array von `FriendbookEntries` arbeitet.
Das Array soll im Konstruktor mit einem festen Wert initialisiert werden.
Verwenden dafür eine Klassen-Konstante INITIAL_SIZE mit Wert 15.
Führen Sie außerdem ein Attribut ein, das den Füllstand des Arrays, also die Anzahl der Freunde, führt.
Verwenden Sie jetzt überall da, wo Sie in der Vergangenheit Code duplizieren mussten, Schleifen.
Schreiben Sie eine Methode `FriendbookEntry` `getFriend(int i)`, die den Eintrag an Stelle i zurückliefert, falls die Position gültig ist (sonst null).

### C.2 Hinzufügen

Definieren Sie weitere Klassenkonstanten: `GROW_FACTOR` mit Wert 2 und `MAX_SIZE` mit Wert 2 106.
Schreiben Sie eine Methode `FriendbookEntry` `addFriend(Author author)`, die einen neuen Eintrag im `Friendbook` erzeugt und zurückliefert.
Falls das Array voll ist, legen Sie ein neues um den Faktor `GROW_FACTOR` größeres Array an, und kopieren Sie die alten Referenzen hinein, bevor Sie den neuen Eintrag hinzufügen.
Falls Sie dabei die mit `MAX_SIZE` festgelegte maximale Größe überschreiten würden, runden Sie auf `MAX_SIZE` ab.
Falls Sie `MAX_SIZE` schon erreicht haben und keinen weiteren Eintrag mehr hinzufügen können, liefern Sie null zurück.

### C.3 Entfernen

Definieren Sie eine weitere Klassenkonstante `SHRINK_FACTOR` mit Wert 4.
Schreiben Sie eine Methode `removeFriend(FriendbookEntry friend)`, die eine Referenz entgegen nimmt, und diese aus der Liste entfernt.
Achten Sie darauf, dass keine Lücken entstehen, indem Sie diese sofort wieder ausfüllen.
Falls die Größe des Arrays `SHRINK_FACTOR` mal größer als sein Füllstand ist, legen Sie ein neues kleineres Array an, dessen Größe dem Produkt aus Füllstand und `GROW_FACTOR` entspricht, falls dieses größer als `INITIAL_SIZE` ist, das aber mindestens die Größe `INITIAL_SIZE` hat.

> Frage
> 
> In welchem Verhältnis müssen die oben verwendeten Konstanten zueinander stehen, damit Ihr Code Sinn macht?
> Wie reduzieren Sie die Wahrscheinlichkeit, dass Kollegen, die Ihren Code weiterentwickeln, sie nicht versehentlich falsch konfigurieren?

> Fibonacci
>
> Die zu berechnende Semi-Fibonacci Folge dient Mathematikern der Analyse von Eigenschaften der Fibonacci-Folge.
> Die Fibonacci-Folge ist nach Leonardo Fibonacci einem der bedeutendsten Mathematiker des Mittelalters benannt.
> Er benutzte diese Zahlenfolge um das Wachstum einer Kaninchenpopulation mathematisch zu modellieren.
> Die Zahlenfolge war auch schon den Menschen in der Antike bekannt. Viele Phänomene aus der Natur lassen sich mit ihr beschreiben.
> Interessanterweise nähert sich der Quotient zweier aufeinanderfolgender Fibonacci-Zahlen dem goldenen Schnitt an.
> Was ist das für eine Zahlenfolge?
> Sie beginnt mit zwei Einsen, und jede weitere Zahl ergibt sich aus der Summe der beiden vorhergehenden Zahlen.
> Mathematisch würde man sie so definieren:
> 
>     a0 = 1
>     a1 = 1
>     an = an-1 + an-2, für n > 2
>
> Die Fibonacci-Folge beginnt also so: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

> Matrixmultiplikation
> 
> Die Matrixmultiplikation ist eine Abbildung von zwei Matrizen A 2 Rm n und B 2 Rn o auf eine Matrix C 2 Rm o.
> Das heißt u.a. sie ist nur definiert, wenn die Spaltenzahl der Matrix A mit der Zeilenzahl der Matrix B übereinstimmt, andernfalls kann das Produkt nicht gebildet werden.
> Die Einträge ci;k der Matrix C berechnet man mit der Formel ci;k = =1 ai;j bj;k, also durch Bildung des Skalarprodukts aus i-ten Zeile von A mit der k-ten Spalte von B. j

> Matrixtransposition
> 
> Die Transposition ist eine unäre Matrixoperation, die Zeilen und Spalten vertauscht.
> D.h. zu jeder Matrix A 2 Rm n mit Elementen ai;j gibt es eine transponierte Matrix AT 2 Rn m mit Elementen aTi;j, und zwar so, dass aTk;l = al;k
