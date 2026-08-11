public class Test_Main {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object discard = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Control_Bind.discardUnit).get("discard"))).apply(Effect.bindEffect);
public static final java.util.function.Supplier<Void> main = () -> {
            ((java.util.function.Supplier<Object>)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Test_Main.discard)).apply(Test_Data_Array.testArray))).apply((java.util.function.Function<Object, Object>) (_dollar__unused_0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Test_Main.discard)).apply(Test_Data_Array_ST.testArrayST))).apply((java.util.function.Function<Object, Object>) (_dollar__unused_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Test_Main.discard)).apply(Test_Data_Array_Partial.testArrayPartial))).apply((java.util.function.Function<Object, Object>) (_dollar__unused_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Test_Main.discard)).apply(Test_Data_Array_ST_Partial.testArraySTPartial))).apply((java.util.function.Function<Object, Object>) (_dollar__unused_3) -> Test_Data_Array_NonEmpty.testNonEmptyArray)))))).get();
            return null;
        };
}
