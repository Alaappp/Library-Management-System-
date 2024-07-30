 // name Class + Methods Inheritance from Library Interfaca using (implements) KayWord and Methods from Test Class using (extends) KayWord
class Book  extends Test implements Library {
                     //  and concept polymorphism


    // Attributes The Class all type Encapsulation (public)
   public String title;
  public String author;
   public String pages;
   public boolean availability;

   // Methods to return value assignment in Class Main and store it as parameter than return store it
     // in variable through (this) KayWord
    public Book(String title, String author, String ISBN, boolean availability) {
        this.title = title ;
        this.author = author;
        this.pages = pages;
        this.availability = availability;
    }

     // Constructor to Create Object in Main Class to invoking Attributes and value assignment it
    public Book() {

    }
     // Methods Inheritance form Library Interface
     @Override
     public void displayBooK() {
         System.out.println("Available Book");
     }

     @Override
     void add() {
         System.out.println("The extra book");
     }
 }



