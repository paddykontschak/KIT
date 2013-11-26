## B (Keine) Freunde (10 Punkte)

### B.1 Datenmodell

Im Folgenden bezeichnet jeder **fett** gedruckte Begriff eine Klasse, die Sie modellieren sollen.
Begriffe wie *hat* oder *enthält* beziehen sich auf Attribute der Klasse.

Erinnern Sie sich an diese Freundschaftsbücher, wie Sie zum Beispiel unter Grundschülern gerne benutzt werden?
Sehr gut!
Hier sollen Sie eines modellieren.
Ein **Freundschaftsbuch** *hat* einen Eigentümer und eine feste Zahl an (möglicherweise noch freien) **Einträgen**.
Wir entscheiden uns hier der Einfachheit halber für genau **fünf Einträge**.
Jeder **Eintrag** *hat* einen **Autor** und *enthält* einen Freitext mit besten Wünschen.
Ein **Autor** *hat* einen Namen, ein **Geburtsdatum** und ein Geschlecht.
Das **Geburtsdatum** *besteht aus* einem Tag, einem Monat und einem Jahr.
Außerdem *hat* ein **Autor** eine Reihe von **Vorlieben**.
Die **Vorlieben** *beinhalten* eine Farbe, eine Tierart, ein Buch, einen Film und ein Musikstück.

Erstellen Sie die Klassen `Friendbook`, `FriendbookEntry`, `Author`, `AuthorPreferences` und `Birthdate`.
Fügen Sie die oben beschriebenen Attribute an passender Stelle hinzu und überlegen Sie sich geeignete Datentypen.
Erstellen Sie für jede Klasse mindestens einen Konstruktor.
Modellieren Sie Farbe und Geschlecht als enum, wobei die Enumeration Farbe mindestens drei Werte umfassen soll.

> Nichts. Oder was?
> 
> Welche Möglichkeiten gibt es einen leeren Eintrag zu modellieren? Erklären Sie warum Sie sich für Ihren Weg entschieden haben und schreiben Sie die Antwort als Kommentar ins Programm.

### B.2 Aggregatsfunktionen

#### B.2.1 Beliebteste Farbe

Fügen Sie der Klasse `Friendbook` die Methode `getMostPopularColor()` hinzu, die die beliebteste Farbe zurückgibt.

> Schon wieder Nichts!
> 
> Was machen Sie, wenn es noch keine Einträge im Freundschaftsbuch gibt? Und was, wenn mehrere Farben gleich beliebt sind? Schreiben Sie auch hier Ihre Antwort als Kommentar ins Programm.

#### B.2.2 Frauenquote

Fügen Sie der Klasse `Friendbook` die Methode `getWomensQuota()` hinzu, die die Frauenquote in % zurückgibt, d.h. den Anteil der Einträge, die von Autorinnen erstellt wurden.

#### B.2.3 Wochentag bei der Geburt

Es gibt einen Algorithmus, der zu einem gegebenen Datum den Wochentag berechnet.
Implementieren Sie diesen Algorithmus (siehe unten) in einer Methode namens `getWeekday()` in `Birthdate`, die den Wochentag der Geburt zurückgibt.
Erstellen Sie für den Rückgabewert ein eigenes `enum` für die Wochentage.

Der Algorithmus erhält als Eingabe drei Zahlen *d*, *m* und *y*.
Dabei steht *d*∈{1...31} für den Tag, *m*∈{1...12} für den Monat und *y* für das Jahr.
Dann werden folgende Berechnungsschritte durchgeführt:

    y0 = y - (14 - m) / 12
    x = y0 - y0 / 4 - y0 / 100 + y0 / 400
    m0 = m + 12 x ((14 - m) / 12) - 2
    d0 = (d + x + (31 x m0) / 12) % 7

Das Ergebnis ergibt sich dann aus dem Wert von *d0*∈{0...6}, wobei die 0 für Sonntag steht, die 1 für Montag, usw. bis zur 6, welche für Samstag steht.

Testen Sie Ihre Implementierung, indem Sie der Klasse `Birthdate` eine `main`-Methode hinzufügen, die für zwei von Ihnen frei gewählte Geburtstage den Wochentag berechnet und in Textdarstellung ausgibt.
