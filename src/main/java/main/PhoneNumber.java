package main;

/**
 * Phone number representation.
 */
public class PhoneNumber {
    String number;

    /**
     * Create phone number from given String.
     */
    public PhoneNumber(String number) {
        this.number = new String(number);
    }

    @Override
    public boolean equals(Object other) {
        PhoneNumber o = (PhoneNumber)other;
        return number.equals(o.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public String toString() {
        return number;
    }
}
