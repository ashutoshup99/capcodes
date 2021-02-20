
public class namearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id[]=new int[4];
		id[0]=11;
		id[1]=12;
		id[2]=13;
		id[3]=14;
		String names[] = new String[4];
		names[0] = "sam";
		names[1] = "rahul";
		names[2] = "Abhi";
		names[3] = "aakash";
		for(int i=0; i< names.length ; i++) {
//			System.out.println(i);
			System.out.println(id[i]  + " : " +names[i]);
		}

	}

}
