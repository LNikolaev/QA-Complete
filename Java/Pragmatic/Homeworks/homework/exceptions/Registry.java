package homework.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Registry<T> {
	private String registryName;
	private Registry<T> elements;
	private List<Registry<T>> registryList;
	
	public Registry(){
		registryList = new ArrayList<>();
	}
	public Registry(String registryName, Registry<T> elements) {
		this.registryName = registryName;
		this.elements = elements;
	}
	public String getRegistryName() {
		return registryName;
	}
	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}
	public Registry<T> getElements() {
		return elements;
	}
	public void setElements(Registry<T> elements) {
		this.elements = elements;
	}
	
	void addElementToRegistry(String registryName, Registry<T> elements){
		registryList.add(new Registry<>(registryName, elements));
	}
	
	void removeElementFromRegistry(String registryName){
		for (Registry<T> registry : registryList) {
			if (registryName.equals(registry.getRegistryName())) {
				registryList.remove(registryName);
			}
		}	
	}
	
	void registryInfo(){
		System.out.println(registryList.toArray());
	}
	
}
