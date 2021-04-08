# Exercise 7
Stwórz klasę Human posiadającą pola name i age.<br>
W klasie tej stwórz statyczne pole power o wartości “None”.<br>
Stwórz instancyjną metodę power() zwracającą wartość tego pola.<br>
Stwórz klasę SuperHuman dziedzicząca po klasie Human i zawierającą dodatkowe pole power.<br>
Nadpisz metodę power() tak by zwracała super moc super człowieka (pole power).<br>
Stwórz instancję Human przypisana do referencji ‘Human human’.<br>
Stwórz instancję SuperHuman przypisaną do innej referencji ‘Human superHuman’.<br>
Obie instancje powinny mieć te same wartości dostarczone dla pól name i age.<br>
Wydrukuj wynik porównań instancji (wyjaśnij dlaczego uzyskano takie a nie inne rezultaty):<br>
• human == superHuman <br>
• human.hashCode() == superHuman.hashCode() <br>
• human.equals(superHuman) <br>
• superHuman.equals(human) <br>
Nadpisz metody equals i hashCode z klasy bazowej Object w klasie Human oraz SuperHuman (w każdym przypadku wykonaj powyższe sprawdzenie i zinterpretuj wyniki).<br>
Czy jesteśmy w stanie zmienić implementację tak by więcej porównań zwróciło wartość true?

# Result
![Result](./img.png?raw=true)