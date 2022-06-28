package impworks;

import java.util.ArrayList;

public class productlist {
private ArrayList<String>producslist=new ArrayList<>();

 public void addproductlist(String item) {
producslist.add(item);

}
public void printproductlist() {
	System.out.println("you have "+producslist.size()+"itemin your list");
	for(int i=0;i<producslist.size();i++) {
System.out.println((i+1)+"."+producslist.get(i));

	}
}
	public String finditem(String searchitem) {
		int position=producslist.indexOf(searchitem);
		if(position>=0) {
			return producslist.get(position);
		}
		return null;
	}
}
