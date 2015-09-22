package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger value) {
		if (value.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.getValue() % 2 != 0) {

			return true;
		}

		else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger value) {
		if (value.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		if (value < 1) {
			return false;
		}
		int i;
		for (i = 2; i < value; i++) {
			int m = value % i;
			if (m == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int value) {
		if (value < 1) {
			return false;
		}
		int i;
		for (i = 2; i < value; i++) {
			int m = value % i;
			if (m == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(MyInteger value) {

		if (value.getValue() < 1) {
			return false;
		}

		else {
			int i;
			for (i = 2; i < value.getValue(); i++) {
				int m = value.getValue() % i;
				if (m == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public boolean equals(int value) {
		if (value == this.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger value) {
		if (value.getValue() == this.value) {
			return true;
		} else {
			return false;
		}

	}

	public static int parseInt(char[] a) {
		int value = Integer.parseInt(new String(a));
		return value;
	}

	public static int parseInt(String k) {
		int value = Integer.parseInt(k);
		return value;
	}

}
