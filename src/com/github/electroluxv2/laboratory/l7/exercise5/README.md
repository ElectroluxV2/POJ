# Exercise 5
Utwórz klasę Local, która w konstruktorze przyjmuje 2 parametry typu String : name (nazwa lokalu) oraz address (adres z Google Maps) np.:<br>
•"Merapar Poland", "Arkońska 6, 80-387 Gdańsk"•"CityFit", "aleja Grunwaldzka 472d, 80-309 Gdańsk"<br>
•"Po Prostu Kwiaty", "Jana Kilińskiego 9/U2B, 80-452 Gdańsk"Zdefiniuj następujące pola klasy:<br>
•name:String<br>
•city:String<br>
•postalCode:String<br>
•street:String<br>
•houseNumber:String<br>
•localNumber:String<br>
<br>Za pomocą wyrażeń regularnych (wykorzystaj metodę split klasy String) uzupełnij pola b-f posługując się przesłanym adresem w konstruktorze klasy.<br>
Nadpisz metodę toString() tak aby zwracała następującą postać:<br>
{name}<br>
City: {city}<br>
PostalCode: {postalCode}<br>
Street: {street}<br>
House/Local: {houseNumber/localNumber}<br>
<br>
Oczekiwane rezultaty:<br>
<br>
Merapar Poland<br>
City: Gdańsk<br>
PostalCode: 80-387<br>
Street: Arkońska<br>
House/Local: 6<br><br>

CityFitCity: Gdańsk<br>
PostalCode: 80-309<br>
Street: aleja Grunwaldzka<br>
House/Local: 472d<br><br>

Po Prostu Kwiaty<br>
City: Gdańsk<br>
PostalCode: 80-452<br>
Street: Jana Kilińskiego<br>
House/Local: 9/U2B

# Result
![Result](./img.png?raw=true)