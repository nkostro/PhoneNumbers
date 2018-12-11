package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

/**
 * Unit test for Phone numbers program.
 */
public class PhoneNumbersTest
{
    /**
     * Test with no phone numbers.
     */
    @Test
    public void noPhoneNumbers()
    {
        String name = "Васечкин В.В.";
        List<PhoneNumber> result = (new PhoneNumbers()).getPhoneNumbers(name);

        assertEquals(null, result);
    }

    /**
     * Test with one phone number.
     */
    @Test
    public void onePhoneNumber()
    {
        List<PhoneNumber> numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 700"));
        String name = "Петров П.П.";

        List<PhoneNumber> result = (new PhoneNumbers()).getPhoneNumbers(name);

        assertEquals(numbers, result);
    }

    /**
     * Test with two phone numbers.
     */
    @Test
    public void twoPhoneNumbers()
    {
        List<PhoneNumber> numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 500"));
        numbers.add(new PhoneNumber("+8 800 200 600"));
        String name = "Иванов И.И.";

        List<PhoneNumber> result = (new PhoneNumbers()).getPhoneNumbers(name);

        assertEquals(numbers, result);
    }

    /**
     * Test with three phone numbers.
     */
    @Test
    public void threePhoneNumbers()
    {
        List<PhoneNumber> numbers = new ArrayList<>();
        numbers.add(new PhoneNumber("+8 800 2000 800"));
        numbers.add(new PhoneNumber("+8 800 2000 900"));
        numbers.add(new PhoneNumber("+8 800 2000 000"));
        String name = "Сидоров С.С.";

        List<PhoneNumber> result = (new PhoneNumbers()).getPhoneNumbers(name);

        assertEquals(numbers, result);
    }
}
