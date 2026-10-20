
public class Person {
    String name;
    Address address;     // a field that holds a reference to another object

    public static void main(String[] args) {
        // Person WITH an address
        Person p = new Person();
        p.name = "Tariro";
        p.address = new Address();
        p.address.city = "Harare";
        System.out.println(p.name + " lives in " + p.address.city);

        // Person WITHOUT an address (address stays null)
        Person q = new Person();
        q.name = "Farai";

        // Safe version: check for null first
        if (q.address != null) {
            System.out.println(q.name + " lives in " + q.address.city);
        } else {
            System.out.println(q.name + " has no address");
        }

        q.address = new Address();
        q.address.city = "Bulawayo";
        System.out.println(q.address.city);
    }
}