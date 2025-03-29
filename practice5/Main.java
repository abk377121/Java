package practice5;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        public class Patron(){
            private String name;
            private int id;
            private item[] checkedOutItems = new item[10];
            private int count = 0;

            public Patron(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public void checkout(item item) {
                if (count < 10) {
                    checkedOutItems[count] = item;
                    count++;
                } else {
                    System.out.println("Cannot checkout more items.");
                }
            }

            public void returnItem(item item) {
                for (int i = 0; i < count; i++) {
                    if (checkedOutItems[i].equals(item)) {
                        checkedOutItems[i] = null;
                        count--;
                        break;
                    }
                }
            }

            public item[] getCheckedOutItems() {
                return checkedOutItems;
            }
        }
        book b = new book("B001", "The Great Gatsby", LocalDate.of(1925, 4, 10), "F. Scott Fitzgerald", 180);
        dvd d = new dvd("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
        cd c = new cd("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);
        
        Patron alice = new Patron("Alice", 1234);
        alice.checkout(b);
        alice.checkout(d);

        System.out.println("Alice's checked out items:");
        for (item item : alice.getCheckedOutItems()) {
            System.out.println(item.getTitle() + " by " + item.getId());
        }

        d.returnItem();
        System.out.println("After returning DVD:");
        for (item item : alice.getCheckedOutItems()) {
            System.out.println(item.getTitle() + " by " + item.getId());
        }
    }
}
