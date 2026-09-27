public final class __Record$69_6e_69_74_O$6c_61_73_74_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final int field1;
    __Record$69_6e_69_74_O$6c_61_73_74_I(String[] order, Object field0, int field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$69_6e_69_74_O$6c_61_73_74_I copy(__Record$69_6e_69_74_O$6c_61_73_74_I original, Object field0, int field1) {
        return new __Record$69_6e_69_74_O$6c_61_73_74_I(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$69_6e_69_74_O$6c_61_73_74_I) return ((__Record$69_6e_69_74_O$6c_61_73_74_I) value).field0;
        return ((java.util.Map<?, ?>) value).get("init");
    }
    public static int read1(Object value) {
        if (value instanceof __Record$69_6e_69_74_O$6c_61_73_74_I) return ((__Record$69_6e_69_74_O$6c_61_73_74_I) value).field1;
        return ((Integer) (((java.util.Map<?, ?>) value).get("last"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("init".equals(key)) return field0;
        if ("last".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "init".equals(key) || "last".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
