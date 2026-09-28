public class Week6_CommunityLibrary {
  public static void main(String[] args) {
    String[] catalogue = {"Java Fundamentals", "Data Structures", "Clean Code"};
    System.out.println("Catalogue size: " + catalogue.length);
    for (String title : catalogue) System.out.println("Available: " + title);
  }
}