public class TestReduceLPN 
{
    public static void main (String[] args) 
    {
        assert -1 == Code.reduceLifePathNumber(0): "sum < 1, lifePathNumber = -1";
        assert 4 == Code.reduceLifePathNumber(13): "sum > 9, lifePathNumber = 4";
        assert 7 == Code.reduceLifePathNumber(7): "1 <= sum <= 9, lifePathNumber = 7";
        assert 11 == Code.reduceLifePathNumber(11): "sum = 11, lifePathNumber = 11";
        assert 22 == Code.reduceLifePathNumber(22): "sum = 22, lifePathNumber = 22";
        assert 33 == Code.reduceLifePathNumber(33): "sum = 33, lifePathNumber = 33";
    }
}
