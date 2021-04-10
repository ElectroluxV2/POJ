# Exercise  5
Stwórz klasy A, B, C, D, E. Klasa B dziedziczy po A, C po B, D po C, E po D. Każda z tych klas ma metodę present(final String phrase).<br>
Klasa A w metodzie present(final String phrase) ma drukować argument podany do metody.<br>
Z kolei każda z podklas (B,C,D,E) ma w swojej metodzie wywoływać metodę klasy nad nią. (Czyli gdy wywołamy metodę w E, to ma ona wywołać metodę w D, ona zaś w C, która wywoła w B, która wywoła w A, która w końcu wydrukuje co ma wydrukować).

# Result
![Result](./img.png?raw=true)