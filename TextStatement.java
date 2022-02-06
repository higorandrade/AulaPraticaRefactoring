import java.util.Enumeration;

public class TextStatement extends Statement {
  private String value(Customer aCustomer, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9) {
      Enumeration rentals = aCustomer.getRentals();
      String result = text1 + aCustomer.getName() + text2;
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += text3 + each.getMovie().getTitle()+ text4 +
         String.valueOf(each.getCharge()) + text5;
      }
      //add footer lines
      result += text6 + 
      String.valueOf(aCustomer.getTotalCharge()) + text7;
      result += text8 +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      text9;
      return result;
  }

  public String TextValue(Customer aCustomer) {
    return value(aCustomer, "Rental Record for ", "\n", "\t", "\t", "\n", "Amount owed is ", "\n", "You earned ", " frequent renter points");
  }
}