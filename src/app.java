import java.util.Timer;
import java.util.TimerTask;

public class app {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTaskImp();
		timer.schedule(task, 0, 1);
	}

}
