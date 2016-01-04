#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#macro( ccase $str )
#foreach( $word in $artifactId.split('-') )$word.substring(0,1).toUpperCase()$word.substring(1)#end
#end
#set( $className = "#ccase( $artifactId )" )
package ${package};

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

public class ${className} extends JavaPlugin {
    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
    }

    // This code is called before the server stops and after the /reload command
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
    }
}
