# Exercise 1
Stwórz klasę MyList posiadającą prywatne pole przechowujące tablicę (array) o inicjalnej
wielkości 20 elementów.<br><br>

Klasa MyList powinna przyjmować typ przechowywanego obiektu jako parametr generyczny. Ten
sam typ generyczny powinna mieć utworzona wewnątrz tablica.<br><br>
Zaimplementuj metody:<br><br>
add(E element): boolean - dodaje kolejny element do listy, jeżeli lista jest pełna nie dodaje
elementu i zwraca false .<br><br>
size(): int - zwraca ilość elementów na liście.<br><br>
contains(E element): boolean – zwraca informacje czy element znajduje się wewnątrz listy.<br><br>
indexOf(E element): int – zwraca numer indeksu pierwszego wystąpienia wskazanego
elementu. W przypadku braku elementu zwraca -1.<br><br>
lastIndexOf(E element): int – zwraca numer indeksu ostatniego wystąpienia danego
elementu. W przypadku braku elementu zwraca -1.<br><br>
get(int index): E – zwraca element znajdujący się pod wskazanym indeksem. Jeżeli indeks
jest mniejszy od 0 lub większy od ilości elementów na liście, zwraca wyjątek
IndexOutOfBoundsException .<br><br>
set(int index, E element): void – podmienia element znajdujący się pod danym
indeksem. Jeśli indeks jest nieprawidłowy zwraca wyjątek IndexOutOfBoundsException .<br><br>
Wydziel logikę walidacji podanego indeksu do osobnej metody.<br><br>
Przetestuj rozwiązanie dla kilku typów ( Integer , String , ...).

# Result
![Result](./img.png?raw=true)