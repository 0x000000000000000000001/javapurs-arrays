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
