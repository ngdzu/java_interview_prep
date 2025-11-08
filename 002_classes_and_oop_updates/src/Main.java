package dev.playground.lesson;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // 1) default method inherited from interface
        final Greeter g = new GreeterImpl();
        System.out.println("GreeterImpl -> " + g.greet("World"));

        // 2) override the default in an implementing class
        final Greeter gOver = new GreeterOverrideImpl();
        System.out.println("GreeterOverrideImpl -> " + gOver.greet("Alice"));

        // 3) class-method precedence: a concrete method in a class wins over
        // an interface default method with the same signature
        final Greeter gClass = new ClassWithGreet();
        System.out.println("ClassWithGreet -> " + gClass.greet("Bob"));

        // 4) conflicting defaults from two interfaces: implementing class must
        // resolve by overriding
        final Greeter conflicting = new Conflicting();
        System.out.println("Conflicting -> " + conflicting.greet("Sam"));

        // 5) interface constant usage (implicitly public static final)
        System.out.println("Consts.MAGIC = " + Consts.MAGIC);

        final ImmutableData d = new ImmutableData("x", 5);
        System.out.println(d);
    }
}

/**
 * A small example interface demonstrating default and private interface
 * methods.
 *
 * In Java, an interface may provide a default implementation for methods using
 * the `default` keyword. This lets interfaces evolve with new behavior without
 * forcing all implementors to provide an implementation. Implementing classes
 * can override default methods if they need different behavior.
 */
interface Greeter {
    /**
     * Default method: provides a concrete implementation on the interface.
     * Callers can use this method directly on any implementing class if the
     * class does not override it.
     */
    default String greet(final String who) {
        return prefix() + who;
    }

    /**
     * Private helper method inside the interface. Private interface methods
     * (since Java 9) allow sharing code between default or static methods
     * without exposing the helper as part of the public API.
     */
    private String prefix() {
        return "Hello, ";
    }
}

/**
 * A simple implementation of Greeter that uses the interface default
 * implementation. Since it does not override `greet`, calling greet on an
 * instance of this class will use the default method defined in the
 * `Greeter` interface.
 */
class GreeterImpl implements Greeter {
}

// Example: override the interface default method in the implementing class
class GreeterOverrideImpl implements Greeter {
    @Override
    public String greet(final String who) {
        return "[overridden] " + who;
    }
}

// A concrete class providing its own greet method (demonstrates class
// precedence over interface defaults)
class ClassWithGreet implements Greeter {
    // This concrete method (in the class) will be used instead of the
    // interface default when called on instances of this class.
    public String greet(final String who) {
        return "Class says hi " + who;
    }
}

// Another interface with a default method that would conflict with Greeter
interface AnotherGreeter {
    default String greet(final String who) {
        return "Other says hi " + who;
    }
}

// If a class implements two interfaces that both define the same default
// method signature, it must override the method to resolve the conflict.
class Conflicting implements Greeter, AnotherGreeter {
    @Override
    public String greet(final String who) {
        // choose Greeter's default implementation explicitly
        return Greeter.super.greet(who) + " (resolved)";
    }
}

// Interface constants are implicitly public static final
interface Consts {
    int MAGIC = 42; // same as public static final int MAGIC = 42;
}

/**
 * A simple immutable data holder. Marking the class `final` and using only
 * private final fields makes instances immutable: their state cannot change
 * after construction.
 */
final class ImmutableData {
    private final String name;
    private final int value;

    public ImmutableData(final String name, final int value) {
        this.name = Objects.requireNonNull(name);
        this.value = value;
    }

    // Accessors – immutable objects expose getters rather than setters.
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ":" + value;
    }
}
