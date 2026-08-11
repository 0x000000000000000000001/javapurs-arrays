public class Data_Divisible {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object divisiblePredicate = new java.util.LinkedHashMap<String, Object>() {{ put("conquer", (java.util.function.Function<Object, Object>) (v_0) -> true); put("Divide0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Divide.dividePredicate); }};
public static final Object divisibleOp = (java.util.function.Function<Object, Object>) (dictMonoid_0) -> ((new java.util.function.Supplier<Object>() { Object divideOp_1 = ((java.util.function.Function<Object, Object>) (Data_Divide.divideOp)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictMonoid_0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); public Object get() { return new java.util.LinkedHashMap<String, Object>() {{ put("conquer", ((new java.util.function.Supplier<Object>() { Object __local_var_2 = ((java.util.LinkedHashMap<String, Object>) dictMonoid_0).get("mempty"); public Object get() { return (java.util.function.Function<Object, Object>) (v_3) -> __local_var_2; } })).get()); put("Divide0", (java.util.function.Function<Object, Object>) (_dollar__unused_2) -> divideOp_1); }}; } })).get();
public static final Object divisibleEquivalence = new java.util.LinkedHashMap<String, Object>() {{ put("conquer", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> true); put("Divide0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Divide.divideEquivalence); }};
public static final Object divisibleComparison = new java.util.LinkedHashMap<String, Object>() {{ put("conquer", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> new Data_Ordering.EQ()); put("Divide0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Divide.divideComparison); }};
public static final Object conquer = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("conquer");
}
