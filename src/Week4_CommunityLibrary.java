class Week4_CommunityLibrary {
  public static void main(String[] args) {
    int copiesAvailable = 0;
    int overdueDays = 3;
    if (copiesAvailable == 0) System.out.println("Reservation created: no copy is currently available.");
    if (overdueDays > 0) System.out.println("Return reminder: " + overdueDays + " day(s) overdue.");
  }
}