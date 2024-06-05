public class TestBooleanDOB 
{
    public static void main (String[] args)
    {
        assert true == Code.invalidDOB(0, 0, 1990): "day < 1 AND month < 1 AND year < 1901";
        assert true == Code.invalidDOB(5, 0, 1990): "day >= 1 AND month < 1 AND year < 1901";
        assert true == Code.invalidDOB(0, 9, 1990): "day < 1 AND month >= 1 AND year < 1901";
        assert true == Code.invalidDOB(0, 0, 1988): "day < 1 AND month < 1 AND year >= 1901";
        assert true == Code.invalidDOB(2, 7, 1900): "day >= 1 AND month >= 1 AND year < 1901";
        assert true == Code.invalidDOB(15, 0, 1987): "day => 1 AND month < 1 AND year >= 1901";
        assert true == Code.invalidDOB(0, 9, 1903): "day < 1 AND month >= 1 AND year >= 1901";
        assert false == Code.invalidDOB(13, 11,1987): "day >= 1 AND month >= 1 AND year >= 1901";
        assert true == Code.invalidDOB(50, 18, 2025): "day > 31 AND month > 12 AND year > 2024";
        assert true == Code.invalidDOB(27, 20, 2027): "day <= 31 AND month > 12 AND year > 2024";
        assert true == Code.invalidDOB(40, 2, 2031): "day > 31 AND month <= 12 AND year > 2024";
        assert true == Code.invalidDOB(34, 14, 2000): "day > 31 AND month > 12 AND year <= 2024";
        assert true == Code.invalidDOB(2, 4, 2033): "day <= 31 AND month <= 12 AND year > 2024";
        assert true == Code.invalidDOB(13, 16, 1999): "day <= 31 AND month > 12 AND year <= 2024";
        assert true == Code.invalidDOB(45, 9, 1962): "day > 31 AND month <= 12 AND year <= 2024";
        assert false == Code.invalidDOB(2, 4, 2004): "day <= 31 AND month <= 12 AND year <= 2024";
    }
}
