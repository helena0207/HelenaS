package arrayex;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library=new Book[5];
		Book[] copyLibrary=new Book[5];
		
		library[0]=new Book("태백산맥1","조정래");
		library[1]=new Book("태백산맥2","조정래");
		library[2]=new Book("태백산맥3","조정래");
		library[3]=new Book("태백산맥4","조정래");
		library[4]=new Book("태백산맥5","조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);
/*
		//향상된 for문 , 어떤 객체의 전체를 돌고 하나씩 꺼내어 변수에 넣겠다.
		for(Book book:copyLibrary){
			book.showBookInfo();
		}
*/		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		for(Book book:library){
			book.showBookInfo();
		}
		
		System.out.println("==============================");
		//얕은 복사 -원본 내용 변경을 했더니 주소를 가르키는 것을 복사한것이다.
		for(Book book : copyLibrary){
			book.showBookInfo();
		}
		
/*		
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
*/
	}

}
