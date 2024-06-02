package DZ_Seminar6.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private final String name;
    private final List<Long> phoneNumbers;

    public User(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(long phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(phoneNumbers, user.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumbers);
    }
}