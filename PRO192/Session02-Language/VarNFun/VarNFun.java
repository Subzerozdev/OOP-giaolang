import java.util.Iterator;
import java.util.Scanner;

public class VarNFun {

	public static void main(String[] args) {

		// playWithVariables();
		// playWithIntegers();
		// playWithDoubles();
		// playWithCharacters();
		// playWithBooleans();

		// Nhập dữ liệu từ bàn phím:
		int n =getAPositiveInteger();
		System.out.println("Your number: "+ n );
		printIntegerList(n); // OOP pass by reference - truyền tham chiếu con trỏ, địa chỉ.
		// printIntegerList(180); // hard-code đàu vào, code cứng/ cố định value/
		// literal
		// không mềm mại. linh hoạt,
		// linh hoạt: bạn muốn in đến mấy ???? hỏi và nhập
	}

	// static chỉ chơi với static --OOP

	// hàm đầu ra để gán cho biến khác.
	// tên hàm là 1 biến được gán value từ return.
	public static int getAPositiveInteger() {
		int n;
		// nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa, name.charAt()
		Scanner banPhimCuaTui = new Scanner(System.in);
		System.out.println("Input a positive integer:  ");
		n = banPhimCuaTui.nextInt();
				
		return n; // getAPositiveInteger() =n
	}  // cơ chế hộp đen, sử dụng hàm này để lấy số liệu người dùng nhập vào
	   // trong hàm main gán 1 biến = hàm mà dùng.
	

	public static void playWithVariables() {
		// biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định tùy loại.
		// dữ liệu / thông tin mà nó sẽ chứa bên trong - data type - hình thức data.
		// số , chữ, ......
		// biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức.
		int age = 20;
		int a = 10, b;
		b = 100;
		// tốn 12 byte trong RAM

		System.out.println("age:" + age); // printf("age: %d\n",age);

		int yob = 2004; // year of birth

		age = 2024 - yob;

		// chơi dạng mới của Java:
		System.out.println("age by using transitive tech :" + (2024 - yob));

		// dùng printf giống C:
		System.out.printf("age printed by using %% as in C: %d\n ", (2024 - yob));

	}

	public static void playWithIntegers() {
		int n = 39; /// mọi con số , kí tự xuất hiện trong code được gọi là literal value.
					// số nguyên xuát hiện trong code mặc định là int.
		System.out.println("n: " + n);

		long m = 3000000000L; // phân cách literal trong code cho dễ đọc.

		System.out.println("m:" + m);

		int status = 0xFA; // hệ 16

		System.out.println("Status: " + status);

		int phone = 010; // 0 hệ 8 octal

		System.out.println("Phone: " + phone);

	}

	// Java ưu tiên double hơn float.
	public static void playWithDoubles() {
		double pi = 3.14;

		System.out.println("pi: " + pi);

		System.out.printf("pi: %.2f\n", pi); // cấm tuyệt đối không dùng %lf

		float vat = 0.1F;
		System.out.println("vat: " + pi);

	}

	public static void playWithCharacters() {
		// 2 byte cho kiểu char heng, lưu bảng mã Unicode
		char m = '$';
		System.out.println("unit: " + m);

		// tên em thì sao C: mảng các kí tự, không primitive nữa rồi, phức tapj rồi.

		// char name [] ="Ahihi";
		String name = "Nguyễn Gia Khánh"; // loại datatype mới hoàn toàn.
											// phức tạp do gom n thứ khác.
											// object data type , học sớm hoy.
		System.out.println("My name is:" + name);

		// in ra kí tự đầu tiên của chuổi String:
		System.out.println(name.charAt(0));
		// chữ thường hết:
		System.out.println("My name as in a lowercase: " + name.toLowerCase());

	}

	public static void playWithBooleans() {
		// C: đúng 1, >0, sai 0 int
		// Java: đúng : true, sai: false
		boolean marriedStatus = true;

		if (marriedStatus == true)
			System.out.println("Bé nghi có bồ rồi!!!");

		else
			System.out.println("Có thể tiếp cận bé Nghi!!");

	}

	// in ra các số tự nhiên từ 1 đến 100
	public static void printIntegerList() {
		System.out.println("The List of 100 first integers: ");
		for (int i = 1; i <= 100; i++) {
			if (i == 100) {
				System.out.println(i + " ");
				break;
			}
			System.out.print(i + ", ");
		}
	}

	// tui muốn in n sô tự nhiên tình từ 1
	// hiện tượng 1 class bất kỳ chứa nhiều hàm trùng tên nhưng khác
	// phần tham số, đầu vào, mà phải khác trên data type chứ không phải khác trên
	// tên biến
	// ĐƯỢC GỌI LÀ OVERLOAD/ OVERLOADING --- QUÁ TẢI HÀM
	// VS. OVERRIDE
	// POLIMORPHISM ==> TÍNH ĐA HÌNH
	// GIỐNG NHƯ: 5 ANH EM TRÊN 1 CHIẾC XE WAVE
	public static void printIntegerList(int n) {
		// chỉ có thằng ngáo thì mới scanf (n) here!!!!! đã có value khi xài.
		// body of function nghiền , trộn xử lí với đầu vào giả định sẽ đưa qua tên gọi
		// giải quyết trên công thức

		System.out.println("The list of " + n + " fisrt integers");

		for (int i = 1; i <= n; i++) {

			System.out.printf("%d  ", i);
		}

	}

}
