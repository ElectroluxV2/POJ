# Exercise 2
Stwórz klasę Player z polami:<br><br>
firstname ( String )<br>
lastname ( String )<br>
ranking ( Integer )<br>
maxSpeed ( Double )<br>
Utwórz odpowiedni konstruktor, metodę toString() oraz gettery i settery.<br><br>
W klasie Player zaimplementuj interfejs Comparable .<br> Zawodnicy powinni być domyślnie
sortowani według: nazwiska, imienia, rankingu.<br><br>
Stwórz klasę RankingComparator implementującą interfejs Comparator .<br> Klasa ta powinna
umożliwiać sortowanie obiektów Player według rankingu.<br><br>
Stwórz tablicę <br> Wypisz początkową listę zawodników,
posortowaną wg zaimplementowanego domyślnego sortowania i posortowaną wg rankingu.<br><br>
Pomocne klasy i metody:<br>
Comparator.comparing()<br>
Arrays.sort()

# Result
![Result](./img.png?raw=true)