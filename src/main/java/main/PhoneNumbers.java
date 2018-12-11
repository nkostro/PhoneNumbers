package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Data Base for phone numbers of various people.
 */
public class PhoneNumbers {
    private Map<String, List<PhoneNumber>> dataBase;

    /**
     * Create and populate Data Base.
     */
    public PhoneNumbers() {
        dataBase = new HashMap<>();
        fillDataBase();
    }

    /**
     * Return list of phone numbers for given name.
     * @param name name of a person
     * @return list of phone numbers for given name
     */
    public List<PhoneNumber> getPhoneNumbers(String name) {
        return dataBase.get(name);
    }

    /**
     * Populate Data Base with predefined values.
     */
    private void fillDataBase() {
        List<PhoneNumber> numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 500"));
        numbers.add(new PhoneNumber("+8 800 200 600"));
        dataBase.put("Иванов И.И.", numbers);

        numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 700"));
        dataBase.put("Петров П.П.", numbers);

        numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 800"));
        numbers.add(new PhoneNumber("+8 800 2000 900"));
        numbers.add(new PhoneNumber("+8 800 2000 000"));
        dataBase.put("Сидоров С.С.", numbers);
    }

    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        PhoneNumbers phoneNumbers = new PhoneNumbers();

        List<PhoneNumber> numbers = phoneNumbers.getPhoneNumbers(name);
        if (numbers == null) {
            System.out.println("No phone numbers for \"" + name + "\" in Data Base");
        } else {
            int i = 0;
            for (PhoneNumber num : numbers) {
                System.out.println(++i + ". " + num);
            }
        }
    }
}
