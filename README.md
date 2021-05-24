# BinGait example plugin

This is a simple example plugin on how to get started on making your plugin for BinGait.

### You can find the BinGait API (here)[https://github.com/CPacketCustomPayload/BinGait-example-plugin/releases/download/1.0/bingait-api.jar].
You need to add the API jar as a compiled dependency to your project. To see how to do this, please visit [this reference](https://www.jetbrains.com/help/idea/working-with-module-dependencies.html).

## BinGait API Documentation
You can check out my BinGait API documentation [here](https://cpacketcustompayload.gitbook.io/bingait-api-docs/).

## Building and using your plugin
To build your plugin, use the `./gradlew build` command in terminal and this will create a directory called `build/libs` which will contain your built jar.


To install your BinGait plugin:

1. Go to the `plugins` folder in your BinGait folder.
2. Drop your jar into the folder.
3. Start up BinGait, go to plugins > manage > your plugin > and enable it.

You can now use your plugin!

