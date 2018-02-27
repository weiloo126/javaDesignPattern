package com.sample.javaDesignMode.creational.builder;

/**
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。所以与工厂模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建复合对象，多个部分。因此，是选择工厂模式还是建造者模式，依实际情况而定。
 * 
 * 该示例摘自《Effective Java》 item02
 * 
 * @date 2017年11月15日
 */
public class NutritionFactsBuilderTest {	

	private final int servingSize; //final修饰的成员变量必须在声明的时候初始化或者在构造器中初始化，否则会报编译错误
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	private NutritionFactsBuilderTest(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	// Builder is static member 
	public static class Builder {
		// Required parameters
		private final int servingSize; //final修饰的成员变量必须在声明的时候初始化或者在构造器中初始化，否则会报编译错误
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) { //Builder的setter方法返回Builder对象本身，以便可以把调用链接起来
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFactsBuilderTest build() {
			return new NutritionFactsBuilderTest(this);
		}
	}	

	@Override
	public String toString() {
		return "BuilderTest [servingSize=" + servingSize + ", servings="
				+ servings + ", calories=" + calories + ", fat=" + fat
				+ ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

	public static void main(String[] args) {
		NutritionFactsBuilderTest cocaCola = new NutritionFactsBuilderTest.Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(cocaCola.toString());
	}
}
