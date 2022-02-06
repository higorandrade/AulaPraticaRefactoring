public class HtmlStatement extends Statement {
  public String HtmlValue(Customer aCustomer) {
    return super.value(aCustomer, "<H1>Rentals for <EM>", "</EM></H1><P>\n", "", ": ", "<BR>\n", "<P>You owe <EM>", "</EM><P>\n", "On this rental you earned <EM>", "</EM> frequent renter points<P>");
  }  
}