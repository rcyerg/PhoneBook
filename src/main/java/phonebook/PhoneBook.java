package phonebook;
import java.util.*;

public class PhoneBook {

    //name : phoneNumber1, phoneNumber2
    //name: phoneNumber
    //Map to hold name and phoneNumbers
    //Key is String and values is arrayList of String

    private Map<String, List<String>> phoneRecord;

    public Map<String, List<String>> getPhoneRecord() {
        return phoneRecord;
    }

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord){
        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook
    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void addAll(String name, List<String> phoneNumbers){
        //add multiple phone numbers to the phonebook
        phoneRecord.put(name, phoneNumbers);
    }


    //Method to remove a person
    public void remove(String name){
        //remove a name from the phonebook
        phoneRecord.remove(name);
    }

    //HasEntry to check if entry exists
    public boolean hasEntry(String name){
        //Check if name exists in record and return true
        if(phoneRecord.containsKey(name)){
            return true;
        }
        return false;
    }


    //lookUP (Name) - return phone number(s)
    public List<String> lookup(String name){
        //return a list of phonenumbers belonging to the name
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers = phoneRecord.get(name);
        return phoneNumbers;
    }


    //reverseLookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber){



        //Takes a phoneNumber and returns the name attached to the number

        for(String name :  phoneRecord.keySet()){
            if (phoneRecord.get(name).contains(phoneNumber)){
                return name;
            }
        }



        return null;
    }

    //get all our contacts in the phonebook
    public List<String> getAllContactNames(){

        //Need a list or container to store the names
        //need to iterate through the map
        //add each name to the list container
        //return the container

        List<String> allContactNames = new ArrayList<>();

        allContactNames.addAll(phoneRecord.keySet());

        return allContactNames;
    }



}
