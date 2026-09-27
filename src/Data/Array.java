    // Port of Data/Array.js. Arrays are Object[] in this backend.
    private static final class __ArrayCons {
        final Object head;
        final Object tail;
        __ArrayCons(Object head, Object tail) { this.head = head; this.tail = tail; }
    }

    public static Object fromFoldableImpl = (java.util.function.Function<Object, Object>) (foldr) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object emptyList = new Object();
            java.util.function.Function<Object, Object> curryCons = head ->
                (java.util.function.Function<Object, Object>) tail -> new __ArrayCons(head, tail);
            Object list = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) foldr)
                .apply(curryCons)).apply(emptyList)).apply(xs);
            java.util.List<Object> out = new java.util.ArrayList<>();
            Object current = list;
            while (current != emptyList) {
                __ArrayCons cons = (__ArrayCons) current;
                out.add(cons.head);
                current = cons.tail;
            }
            return out.toArray(new Object[0]);
        };

    public static Object rangeImpl = (java.util.function.Function<Object, Object>) (start_obj) -> (java.util.function.Function<Object, Object>) (end_obj) -> {
        int start = ((Number) start_obj).intValue();
        int end = ((Number) end_obj).intValue();
        int step = start > end ? -1 : 1;
        int len = step > 0 ? end - start + 1 : start - end + 1;
        Object[] result = new Object[len];
        int i = start;
        int n = 0;
        while (i != end) {
            result[n++] = i;
            i += step;
        }
        result[n] = i;
        return result;
    };
    public static Object replicateImpl = (java.util.function.Function<Object, Object>) (count_obj) ->
        (java.util.function.Function<Object, Object>) (value) -> {
            int count = ((Number) count_obj).intValue();
            if (count < 1) return new Object[0];
            Object[] result = new Object[count];
            java.util.Arrays.fill(result, value);
            return result;
        };
    public static Object length = (java.util.function.Function<Object, Object>) (xs) -> {
        return ((Object[]) xs).length;
    };
    public static Object unconsImpl = (java.util.function.Function<Object, Object>) (empty) -> (java.util.function.Function<Object, Object>) (next) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        if (arr.length == 0) return ((java.util.function.Function<Object, Object>) empty).apply(null);
        Object head = arr[0];
        Object[] tail = java.util.Arrays.copyOfRange(arr, 1, arr.length);
        return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) next).apply(head))).apply(tail);
    };
    public static Object indexImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (xs) -> (java.util.function.Function<Object, Object>) (i) -> {
        Object[] arr = (Object[]) xs;
        int index = ((Number) i).intValue();
        if (index < 0 || index >= arr.length) return nothing;
        return ((java.util.function.Function<Object, Object>) just).apply(arr[index]);
    };
    public static Object findMapImpl = (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (isJust) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] arr = (Object[]) xs;
            for (Object item : arr) {
                Object result = ((java.util.function.Function<Object, Object>) f).apply(item);
                if ((Boolean) ((java.util.function.Function<Object, Object>) isJust).apply(result)) return result;
            }
            return nothing;
        };
    public static Object findIndexImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        for (int i = 0; i < arr.length; i++) {
            if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(arr[i])) {
                return ((java.util.function.Function<Object, Object>) just).apply(i);
            }
        }
        return nothing;
    };
    public static Object findLastIndexImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] arr = (Object[]) xs;
            for (int i = arr.length - 1; i >= 0; i--) {
                if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(arr[i])) {
                    return ((java.util.function.Function<Object, Object>) just).apply(i);
                }
            }
            return nothing;
        };
    public static Object _insertAt = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (l) -> {
            Object[] arr = (Object[]) l;
            int index = ((Number) i).intValue();
            if (index < 0 || index > arr.length) return nothing;
            Object[] out = new Object[arr.length + 1];
            System.arraycopy(arr, 0, out, 0, index);
            out[index] = a;
            System.arraycopy(arr, index, out, index + 1, arr.length - index);
            return ((java.util.function.Function<Object, Object>) just).apply(out);
        };
    public static Object _deleteAt = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (l) -> {
            Object[] arr = (Object[]) l;
            int index = ((Number) i).intValue();
            if (index < 0 || index >= arr.length) return nothing;
            Object[] out = new Object[arr.length - 1];
            System.arraycopy(arr, 0, out, 0, index);
            System.arraycopy(arr, index + 1, out, index, arr.length - index - 1);
            return ((java.util.function.Function<Object, Object>) just).apply(out);
        };
    public static Object _updateAt = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (l) -> {
            Object[] arr = (Object[]) l;
            int index = ((Number) i).intValue();
            if (index < 0 || index >= arr.length) return nothing;
            Object[] out = arr.clone();
            out[index] = a;
            return ((java.util.function.Function<Object, Object>) just).apply(out);
        };
    public static Object reverse = (java.util.function.Function<Object, Object>) (l) -> {
        Object[] arr = ((Object[]) l).clone();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            Object tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    };
    public static Object concat = (java.util.function.Function<Object, Object>) (xss) -> {
        Object[] arrays = (Object[]) xss;
        int total = 0;
        for (Object array : arrays) total += ((Object[]) array).length;
        Object[] out = new Object[total];
        int offset = 0;
        for (Object array : arrays) {
            Object[] current = (Object[]) array;
            System.arraycopy(current, 0, out, offset, current.length);
            offset += current.length;
        }
        return out;
    };
    public static Object filterImpl = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        java.util.List<Object> res = new java.util.ArrayList<>();
        for (Object x : arr) {
            if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(x)) {
                res.add(x);
            }
        }
        return res.toArray(new Object[0]);
    };
    public static Object partitionImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] arr = (Object[]) xs;
            java.util.List<Object> yes = new java.util.ArrayList<>();
            java.util.List<Object> no = new java.util.ArrayList<>();
            for (Object x : arr) {
                if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(x)) yes.add(x);
                else no.add(x);
            }
            java.util.Map<String, Object> result = new java.util.LinkedHashMap<>();
            result.put("yes", yes.toArray(new Object[0]));
            result.put("no", no.toArray(new Object[0]));
            return result;
        };
    public static Object scanlImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] arr = (Object[]) xs;
            Object[] out = new Object[arr.length];
            Object acc = b;
            for (int i = 0; i < arr.length; i++) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(acc)).apply(arr[i]);
                out[i] = acc;
            }
            return out;
        };
    public static Object scanrImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] arr = (Object[]) xs;
            Object[] out = new Object[arr.length];
            Object acc = b;
            for (int i = arr.length - 1; i >= 0; i--) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(arr[i])).apply(acc);
                out[i] = acc;
            }
            return out;
        };
    public static Object sortByImpl = (java.util.function.Function<Object, Object>) (compare) ->
        (java.util.function.Function<Object, Object>) (fromOrdering) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] out = ((Object[]) xs).clone();
            java.util.Arrays.sort(out, (java.util.Comparator<Object>) (a, b) -> ((Number)
                ((java.util.function.Function<Object, Object>) fromOrdering).apply(
                    ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) compare).apply(a)).apply(b))).intValue());
            return out;
        };
    public static Object sliceImpl = (java.util.function.Function<Object, Object>) (s) -> (java.util.function.Function<Object, Object>) (e) -> (java.util.function.Function<Object, Object>) (l) -> {
        Object[] arr = (Object[]) l;
        int start = Math.max(0, ((Number) s).intValue());
        int end = Math.min(arr.length, ((Number) e).intValue());
        start = Math.min(start, arr.length);
        end = Math.max(start, end);
        return java.util.Arrays.copyOfRange(arr, start, end);
    };
    public static Object zipWithImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Function<Object, Object>) (ys) -> {
            Object[] left = (Object[]) xs;
            Object[] right = (Object[]) ys;
            int length = Math.min(left.length, right.length);
            Object[] out = new Object[length];
            for (int i = 0; i < length; i++) {
                out[i] = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(left[i])).apply(right[i]);
            }
            return out;
        };
    public static Object anyImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            for (Object x : (Object[]) xs) {
                if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(x)) return true;
            }
            return false;
        };
    public static Object allImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            for (Object x : (Object[]) xs) {
                if (!(Boolean) ((java.util.function.Function<Object, Object>) f).apply(x)) return false;
            }
            return true;
        };
    public static Object unsafeIndexImpl = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Function<Object, Object>) (i) ->
            ((Object[]) xs)[((Number) i).intValue()];
