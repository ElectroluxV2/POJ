# Exercise 5
Utwórz klasę Samochod o polach limitPredkosci, predkosc, kolor, marka, rocznik. Niech prędkość
będzie domyślnie równa 0 dla nowo utworzonego auta (nie trzeba jej podawać w konstruktorze).
Następnie:<br>
• nadpisz metodę .toString() tak, aby wyświetlić opis auta (np. „Czerwone BMW rocznik
2000”)<br>
• nadpisz metodę equals(), która zwróci true jeśli kolor, marka i rocznik będą takie same<br>
• utwórz metodę abstrakcyjną przyspiesz()<br>
• utwórz podklasę BMW rozszerzającą klasę Samochód. Limit prędkości dla BMW powinien
wynosić zawsze 200km/h<br>
• zaimplementuj ciało metody przyspiesz() - za każdym razem kiedy zostanie ona wywołana
BMW powinno przyspieszyć o 30km/h aż do limitu prędkości<br>
• przetestuj swoje rozwiązanie<br>

# Result
![Result](./img.png?raw=true)