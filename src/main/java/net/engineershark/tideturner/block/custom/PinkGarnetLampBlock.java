package net.engineershark.tideturner.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class PinkGarnetLampBlock extends Block {
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");


    public PinkGarnetLampBlock(Settings settings) {
        super(settings);
    }
}

