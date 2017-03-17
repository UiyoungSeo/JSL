import java.util.Scanner;

public class SeatType {
	private char type;
	private Seat[] aSeat;

	public SeatType(char _type, int _number) {
		type = _type;
		aSeat = new Seat[_number];
		for (int i = 0; i < aSeat.length; i++) {
			aSeat[i] = new Seat();
		}
	}

	public void show() {
		System.out.print(type + "석>> ");
		for (int i = 0; i < aSeat.length; i++) {
			if (aSeat[i].isOccupied())
				System.out.print(aSeat[i].getName());
			else
				System.out.print("-(" + (i + 1) + ")-");
			System.out.print(" ");
		}
		System.out.println();
	}

	public boolean reserve() {
		Scanner sc = new Scanner(System.in);
		int seatNumber;
		String name;
		show();

		System.out.print("예약하고 싶은 좌석의 번호를 입력>>");
		seatNumber = sc.nextInt();
		System.out.print("예약자 이름 입력>>");
		name = sc.next();

		if (seatNumber < 1 || seatNumber > aSeat.length) {
			System.out.println("잘못된 좌석번호 입니다.");
			return false;
		}
		if (aSeat[seatNumber - 1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}

		aSeat[seatNumber - 1].reserve(name);
		return true;
	}

	public boolean cancel() {
		Scanner sc = new Scanner(System.in);
		show();
		System.out.print("예약 취소할 이름 >>");
		String name = sc.next();
		if (name != null) {
			for (int i = 0; i < aSeat.length; i++) {
				if (aSeat[i].match(name)) {
					aSeat[i].cancel();
					return true;
				}
			}
			System.out.println("예약자 이름을 찾을 수 없습니다.");
		}
		return false;
	}

	public boolean search(String name) {
		int i = 0;
		for (i = 0; i < aSeat.length; i++) {
			if (name.equals(aSeat[i].getName())) {
				System.out.println(name + "님은 " + type + "석의 " + (i + 1) + "번째 좌석에 예약이 되어있습니다.");
				return true;
			}
		}
		return false;
	}
}
