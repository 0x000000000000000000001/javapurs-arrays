public class Test_Data_UndefinedOr {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object compareUndefinedOrImpl = FFI_STUB;
    public static Object compareUndefinedOrImpl(Object... args) { return null; }
    public static Object defined = FFI_STUB;
    public static Object defined(Object... args) { return null; }
    public static Object eqUndefinedOrImpl = FFI_STUB;
    public static Object eqUndefinedOrImpl(Object... args) { return null; }
    public static Object undefined = FFI_STUB;
    public static Object undefined(Object... args) { return null; }

public static final Object eqUndefinedOr = (java.util.function.Function<Object, Object>) (dictEq_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("eq", ((java.util.function.Function<Object, Object>) (Test_Data_UndefinedOr.eqUndefinedOrImpl)).apply(((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq"))); }};
public static final Object ordUndefinedOr = (java.util.function.Function<Object, Object>) (dictOrd_0) -> ((new java.util.function.Supplier<Object>() { Object eqUndefinedOr1_1 = new java.util.LinkedHashMap<String, Object>() {{ put("eq", ((java.util.function.Function<Object, Object>) (Test_Data_UndefinedOr.eqUndefinedOrImpl)).apply(((java.util.LinkedHashMap<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("Eq0"))).apply(null /* TODO: PrimUndefined */)).get("eq"))); }}; public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("compare", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Test_Data_UndefinedOr.compareUndefinedOrImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("compare"))); put("Eq0", (java.util.function.Function<Object, Object>) (_dollar__unused_2) -> eqUndefinedOr1_1); }}; } })).get();
}
