package net.minecraft.network;

import net.minecraft.network.PacketHandler;
import net.minecraft.network.play.PacketAnimation;
import net.minecraft.network.play.PacketAttachEntity;
import net.minecraft.network.play.PacketBlockAction;
import net.minecraft.network.play.PacketBlockBreakAnimation;
import net.minecraft.network.play.PacketBlockChange;
import net.minecraft.network.play.PacketCamera;
import net.minecraft.network.play.PacketChangeGameState;
import net.minecraft.network.play.PacketChangeHeldItem;
import net.minecraft.network.play.PacketChunkData;
import net.minecraft.network.play.PacketClientboundKeepAlive;
import net.minecraft.network.play.PacketCollectItem;
import net.minecraft.network.play.PacketCombatEvent;
import net.minecraft.network.play.PacketConfirmTransaction;
import net.minecraft.network.play.PacketDestroyEntities;
import net.minecraft.network.play.PacketDisconnect;
import net.minecraft.network.play.PacketDisplayScoreboard;
import net.minecraft.network.play.PacketEffect;
import net.minecraft.network.play.PacketEntity;
import net.minecraft.network.play.PacketEntityEffect;
import net.minecraft.network.play.PacketEntityEquipment;
import net.minecraft.network.play.PacketEntityHeadLook;
import net.minecraft.network.play.PacketEntityMetadata;
import net.minecraft.network.play.PacketEntityProperties;
import net.minecraft.network.play.PacketEntityStatus;
import net.minecraft.network.play.PacketEntityTeleport;
import net.minecraft.network.play.PacketEntityVelocity;
import net.minecraft.network.play.PacketExplosion;
import net.minecraft.network.play.PacketForceCloseWindow;
import net.minecraft.network.play.PacketJoinGame;
import net.minecraft.network.play.PacketMapChunkBulk;
import net.minecraft.network.play.PacketMaps;
import net.minecraft.network.play.PacketMultiBlockChange;
import net.minecraft.network.play.PacketOpenWindow;
import net.minecraft.network.play.PacketParticle;
import net.minecraft.network.play.PacketPlayerAbilities;
import net.minecraft.network.play.PacketPlayerListHeaderFooter;
import net.minecraft.network.play.PacketPlayerListItem;
import net.minecraft.network.play.PacketPlayerTeleport;
import net.minecraft.network.play.PacketRemoveEntityEffect;
import net.minecraft.network.play.PacketRespawn;
import net.minecraft.network.play.PacketScoreboardObjective;
import net.minecraft.network.play.PacketServerDifficulty;
import net.minecraft.network.play.PacketServerMessage;
import net.minecraft.network.play.PacketServerPluginMessage;
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
import net.minecraft.network.play.PacketStatistics;
import net.minecraft.network.play.PacketTabReply;
import net.minecraft.network.play.PacketTeams;
import net.minecraft.network.play.PacketTimeUpdate;
import net.minecraft.network.play.PacketTitle;
import net.minecraft.network.play.PacketUpdateBlockEntity;
import net.minecraft.network.play.PacketUpdateHealth;
import net.minecraft.network.play.PacketUpdateScore;
import net.minecraft.network.play.PacketUseBed;
import net.minecraft.network.play.PacketWindowItems;
import net.minecraft.network.play.PacketWindowProperty;
import net.minecraft.network.play.PacketWorldBorder;

public interface PacketHandlerPlayClientbound extends PacketHandler {

   void handle(PacketSpawnObject var1);

   void handle(PacketSpawnExperienceOrb var1);

   void handle(PacketSpawnGlobalEntity var1);

   void handle(PacketSpawnMob var1);

   void handle(PacketScoreboardObjective var1);

   void handle(PacketSpawnPainting var1);

   void handle(PacketSpawnPlayer var1);

   void handle(PacketAnimation var1);

   void handle(PacketStatistics var1);

   void handle(PacketBlockBreakAnimation var1);

   void handle(PacketSignEditorOpen var1);

   void handle(PacketUpdateBlockEntity var1);

   void handle(PacketBlockAction var1);

   void handle(PacketBlockChange var1);

   void handle(PacketServerMessage var1);

   void handle(PacketTabReply var1);

   void handle(PacketMultiBlockChange var1);

   void handle(PacketMaps var1);

   void handle(PacketConfirmTransaction var1);

   void handle(PacketForceCloseWindow var1);

   void handle(PacketWindowItems var1);

   void handle(PacketOpenWindow var1);

   void handle(PacketWindowProperty var1);

   void handle(PacketSetSlot var1);

   void handle(PacketServerPluginMessage var1);

   void handle(PacketDisconnect var1);

   void handle(PacketUseBed var1);

   void handle(PacketEntityStatus var1);

   void handle(PacketAttachEntity var1);

   void handle(PacketExplosion var1);

   void handle(PacketChangeGameState var1);

   void handle(PacketClientboundKeepAlive var1);

   void handle(PacketChunkData var1);

   void handle(PacketMapChunkBulk var1);

   void handle(PacketEffect var1);

   void handle(PacketJoinGame var1);

   void handle(PacketEntity var1);

   void handle(PacketPlayerTeleport var1);

   void handle(PacketParticle var1);

   void handle(PacketPlayerAbilities var1);

   void handle(PacketPlayerListItem var1);

   void handle(PacketDestroyEntities var1);

   void handle(PacketRemoveEntityEffect var1);

   void handle(PacketRespawn var1);

   void handle(PacketEntityHeadLook var1);

   void handle(PacketChangeHeldItem var1);

   void handle(PacketDisplayScoreboard var1);

   void handle(PacketEntityMetadata var1);

   void handle(PacketEntityVelocity var1);

   void handle(PacketEntityEquipment var1);

   void handle(PacketSetExperience var1);

   void handle(PacketUpdateHealth var1);

   void handle(PacketTeams var1);

   void handle(PacketUpdateScore var1);

   void handle(PacketSpawnPosition var1);

   void handle(PacketTimeUpdate var1);

   void handle(PacketSetSignContent var1);

   void handle(PacketSoundEffect var1);

   void handle(PacketCollectItem var1);

   void handle(PacketEntityTeleport var1);

   void handle(PacketEntityProperties var1);

   void handle(PacketEntityEffect var1);

   void handle(PacketCombatEvent var1);

   void handle(PacketServerDifficulty var1);

   void handle(PacketCamera var1);

   void handle(PacketWorldBorder var1);

   void handle(PacketTitle var1);

   void handle(PacketSetCompression var1);

   void handle(PacketPlayerListHeaderFooter var1);
}
