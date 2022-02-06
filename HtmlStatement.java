import java.util.Enumeration;

public class HtmlStatement extends Statement {
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

  public String HtmlValue(Customer aCustomer) {
    return value(aCustomer, "<H1>Rentals for <EM>", "</EM></H1><P>\n", "", ": ", "<BR>\n", "<P>You owe <EM>", "</EM><P>\n", "On this rental you earned <EM>", "</EM> frequent renter points<P>");
  }  
}