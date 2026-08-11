public class Data_Number_Format {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object toExponentialNative = FFI_STUB;
    public static Object toFixedNative = FFI_STUB;
    public static Object toPrecisionNative = FFI_STUB;
    public static Object toString = FFI_STUB;

public static final class Precision {
            public final Object value0;
            public Precision(Object value0) {
                this.value0 = value0;
            }
        }
public static final class Fixed {
            public final Object value0;
            public Fixed(Object value0) {
                this.value0 = value0;
            }
        }
public static final class Exponential {
            public final Object value0;
            public Exponential(Object value0) {
                this.value0 = value0;
            }
        }
public static final Object clamp = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordIntImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()); public Object get() { return (java.util.function.Function<Object, Object>) (low_1) -> (java.util.function.Function<Object, Object>) (hi_2) -> (java.util.function.Function<Object, Object>) (x_3) -> ((new java.util.function.Supplier<Object>() { Object v_4 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__local_var_0)).apply(low_1))).apply(x_3); public Object get() { return ((new java.util.function.Supplier<Object>() { Object __local_var_5 = ( ((Boolean) ((v_4 instanceof Data_Ordering.LT))) ? x_3 : ( ((Boolean) ((v_4 instanceof Data_Ordering.EQ))) ? low_1 : ( ((Boolean) ((v_4 instanceof Data_Ordering.GT))) ? low_1 : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); public Object get() { return ((new java.util.function.Supplier<Object>() { Object v_6 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__local_var_0)).apply(hi_2))).apply(__local_var_5); public Object get() { return ( ((Boolean) ((v_6 instanceof Data_Ordering.LT))) ? hi_2 : ( ((Boolean) ((v_6 instanceof Data_Ordering.EQ))) ? hi_2 : ( ((Boolean) ((v_6 instanceof Data_Ordering.GT))) ? __local_var_5 : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); } })).get(); } })).get(); } })).get(); } })).get();
public static final Object Precision = (java.util.function.Function<Object, Object>) (value0) -> new Data_Number_Format.Precision(value0);
public static final Object Fixed = (java.util.function.Function<Object, Object>) (value0) -> new Data_Number_Format.Fixed(value0);
public static final Object Exponential = (java.util.function.Function<Object, Object>) (value0) -> new Data_Number_Format.Exponential(value0);
public static final Object toStringWith = (java.util.function.Function<Object, Object>) (v_0) -> ( ((Boolean) ((v_0 instanceof Data_Number_Format.Precision))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toPrecisionNative)).apply((((Data_Number_Format.Precision) v_0).value0)) : ( ((Boolean) ((v_0 instanceof Data_Number_Format.Fixed))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toFixedNative)).apply((((Data_Number_Format.Fixed) v_0).value0)) : ( ((Boolean) ((v_0 instanceof Data_Number_Format.Exponential))) ? ((java.util.function.Function<Object, Object>) (Data_Number_Format.toExponentialNative)).apply((((Data_Number_Format.Exponential) v_0).value0)) : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())));
public static final Object precision = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Number_Format.clamp)).apply(1))).apply(21); public Object get() { return (java.util.function.Function<Object, Object>) (x_1) -> new Data_Number_Format.Precision(((java.util.function.Function<Object, Object>) (__local_var_0)).apply(x_1)); } })).get();
public static final Object fixed = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Number_Format.clamp)).apply(0))).apply(20); public Object get() { return (java.util.function.Function<Object, Object>) (x_1) -> new Data_Number_Format.Fixed(((java.util.function.Function<Object, Object>) (__local_var_0)).apply(x_1)); } })).get();
public static final Object exponential = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Number_Format.clamp)).apply(0))).apply(20); public Object get() { return (java.util.function.Function<Object, Object>) (x_1) -> new Data_Number_Format.Exponential(((java.util.function.Function<Object, Object>) (__local_var_0)).apply(x_1)); } })).get();
}
