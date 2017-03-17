import java.util.Scanner;

public class Reserve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SeatType[] aSeatType = new SeatType[3];
		aSeatType[0] = new SeatType('S', 10);
		aSeatType[1] = new SeatType('A', 15);
		aSeatType[2] = new SeatType('B', 20);

		int choice = 0;

		while (choice != 5) {
			int type;
			System.out.print("予約(1), 예약상황조회(2), よやくしゃ(3) 예약취소(4), 끝내기(5) >>");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("좌석 구분 : S석(1), A석(2), B석(3) >> ");
				type = sc.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("잘못된 좌석 선택입니다.");
					break;
				}
				aSeatType[type - 1].reserve();
				break;

			case 2:
				for (int i = 0; i < aSeatType.length; i++) {
					aSeatType[i].show();
				}
				System.out.println("<<< 조회를 완료했습니다. >>>");
				break;

			case 3:
				System.out.print("예약자의 이름을 입력해주세요 >>");

				String name = sc.next();
				int i = 0;
				for (i = 0; i < aSeatType.length; i++) {
					if (aSeatType[i].search(name))
						break;
				}

				if (i == aSeatType.length)
					System.out.println(name + "님을 찾을 수 없습니다.");

				break;

			case 4:
				System.out.print("좌석 구분 : S석(1), A석(2), B석(3) >>");
				type = sc.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("잘못된 좌석 선택입니다.");
					break;
				}
				aSeatType[type - 1].cancel();
				break;

			case 5:
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
