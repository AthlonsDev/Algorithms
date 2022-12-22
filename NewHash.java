    /**
     * Author: Andrea Sanna u1612023
     */

import java.util.Hashtable;

public class NewHash {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<String, String>();
        // Hashtable<Integer, String> Nature = new Hashtable<Integer, String>();
        NewHash nh = new NewHash();
        nh.addJournals(table, "THE JOURNAL OF MEDICINE AND SCIENCE", "Dr. R Srinivasan", "08.2022-52295319", "THE JOURNAL OF MEDICINE AND SCIENCE", "500");
        nh.addJournals(table, "Eureka Journals", "Dr. Madhuri Hooda", "07.2022-37579487", "Eureka Publications", "250");
        nh.addJournals(table, "Research Review", "Dr.Jignesh Tapariya", "01.2022-18311985", "Research Review", "650");
        nh.addJournals(table, "nternational Journal of Arts, Humanities and Social Studies", "Ayush Pandey", "01.2022-18311985", "Research Review", "650");
        nh.addJournals(table, "CONTEMPORARY SOCIAL SCIENCE", "Dharam Vir", "10.2021-97837216", "IJAHSS", "450");
    }

    public void addJournals(Hashtable table, String title, String authors, String DOI, String publisher, String copies) {
        // String[] journals = {"The Guardian", "The Telegraph", "National Geographic", "Nature", "Science"};
        table.put("Title", title);
        table.put("Authors", authors);
        table.put("DOI", DOI);
        table.put("Publisher", publisher);
        table.put("Copies Avaliable", copies);

        System.out.println(table);
    }
}
