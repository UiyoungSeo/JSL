import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManager {
	Scanner sc;
	HashMap<String, Phone> phones;

	public PhoneManager() {
		sc = new Scanner(System.in);
		phones = new HashMap<>();
	}

	public void showMenu() {
		System.out.println("0.삽입, 1.삭제, 2.찾기, 3.전체보기, 4.종료");
		System.out.print(">>");
	}

	public void insert() {
		String name, address, phoneNumber;

		System.out.print("이름>>");
		name = sc.next();
		System.out.print("주소>>");
		address = sc.next();
		System.out.print("전화번호>>");
		phoneNumber = sc.next();
		phones.put(name, new Phone(name, address, phoneNumber));
		System.out.println(name + "이 등록되었습니다.");
	}

	public void remove() {
		String name;
		System.out.print("삭제할 이름>>");
		name = sc.next();
		
		Set<String> keys = phones.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			if(phones.get(it.next()).getName().equals(name)){
				phones.remove(name);
				System.out.println(name + "이 삭제되었습니다.");		
				return;
			} else
				System.out.println(name+"은 등록되지 않은 이름입니다.");
		}
	}

	public void search() {
		System.out.print("이름>>");
		System.out.println(phones.get(sc.next()));
	}

	public void showAll() {
		System.out.println("---저장된 번호---");

		Set<String> keys = phones.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(phones.get(it.next()));
		}

		System.out.println("---------------");
	}
}
