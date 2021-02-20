	
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Item [] c = new Item[7];
//		c[1] = new WrittenItem(15,"Wake me Up",303212,"Avici");
//		WrittenItem w1=new WrittenItem(15,"Wake me Up",303212,"Avici");
//		w1.addItem(w1);
		Item i1 = new WrittenItem(14, "Hold On",5,"Akon");
		System.out.println("You requested For item " + i1.toString());
		i1.checkIn();
		System.out.println("You item has been checked in " + i1.toString());
		Item i2 = new JournalPaper(16,"Night you",5,"Avici",2012);
		System.out.println("You requested For item " + i2.toString());
		i2.checkOut();
		System.out.println("You item has been checked Out " + i2.toString());
		Item i3 = new JournalPaper(17,"365",5,"ZEDD",2014);
//				Item i5 = new CD(18,"hour",5435,60,"sam","Crime");
//				i5.setDirector("Nolan") it is error as we can't use getter/setter method of subclass when our reference is of parent type(Item)
//				we have to use reference of subclass and then upcast to it parent class
		Video i4 = new Video(17,"jounery",5,20,"martin","Thriller",1999); 
		i4.setDirector("Nolan");
		i4.checkOut();
		Item i7=i4;  // Upcasting
		System.out.println(i7.toString()); /// Printing
		Item i5 = new CD(18,"hour",5,60,"sam","Crime");
		Item i6 = new Book(19,"War",5,"Augushta");
		System.out.println(i1.toString());
		
	}

}
