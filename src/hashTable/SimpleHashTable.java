package hashTable;

public class SimpleHashTable {


    private Employee[] hashTable;


    public SimpleHashTable() {

        hashTable = new Employee[10];


    }


    private int hashKey(String key) {


        return key.length() % hashTable.length;


    }


    public void put(String key, Employee emp) {

        int hashedKey = hashKey(key);


        if (occupied(hashedKey)) {


            int stopindex = hashedKey;

            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {

                hashedKey++;
            }

        }
        if (occupied(hashedKey)) {


            System.out.println("Sorry, there's is already an employee at position " + hashedKey);
        } else {


            hashTable[hashedKey] = emp;

        }


    }


    public Employee get(String key) {

        int hashedKey = hashKey(key);


        return hashTable[hashedKey];


    }


    public void printHashTable() {

        for (int i = 0; i < hashTable.length; i++) {

            System.out.println(hashTable[i]);

        }

    }


    private boolean occupied(int index) {


        return hashTable[index] != null;
    }


}
