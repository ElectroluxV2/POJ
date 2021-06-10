# Exercise 5
Przeanalizuj	przykłady	wykorzystania	wyrażeń	lambda	i	strumieni,	które	znajdują	się	w	poniższym
repozytorium:<br>
https://bitbucket.org/krzysztof-pawlowski/mpr-streams-examples/src<br>
Twoje	zadanie	będzie	polegało	na	pobraniu	kodu	z	repozytorium	https://bitbucket.org/krzysztofpawlowski/mpr-streams/src oraz	zaimplementowaniu	przy	użyciu	wyrażeń	lambda	i	strumieni
następujących	metod	z	klasy	UserService:<br>
```java 
public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users)
```
dającą	jako	wynik	listę	użytkowników,	którzy	w	obiekcie	personDetails mają	więcej	niż	jeden	adres,
```java
public static Person findOldestPerson(List<User> users)
```
dającą	jako	wynik	dane	użytkownika	(personDetails),	który	jest	najstarszy (pole	age w	klasie	Person),
```java
public static User findUserWithLongestUsername(List<User> users)
```
dającą	jako	wynik	użytkownika	o	najdłuższej	nazwie	użytkownika,
```java
public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users)
```
dającą	jako	wynik	napis	składający	się	z	imion	i	nazwisk	oddzielonych	przecinkiem	użytkowników,	którzy
mają	więcej	niż	18	lat (podpowiedź:	`````.collect(joining(","))`````),
```java
public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users)
```
dającą	jako	wynik	posortowaną	od	‘a’	do	‘z’		listę	nazw	uprawnień	użytkowników,	których	imię	zaczyna	się
na	literę	‘A’,
```java
public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users)
```
wypisującą	na	ekran	uprawnienia	użytkowników,	których	nazwisko	zaczyna	się	na	literę	‘S’,
```java
public static Map<Role, List<User>> groupUsersByRole(List<User> users)
```
dającą	jako	wynik	mapę,	gdzie	kluczem	jest	rola,	a	wartościami	lista	użytkowników,	którzy	mają	daną	rolę
przypisaną,
```java
public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users)
```
dającą	 jako	 wynik	mapę,	 gdzie	 kluczem	 jest	 wartość	 logiczna	 (true	 lub	 false),	 a	 wartością	 dla	 false	 lista
użytkowników	którzy	mają	mniej	niż	18	lat,	a	dla	 true	lista	użytkowników,	którzy	mają	18	lub	więcej lat
(podpowiedź:	```.collect(partitioningBy(…))```).
<br><br>Pamiętaj,	aby	napisać	testy	sprawdzające	poprawne	działanie	każdej	metody	(poza	metodą	wypisującą	na
ekran).

# Result
![Result](./img.png?raw=true)