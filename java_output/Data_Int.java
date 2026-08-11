public class Data_Int {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object fromNumberImpl = FFI_STUB;
    public static Object fromNumberImpl(Object... args) { return null; }
    public static Object fromStringAsImpl = FFI_STUB;
    public static Object fromStringAsImpl(Object... args) { return null; }
    public static Object pow = FFI_STUB;
    public static Object pow(Object... args) { return null; }
    public static Object quot = FFI_STUB;
    public static Object quot(Object... args) { return null; }
    public static Object rem = FFI_STUB;
    public static Object rem(Object... args) { return null; }
    public static Object toNumber = FFI_STUB;
    public static Object toNumber(Object... args) { return null; }
    public static Object toStringAs = FFI_STUB;
    public static Object toStringAs(Object... args) { return null; }

public static final class Even {
            
            public Even() {
                
            }
        }
public static final class Odd {
            
            public Odd() {
                
            }
        }
public static final Object greaterThanOrEq = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordIntImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()); public Object get() { return (java.util.function.Function<Object, Object>) (a1_1) -> (java.util.function.Function<Object, Object>) (a2_2) -> ( ((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__local_var_0)).apply(a1_1))).apply(a2_2) instanceof Data_Ordering.LT))) ? false : true); } })).get();
public static final Object lessThanOrEq = ((new java.util.function.Supplier<Object>() { Object __local_var_0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordIntImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()); public Object get() { return (java.util.function.Function<Object, Object>) (a1_1) -> (java.util.function.Function<Object, Object>) (a2_2) -> ( ((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__local_var_0)).apply(a1_1))).apply(a2_2) instanceof Data_Ordering.GT))) ? false : true); } })).get();
public static final Object Even = new Data_Int.Even();
public static final Object Odd = new Data_Int.Odd();
public static final Object showParity = new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_0) -> ( ((Boolean) ((v_0 instanceof Data_Int.Even))) ? "Even" : ( ((Boolean) ((v_0 instanceof Data_Int.Odd))) ? "Odd" : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); }};
public static final Object radix = (java.util.function.Function<Object, Object>) (n_0) -> ( ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Data_HeytingAlgebra.heytingAlgebraBoolean).get("conj"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.greaterThanOrEq)).apply(n_0))).apply(2)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.lessThanOrEq)).apply(n_0))).apply(36)))) ? new Data_Maybe.Just(n_0) : new Data_Maybe.Nothing());
public static final Object odd = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Data_Eq.eqBoolean).get("eq"))).apply((((Integer) (null /* TODO: Op2 */)) == ((Integer) (0)))))).apply(false);
public static final Object octal = 8;
public static final Object hexadecimal = 16;
public static final Object fromStringAs = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.fromStringAsImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object fromString = ((java.util.function.Function<Object, Object>) (Data_Int.fromStringAs)).apply(10);
public static final Object fromNumber = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Int.fromNumberImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object unsafeClamp = (java.util.function.Function<Object, Object>) (x_0) -> ( ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Data_HeytingAlgebra.heytingAlgebraBoolean).get("not"))).apply(((java.util.function.Function<Object, Object>) (Data_Number.isFinite)).apply(x_0)))) ? 0 : ( ((Boolean) (( ((Boolean) (null /* TODO: Op2 */)) ? false : true))) ? ((java.util.LinkedHashMap<String, Object>) Data_Bounded.boundedInt).get("top") : ( ((Boolean) (( ((Boolean) (null /* TODO: Op2 */)) ? false : true))) ? ((java.util.LinkedHashMap<String, Object>) Data_Bounded.boundedInt).get("bottom") : ((new java.util.function.Supplier<Object>() { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (Data_Int.fromNumber)).apply(x_0); public Object get() { return ( ((Boolean) ((__local_var_1 instanceof Data_Maybe.Nothing))) ? 0 : ( ((Boolean) ((__local_var_1 instanceof Data_Maybe.Just))) ? (((Data_Maybe.Just) __local_var_1).value0) : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())); } })).get())));
public static final Object round = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.round)).apply(x_0));
public static final Object trunc = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.trunc)).apply(x_0));
public static final Object floor = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.floor)).apply(x_0));
public static final Object even = (java.util.function.Function<Object, Object>) (x_0) -> (((Integer) (null /* TODO: Op2 */)) == ((Integer) (0)));
public static final Object parity = (java.util.function.Function<Object, Object>) (n_0) -> ( ((Boolean) ((((Integer) (null /* TODO: Op2 */)) == ((Integer) (0))))) ? new Data_Int.Even() : new Data_Int.Odd());
public static final Object eqParity = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (x_0) -> (java.util.function.Function<Object, Object>) (y_1) -> ( ((Boolean) ((x_0 instanceof Data_Int.Even))) ? ( ((Boolean) ((y_1 instanceof Data_Int.Even))) ? true : false) : ( ((Boolean) (null /* TODO: Op2 */)) ? true : false))); }};
public static final Object ordParity = new java.util.LinkedHashMap<String, Object>() {{ put("compare", (java.util.function.Function<Object, Object>) (x_0) -> (java.util.function.Function<Object, Object>) (y_1) -> ( ((Boolean) ((x_0 instanceof Data_Int.Even))) ? ( ((Boolean) ((y_1 instanceof Data_Int.Even))) ? new Data_Ordering.EQ() : new Data_Ordering.LT()) : ( ((Boolean) ((y_1 instanceof Data_Int.Even))) ? new Data_Ordering.GT() : ( ((Boolean) (null /* TODO: Op2 */)) ? new Data_Ordering.EQ() : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get())))); put("Eq0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.eqParity); }};
public static final Object semiringParity = new java.util.LinkedHashMap<String, Object>() {{ put("zero", new Data_Int.Even()); put("add", (java.util.function.Function<Object, Object>) (x_0) -> (java.util.function.Function<Object, Object>) (y_1) -> ( ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Data_Int.eqParity).get("eq"))).apply(x_0))).apply(y_1))) ? new Data_Int.Even() : new Data_Int.Odd())); put("one", new Data_Int.Odd()); put("mul", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> ( ((Boolean) (null /* TODO: Op2 */)) ? new Data_Int.Odd() : new Data_Int.Even())); }};
public static final Object ringParity = new java.util.LinkedHashMap<String, Object>() {{ put("sub", ((java.util.LinkedHashMap<String, Object>) Data_Int.semiringParity).get("add")); put("Semiring0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.semiringParity); }};
public static final Object divisionRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("recip", (java.util.function.Function<Object, Object>) (x_0) -> x_0); put("Ring0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.ringParity); }};
public static final Object decimal = 10;
public static final Object commutativeRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("Ring0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.ringParity); }};
public static final Object euclideanRingParity = new java.util.LinkedHashMap<String, Object>() {{ put("degree", (java.util.function.Function<Object, Object>) (v_0) -> ( ((Boolean) ((v_0 instanceof Data_Int.Even))) ? 0 : ( ((Boolean) ((v_0 instanceof Data_Int.Odd))) ? 1 : ((java.util.function.Supplier<Object>) () -> { throw new RuntimeException("Failed pattern match"); }).get()))); put("div", (java.util.function.Function<Object, Object>) (x_0) -> (java.util.function.Function<Object, Object>) (v_1) -> x_0); put("mod", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> new Data_Int.Even()); put("CommutativeRing0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.commutativeRingParity); }};
public static final Object ceil = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_Int.unsafeClamp)).apply(((java.util.function.Function<Object, Object>) (Data_Number.ceil)).apply(x_0));
public static final Object boundedParity = new java.util.LinkedHashMap<String, Object>() {{ put("bottom", new Data_Int.Even()); put("top", new Data_Int.Odd()); put("Ord0", (java.util.function.Function<Object, Object>) (_dollar__unused_0) -> Data_Int.ordParity); }};
public static final Object binary = 2;
public static final Object base36 = 36;
}
