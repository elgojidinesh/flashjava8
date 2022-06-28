package impworks;


	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	//model class
	class Itemes {

	    String itemname;
	    float itemprice;
	    String Category;
	    LocalDate dom;
	    LocalDate doe;

	    public Itemes(String itemname, float itemprice, String category, LocalDate dom, LocalDate doe) {
	        super();
	        this.itemname = itemname;
	        this.itemprice = itemprice;
	        this.Category = category;
	        this.dom = dom;
	        this.doe = doe;
	    } 

	}

	public class Itemtest_16 {
	    public static void main(String[] args) {
	        List<Itemes> itemList = new ArrayList<>();
	        itemList.add(new Itemes("laptop", 30000, "electronics", LocalDate.of(2021, 12, 23), null));
	        itemList.add(new Itemes("smartwatch", 2000, "electronics", LocalDate.of(2020, 2, 12), null));
	        itemList.add(new Itemes("tv", 10000, "electronics", LocalDate.of(2022, 2, 20), null));
	        itemList.add(new Itemes("snacks", 50, "food", LocalDate.of(2022, 5, 30), LocalDate.of(2022, 8, 21)));
	        itemList.add(new Itemes("burger", 200, "food", LocalDate.of(2022, 6, 22), LocalDate.of(2022, 7, 1)));

	        while (true) {

	            Scanner sc = new Scanner(System.in);
	            System.out.println("********************");
	            System.out.println("1. print the item detail on the basis of category name");
	            System.out.println("2. print the item detail on the basis of starting letter item name");
	            System.out.println("3. print the item detail on the basis of date of manufacturing");
	            System.out.println("4. print the item detail on the basis of date of expiry");
	            System.out.println("5. print the item detail on the basis of item price");
	            System.out.println("*******************");
	            System.out.println("Select option from above list");
	            int choice = sc.nextInt();

	            switch (choice) {
	            case 1: {

	                System.out.println("enter catagory of item from above list:- ");
	                String catgory = sc.next();

	                List<Itemes> Itemcat = itemList.stream().filter(i -> i.Category.equals(catgory)).toList();

	                if (!Itemcat.isEmpty()) {
	                    System.out.println("Items with " + catgory + " category");
	                    for (Itemes i : Itemcat) {
	                        System.out.println("name:" + i.itemname + " price:" + i.itemprice + " category:" + i.Category
	                                + " dom:" + i.dom + " doe:" + i.doe);
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("category not found");
	                }
	                break;

	            }

	            case 2: {
	                itemList.stream().map(i -> i.itemname).distinct().forEach(System.out::println);
	                System.out.println("enter starting letter of item name from above list");
	                String startname = sc.next();

	                List<Itemes> nameItem = itemList.stream().filter(i -> i.itemname.startsWith(startname)).toList();

	                if (!nameItem.isEmpty()) {
	                    System.out.println("Items having starting letter " + startname);
	                    for (Itemes i : nameItem) {
	                        System.out.println("name:" + i.itemname + " price:" + i.itemprice + " category:" + i.Category
	                                + " dom:" + i.dom + " doe:" + i.doe);
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("item not found with this starting letter");
	                }
	                break;
	            }

	            case 3: {
	                System.out.println("enter date of manufacturing in format(YYYY MM DD)");
	                try {
	                    System.out.println("enter year");
	                    int year = sc.nextInt();
	                    System.out.println("enter month");
	                    int month = sc.nextInt();
	                    System.out.println("enter day");
	                    int day = sc.nextInt();
	                    LocalDate dom = LocalDate.of(year, month, day);
	                    List<Itemes> domItem = itemList.stream().filter(i -> i.dom.equals(dom)).toList();

	                    if (!domItem.isEmpty()) {
	                        for (Itemes i : domItem) {
	                            System.out.println("name:" + i.itemname + " price:" + i.itemprice + " category:"
	                                    + i.Category + " dom:" + i.dom + " doe:" + i.doe);
	                        }
	                        System.out.println();
	                    } else {
	                        System.out.println("item not found with this DOM");
	                    }

	                } catch (Exception e) {
	                    System.out.println("wrong format");
	                }

	                break;
	            }

	            case 4: {
	                System.out.println("enter date of expiry in format(YYYY MM DD)");
	                try {
	                    System.out.println("enter year");
	                    int year = sc.nextInt();
	                    System.out.println("enter month");
	                    int month = sc.nextInt();
	                    System.out.println("enter day");
	                    int day = sc.nextInt();
	                    LocalDate doe = LocalDate.of(year, month, day);
	                    List<Itemes> doeItem = itemList.stream().filter(i -> i.doe != null).filter(i -> i.doe.equals(doe))
	                            .toList();

	                    if (!doeItem.isEmpty()) {
	                        for (Itemes i : doeItem) {
	                            System.out.println("name:" + i.itemname + " price:" + i.itemprice + " category:"
	                                    + i.Category + " dom:" + i.dom + " doe:" + i.doe);
	                        }
	                        System.out.println();
	                    } else {
	                        System.out.println("item not found with this DOE");
	                    }

	                } catch (Exception e) {
	                    System.out.println("wrong format");
	                }

	                break;
	            }

	            case 5: {
	                System.out.println("enter item price ");
	                int price = sc.nextInt();
	                List<Itemes> itemPrice = itemList.stream().filter(i -> i.itemprice == price).toList();

	                if (!itemPrice.isEmpty()) {
	                    for (Itemes i : itemPrice) {
	                        System.out.println("name:" + i.itemname + " price:" + i.itemprice + " category:" + i.Category
	                                + " dom:" + i.dom + " doe:" + i.doe);
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("item not found with this price");
	                }
	                break;
	            }

	            default:
	                System.out.println("wrong choice");
	            }
	        }
	    }
	
}
