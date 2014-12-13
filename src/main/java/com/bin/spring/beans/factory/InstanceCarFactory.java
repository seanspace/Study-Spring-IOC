package com.bin.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法:实例工厂的方法,即需要创建工厂本身,再调用工厂的实例方法来返回bean的实例.
 *
 */
public class InstanceCarFactory {
	private Map<String, Car> cars = null ;
	
	public InstanceCarFactory(){
		cars = new HashMap<String, Car>() ;
		cars.put("audi", new Car("audi",30000)) ;
		cars.put("ford", new Car("ford",40000)) ;
	}
	
	public Car getCar(String brand){
		return cars.get(brand) ;
	}
}
