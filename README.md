# New features of Java 8

* [Lambdas](#lambdas)
* Predicates
* Functions

##### <a name="lambdas"></a>Lambdas
Lambda expressions are sort of anonymous methods. They have method body, argument list. However no name, and return type as well as exception clause.
Return type and exceptions are inferred by the compiler based on method body.
Lambdas work with Single abstract method classes -- wherever you may want to use such interface/class you can replace them with lambdas.
	<code>
		new Runnable() {
			public void run() {
				/*METHOD BODY*/
			}
		}
	</code>
	is replaced by a lambda <code>() -> { /*METHOD BODY */ } </code>