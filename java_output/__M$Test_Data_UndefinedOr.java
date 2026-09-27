public class __M$Test_Data_UndefinedOr {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Test.Data.UndefinedOr"); }
    };
    public static Object compareUndefinedOrImpl = FFI_STUB;
    public static Object compareUndefinedOrImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Test.Data.UndefinedOr.compareUndefinedOrImpl"); }
    public static Object defined = FFI_STUB;
    public static Object defined(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Test.Data.UndefinedOr.defined"); }
    public static Object eqUndefinedOrImpl = FFI_STUB;
    public static Object eqUndefinedOrImpl(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Test.Data.UndefinedOr.eqUndefinedOrImpl"); }
    public static Object undefined = FFI_STUB;
    public static Object undefined(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Test.Data.UndefinedOr.undefined"); }

public static final Object eqUndefinedOr = (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.eqUndefinedOrImpl)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0_i0)); return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); };
public static final Object ordUndefinedOr = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { Object eqUndefinedOr1_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.eqUndefinedOr)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictOrd_0_i0).get("Eq0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.compareUndefinedOrImpl)).apply(__M$Data_Ordering.__singleton$LT.value))).apply(__M$Data_Ordering.__singleton$EQ.value))).apply(__M$Data_Ordering.__singleton$GT.value))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0_i0)); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2_i2) -> { return eqUndefinedOr1_1_i1; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get(); };
}
