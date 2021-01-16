package Bot;

import java.util.concurrent.TimeUnit;

import net.dv8tion.jda.api.EmbedBuilder;import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	
	
	
	
	
	// Message Gather
	
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) { 
	//user information like the input and the author name and pfp
		String[] commandlist = event.getMessage().getContentRaw().split(",");
		String author = event.getAuthor().getName().toString();
		String authorpic = event.getAuthor().getAvatarUrl().toString();
		long messageid = event.getMessageIdLong();
		
	
		
		
		
		//Embeds will create for !scrimhelp
		EmbedBuilder register = new EmbedBuilder();
		if(commandlist[0].equals(Main.prefix + "scrimhelp")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("This is the Format and need to be seperated by commas\n!scrim,(team_name),(time),(date),(match type)\n").queue();
		}
		//scrim command
		 if(commandlist[0].equals(Main.prefix + "scrim")){
			
			 register.setTitle("✨🎈Scrimmage Time!!🎈✨");
			register.addField( "General Information\n\nTeam Name: "+commandlist[1]+"\n\nTime: "+ commandlist[2]+"\n\nDate: "+commandlist[3]+"\n\nMaps: "+commandlist[4],/*Must Empty --->*/"",true);
			register.addField("","", false);
			register.setAuthor(author);
			register.setImage(authorpic);
		    register.setFooter("Created by MorsHs");
		    register.setThumbnail(authorpic);
		    event.getChannel().sendMessage(register.build()).queue();	
		 // deletes the 1st user input
		    event.getChannel().deleteMessageById(messageid).queueAfter(1, TimeUnit.NANOSECONDS);
		}	
	}
	
	}	

