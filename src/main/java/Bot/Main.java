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
	JDA jda = JDABuilder.createDefault("INSERT TOKEN").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE); 
		jda.getPresense().setActivity(Activity.playing("test"));
	jda.addEventListener(new Commands());
}
}
