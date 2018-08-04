package student;

import java.util.ArrayList;
import java.util.List;

public class Registry<T> {
	private String registryName;
	private List<T> elements;

	public Registry() {
		elements = new ArrayList<>();
	}

	public Registry(String registryName) {
		this.registryName = registryName;

	}

	public String getRegistryName() {
		return registryName;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	void addElementToRegistry(T element) {
		elements.add(element);
	}

	void removeElementFromRegistry(int index) {	
		System.out.println(elements.get(index) + " <=== Has been successfully removed ! ");
			elements.remove(index);		
	}

		void registryInfo() {
			for (T t : elements) {
				System.out.println(t);
			}
		}

}
