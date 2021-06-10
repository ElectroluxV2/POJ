package com.github.electroluxv2.laboratory.l13.service;

import com.github.electroluxv2.laboratory.l13.domain.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class UserService {

    public static void main(String[] args) {
        var u1 = new User().setName("Sebastian").setPersonDetails(new Person().setSurname("Adores").setAge(12).setPhoneNumbers(List.of("713445345", "4353454354", "123123123")).setAddresses(List.of(new Address().setStreetName("U1").setCity("U1").setCountry("U1").setPostCode("U1").setFlatNumber(1).setHouseNumber(1), new Address().setStreetName("U1").setCity("U1").setCountry("U1").setPostCode("U1").setFlatNumber(1).setHouseNumber(1))));
        var u2 = new User().setName("Andrzej").setPersonDetails(new Person().setSurname("Judson").setAge(24).setPhoneNumbers(List.of("234234")).setAddresses(List.of(new Address().setStreetName("U2").setCity("U2").setCountry("U2").setPostCode("U2").setFlatNumber(2).setHouseNumber(2))));
        var u3 = new User().setName("Aniela").setPersonDetails(new Person().setSurname("Davids").setAge(34).setPhoneNumbers(List.of("345345435", "3453454353")).setAddresses(List.of(new Address().setStreetName("U3").setCity("U3").setCountry("U3").setPostCode("U3").setFlatNumber(3).setHouseNumber(3))));
        var u4 = new User().setName("Patrycja").setPersonDetails(new Person().setSurname("Asgard").setAge(56).setPhoneNumbers(List.of()).setAddresses(List.of(new Address().setStreetName("U4").setCity("U4").setCountry("U4").setPostCode("U4").setFlatNumber(4).setHouseNumber(4))));

        var users = List.of(u1, u2, u3, u4);
        System.out.printf("findUsersWhoHaveMoreThanOneAddress: %s%n", findUsersWhoHaveMoreThanOneAddress(users));
        System.out.printf("findOldestPerson: %s%n", findOldestPerson(users).getAge());
        System.out.printf("findUserWithLongestUsername: %s%n", findUserWithLongestUsername(users).getName());
        System.out.printf("getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18: %s%n", getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(users));
        System.out.printf("partitionUserByUnderAndOver18: %s%n", partitionUserByUnderAndOver18(users));
    }

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
            .filter(user -> user.getPersonDetails().getAddresses().size() > 1)
            .collect(Collectors.toList());
    }

    public static Person findOldestPerson(List<User> users) {
        return users.stream().map(User::getPersonDetails)
            .max(Comparator.comparing(Person::getAge))
            .orElse(null);
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream()
            .max(Comparator.comparing(user -> user.getName().length()))
            .orElse(null);
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        return users.stream()
            .filter(user -> user.getPersonDetails().getAge() > 18)
            .map(user -> "%s %s".formatted(user.getName(), user.getPersonDetails().getSurname()))
            .collect(Collectors.joining(","));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return users.stream()
            .filter(user -> user.getName().startsWith("A"))
            .map(User::getPersonDetails)
            .map(Person::getRole)
            .map(Role::getPermissions)
            .flatMap(Collection::stream)
            .map(Permission::getName)
            .sorted()
            .collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        users.stream()
            .map(User::getPersonDetails)
            .filter(personDetails -> personDetails.getSurname().startsWith("S"))
            .map(Person::getRole)
            .map(Role::getPermissions)
            .flatMap(Collection::stream)
            .map(Permission::getName)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream()
            .collect(Collectors.groupingBy(user -> user.getPersonDetails().getRole()));

    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream()
            .collect(Collectors.partitioningBy(user -> user.getPersonDetails().getAge() > 18));
    }
}