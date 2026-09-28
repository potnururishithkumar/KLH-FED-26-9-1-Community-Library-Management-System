import java.util.Scanner;

public class Week2_CommunityLibrary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Book title: "); String title = input.nextLine().trim();
    System.out.print("Member name: "); String member = input.nextLine().trim();
    if (title.isEmpty() || member.isEmpty()) { System.out.println("Loan rejected: book and member are required."); return; }
    System.out.println("Loan receipt");
    System.out.println("Book: " + title);
    System.out.println("Member: " + member);
    System.out.println("Status: issued for 14 days");
  }
}