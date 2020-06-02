import java.util.HashMap;

public class HashMapException {

	public static void main(String[] args) {
/*		HashMap<String, Integer> hashtable= new HashMap<String, Integer>();
		hashtable.put("헤리",new Integer(95));
		hashtable.put("헤르미온느",new Integer(100));
		hashtable.put("론",new Integer(85));
		hashtable.put("드레이코",new Integer(93));
		hashtable.put("네빌",new Integer(70));
		Integer num = hashtable.get("헤르미온느");
		System.out.println("헤르미온느의 성적은 ? "+ num);
*/
		HashMap<Name, Integer> hashtable= new HashMap<Name, Integer>();
		hashtable.put(new Name("헤리","포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인져"), new Integer(100));
		hashtable.put(new Name("론","위즐리"), new Integer(85));
		hashtable.put(new Name("드레이코","말포이"), new Integer(93));
		hashtable.put(new Name("네빌","롱버텀"), new Integer(70));
		
		Integer num = hashtable.get(new Name("헤르미온느","그레인져"));
		System.out.println("헤르미온느 그레인져의 성적은 ? "+ num);
	}

}
class Name{
	String firstName;
	String lastName;
	Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Name)) {
			return false;
		}
		Name name = (Name) obj;
		if(firstName.equals(name.firstName) && lastName.equals(name.lastName)) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}
}