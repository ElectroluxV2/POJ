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
public static void main(final String[] args) {
  System.out.println(">>> removeSigns");
  System.out.println(removeSigns("123 Testo wanie", Sign.NUMBER));
  System.out.println(removeSigns("123 Testo wanie", Sign.SPACE));
  System.out.println(removeSigns("123 Testo wanie", Sign.VOWEL));
  System.out.println(removeSigns("123 Testo wanie", Sign.CONSONANT));
  System.out.println(">>> replaceSigns");
  System.out.println(replaceSigns("123 Testo wanie", Sign.NUMBER, "#"));
  System.out.println(replaceSigns("123 Testo wanie", Sign.SPACE, "#"));
  System.out.println(replaceSigns("123 Testo wanie", Sign.VOWEL, "#"));
  System.out.println(replaceSigns("123 Testo wanie", Sign.CONSONANT, "#"));
  System.out.println(">>> preserveSigns");
  System.out.println(preserveSigns("123 Testo wanie", Sign.NUMBER));
  System.out.println(preserveSigns("123 Testo wanie", Sign.SPACE));
  System.out.println(preserveSigns("123 Testo wanie", Sign.VOWEL));
  System.out.println(preserveSigns("123 Testo wanie", Sign.CONSONANT));
}
```


Oczekiwane rezultaty:<br>
\>>> removeSigns <br>
Testo wanie<br>
123Testowanie<br>
123 Tst wn<br>
123 eo aie<br><br>
\>>> replaceSigns<br>
\### Testo wanie<br>
123#Testo#wanie<br>
123 T#st# w#n##<br>
123 #e##o #a#ie<br>
\>>> preserveSigns<br>
123eoaieTstwn

# Result
![Result](./img.png?raw=true)