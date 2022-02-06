public class TextStatement extends Statement {
  public String TextValue(Customer aCustomer) {
    return super.value(aCustomer, "Rental Record for ", "\n", "\t", "\t", "\n", "Amount owed is ", "\n", "You earned ", " frequent renter points");
  }
}