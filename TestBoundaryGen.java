public class TestBoundaryGen 
{
    public static void main(String[] args) 
    {
        assert "Unknown Generation".equals(Code.Generations("1900")) : "year < 1901";
        assert "Silent Generation".equals(Code.Generations("1901")) : "1901 <= year <= 1945";
        assert "Silent Generation".equals(Code.Generations("1945")) : "1901 <= year <= 1945";
        assert "Baby Boomers Generation".equals(Code.Generations("1946")) : "1946 <= year <= 1964";
        assert "Baby Boomers Generation".equals(Code.Generations("1964")) : "1946 <= year <= 1964";
        assert "Generation X".equals(Code.Generations("1965")) : "1965 <= year <= 1979";
        assert "Generation X".equals(Code.Generations("1979")) : "1965 <= year <= 1979";
        assert "Millennials Generation".equals(Code.Generations("1980")) : "1980 <= year <= 1994";
        assert "Millennials Generation".equals(Code.Generations("1994")) : "1980 <= year <= 1994";
        assert "Generation Z".equals(Code.Generations("1995")) : "1995 <= year <= 2009";
        assert "Generation Z".equals(Code.Generations("2009")) : "1995 <= year <= 2009";
        assert "Generation Alpha".equals(Code.Generations("2010")) : "2010 <= year <= 2024";
        assert "Generation Alpha".equals(Code.Generations("2024")) : "2010 <= year <= 2024";
        assert "Unknown Generation".equals(Code.Generations("2025")) : "year > 2024";
    }
}
