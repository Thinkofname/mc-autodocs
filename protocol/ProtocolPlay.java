package net.minecraft.network;

import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.play.PacketAnimation;
import net.minecraft.network.play.PacketAttachEntity;
import net.minecraft.network.play.PacketBlockAction;
import net.minecraft.network.play.PacketBlockBreakAnimation;
import net.minecraft.network.play.PacketBlockChange;
import net.minecraft.network.play.PacketBossBar;
import net.minecraft.network.play.PacketCamera;
import net.minecraft.network.play.PacketChangeGameState;
import net.minecraft.network.play.PacketChangeHeldItem;
import net.minecraft.network.play.PacketChatMessage;
import net.minecraft.network.play.PacketCheckTransaction;
import net.minecraft.network.play.PacketChunkData;
import net.minecraft.network.play.PacketClickWindow;
import net.minecraft.network.play.PacketClientAbilities;
import net.minecraft.network.play.PacketClientPluginMessage;
import net.minecraft.network.play.PacketClientSettings;
import net.minecraft.network.play.PacketClientStatus;
import net.minecraft.network.play.PacketClientboundKeepAlive;
import net.minecraft.network.play.PacketCloseWindow;
import net.minecraft.network.play.PacketCollectItem;
import net.minecraft.network.play.PacketCombatEvent;
import net.minecraft.network.play.PacketConfirmTransaction;
import net.minecraft.network.play.PacketCreativeInventoryAction;
import net.minecraft.network.play.PacketDestroyEntities;
import net.minecraft.network.play.PacketDisconnect;
import net.minecraft.network.play.PacketDisplayScoreboard;
import net.minecraft.network.play.PacketEffect;
import net.minecraft.network.play.PacketEnchantItem;
import net.minecraft.network.play.PacketEntity;
import net.minecraft.network.play.PacketEntityAction;
import net.minecraft.network.play.PacketEntityEffect;
import net.minecraft.network.play.PacketEntityEquipment;
import net.minecraft.network.play.PacketEntityHeadLook;
import net.minecraft.network.play.PacketEntityLook;
import net.minecraft.network.play.PacketEntityLookAndRelativeMove;
import net.minecraft.network.play.PacketEntityMetadata;
import net.minecraft.network.play.PacketEntityProperties;
import net.minecraft.network.play.PacketEntityRelativeMove;
import net.minecraft.network.play.PacketEntityStatus;
import net.minecraft.network.play.PacketEntityTeleport;
import net.minecraft.network.play.PacketEntityVelocity;
import net.minecraft.network.play.PacketExplosion;
import net.minecraft.network.play.PacketForceCloseWindow;
import net.minecraft.network.play.PacketHeldItemChange;
import net.minecraft.network.play.PacketJoinGame;
import net.minecraft.network.play.PacketMapChunkBulk;
import net.minecraft.network.play.PacketMaps;
import net.minecraft.network.play.PacketMultiBlockChange;
import net.minecraft.network.play.PacketOpenWindow;
import net.minecraft.network.play.PacketParticle;
import net.minecraft.network.play.PacketPlayer;
import net.minecraft.network.play.PacketPlayerAbilities;
import net.minecraft.network.play.PacketPlayerBlockPlacement;
import net.minecraft.network.play.PacketPlayerDigging;
import net.minecraft.network.play.PacketPlayerListHeaderFooter;
import net.minecraft.network.play.PacketPlayerListItem;
import net.minecraft.network.play.PacketPlayerLook;
import net.minecraft.network.play.PacketPlayerPosition;
import net.minecraft.network.play.PacketPlayerPositionAndLook;
import net.minecraft.network.play.PacketPlayerTeleport;
import net.minecraft.network.play.PacketRemoveEntityEffect;
import net.minecraft.network.play.PacketResourcePackSend;
import net.minecraft.network.play.PacketResourcePackStatus;
import net.minecraft.network.play.PacketRespawn;
import net.minecraft.network.play.PacketScoreboardObjective;
import net.minecraft.network.play.PacketServerDifficulty;
import net.minecraft.network.play.PacketServerMessage;
import net.minecraft.network.play.PacketServerPluginMessage;
import net.minecraft.network.play.PacketServerboundKeepAlive;
import net.minecraft.network.play.PacketSetCompression;
import net.minecraft.network.play.PacketSetExperience;
import net.minecraft.network.play.PacketSetSignContent;
import net.minecraft.network.play.PacketSetSlot;
import net.minecraft.network.play.PacketSignEditorOpen;
import net.minecraft.network.play.PacketSoundEffect;
import net.minecraft.network.play.PacketSpawnExperienceOrb;
import net.minecraft.network.play.PacketSpawnGlobalEntity;
import net.minecraft.network.play.PacketSpawnMob;
import net.minecraft.network.play.PacketSpawnObject;
import net.minecraft.network.play.PacketSpawnPainting;
import net.minecraft.network.play.PacketSpawnPlayer;
import net.minecraft.network.play.PacketSpawnPosition;
import net.minecraft.network.play.PacketSpectate;
import net.minecraft.network.play.PacketStatistics;
import net.minecraft.network.play.PacketSteerVehicle;
import net.minecraft.network.play.PacketSwingArm;
import net.minecraft.network.play.PacketTabComplete;
import net.minecraft.network.play.PacketTabReply;
import net.minecraft.network.play.PacketTeams;
import net.minecraft.network.play.PacketTimeUpdate;
import net.minecraft.network.play.PacketTitle;
import net.minecraft.network.play.PacketUpdateBlockEntity;
import net.minecraft.network.play.PacketUpdateHealth;
import net.minecraft.network.play.PacketUpdateScore;
import net.minecraft.network.play.PacketUpdateSign;
import net.minecraft.network.play.PacketUseBed;
import net.minecraft.network.play.PacketUseEntity;
import net.minecraft.network.play.PacketUseItem;
import net.minecraft.network.play.PacketWindowItems;
import net.minecraft.network.play.PacketWindowProperty;
import net.minecraft.network.play.PacketWorldBorder;

