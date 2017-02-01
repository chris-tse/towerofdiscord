import com.darichey.discord.api.Command;
import com.darichey.discord.api.CommandRegistry;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class Tool {
    public static void print(String input) {
        System.out.println(input);
    }

    private static void sendMessage(IChannel channel, String message) {
        try {
            channel.sendMessage(message);
        } catch (MissingPermissionsException | DiscordException | RateLimitException e) {
            e.printStackTrace();
        }
    }

    static Command ping = new Command("ping")
            .withDescription("Ping -> Pong!")
            .onExecuted(context ->
                    Tool.sendMessage(context.getMessage().getChannel(), "Pong!")
            );

    static Command fuck = new Command("fuck")
            .withDescription("o lo")
            .onExecuted(context ->
                    Tool.sendMessage(context.getMessage().getChannel(), "いやだ、さわらないで～ :djbjanai:")
            );


}