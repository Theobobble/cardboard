# Cardboard Feature Implementation Checklist

> **Status**: Work in Progress  
> **Repository**: [Theobobble/cardboard](https://github.com/Theobobble/cardboard)  
> **Upstream**: [CardboardPowered/cardboard](https://github.com/CardboardPowered/cardboard)  
> **Last Updated**: June 9, 2026  
> **Current Version**: 26.1

This document tracks all features, patches, and events that need to be implemented for Cardboard to be complete. Cardboard is a Fabric mod that implements the Bukkit/Spigot/Paper plugin APIs.

---

## Table of Contents

1. [Core Patches](#-core-patches)
2. [Event Implementation](#-event-implementation)
3. [Plugin Compatibility](#-plugin-compatibility)
4. [Platform Support](#-platform-support)
5. [Bug Fixes](#-bug-fixes)
6. [Enhancements](#-enhancements)

---

## Core Patches

> Source: [Issue #10 - TODO Port Patches](https://github.com/CardboardPowered/cardboard/issues/10)

### Items
- [x] CrossbowItem
- [x] EnderPearlItem
- [ ] DecorationItem
- [x] LeadItem
- [ ] MilkBucketItem
- [x] MinecartItem
- [x] PotionItem
- [x] SignItem
- [x] SnowballItem
- [x] ItemStack

### Screen Handlers
- [x] ScreenHandler
- [x] CartographyTableScreenHandler
- [x] ScreenHandlerType

### Entity Related
- [x] Angerable
- [x] EntityPredicates

### Block Entities
- [x] BeaconBlockEntity
- [x] CommandBlockBlockEntity
- [x] ConduitBlockEntity

### Recipes
- [x] ServerRecipeBook

### World-related
- [x] ChunkTicketManager
- [x] GameRules
- [ ] VersionedChunkStorage
- [x] ModifiableWorld
- [x] ChunkHolder
- [x] ThreadedAnvilChunkStorage
- [x] World
- [ ] WorldBorderS2CPacket
- [ ] SaplingGenerator
- [ ] BiomeArray
- [ ] Raid
- [ ] RayTraceContext
- [ ] RaidManager
- [ ] FeatureUpdater
- [ ] ZombieSiegeManager

### Command
- [ ] CommandManager
- [ ] TeleportCommand
- [ ] EffectCommand
- [ ] GameRuleCommand

### Inventory
- [ ] FurnaceOutputSlot

### Behavior
- [ ] FarmerVillagerTask
- [ ] VillagerBreedTask
- [ ] LookTargetUtil
- [ ] FarmerWorkTask

### Loot
- [ ] LootPoolEntry

### Other
- [ ] PhaseManager
- [ ] Trader
- [ ] ServerConfigList
- [ ] StatusEffect
- [ ] StatusEffects
- [ ] SpawnHelper
- [ ] MobSpawnerLogic
- [ ] PillagerSpawner
- [ ] PhantomSpawner
- [ ] WanderingTraderManager
- [ ] DamageEnchantment
- [ ] DataTracker
- [ ] FlowableFluid
- [ ] LavaFluid
- [ ] TeleportTarget
- [ ] HungerManager
- [ ] PortalForcer

---

## Event Implementation

> Source: [Issue #9 - TODO Events](https://github.com/CardboardPowered/cardboard/issues/9)

### Block Events
- [ ] BlockBurnEvent
- [ ] BlockCookEvent
- [ ] BlockDispenseEvent
- [ ] BlockDropItemEvent
- [ ] BlockExpEvent
- [ ] BlockFadeEvent
- [ ] BlockFertilizeEvent
- [ ] BlockFormEvent
- [ ] BlockFromToEvent
- [ ] BlockGrowEvent
- [ ] BlockMultiPlaceEvent
- [ ] BlockPhysicsEvent
- [ ] BlockRedstoneEvent
- [ ] BlockSpreadEvent
- [ ] CauldronLevelChangeEvent
- [ ] EntityBlockFormEvent
- [ ] FluidLevelChangeEvent
- [ ] MoistureChangeEvent
- [ ] SpongeAbsorbEvent

### Entity Events
- [ ] AreaEffectCloudApplyEvent
- [ ] CreatureSpawnEvent
- [ ] EnderDragonChangePhaseEvent
- [ ] EntityBreedEvent
- [ ] EntityChangeBlockEvent
- [ ] EntityCombustByBlockEvent
- [ ] EntityCombustByEntityEvent
- [ ] EntityCombustEvent
- [ ] EntityCreatePortalEvent
- [ ] EntityDamageByBlockEvent
- [ ] EntityDamageByEntityEvent
- [ ] EntityDamageEvent
- [ ] EntityEnterBlockEvent
- [ ] EntityInteractEvent
- [ ] EntityPickupItemEvent
- [ ] EntityPlaceEvent
- [ ] EntityPortalExitEvent
- [ ] EntityResurrectEvent
- [ ] EntityShootBowEvent
- [ ] EntitySpawnEvent
- [ ] EntitySpellCastEvent
- [ ] EntityTameEvent
- [ ] EntityTargetEvent
- [ ] EntityTargetLivingEntityEvent
- [ ] EntityTeleportEvent
- [ ] EntityToggleGlideEvent
- [ ] EntityToggleSwimEvent
- [ ] EntityTransformEvent
- [ ] EntityUnleashEvent
- [ ] ExplosionPrimeEvent
- [ ] FireworkExplodeEvent
- [ ] FoodLevelChangeEvent
- [ ] LingeringPotionSplashEvent
- [ ] PigZapEvent
- [ ] ProjectileHitEvent
- [ ] ProjectileLaunchEvent

### Inventory Events
- [ ] CraftItemEvent
- [ ] Furnace Events (FurnaceBurnEvent, FurnaceExtractEvent, FurnaceSmeltEvent)
- [ ] InventoryCreativeEvent
- [ ] InventoryDragEvent
- [ ] InventoryInteractEvent
- [ ] InventoryMoveItemEvent
- [ ] InventoryPickupItemEvent
- [ ] PrepareAnvilEvent
- [ ] PrepareSmithingEvent
- [ ] TradeSelectEvent

### Player Events
- [ ] PlayerBedEvents (PlayerBedEnterEvent & PlayerBedLeaveEvent)
- [ ] PlayerEditBookEvent
- [ ] PlayerHarvestBlockEvent
- [ ] PlayerInteractAtEntityEvent
- [ ] PlayerInteractEntityEvent
- [ ] PlayerLocaleChangeEvent
- [ ] PlayerPortalEvent
- [ ] PlayerRecipeDiscoverEvent
- [ ] PlayerTeleportEvent
- [ ] PlayerVelocityEvent

### Server Events
- [ ] ServiceRegisterEvent
- [ ] ServiceUnregisterEvent

### World Events
- [ ] Chunk Events (ChunkLoadEvent, ChunkPopulateEvent, ChunkUnloadEvent)
- [ ] PortalCreateEvent
- [ ] StructureGrowEvent

### Other
- [ ] Vehicle events
- [ ] Weather events
- [ ] hanging events
- [ ] enchantment events
- [ ] Raid Events

---

## Plugin Compatibility

### Known Plugin Issues
- [ ] GSit - Not working due to missing field mappings
- [ ] Carpet Mod - Crashes when used alongside Cardboard
- [ ] PalladiumCore & TrainCarts - Plugin does not load properly
- [ ] WorldGuard - Lectern-related errors
- [ ] PlaceholderAPI - Unable to register

### Compatibility Enhancements
- [ ] Paper PluginLoader - Support for loading library dependencies
- [ ] Single Player Support - Add plugin folder support for single player worlds

---

## Bug Fixes

### Critical Bugs
- [x] Lectern crashes - Invalid casts and null Bukkit player in 1.21.11
- [ ] NullPointerException - CraftItemStack.getItemMeta when decoding packets
- [ ] Unbreaking not applying - Durability enchantment ignored
- [ ] Invalid Player Data - Connection issues

### Mixin Issues
- [ ] Mixin transformation failed - Conflict between PalladiumCore and Cardboard
- [ ] Mixin signature error - Various mixin-related crashes
- [ ] Mixin priority conflicts - Multiple mods using same priority

### Inventory & Items
- [ ] Shulker boxes stuck - Animation and hitbox remain after closing GUI
- [ ] Material is null - Various null material errors

### Network & Packets
- [ ] Packet decoding errors - NullPointerException in CraftItemStack
- [ ] Network protocol errors - When clearing inventory

### World & Entities
- [ ] Server stuck at preparing spawn - World loading issues
- [ ] Food crash - 1.21.1 food-related crashes

---

## Enhancements

### Core Features
- [ ] Paper PluginLoader support - For loading library dependencies
- [ ] Single Player Support - Plugin folder in world saves
- [ ] NeoForge Port - Expand beyond Fabric

### API Completeness
- [ ] Complete event system - All Bukkit/Spigot/Paper events
- [ ] Full patch coverage - All missing patches from TODO list

### Performance & Stability
- [ ] Reduce mixin conflicts - Better priority management
- [ ] Improve mod compatibility - Work with popular mods like Carpet

---

## Progress Summary

| Category | Total | Completed | Percentage |
|----------|-------|-----------|------------|
| Core Patches | ~80 | ~60 | 75% |
| Events | ~100 | ~40 | 40% |
| Plugin Compatibility | 6 | 0 | 0% |
| Bug Fixes | 20+ | 1 | 5% |
| Enhancements | 5 | 0 | 0% |

**Note**: These are rough estimates based on the TODO lists. See PR #2 for recent progress. Actual progress may vary.

---

## Priority Recommendations

### High Priority (Critical for stability)
1. Fix Lectern crashes - Breaks core functionality
2. Fix NullPointerException in CraftItemStack - Causes player disconnections
3. Fix Mixin conflicts - Prevents using Cardboard with other mods
4. Implement missing ScreenHandlers - Critical for inventory functionality
5. Implement missing Entity patches - Needed for mob behavior

### Medium Priority (Important features)
1. Complete Event implementation - For plugin compatibility
2. Add Paper PluginLoader support - For modern plugins
3. Fix Carpet compatibility - Popular mod
4. Implement missing Command patches - For command functionality
5. Fix Shulker box issues - Common plugin feature

### Low Priority (Nice to have)
1. NeoForge Port - Expand platform support
2. Single Player Support - Niche use case
3. Complete World-related patches - Less critical

---

## Notes

1. This checklist is based on the upstream repositorys TODO issues and open open issues as of June 9, 2026.
2. Some items may already be partially implemented or in progress.
3. The TODO lists (Issues #9 and #10) have not been updated recently and may contain outdated information.
4. Priority is subjective and based on user impact and frequency of reports.
5. Contributions are welcome! See the upstream repository for contribution guidelines.

---

## References

- [Upstream Repository](https://github.com/CardboardPowered/cardboard)
- [Issue #10: TODO Port Patches](https://github.com/CardboardPowered/cardboard/issues/10)
- [Issue #9: TODO Events](https://github.com/CardboardPowered/cardboard/issues/10)
- [Open Issues](https://github.com/CardboardPowered/cardboard/issues)
- [Discord Server](https://discord.gg/tddTWXZtaP)