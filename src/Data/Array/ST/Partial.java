    // Port of Data/Array/ST/Partial.js: unchecked STArray access.
    public static Object peekImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () ->
                ((java.util.List<Object>) xs).get(((Number) i).intValue());

    public static Object pokeImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                ((java.util.List<Object>) xs).set(((Number) i).intValue(), a);
                return null;
            };
