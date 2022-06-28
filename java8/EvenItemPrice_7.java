package impworks;

	import java.util.ArrayList;
	import java.util.List;

	//model class
	class Items{
	    int itemid;
	    String itemname;
	    float itemprice;

	    public Items(int itemid, String itemname, float itemprice) {
	        super();
	        this.itemid = itemid;
	        this.itemname = itemname;
	        this.itemprice = itemprice;
	    }

	    
	}

	public class EvenItemPrice_7 {
	    public static void main(String[] args) {
	        List<Items> itemList = new ArrayList<>();
	         itemList.add(new Items(2,"laptop",33457));
	         itemList.add(new Items(5,"mobile",256781));
	         itemList.add(new Items( 4,"TV",11768));
	         itemList.add(new Items( 9,"smartwatch",2000));
	         itemList.add(new Items( 3,"headphone",1899));


	         List<String> evenPriceItems= itemList.stream().filter(i->i.itemprice%2==0).map(i->i.itemname).toList();

	          System.out.println("Items with even price "+ evenPriceItems );
	    }



}
