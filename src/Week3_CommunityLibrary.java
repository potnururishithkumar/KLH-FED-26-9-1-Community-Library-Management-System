import java.util.Scanner;
public class Week3_CommunityLibrary {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("1 Issue  2 Return  3 Search");
    System.out.print("Choose: "); int choice = in.nextInt();
    switch (choice) {
      case 1 -> System.out.println("Issue desk opened.");
      case 2 -> System.out.println("Return desk opened.");
      case 3 -> System.out.println("Catalogue search opened.");
      default -> System.out.println("Choose 1, 2 or 3.");
    }
  }
}