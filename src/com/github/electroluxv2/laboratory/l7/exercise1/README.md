# Exercise 1
Utwórz klasę Person o polach: firstName, lastName, birthYear.<br>
W metodzie konstruktora sprawdź czy firstName bądź lastName jest przekazane jako pusty String – jeśli tak jest to zwróć wyjątek Excep^on.<br>
Sprawdź poprawność formatu birthYear (zwróć wyjątek jeśli dana ta jest niepoprawna).<br>
Dodaj klasę App, gdzie poprzez Scanner odpytujesz użytkownika o dane potrzebne do utworzenia obiektu a następnie ten obiekt tworzysz. Następnie:<br>
•Nadpisz metodę toString w klasie Person aby zwracała dane osoby<br>
•Dodaj obsługę wyjątku – poinformuj użytkownika gdy nie udało się utworzyć nowego obiektu, ze względu na błędne dane<br>
•Zapętl tworzenie użytkownika – dopóki nie zostanie utworzony poprawnie<br>
•W klasie Osoba utwórz metodę validatePersonalData(String firstName, String lastName, String birthYear): void która sprawdzi poprawność zadanych danych<br>
•Wywołaj metodę już w pierwszej linii konstruktora klasy Person•Niech metoda zwróci wyjątek wraz z odpowiednią wiadomością gdy:<br>
•Imię jest pustym stringiem -> „First name is incorrect! Given: {provided_value}”<br>
•Nazwisko jest pustym stringiem -> „Last name is incorrect! Given: {provided_value}”<br>
•Rok jest w niepoprawnym formacie -> “Birth year cannot be parsed to int! Given: {provided_value}”<br>
•Rok jest mniejszy od 1900 i większy od 2020 -> „Birth year is incorrect! Given: {provided_value}”<br>
•W bloku catch wyświetl otrzymany błąd

# Result
![Result](./img.png?raw=true)