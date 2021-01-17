package Bot;

import javax.security.auth.login.LoginException;



import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;



public class Main {

	public static JDA jda;
	public static String prefix = "!";
	
	public static void main(String[] args) throws LoginException {
	JDA jda = JDABuilder.createDefault("Nzk4MzcwMjc1OTAxMTc3OTA5.X_0CQg.UJFgLQexQLMldnT098NUqG2IY8I").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE); 
		jda.getPresense().setActivity(Activity.playing("test"));
	jda.addEventListener(new Commands());
}
}
