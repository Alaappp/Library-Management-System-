public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to The Management System" + "\n");

        // Create objects to Attributes value to Object one than Book Class
        Book b1 = new Book();
        b1.title = "Effective Java";
        b1.author = "Joshua Bloch";
        b1.pages = "800";
        b1.availability = true;
        b1.displayBooK();
        System.out.println( "\n" + "title: " + b1.title + "\n" + "author: " + b1.author + "\n"
                + "pages: " + b1.pages +  "\n" + "availability: " + b1.availability + "\n");

        // Create objects to Attributes value to Object Twe than Book Class
        Book b2 = new Book();
        b2.title = "The Complete : Java Reference";
        b2.author = "Herbert Schildt";
        b2.pages = "447";
        b2.availability = true ;
        b2.add();
        System.out.println( "\n" + "title: "  + b2.title +"\n" +"author: "  + b2.author + "\n"
        + "pages: " + b2.pages + "\n" + "availability: " + b2.availability );

        // Create objects to Attributes value to Object one than User Class
        System.out.println("\n" + "User 1" );
        User u1 = new User();
        u1.ID = 443 ;
        u1.FirstName = "Alaa" ;
        u1.LastName = "Al Shahrani";
        System.out.println("\n" + "ID: " + u1.ID + "\n" + "FirstName: " + u1.FirstName + "\n"
        +"LastName: " + u1.LastName);

        // Create objects to Attributes (Inheritance from User Class) value  to Object one than Student Class
        System.out.println( "\n" +"Student 1 :" );
        Student s1 = new Student();
        s1.ID = 441 ;
        s1.FirstName = "Shahad";
        s1.LastName = "Al Shahrani";
        System.out.println("\n" + "ID: " + s1.ID +"\n" + "FirstName: " + s1.FirstName + "\n"
        + "LastName: " + s1.LastName);

        //Polymorphism
        Library a1 = new Book();
        Library a2;
        a1 = new Book();
        a2 = new Test() {
            @Override
            void add() {

            }

            @Override
            public void displayBooK() {

            }
        };


    }


}