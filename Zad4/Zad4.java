
public class Zad4 {

	public static void main(String[] args) 
	{
		Invoice invoice = new Invoice();
		invoice.addInvoiceItem(new InvoiceItem(invoice.getInvoiceItemsCount() + 1, "Produkt1", 5, 4.50));
		invoice.addInvoiceItem(new InvoiceItem(invoice.getInvoiceItemsCount() + 1, "Produkt2", 2, 454.59));
		invoice.addInvoiceItem(new InvoiceItem(invoice.getInvoiceItemsCount() + 1, "Produkt3", 10, 18.45));
		
		System.out.println("Ilo�� pozycji: " + invoice.getInvoiceSize());
		System.out.println("Ilo�� produkt�w: " + invoice.getInvoiceItemsCount());
		System.out.println("��czna cena: " + invoice.getInvoiceAmount());
	}
}