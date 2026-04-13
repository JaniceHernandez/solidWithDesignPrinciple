public class TestProgram {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        NEU LIBRARY SYSTEM");
        System.out.println("======================================\n");

        Student student1 = new Student("Nadine Lustre");
        Student student2 = new Student("James Reid");

        LibraryResource book = new Book("Introduction to Java Programming");
        LibraryResource journal = new Journal("Artificial Intelligence Research Journal");
        LibraryResource thesis = new Thesis("Machine Learning for Data Science");
        LibraryResource newspaper = new NewsPaper("Today's Latest Technological Development");
        LibraryResource network = new Internet("NEULibrary000");

        student1.borrowResource(book);
        student1.borrowResource(journal);
        student2.borrowResource(thesis);
        student2.borrowResource(newspaper);
        student1.borrowResource(network);

        System.out.println("\n======================================");
        System.out.println("  Thank you for using NEU Library!");
        System.out.println("======================================");
    }

}