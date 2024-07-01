package Has_a_relationship_early_instance_onee_to_one;

public interface Test {
		public void demo();
		
		public static void test() {
			System.out.println("this is static method test");
		}
		public static void main(String[] args) {
			System.out.println("THis is interfce");
//			t.show();
		}
		
		default void show() {
			System.out.println("this default ");
		}
}
