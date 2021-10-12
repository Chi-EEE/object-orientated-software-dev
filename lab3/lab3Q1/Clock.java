import java.util.Calendar;

public class Clock {
	public static void main(String args[]) 
	{
        Calendar cal = Calendar.getInstance();
        Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        int currentSecond = currentTime.getSecond();
        long startingTime = System.currentTimeMillis();
        while (true)
        {
            if (System.currentTimeMillis() - startingTime >= 1000)
            {
                startingTime = System.currentTimeMillis();
                currentTime.tick();
                System.out.println(currentTime.toString());
                if (currentSecond == currentTime.getSecond())
                {
                    break;
                }
            }
        }
    }
}
