public final class __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O copy(__Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) return ((__Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("init_");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) return ((__Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("input");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) return ((__Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("p");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) return ((__Record$69_6e_69_74_5f_O$69_6e_70_75_74_O$70_O$72_65_73_74_5f_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("rest_");
    }
    @Override public Object get(Object key) {
        if ("init_".equals(key)) return field0;
        if ("input".equals(key)) return field1;
        if ("p".equals(key)) return field2;
        if ("rest_".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "init_".equals(key) || "input".equals(key) || "p".equals(key) || "rest_".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
