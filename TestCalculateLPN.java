public class TestCalculateLPN 
{
    public static void main (String[] args) 
    {
        assert -1 == Code.calculateLifePathNumber("0", "0", "1870"): "day<1 AND month<1 AND year<1901";
        assert -1 == Code.calculateLifePathNumber("10", "0", "1899"): "day>1 AND month<1 AND year<1901";
        assert -1 == Code.calculateLifePathNumber("0", "5", "1890"): "day<1 AND month>1 AND year<1901";
        assert -1 == Code.calculateLifePathNumber("0", "0", "1950"): "day<1 AND month<1 AND year>1901";
        assert -1 == Code.calculateLifePathNumber("11", "5", "1880"): "day>1 AND month>1 AND year<1901";
        assert -1 == Code.calculateLifePathNumber("30", "0", "1960"): "day>1 AND month<1 AND year>1901";
        assert -1 == Code.calculateLifePathNumber("0", "9", "2000"): "day<1 AND month>1 AND year>1901";
        assert 22 == Code.calculateLifePathNumber("13", "11", "1987"): "day>1 AND month>1 AND year>1901";
        assert -1 == Code.calculateLifePathNumber("35", "15", "2004"): "day>31 AND month>12 AND year>2024";
        assert -1 == Code.calculateLifePathNumber("30", "0", "1999"): "1<=day<=31 AND month<1 AND year<2024";
        assert -1 == Code.calculateLifePathNumber("0", "3", "1987"): "day<1 AND 1<=month<=12 AND year<2024";
        assert -1 == Code.calculateLifePathNumber("0", "0", "2007"): "day<1 AND month<1 AND 1901<=year<=2024";
        assert 11 == Code.calculateLifePathNumber("25", "10", "2010"): "1<=day<=31 AND 1<=month<=12 AND year<2024";
        assert -1 == Code.calculateLifePathNumber("15", "0", "2023"): "1<=day<=31 AND month<1 AND 1901<=year<=2024";
        assert -1 == Code.calculateLifePathNumber("0", "2", "1999"): "day<1 AND 1<=month<=12 AND 1901<=year<=2024";
        assert -1 == Code.calculateLifePathNumber("3", "6", "2030"): "1<=day<=31 AND month>1 AND year>2024";
        assert -1 == Code.calculateLifePathNumber("7", "9", "2027"): "day>1 AND 1<=month<=12 AND year>2024";
        assert 36 == Code.calculateLifePathNumber("29", "5", "1991"): "day>1 AND month>1 AND 1901<=year<=2024";
        assert 12 == Code.calculateLifePathNumber("2", "4", "2004"): "1<=day<=31 AND 1<=month<=12 AND year>2024";
        assert 38 == Code.calculateLifePathNumber("28", "9", "1945"): "1<=day<=31 AND month>1 AND 1901<=year<=2024";
        assert 35 == Code.calculateLifePathNumber("5", "5", "1987"): "day>1 AND 1<=month<=12 AND 1901<=year<=2024";
        assert 22 == Code.calculateLifePathNumber("13", "11", "1987"): "1<=day<=31 AND 1<=month<=12 AND 1901<=year<=2024";

        //Add last four digit and last name from student ID
        assert -1 == Code.calculateLifePathNumber("5799", "5799", "5799"): "Add last four digit from Student ID";
        assert -1 == Code.calculateLifePathNumber("Tan", "Tan", "Tan"): "Add last name from Student ID";
        assert -1 == Code.calculateLifePathNumber("Tan", "Darren", "5799"): "Add name from Student ID";
    }
}
