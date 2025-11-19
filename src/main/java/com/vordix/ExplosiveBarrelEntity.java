package com.vordix;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ExplosiveBarrelEntity extends TntEntity {
    public ExplosiveBarrelEntity(EntityType<? extends TntEntity> entityType, World world) {
        super(entityType, world);
    }
}
