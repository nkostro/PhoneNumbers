package main;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PhoneNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        PhoneNumbers phoneNumbers = new PhoneNumbers();

        List<PhoneNumber> numbers = phoneNumbers.getPhoneNumbers(name);
        for (PhoneNumber num : numbers) {
            System.out.println(num);
        }
    }

    public List<PhoneNumber> getPhoneNumbers(String name) {
        List<PhoneNumber> numbers = new ArrayList<>();

        return numbers;
    }
}
