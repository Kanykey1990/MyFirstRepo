package javafaker;

import com.github.javafaker.Faker;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

public class Demo {
    protected static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateFakeArtistName());
        System.out.println(generateFakeAnimalName());
    }

    public static String generateFakeFirstName() {
        return "Hello my name is " + faker.name().firstName();

    }

    public static String generateFakeLastName() {
        return "My suname is " + faker.name().lastName();

    }
    public static String generateFakeEmailAddress(){
        return "My email is" + faker.internet().emailAddress();
    }
    public static String generateFakeArtistName(){
        return faker.artist().name();
    }
    public static String generateFakeAnimalName(){
        return faker.animal().name();
    }

}


