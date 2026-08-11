public class Test_Data_UndefinedOr {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object compareUndefinedOrImpl = FFI_STUB;
    public static Object defined = FFI_STUB;
    public static Object eqUndefinedOrImpl = FFI_STUB;
    public static Object undefined = FFI_STUB;

public static final Object eqUndefinedOr = (java.util.function.Function<Object, Object>) (dictEq_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (__local_var_1) -> (java.util.function.Function<Object, Object>) (__local_var_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq"))).apply(__local_var_1))).apply(__local_var_2)); }};
public static final Object ordUndefinedOr = (java.util.function.Function<Object, Object>) (dictOrd_0) -> ((new java.util.function.Supplier<Object>() { Object eqUndefinedOr1_1 = ((new java.util.function.Supplier<Object>() { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("Eq0"))).apply(null /* TODO: PrimUndefined */); public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (__local_var_2) -> (java.util.function.Function<Object, Object>) (__local_var_3) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) __local_var_1).get("eq"))).apply(__local_var_2))).apply(__local_var_3)); }}; } })).get(); public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("compare", (java.util.function.Function<Object, Object>) (__local_var_2) -> (java.util.function.Function<Object, Object>) (__local_var_3) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("compare"))).apply(__local_var_2))).apply(__local_var_3)); put("Eq0", (java.util.function.Function<Object, Object>) (_dollar__unused_2) -> eqUndefinedOr1_1); }}; } })).get();
}
