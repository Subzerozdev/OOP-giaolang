package WS1;

public class WS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean result =isPrime(3);
			System.out.println("2:"+ result);
	}

	public static boolean  isPrime (int n ) {
		if (n <2) {
			return false;
		}
		// else rồi đấy nên CPU đến đây, n >2.
		// kiểm tra xem trong khoảng từ 2 cho đến .... căn  (n).
		// lỡ tay chia hết đứa nào ko, có kl  ngay không nguyên tố.
		if (n ==2) {
			return true;
			
		}
		// for 2 .... căn n, n ơi, mày có chai hết đứa nào từ 2 ... căn không ?
		for (int i = 2; i <=  Math.sqrt(n); i++) {
			if (n % i ==0) {
				return false; // mày lỡ tay chia hết trong [2 .. căn]
			}
			// hết for rồi mà không thoát sớm , đích thị không chia hết đứa nào.
			// sure nguyên tố
		
		}
		return true;
	}
}
