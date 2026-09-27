    // Port of Data/Array/NonEmpty/Internal.js. The JavaScript trampoline only
    // avoids deep recursion; the folds below keep the same order.
    public static Object foldr1Impl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] array = (Object[]) xs;
            Object acc = array[array.length - 1];
            for (int index = array.length - 2; index >= 0; index--) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(array[index])).apply(acc);
            }
            return acc;
        };

    public static Object foldl1Impl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] array = (Object[]) xs;
            Object acc = array[0];
            for (int index = 1; index < array.length; index++) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(acc)).apply(array[index]);
            }
            return acc;
        };

    public static Object traverse1Impl = (java.util.function.Function<Object, Object>) (apply) ->
        (java.util.function.Function<Object, Object>) (map) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (arrayObj) -> {
            Object[] array = (Object[]) arrayObj;
            java.util.function.Function<Object, Object> finalCell = head -> {
                java.util.List<Object> single = new java.util.ArrayList<>();
                single.add(head);
                return single;
            };
            java.util.function.Function<Object, Object> consList = x ->
                (java.util.function.Function<Object, Object>) xs -> {
                    java.util.List<Object> out = new java.util.ArrayList<>();
                    out.add(x);
                    out.addAll((java.util.List<Object>) xs);
                    return out;
                };
            java.util.function.Function<Object, Object> listToArray = list ->
                ((java.util.List<Object>) list).toArray(new Object[0]);
            Object acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(finalCell))
                .apply(((java.util.function.Function<Object, Object>) f).apply(array[array.length - 1]));
            for (int index = array.length - 2; index >= 0; index--) {
                Object mapped = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(consList))
                    .apply(((java.util.function.Function<Object, Object>) f).apply(array[index]));
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) apply).apply(mapped)).apply(acc);
            }
            return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(listToArray)).apply(acc);
        };
