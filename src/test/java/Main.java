import com.darichey.discord.api.Command;
import com.darichey.discord.api.CommandRegistry;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static IDiscordClient client;
    private static String TOKEN = "Mjc2MDQ5NjA2MTU1MDQyODE5.C3LyBw.W1cY9zQNSzSaay0sksDuUg7gvPg";

    public static void main(String[] args) {
        try {
            client = new ClientBuilder().withToken(TOKEN).login();



        } catch (DiscordException e) {
            e.printStackTrace();
        }
    }
}