    // Port of Data/Array/ST.js. An STArray is an ArrayList; ST values are
    // Suppliers, the convention the other ST ports use.
    public static Object $new = (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<Object>();

    public static Object unsafeFreezeImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) st).toArray(new Object[0]);

    public static Object unsafeThawImpl = (java.util.function.Function<Object, Object>) (arr) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>(java.util.Arrays.asList((Object[]) arr));

    public static Object thawImpl = (java.util.function.Function<Object, Object>) (arr) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>(java.util.Arrays.asList((Object[]) arr));

    public static Object freezeImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) st).toArray(new Object[0]);

    public static Object cloneImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>((java.util.List<Object>) st);

    public static Object peekImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int index = ((Number) i).intValue();
                return index >= 0 && index < list.size()
                    ? ((java.util.function.Function<Object, Object>) just).apply(list.get(index))
                    : nothing;
            };

    public static Object pokeImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int index = ((Number) i).intValue();
                if (index >= 0 && index < list.size()) { list.set(index, a); return true; }
                return false;
            };

    public static Object lengthImpl = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) xs).size();

    public static Object popImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                return list.isEmpty() ? nothing : ((java.util.function.Function<Object, Object>) just).apply(list.remove(list.size() - 1));
            };

    public static Object shiftImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                return list.isEmpty() ? nothing : ((java.util.function.Function<Object, Object>) just).apply(list.remove(0));
            };

    public static Object pushImpl = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                list.add(a);
                return list.size();
            };

    public static Object pushAllImpl = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                for (Object item : (Object[]) as) list.add(item);
                return list.size();
            };

    public static Object unshiftAllImpl = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                Object[] items = (Object[]) as;
                for (int index = items.length - 1; index >= 0; index--) list.add(0, items[index]);
                return list.size();
            };

    public static Object spliceImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (howMany) ->
        (java.util.function.Function<Object, Object>) (bs) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int start = Math.max(0, Math.min(((Number) i).intValue(), list.size()));
                int count = Math.max(0, Math.min(((Number) howMany).intValue(), list.size() - start));
                java.util.List<Object> removed = new java.util.ArrayList<>();
                for (int index = 0; index < count; index++) removed.add(list.remove(start));
                Object[] items = (Object[]) bs;
                for (int index = 0; index < items.length; index++) list.add(start + index, items[index]);
                return removed.toArray(new Object[0]);
            };

    public static Object sortByImpl = (java.util.function.Function<Object, Object>) (compare) ->
        (java.util.function.Function<Object, Object>) (fromOrdering) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                list.sort((java.util.Comparator<Object>) (a, b) -> ((Number)
                    ((java.util.function.Function<Object, Object>) fromOrdering).apply(
                        ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) compare).apply(a)).apply(b))).intValue());
                return list;
            };

    public static Object toAssocArrayImpl = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Supplier<Object>) () -> {
            java.util.List<Object> list = (java.util.List<Object>) xs;
            Object[] out = new Object[list.size()];
            for (int index = 0; index < list.size(); index++) {
                java.util.Map<String, Object> assoc = new java.util.LinkedHashMap<>();
                assoc.put("value", list.get(index));
                assoc.put("index", index);
                out[index] = assoc;
            }
            return out;
        };
