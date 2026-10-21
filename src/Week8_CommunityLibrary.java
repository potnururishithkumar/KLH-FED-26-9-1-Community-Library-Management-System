public class Week8_CommunityLibrary {
  static void issue(int copies) { if (copies < 1) throw new IllegalStateException("No copies available"); System.out.println("Issue completed."); }
  public static void main(String[] args) { try { issue(0); } catch (IllegalStateException error) { System.out.println("Handled: " + error.getMessage()); } }
}