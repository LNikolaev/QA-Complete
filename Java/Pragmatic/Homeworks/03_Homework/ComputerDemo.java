
public class ComputerDemo {
	public static void main(String[] args) {
		Computer asus = new Computer("Asus", 2012, 1965, true, 500, 1024, "Windows 7");
		Computer lenovo = new Computer("Lenovo", 2018, 2730, false, 10000, 2048, "Windows Vista");

		asus.useMemory(100);
		lenovo.changeOperationSystem("Windows 10");

		asus.printInfo(asus);
		System.out.println("\n---------------------");
		lenovo.printInfo(lenovo);

	}
}