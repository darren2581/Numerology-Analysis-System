public class TestGeneration {
    public static void main(String[] args) 
    {
        assert "Unknown Generation".equals(Code.Generations("1900")): "year < 1901";
        assert "Silent Generation".equals(Code.Generations("1920")): "1901 <= year <= 1945";
        assert "Baby Boomers Generation".equals(Code.Generations("1955")): "1946 <= year <= 1964";
        assert "Generation X".equals(Code.Generations("1970")): "1965 <= year <= 1979";
        assert "Millennials Generation".equals(Code.Generations("1990")): "1980 <= year <= 1994";
        assert "Generation Z".equals(Code.Generations("2004")): "1995 <= year <= 2009";
        assert "Generation Alpha".equals(Code.Generations("2011")): "2010 <= year <= 2024";
        assert "Unknown Generation".equals(Code.Generations("2025")): "year > 2024";
    }
}
