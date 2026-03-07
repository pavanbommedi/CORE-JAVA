✅ Benefits

Car doesn’t care which engine it gets

Easy to change implementation

Easy to test (mock engine)

Flexible & maintainable

📌 Interview line:

“Loose coupling improves flexibility and testability.”

Car depends on the interface Engine, not on a concrete class

This means:

Car does NOT know whether it is PetrolEngine or DieselEngine

You can change engine types without modifying Car

✅ This is loose coupling

Dependency Injection is Used (Constructor Injection)
Car car = new Car(new PetrolEngine());


The dependency (PetrolEngine) is injected from outside

Car does NOT create the engine itself (new PetrolEngine() is not inside Car)

✅ This is Dependency Injection (DI)

3️⃣ Polymorphism Works Correctly
Engine engine = new PetrolEngine();


Interface reference → concrete implementation

At runtime:

engine.start(); // calls PetrolEngine.start()


✅ Runtime polymorphism is working