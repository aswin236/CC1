import java.util.scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int no = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter a string:");
    String text = scanner.nextLine();
    System.out.println("Enter a character:");
    char character=scanner.nextLine().charAt(0);
    System.out.println(no);
    System.out.println(text);
    System.out.println(character);
  }
}
    
