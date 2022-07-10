package inheritanceconcept;

public class TestAggregation {

	public static void main(String[] args) {
		Author ath=new Author("Me",22,"India");
		// Book b=new Book("Java",550,ath);
		Book b=new Book("Java",550,ath);
		 b.showDetail();
	}
	

}
