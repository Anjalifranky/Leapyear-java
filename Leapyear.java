public class Leapyear {

    public static void main(String[] args) {
  
      // year to be checked
      int year = 2024;
      boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
  
      if (isLeap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
    }
  }
  