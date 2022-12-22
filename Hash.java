    /**
     * Author: Andrea Sanna u1612023
     */

import java.util.Hashtable;

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer, String> t = new Hashtable<Integer, String>();
        Hash hs = new Hash();

        hs.addStudents(t);
        
        System.out.println(hs.getStudent(t));
        // deletres on student from the hash table by their key - in the case the key is 4
        hs.deleteStudent(t, 4);
    }

    public void addStudents(Hashtable table) {
        // Add the students to the hash table using a for loop
        String[] students = {"Amaya", "Frankie", "Matthew", "Noah", "Xiao" , "Memhet", "Lorraine" , "Rhea", "Louie" , "Kristen"};
       for (int i = 0; i < students.length; i++) {
            table.put(i, students[i]);
       }
    }

    public Hashtable getStudent(Hashtable table) {
        return table;
    }

    public void deleteStudent(Hashtable table, int key) {
        if(table.containsKey(key)) {
            table.remove(key);
        }
        System.out.println(getStudent(table));
        table.keys();
    }

}
