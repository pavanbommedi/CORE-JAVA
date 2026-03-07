

A funtional interface is an interface hat has one and only one abstarct method.

this is how java can infer the method to derive the paraneters and retrun type for the lambda exoression 

functional interfaces also konown as SAM which is single abstract nethod

A functional interface is the target type for a lambda expressio

A functional interface can have only one abstract method; extending another interface counts its abstract methods too unless additional methods are declared as default or static.

-------------------------------------
Consumer interface 

it is in the java.util.function.package

it has one abstract method that tajes a single argument and doesnt return anything 

void accept(T t)

variable used in lamda expression should be finbal or effectively final

This code demonstrates passing behavior using lambda expressions backed by a functional interface, with generics enabling type-safe reuse across different operations.

Lambda expressions with multuple params rules

(a,b)->a+b; ----> Paranthesis are always requires
(Integer a, Intger b) ---> if you suse an explicit type for one parameter you must use explixit types forall the params
(var a, var b) ----> if you use var for one parameter you must use var for all parameters
(a,b)->a+b; ----> when not using curly braces the return keyword is unnecesaary and will therow a compiler error

(a,b) ->{
    var c = a+b;
    return c;        -----> if you use a statement block meaning you use the curly braces a return is required
}


Consumer -> void accept(T t) ---> excecute code without returning data

Function<T,R> -> R apply (T t) ---> return a result of an operatiin or func

predicate -> boolean test(T t) ---> test if a condition is true or false

Supplier -- > T get() ---> return an instance of something 

BiConsumer ---. void accept(T t , U u) 

BiFunction<T,U,R> -> R apply(T t, U u)

UnaryOperato<T> - T apply(T t)

BinaryOperator<T> - T apply(T t1,T t2)

UnaryOperator is Function type but resukt and arg are same type
BinaryIperatir is BiFunction type but resuly and arg are same type

For example: this lamvda exoressuon rtakes a string s and splits that string on commas returinghg asn array of strting , int his case the argument type t is a string and th result R is an array of STring

lambda expression for function = s->s.split(",");
function method = R apply (T t);
variable declaration for this example : Function<String,String[]> f1;

Suppplier interface takes no args but returns an instance of some type T -> factory method

it will produce an instance of some object

Example" i will use yhe Random class to generate a random Integer
Thsi method takes no argument but lamda expressuons can use final  or effecticvely dinal varibales in their exprssions which will code in supplier folder
lambda expression for Supplier () -> random.nextInt(1,100);

Method References
s->System.Out.println()s  ==  s->System.Out::println

A method reference abstracts the lambda exoression even further eliminating the need to declare formal paramters

we also dont have to pass arguments to the method in question in this case println

A method reference had dounle colons between the qualifying type and the methid name

When you create variables that are lambda or method references its important to remember that the code isnt invoked at that point

the statemnet or code block gets invoked at the poinyt in the ciode that the targfedt functional methods is called

You mixed lambda and method reference ❌
You used:

lambda syntax s ->

method reference syntax ::

You must use one or the other, not both together.

Static methods in method references and lambda expressions must be invoked using a reference type only

In ClassName::instanceMethod, the first argument becomes the receiver object, and the remaining arguments are passed to the method.

🧠 The CORE rule (this makes everything obvious)
Method reference forms
Syntax	Meaning
ClassName::staticMethod	(a,b) -> ClassName.staticMethod(a,b)
object::instanceMethod	(a) -> object.instanceMethod(a)
ClassName::instanceMethod	(obj, a) -> obj.instanceMethod(a)
ClassName::new	() -> new ClassName()

ClassName::staticMethod	:

(a,b)-> ClassName.staticMethod(a,b)

BinaryOperator<Integer> add = Integer::sum;
System.out.println(add.apply(12,12))

What java sees = (a,b)-> Integer.sum(a,b)

2: Object::instanceMethod

a-> Object.instanceMethod(a)

List<String> list = List.of("Java","Lambda");
list.forEach(System.out::println)

what java sees = s->System.out.println(s)

3: ClassName :: instanceMethod

(obj,a) -> obj.instanceMethod(a)

BiFunction<String,String> con = String::concat
con.apply("Hello","World")

what java sees = (s1,s2)->s1.concat(s2)

4.ClassName :: new (Constructor reference)

()->new ClassName()

Supplier<ArrayList<String>> supplier =  ArrayList::new
ArrayList<String> list = supplier.get()

what java sees = ()->new ArrayList<>()

BiFunction<Integer,String,Persom> personCreator = Person::new

what java sees = (id,name) -> new Person(id,name)