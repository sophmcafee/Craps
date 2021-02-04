
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
private int roll;
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        // put your code here
        int roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    public int getResult()
    {
        return roll;
    }
}
