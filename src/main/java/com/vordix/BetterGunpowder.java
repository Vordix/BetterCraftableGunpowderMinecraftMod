package com.vordix;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.KeyDispatchCodec;
import net.minecraft.component.Component;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;

import java.util.List;
import java.util.function.Consumer;

public class BetterGunpowder extends Item {
    public BetterGunpowder(Settings settings) {
        super(settings);
    }
    @Deprecated
    public void appendTooltip(
            ItemStack stack, Item.TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type
    ) { textConsumer.accept(new Text() {
        @Override
        public Style getStyle() {
            return null;
        }

        @Override
        public TextContent getContent() {
            return null;
        }


        @Override
        public List<Text> getSiblings() {
            return List.of();
        }

        @Override
        public OrderedText asOrderedText() {
            return null;
        }
    });
    }
}
