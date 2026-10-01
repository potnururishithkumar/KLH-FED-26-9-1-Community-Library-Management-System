public class Week5_CommunityLibrary {
  static boolean validMember(String id) { return id != null && id.matches("M\\d{3}"); }
  static boolean available(int copies) { return copies > 0; }
  public static void main(String[] args) {
    String member = "M101"; int copies = 2;
    System.out.println(validMember(member) && available(copies) ? "Loan approved for " + member : "Loan rejected.");
  }
}