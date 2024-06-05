public class TestColour 
{
    public static void main (String[] args) 
    {
        assert "Red".equals(Code.determineColor(1)): "pathNumber = 1";
        assert "Orange".equals(Code.determineColor(2)): "pathNumber = 2";
        assert "Yellow".equals(Code.determineColor(3)): "pathNumber = 3";
        assert "Green".equals(Code.determineColor(4)): "pathNumber = 4";
        assert "Sky Blue".equals(Code.determineColor(5)): "pathNumber = 5";
        assert "Indigo".equals(Code.determineColor(6)): "pathNumber = 6";
        assert "Violet".equals(Code.determineColor(7)): "pathNumber = 7";
        assert "Magenta".equals(Code.determineColor(8)): "pathNumber = 8";
        assert "Gold".equals(Code.determineColor(9)): "pathNumber = 9";
        assert "Invalid".equals(Code.determineColor(10)): "pathNumber = 10";
        assert "Silver".equals(Code.determineColor(11)): "pathNumber = 11";
        assert "White".equals(Code.determineColor(22)): "pathNumber = 22";
        assert "Crimson".equals(Code.determineColor(33)): "pathNumber = 33";
        assert "Invalid".equals(Code.determineColor(0)): "pathNumber < 1";
        assert "Invalid".equals(Code.determineColor(15)): "11 < pathNumber < 12";
        assert "Invalid".equals(Code.determineColor(25)): "22 < pathNumber < 33";
        assert "Invalid".equals(Code.determineColor(35)): "33 < pathNumber";
    }
}
