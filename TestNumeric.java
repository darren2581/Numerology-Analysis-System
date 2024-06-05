public class TestNumeric {
    public static void main(String[] args) {
        assert true == Code.isNumeric("1987");
        assert false == Code.isNumeric("abcd");
    }
}
