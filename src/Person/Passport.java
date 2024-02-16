package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Passport {
    private String ownerPassport;
    private String dataBirthday;
    private String city;


    public Passport(String ownerPassport, String dataBirthday, String city) {
        this.ownerPassport = ownerPassport;
        this.dataBirthday = dataBirthday;
        this.city = city;


    }
    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "ownerPassport='" + ownerPassport + '\'' +
                ", dataBirthday='" + dataBirthday + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(ownerPassport, passport.ownerPassport) && Objects.equals(dataBirthday, passport.dataBirthday) && Objects.equals(city, passport.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerPassport, dataBirthday, city);
    }
}
