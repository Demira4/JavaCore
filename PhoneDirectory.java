package Lesson4;

import java.util.HashMap;

public class PhoneDirectory {
    private HashMap<String, String> phoneDirectory;

    public PhoneDirectory() {
        this.phoneDirectory = new HashMap<>();
    }

    public void addCaller(String name, String phoneNumber) {
        phoneDirectory.put(name, phoneNumber);
    }


    public String getPhoneByFIO(String fio) {
        if (!phoneDirectory.containsValue(fio)) {
            return "Can't find phone number: " + fio;
        } else {
            String result = "Phone number " + fio + ": ";
            for (String key : phoneDirectory.keySet()) {
                if (phoneDirectory.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        }
    }


}
