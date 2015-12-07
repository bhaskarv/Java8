# New features of Java 8

* [Lambdas](#lambdas)
* [Functional Interfaces](#fics)
* Higher order functions


##### <a name="lambdas"></a>Lambdas
Lambda expressions are sort of anonymous methods. They have method body, argument list. However no name, and return type as well as exception clause.
Return type and exceptions are inferred by the compiler based on method body.
Lambdas are used in places where we normally use anonymous inner classes. For example
	<code>
		new Runnable() {
			public void run() {
				/*METHOD BODY*/
			}
		}
	</code>
	can be replaced by a lambda <code>() -> { /*METHOD BODY */ } </code>

##### <a name="fics"></a>Functional Interfaces
An interface with a single abstract method (SAM) is called a functional interface. Such an interface can be used as a type of a lambda expression. For example in the below code <br>
	<code>
		Thread t = new Thread(()-> System.out.pritnln("hellow from thread"));
	</code><br>
the type of lambda expression <code>()-> System.out.pritnln("hell...") </code> is Runnable. Compiler could infer this based on Thread's constructor.In our examples in StringUtils class we use a Java supplied interface <i>Function</i> as type for lambda expression <code><i>s->s.toUpperCase()<i></code> in <code>StringUtils.transform(input, s->s.toUpperCase())</code>

Java 8 allows static methods and default methods in interfaces.
	Static methods however can not manipulate static (these are the only ones it case access anyway) variables.
	These static methods need to be accessed with interface name only MyIntf.myMethod() even from inside classes that implement the interface.