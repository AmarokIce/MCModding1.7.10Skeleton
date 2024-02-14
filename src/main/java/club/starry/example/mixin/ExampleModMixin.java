package club.starry.example.mixin;

import club.starry.example.ExampleMod;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleModMixin {
    @Inject(method = "loadAllWorlds(Ljava/lang/String;Ljava/lang/String;JLnet/minecraft/world/WorldType;Ljava/lang/String;)V", at = @At(value = "HEAD"))
    private void onLoadAllWorld(String folderName, String worldName, long worldSeed, WorldType terrainType, String generatorOptions, CallbackInfo ci) {
        ExampleMod.LOG.info("Now load all world. Mixin love from your example mod.");
    }
}
