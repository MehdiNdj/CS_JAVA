package testExamen;
import java.util.*;

public class Dish {
private String name;
private boolean vegetarian;
private int calories;
private Type type;
public Dish(String name, boolean vegetarian, int calories, Type type) {
	this.name = name;
	this.vegetarian = vegetarian;
	this.calories = calories;
	this.type = type;
}

public String getName() {
return name;
}
public boolean isVegetarian() {
return vegetarian;
}
public int getCalories() {
return calories;
}
public Type getType() {
return type;
}

public enum Type { MEAT, FISH, OTHER }// l’attribut Type est une énumération
@Override
public String toString() {
return name; // ne retoune que le nom du menu
}

public static final List<Dish> menu =
Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
new Dish("beef", false, 700, Dish.Type.MEAT),
new Dish("chicken", false, 400, Dish.Type.MEAT),
new Dish("french fries", true, 530, Dish.Type.OTHER),
new Dish("rice", true, 350, Dish.Type.OTHER),
new Dish("season fruit", true, 120, Dish.Type.OTHER),
new Dish("pizza", true, 550, Dish.Type.OTHER),
new Dish("prawns", false, 400, Dish.Type.FISH),
new Dish("salmon", false, 450, Dish.Type.FISH));
}