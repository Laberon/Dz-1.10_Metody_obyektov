public class Main {
    public static void main(String[] args) {
        Book sharpObject = new Book("Sharp Object", 2007, new Author("Gillian", "Flynn"));
        Author gillian = new Author("Gillian", "Flynn");
        Book gulliver = new Book("Gulliver's Travels", 2009, new Author("Jonatan", "Swift"));
        Author jonatan = new Author("Jonatan", "Swift");
        System.out.println("sharpObject = " + sharpObject.getTitel()+", "+sharpObject.getPublishingYear()+", "+gillian.getAuthors());
        System.out.println("gullive = " + gulliver.getTitel() + ", " + gulliver.getPublishingYear() + ", " + jonatan.getAuthors());
        gulliver.setPublishingYear(2010);
        System.out.println("gulliver = " + gulliver.getPublishingYear());

        System.out.println(new Book("Атлант расправил плечи",1957,new Author("Роман Айн","Рэнд")));

        Book gulliver2 = new Book("Gulliver's Travels", 2009, new Author("Jonatan", "Swift"));
        System.out.println(gulliver.equals(gulliver2));
    }
}