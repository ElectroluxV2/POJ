# Exercise 6
Utwórz typ enum o nazwie Sign, przyporządkuj mu następujące możliwe wartości:<br> 
•CONSONANT (tłumaczenie SPOLGLOSKA)<br>
•VOWEL (tłumaczenie SAMOGLOSKA)<br>
•SPACE (tłumaczenie SPACJA)<br>
•NUMBER (tłumaczenie LICZBA)<br>
Utwórz klasę StringTransformer z następującymi metodami statycznymi:<br>
a) removeSigns(String text, Sign sign):String – zwraca przesłany tekst pozbawiony wybranego rodzaju znaków<br>
b) replaceSigns(String text, Sign sign, String replacement):String – zwraca przesłany tekst z podmienionymi wybranymi znakami<br>
c) preserveSigns(String text, Sign sign):String – usuwa wszystkie znaki oprócz tych zdefiniowanych w argumencie <br>
    Wykonaj poniższy kod:<br>

```java
public static void main(final String[] args) {    System.out.println(">>> removeSigns");    System.out.println(removeSigns("123 Testo wanie", Sign.NUMBER));    System.out.println(removeSigns("123 Testo wanie", Sign.SPACE));    System.out.println(removeSigns("123 Testo wanie", Sign.VOWEL));    System.out.println(removeSigns("123 Testo wanie", Sign.CONSONANT));    System.out.println(">>> replaceSigns");    System.out.println(replaceSigns("123 Testo wanie", Sign.NUMBER, "#"));    System.out.println(replaceSigns("123 Testo wanie", Sign.SPACE, "#"));    System.out.println(replaceSigns("123 Testo wanie", Sign.VOWEL, "#"));    System.out.println(replaceSigns("123 Testo wanie", Sign.CONSONANT, "#"));    System.out.println(">>> preserveSigns");    System.out.println(preserveSigns("123 Testo wanie", Sign.NUMBER));    System.out.println(preserveSigns("123 Testo wanie", Sign.SPACE));    System.out.println(preserveSigns("123 Testo wanie", Sign.VOWEL));    System.out.println(preserveSigns("123 Testo wanie", Sign.CONSONANT));}
```


Oczekiwane rezultaty:<br>>> removeSigns <br>Testo wanie123Testowanie123 Tst wn123 eo aie>>> replaceSigns### Testo wanie123#Testo#wanie123 T#st# w#n##123 #e##o #a#ie>>> preserveSigns123eoaieTstwn

# Result
![Result](./img.png?raw=true)