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

	void removeElementFromRegistry(String registryName) {
		if (registryName.equals(getRegistryName())) {
			elements.remove(registryName);
		}
	}

		void registryInfo() {
			for (T t : elements) {
				System.out.println(t);
			}
		}

}
