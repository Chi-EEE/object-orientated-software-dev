import java.util.Calendar;

public class Clock {
	public static void main(String args[]) 
	{
		// Get calender
        Calendar cal = Calendar.getInstance();
        
        // Current time
        Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        int currentSecond = currentTime.getSecond();
        long startingTime = System.currentTimeMillis();
        while (true) // While the function is true
        {
            if (System.currentTimeMillis() - startingTime >= 1000)
            {
                startingTime = System.currentTimeMillis();
                currentTime.tick(); // Tick once
                System.out.println(currentTime.toString());
                if (currentSecond == currentTime.getSecond()) // When the seconds is the same as the current second
                {
                    break;
                }
            }
        }
    }
}
