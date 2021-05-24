package club.cpacket.example;

import dev.binclub.bingait.api.BingaitPlugin;
import org.jetbrains.annotations.NotNull;

public class BinGaitExamplePlugin extends BingaitPlugin {

    // The id of your plugin.
    @NotNull
    private String id = "example_plugin";

    // The name of your plugin.
    @NotNull
    private String name = "ExamplePlugin";

    // The description of your plugin.
    @NotNull
    private String description = "This is an example description.";

    // The version of your plugin.
    @NotNull
    private String version = "1.0";

    @NotNull
    @Override
    public String getDescription() {
        return this.description; // Returns plugin description.
    }

    @NotNull
    @Override
    public String getId() {
        return this.id; // Returns plugin id.
    }

    @NotNull
    @Override
    public String getName() {
        return this.name; // Returns plugin name.
    }

    @NotNull
    @Override
    public String getVersion() {
        return this.version; // Returns plugin version.
    }
}