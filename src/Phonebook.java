import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
    Directory directory = new Directory();
    directory.add("Ivanov", "8999123321");
    directory.add("Bobik", "8912155326");
    directory.add("Kokorin", "8917155552");
    directory.add("Kokorin", "8913455672");
    directory.add("Ivanov", "899999999");
    directory.add("Voitenko", "899111111");
    directory.add("Bobik", "89923231999");
    directory.add("Kokorin", "8324325234");
    System.out.println(directory.get("Kokorin"));
    System.out.println(directory.get("Voitenko"));
    System.out.println(directory.get("Ivanov"));
    }
}
class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;


    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