public enum ProtocolPlay {

   public ProtocolPlay(String arg_0, int arg_1, int arg_2) {
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketClientboundKeepAlive.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketJoinGame.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketServerMessage.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketTimeUpdate.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityEquipment.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnPosition.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketUpdateHealth.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketRespawn.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketPlayerTeleport.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketChangeHeldItem.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketUseBed.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketAnimation.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnPlayer.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketCollectItem.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnObject.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnMob.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnPainting.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnExperienceOrb.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityVelocity.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketDestroyEntities.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntity.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityRelativeMove.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityLook.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityLookAndRelativeMove.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityTeleport.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityHeadLook.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityStatus.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketAttachEntity.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityMetadata.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityEffect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketRemoveEntityEffect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSetExperience.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEntityProperties.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketChunkData.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketMultiBlockChange.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketBlockChange.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketBlockAction.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketBlockBreakAnimation.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketMapChunkBulk.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketExplosion.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketEffect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSoundEffect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketParticle.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketChangeGameState.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSpawnGlobalEntity.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketOpenWindow.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketForceCloseWindow.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSetSlot.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketWindowItems.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketWindowProperty.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketConfirmTransaction.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSetSignContent.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketMaps.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketUpdateBlockEntity.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSignEditorOpen.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketStatistics.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketPlayerListItem.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketPlayerAbilities.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketTabReply.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketScoreboardObjective.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketUpdateScore.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketDisplayScoreboard.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketTeams.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketServerPluginMessage.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketDisconnect.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketServerDifficulty.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketCombatEvent.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketCamera.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketWorldBorder.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketTitle.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketSetCompression.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketPlayerListHeaderFooter.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketResourcePackSend.class);
      this.addPacket(ProtocolDirection.CLIENTBOUND, PacketBossBar.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketServerboundKeepAlive.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketChatMessage.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketUseEntity.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayer.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayerPosition.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayerLook.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayerPositionAndLook.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayerDigging.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketUseItem.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketPlayerBlockPlacement.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketHeldItemChange.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketSwingArm.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketEntityAction.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketSteerVehicle.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketCloseWindow.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketClickWindow.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketCheckTransaction.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketCreativeInventoryAction.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketEnchantItem.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketUpdateSign.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketClientAbilities.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketTabComplete.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketClientSettings.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketClientStatus.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketClientPluginMessage.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketSpectate.class);
      this.addPacket(ProtocolDirection.SERVERBOUND, PacketResourcePackStatus.class);
   }
}
