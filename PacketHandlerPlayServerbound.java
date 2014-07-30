package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.play.PacketChatMessage;
import net.minecraft.network.play.PacketCheckTransaction;
import net.minecraft.network.play.PacketClickWindow;
import net.minecraft.network.play.PacketClientAbilities;
import net.minecraft.network.play.PacketClientPluginMessage;
import net.minecraft.network.play.PacketClientSettings;
import net.minecraft.network.play.PacketClientStatus;
import net.minecraft.network.play.PacketCloseWindow;
import net.minecraft.network.play.PacketCreativeInventoryAction;
import net.minecraft.network.play.PacketEnchantItem;
import net.minecraft.network.play.PacketEntityAction;
import net.minecraft.network.play.PacketHeldItemChange;
import net.minecraft.network.play.PacketPlayer;
import net.minecraft.network.play.PacketPlayerBlockPlacement;
import net.minecraft.network.play.PacketPlayerDigging;
import net.minecraft.network.play.PacketServerbound25;
import net.minecraft.network.play.PacketServerboundKeepAlive;
import net.minecraft.network.play.PacketSpectate;
import net.minecraft.network.play.PacketSteerVehicle;
import net.minecraft.network.play.PacketSwingArm;
import net.minecraft.network.play.PacketTabComplete;
import net.minecraft.network.play.PacketUpdateSign;
import net.minecraft.network.play.PacketUseEntity;

public interface PacketHandlerPlayServerbound extends PacketHandler {

   void handle(PacketSwingArm var1);

   void handle(PacketChatMessage var1);

   void handle(PacketTabComplete var1);

   void handle(PacketClientStatus var1);

   void handle(PacketClientSettings var1);

   void handle(PacketCheckTransaction var1);

   void handle(PacketEnchantItem var1);

   void handle(PacketClickWindow var1);

   void handle(PacketCloseWindow var1);

   void handle(PacketClientPluginMessage var1);

   void handle(PacketUseEntity var1);

   void handle(PacketServerboundKeepAlive var1);

   void handle(PacketPlayer var1);

   void handle(PacketClientAbilities var1);

   void handle(PacketPlayerDigging var1);

   void handle(PacketEntityAction var1);

   void handle(PacketSteerVehicle var1);

   void handle(PacketHeldItemChange var1);

   void handle(PacketCreativeInventoryAction var1);

   void handle(PacketUpdateSign var1);

   void handle(PacketPlayerBlockPlacement var1);

   void handle(PacketSpectate var1);

   void handle(PacketServerbound25 var1);
}
