public class Effect_Ref {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _new = FFI_STUB;
    public static Object modifyImpl = FFI_STUB;
    public static Object newWithSelf = FFI_STUB;
    public static Object read = FFI_STUB;
    public static Object write = FFI_STUB;

public static final Object $void = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Effect.functorEffect).get("map"))).apply((java.util.function.Function<Object, Object>) (v_0) -> Data_Unit.unit);
public static final Object $new = Effect_Ref._new;
public static final Object modifyprime = Effect_Ref.modifyImpl;
public static final Object modify = (java.util.function.Function<Object, Object>) (f_0) -> ((java.util.function.Function<Object, Object>) (Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_1) -> ((new java.util.function.Supplier<Object>() { Object s_prime_2 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_1); public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("state", s_prime_2); put("value", s_prime_2); }}; } })).get());
public static final Object modify_ = (java.util.function.Function<Object, Object>) (f_0) -> (java.util.function.Function<Object, Object>) (s_1) -> ((java.util.function.Function<Object, Object>) (Effect_Ref.$void)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_2) -> ((new java.util.function.Supplier<Object>() { Object s_prime_3 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_2); public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("state", s_prime_3); put("value", s_prime_3); }}; } })).get()))).apply(s_1));
}
