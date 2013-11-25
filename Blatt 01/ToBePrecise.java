public class ToBePrecise {
	public static void main(String[] args) {
		System.out.println(1E300);
		System.out.println(1E20);
		System.out.println(1E300 * 1E20);
		System.out.println(1E300 * 1E20 == 1 / 0.0);
	}
}