import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        arrayValue(name(), surName());
    }


    public static void arrayValue(String[] nameArray, String[] surnameArray) {

        Person[] nameOneHundred = new Person[100];
        for (int i = 0; i < nameOneHundred.length; i++) {
            Person person = new Person(nameArray[(int) (Math.random() * 3)], surnameArray[(int) (Math.random() * 3)],
                    (int) (Math.random() * 80), (Math.random() * 80 + 40), (Math.random() * 1.5 + 1));
            nameOneHundred[i] = person;
        }
        System.out.println(Arrays.toString(nameOneHundred));

    }

    public static String[] name() {
        String[] nameArray = new String[3];
        nameArray[0] = "Maks";
        nameArray[1] = "Andre";
        nameArray[2] = "Aleks";

        return nameArray;
    }

    public static String[] surName() {

        String[] surnameArray = new String[3];
        surnameArray[0] = "Grod";
        surnameArray[1] = "Brog";
        surnameArray[2] = "Alalala";

        return surnameArray;

    }
}

