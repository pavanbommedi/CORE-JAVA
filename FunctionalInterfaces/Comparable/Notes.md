We cannot create compareTo on primitive dataType
Arrays.sort() works for only Arrays
for Lists,ArrayList -> Collections.sort();

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
