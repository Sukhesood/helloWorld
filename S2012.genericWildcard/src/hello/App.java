package hello;

import java.util.ArrayList;
import java.util.List;

class Vehicle<V>{
	public V vehicleName;

	public Vehicle(V vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}

	public V getVehicleName() {
		return vehicleName;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + "]";
	}
	
}
class Car<K> extends Vehicle<Object>{
   public K id;

public Car(Object vehicleName, K id) {
	super(vehicleName);
	this.id = id;
}

public K getId() {
	return id;
}

@Override
public String toString() {
	return "Car [id=" + id + "]";
}
   
   
   
	
}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Vehicle<Object>> sukhjot=new ArrayList<>();
         sukhjot.add(new Vehicle<Object>("sukhjit"));
         sukhjot.add(new Car<Integer>(9, 9));
         printList(sukhjot);
	}
	static void printList(List<? super Car<Object>> list) {
		for(Object name:list) {
			System.out.println(name);
			
		}
	}

}
