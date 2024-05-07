package phonebook;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Jack", "302-499-3723");

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("302-992-1841");
        phoneNumbers.add("302-884-8134");

        phoneBook.addAll("Bill", phoneNumbers);

        phoneBook.add("Tom", "234-675-1461");


        phoneBook.remove("Tom");

        System.out.println("Contains Tom?");
        System.out.println("-------------");
        System.out.println(phoneBook.hasEntry("Tom") + "\n");


        System.out.println("Bill's numbers via lookup method:");
        System.out.println("---------------------------------");
        for (String s : phoneBook.lookup("Bill")){
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Reverse lookup number \"302-992-1841\" (Bill's)");
        System.out.println("-----------------------------------------------");
        System.out.println(phoneBook.reverseLookUp("302-992-1841") + "\n");

        System.out.println("Get all contact names");
        System.out.println("----------------------");
        for (String s : phoneBook.getAllContactNames()) {
            System.out.println(s);
        }
    }



}
