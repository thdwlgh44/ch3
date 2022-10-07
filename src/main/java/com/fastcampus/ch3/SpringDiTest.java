//package com.fastcampus.ch3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
//
////@Component("engine")
//class Engine {} // <bean id="engine" class="package"/>
//@Component class SuperEngine extends Engine{}
//@Component class TurboEngine extends Engine{}
//@Component class Door {}
//@Component
//class Car {
//    @Value("red") String color;
//    @Value("100") int oil;
////    @Autowired // byType
////    @Qualifier("superEngine") // 이름이 여러개면 반드시 @Qualifier로 구분해주기
//    @Resource(name = "superEngine") // byName
//    Engine engine; //byType - 타입으로 먼저 검색, 여러개면 이름으로 검색. - engine, superEngine, turboEngine
//    @Autowired Door[] doors;
//
//    public Car() {} // 기본 생성자
//
//    public Car(String color, int oil, Engine engine, Door[] doors) {
//        this.color = color;
//        this.oil = oil;
//        this.engine = engine;
//        this.doors = doors;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setOil(int oil) {
//        this.oil = oil;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setDoors(Door[] doors) {
//        this.doors = doors;
//    }
//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", oil=" + oil +
//                ", engine=" + engine +
//                ", doors=" + Arrays.toString(doors) +
//                '}';
//    }
//
//}
//
//public class SpringDiTest {
//    public static void main(String[] args) {
//        ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
////        Car car = (Car) ac.getBean("car"); //byName. 아래와 같은 문장
//        Car car = ac.getBean("car", Car.class); //byName
////        Car car2 = (Car) ac.getBean(Car.class); //byType
////
//////        Engine engine = (Engine) ac.getBean("engine");
////        Engine engine = (Engine) ac.getBean("superEngine");
////        Door door = (Door) ac.getBean("door");
//
////        car.setColor("red");
////        car.setOil(100);
////        car.setEngine(engine);
////        car.setDoors(new Door[]{ac.getBean("door", Door.class), (Door)ac.getBean("door")});
//        System.out.println("car = " + car);
//    }
//}
