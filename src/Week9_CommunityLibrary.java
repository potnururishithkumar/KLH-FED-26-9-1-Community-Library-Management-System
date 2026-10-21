public class Week9_CommunityLibrary{
  static String key(String title) { return title.trim().toLowerCase().replaceAll("\\s+", " "); }
  public static void main(String[] args) { System.out.println("Search key: " + key("  Java   Fundamentals  ")); }
}
