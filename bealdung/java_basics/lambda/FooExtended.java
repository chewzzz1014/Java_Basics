package lambda;

@FunctionalInterface
public interface FooExtended extends Baz, Bar {
    @Override
    default String defaultCommon() {
        return Bar.super.defaultCommon();
    }
}

@FunctionalInterface
interface Baz {
    String method(String string);
    default String defaultBiz() {return "";}
    default String defaultCommon() {return "";}
}

@FunctionalInterface
interface  Bar {
    String method(String string);
    default String defaultBar() {return "";}
    default String defaultCommon() {return "";}
}
