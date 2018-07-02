
public class Computer {
	private String name;
	private int year;
	private float price;
	private boolean isNoteBook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operationSystem;

	public Computer(String name, int year, float price, boolean isNoteBook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
		this.isNoteBook = isNoteBook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isNoteBook() {
		return isNoteBook;
	}

	public void setNoteBook(boolean isNoteBook) {
		this.isNoteBook = isNoteBook;
	}

	public int getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(int hardDiskMemory) {
		this.hardDiskMemory = hardDiskMemory;
	}

	public int getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(int freeMemory) {
		this.freeMemory = freeMemory;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("There is not enought memory");
		} else {
			freeMemory = freeMemory - (int) memory;
		}
	}

	void printInfo(Computer computerName) {
		System.out.printf("Name: %s\nYear: %d\nPrice: %.1f\nNotebook? %b\nHardDrive: %d\nRam: %d\nOperation System: %s",
				computerName.getName(), computerName.getYear(), computerName.getPrice(), computerName.isNoteBook(),
				computerName.getHardDiskMemory(), computerName.getFreeMemory(), computerName.getOperationSystem());
	}
}

/*
 * year – числова стойност показваща година на производство на компютъра price –
 * числова стойност (не е задължително да е цяло число) показваща цената на
 * компютъра isNotebook – булева стойност – дали компютъра е преносим или не
 * hardDiskMemory – числова стойност за размера на хардиска freeMemory – числова
 * стойност показваща размера на свободната памет operationSystem – текстово
 * поле за операционната система на компютъра
 */

/*-метод void changeOperationSystem(String newOperationSystem), който сменя
стойността на полето operationSystem със стойността подадена като
параметър.
-метод void useMemory(double memory), който намалява свободната памет
(freeMemory) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"*/