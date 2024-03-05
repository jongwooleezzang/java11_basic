package sec2;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임 워크 : 기본적으로 자바에서 제공하는 여러데이터를 저장하고,관리하기 위한 미리짜놓은 자료구조 틀
//Map,Set, List  등이있다.
public class CollectionEx1 {
	public static void main(String[] args) {
		//List 인터페이스 : ArrayList , Vector , LinkedList
		//Set  인터페이스: HashSet , TreeSet
		//Map  인터페이스: HashMap , Hashtable ,TreeMap , Properties
		//Stack , Queue, Deque 등 도 자료구조에 해당하는 컬렉션 프레임워크의 일종이다
		// 자료구조인 컬렉션 프레임워크에서 자주 사용하는 메소드
		//add : 해당 컬렉션 프레임워크의 인스턴스 추가 
		//clear: 해당 컬렉션 프레임워크의 모든 인스턴스 제거
		//remove:해당 컬렉션 프레임워크의 특정 인스턴스 제거
		//size : 해당 컬렉션 프레임워크의 인스턴스 갯수
		//iterator : 분리자(반복자)를 의미
		
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		for(String s : lst) {
			System.out.println(s);
		}
		//List<Student>,Map<Board>,Set<Data> => <>로 인자가 규정되므로 제너릭의 일종이다
		
	}

}
