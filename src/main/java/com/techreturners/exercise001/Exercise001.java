package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

import static java.lang.Character.toUpperCase;
import static java.lang.Math.round;

public class Exercise001 {
    public String capitalizeWord(String word) {
        char firstLetter = word.charAt(0);
        String restOfString = word.substring(1);
        return toUpperCase(firstLetter) + restOfString;
    }

    public String generateInitials(String firstName, String lastName) {
        char firstInitial = toUpperCase(firstName.charAt(0));
        char surnameInitial = toUpperCase(lastName.charAt(0));
        String initials = String.format("%c.%c", firstInitial, surnameInitial);
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {

        DecimalFormat df = new DecimalFormat("##.##");
        double totalWithVat = originalPrice + ((originalPrice / 100) * vatRate);
        return Double.parseDouble(df.format(totalWithVat));
    }

    public String reverse(String sentence) {
        StringBuilder reversedSentence = new StringBuilder(sentence);
        return reversedSentence.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream()
                .filter(user -> "Linux".equals(user.getType()))
                .count();
    }
}
