public class __M$Test_Data_UndefinedOr {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Test.Data.UndefinedOr"); }
    };
    // FFI provided by test/Test/Data/UndefinedOr.java
    // Port of test/Test/Data/UndefinedOr.js: the sentinel replaces undefined.
    private static final Object __undefined = new Object();

    public static Object undefined = __undefined;

    public static Object defined = (java.util.function.Function<Object, Object>) (x) -> x;

    public static Object eqUndefinedOrImpl = (java.util.function.Function<Object, Object>) (eq) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
            (a == __undefined && b == __undefined)
                || (Boolean) ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) eq).apply(a)).apply(b);

    public static Object compareUndefinedOrImpl = (java.util.function.Function<Object, Object>) (lt) ->
        (java.util.function.Function<Object, Object>) (eq) ->
        (java.util.function.Function<Object, Object>) (gt) ->
        (java.util.function.Function<Object, Object>) (compare) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) -> {
            if (a == __undefined && b == __undefined) return eq;
            if (a == __undefined) return lt;
            if (b == __undefined) return gt;
            return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) compare).apply(a)).apply(b);
        };


public static final Object eqUndefinedOr = __init$eqUndefinedOr();
    private static Object __init$eqUndefinedOr() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.eqUndefinedOrImpl)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0$r0)); return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }; }
public static final Object ordUndefinedOr = __init$ordUndefinedOr();
    private static Object __init$ordUndefinedOr() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { Object eqUndefinedOr1_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.eqUndefinedOr)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictOrd_0$r0).get("Eq0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Data_UndefinedOr.compareUndefinedOrImpl)).apply(__M$Data_Ordering.__singleton$LT.value))).apply(__M$Data_Ordering.__singleton$EQ.value))).apply(__M$Data_Ordering.__singleton$GT.value))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0)); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2$r2) -> { return eqUndefinedOr1_1$r1; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get(); }; }
}
