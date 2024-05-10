/** A class that represent database for library patrons */

public class LibarayDataBase {
    public static void main(String[] args) {

        Patron[] patrons = {
            new Patron("John Doe", 38504, "123 Main St", "Los Angles", "CA", "12345"),
            new Patron("Alice Smith", 12058, "456 Oak St", "New York", "NY", "54321"),
            new Patron("Bob Johnson", 83750, "789 Elm St", "San Jose", "CA", "98765"),
            new Patron("Emma Brown", 82857, "246 Pine St", "San Francisco", "CA", "13579"),
            new Patron("David Lee", 94702, "369 Cedar St", "Chicago", "OH", "24680"),
            new Patron("Sophia Wilson", 18371, "582 Maple St", "Houston", "IL", "97531"),
            new Patron("Michael Clark", 85649, "741 Birch St", "Phoenix", "GA", "86420"),
            new Patron("Olivia Taylor", 11111, "888 Willow St", "Philadephia", "WA", "77777"),
            new Patron("James Anderson", 17352, "999 Oak St", "Bigcity", "MI", "66666"),
            new Patron("Emily Thomas", 99999, "111 Pine St", "Village", "WI", "88888")
        };

        DataBase<Patron> libraryDataBase = new DataBase<>();

        // simulate adding patrons' data to database
        for (int index = 0; index < patrons.length; index++) {
            Patron patron = patrons[index];
            libraryDataBase.add(patron);
        }

        // simulate removing patrons' data from database
        while (!libraryDataBase.isEmpty()) {
            System.out.println(libraryDataBase.remove());
        }
    
    }
}

/** OUTPUT

Patron{name=Emily Thomas, libraryCardNumber=99999, streetAddress=111 Pine St, city=Village, state=WI, zip=88888}
Patron{name=James Anderson, libraryCardNumber=17352, streetAddress=999 Oak St, city=Bigcity, state=MI, zip=66666}
Patron{name=Olivia Taylor, libraryCardNumber=11111, streetAddress=888 Willow St, city=Philadephia, state=WA, zip=77777}
Patron{name=Michael Clark, libraryCardNumber=85649, streetAddress=741 Birch St, city=Phoenix, state=GA, zip=86420}
Patron{name=Sophia Wilson, libraryCardNumber=18371, streetAddress=582 Maple St, city=Houston, state=IL, zip=97531}
Patron{name=David Lee, libraryCardNumber=94702, streetAddress=369 Cedar St, city=Chicago, state=OH, zip=24680}
Patron{name=Emma Brown, libraryCardNumber=82857, streetAddress=246 Pine St, city=San Francisco, state=CA, zip=13579}
Patron{name=Bob Johnson, libraryCardNumber=83750, streetAddress=789 Elm St, city=San Jose, state=CA, zip=98765}
Patron{name=Alice Smith, libraryCardNumber=12058, streetAddress=456 Oak St, city=New York, state=NY, zip=54321}
Patron{name=John Doe, libraryCardNumber=38504, streetAddress=123 Main St, city=Los Angles, state=CA, zip=12345}
*/
