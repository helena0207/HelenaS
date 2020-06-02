import java.util.HashMap;

public class HashMapException {

	public static void main(String[] args) {
/*		HashMap<String, Integer> hashtable= new HashMap<String, Integer>();
		hashtable.put("�츮",new Integer(95));
		hashtable.put("�츣�̿´�",new Integer(100));
		hashtable.put("��",new Integer(85));
		hashtable.put("�巹����",new Integer(93));
		hashtable.put("�׺�",new Integer(70));
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������ ? "+ num);
*/
		HashMap<Name, Integer> hashtable= new HashMap<Name, Integer>();
		hashtable.put(new Name("�츮","����"), new Integer(95));
		hashtable.put(new Name("�츣�̿´�","�׷�����"), new Integer(100));
		hashtable.put(new Name("��","����"), new Integer(85));
		hashtable.put(new Name("�巹����","������"), new Integer(93));
		hashtable.put(new Name("�׺�","�չ���"), new Integer(70));
		
		Integer num = hashtable.get(new Name("�츣�̿´�","�׷�����"));
		System.out.println("�츣�̿´� �׷������� ������ ? "+ num);
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