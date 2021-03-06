package net.tslat.aoa3.structure.barathos;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class BaronRock8 extends AoAStructure { //StructureSize: 8x8x11
	private static final IBlockState baronStone = BlockRegister.BARON_STONE.getDefaultState();
	private static final IBlockState baronGround = BlockRegister.BARON_GROUND.getDefaultState();

	public BaronRock8() {
		super("BaronRock8");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 4, baronGround);
		addBlock(world, basePos, 0, 0, 5, baronGround);
		addBlock(world, basePos, 0, 0, 6, baronGround);
		addBlock(world, basePos, 0, 0, 7, baronGround);
		addBlock(world, basePos, 0, 0, 8, baronGround);
		addBlock(world, basePos, 1, 0, 3, baronGround);
		addBlock(world, basePos, 1, 0, 4, baronStone);
		addBlock(world, basePos, 1, 0, 5, baronStone);
		addBlock(world, basePos, 1, 0, 6, baronStone);
		addBlock(world, basePos, 1, 0, 7, baronStone);
		addBlock(world, basePos, 1, 0, 8, baronStone);
		addBlock(world, basePos, 1, 0, 9, baronGround);
		addBlock(world, basePos, 2, 0, 1, baronStone);
		addBlock(world, basePos, 2, 0, 2, baronStone);
		addBlock(world, basePos, 2, 0, 3, baronStone);
		addBlock(world, basePos, 2, 0, 4, baronStone);
		addBlock(world, basePos, 2, 0, 5, baronStone);
		addBlock(world, basePos, 2, 0, 6, baronStone);
		addBlock(world, basePos, 2, 0, 7, baronStone);
		addBlock(world, basePos, 2, 0, 8, baronStone);
		addBlock(world, basePos, 2, 0, 9, baronGround);
		addBlock(world, basePos, 3, 0, 0, baronStone);
		addBlock(world, basePos, 3, 0, 1, baronStone);
		addBlock(world, basePos, 3, 0, 2, baronStone);
		addBlock(world, basePos, 3, 0, 3, baronStone);
		addBlock(world, basePos, 3, 0, 4, baronStone);
		addBlock(world, basePos, 3, 0, 5, baronStone);
		addBlock(world, basePos, 3, 0, 6, baronStone);
		addBlock(world, basePos, 3, 0, 7, baronStone);
		addBlock(world, basePos, 3, 0, 8, baronStone);
		addBlock(world, basePos, 3, 0, 9, baronStone);
		addBlock(world, basePos, 3, 0, 10, baronGround);
		addBlock(world, basePos, 4, 0, 0, baronStone);
		addBlock(world, basePos, 4, 0, 1, baronStone);
		addBlock(world, basePos, 4, 0, 2, baronStone);
		addBlock(world, basePos, 4, 0, 3, baronStone);
		addBlock(world, basePos, 4, 0, 4, baronStone);
		addBlock(world, basePos, 4, 0, 5, baronStone);
		addBlock(world, basePos, 4, 0, 6, baronStone);
		addBlock(world, basePos, 4, 0, 7, baronStone);
		addBlock(world, basePos, 4, 0, 8, baronStone);
		addBlock(world, basePos, 4, 0, 9, baronStone);
		addBlock(world, basePos, 4, 0, 10, baronGround);
		addBlock(world, basePos, 5, 0, 0, baronStone);
		addBlock(world, basePos, 5, 0, 1, baronStone);
		addBlock(world, basePos, 5, 0, 2, baronStone);
		addBlock(world, basePos, 5, 0, 3, baronStone);
		addBlock(world, basePos, 5, 0, 4, baronStone);
		addBlock(world, basePos, 5, 0, 5, baronStone);
		addBlock(world, basePos, 5, 0, 6, baronStone);
		addBlock(world, basePos, 5, 0, 7, baronStone);
		addBlock(world, basePos, 5, 0, 8, baronStone);
		addBlock(world, basePos, 5, 0, 9, baronStone);
		addBlock(world, basePos, 5, 0, 10, baronGround);
		addBlock(world, basePos, 6, 0, 0, baronStone);
		addBlock(world, basePos, 6, 0, 1, baronStone);
		addBlock(world, basePos, 6, 0, 2, baronStone);
		addBlock(world, basePos, 6, 0, 3, baronStone);
		addBlock(world, basePos, 6, 0, 4, baronStone);
		addBlock(world, basePos, 6, 0, 5, baronStone);
		addBlock(world, basePos, 6, 0, 6, baronStone);
		addBlock(world, basePos, 6, 0, 7, baronStone);
		addBlock(world, basePos, 6, 0, 8, baronStone);
		addBlock(world, basePos, 7, 0, 0, baronStone);
		addBlock(world, basePos, 7, 0, 1, baronStone);
		addBlock(world, basePos, 7, 0, 2, baronStone);
		addBlock(world, basePos, 7, 0, 3, baronStone);
		addBlock(world, basePos, 7, 0, 4, baronStone);
		addBlock(world, basePos, 7, 0, 5, baronStone);
		addBlock(world, basePos, 1, 1, 4, baronStone);
		addBlock(world, basePos, 1, 1, 5, baronStone);
		addBlock(world, basePos, 1, 1, 6, baronStone);
		addBlock(world, basePos, 1, 1, 7, baronStone);
		addBlock(world, basePos, 1, 1, 8, baronGround);
		addBlock(world, basePos, 2, 1, 1, baronStone);
		addBlock(world, basePos, 2, 1, 2, baronStone);
		addBlock(world, basePos, 2, 1, 3, baronStone);
		addBlock(world, basePos, 2, 1, 4, baronStone);
		addBlock(world, basePos, 2, 1, 5, baronStone);
		addBlock(world, basePos, 2, 1, 6, baronStone);
		addBlock(world, basePos, 2, 1, 7, baronStone);
		addBlock(world, basePos, 2, 1, 8, baronStone);
		addBlock(world, basePos, 3, 1, 1, baronStone);
		addBlock(world, basePos, 3, 1, 2, baronStone);
		addBlock(world, basePos, 3, 1, 3, baronStone);
		addBlock(world, basePos, 3, 1, 4, baronStone);
		addBlock(world, basePos, 3, 1, 5, baronStone);
		addBlock(world, basePos, 3, 1, 6, baronStone);
		addBlock(world, basePos, 3, 1, 7, baronStone);
		addBlock(world, basePos, 3, 1, 8, baronStone);
		addBlock(world, basePos, 3, 1, 9, baronGround);
		addBlock(world, basePos, 4, 1, 1, baronStone);
		addBlock(world, basePos, 4, 1, 2, baronStone);
		addBlock(world, basePos, 4, 1, 3, baronStone);
		addBlock(world, basePos, 4, 1, 4, baronStone);
		addBlock(world, basePos, 4, 1, 5, baronStone);
		addBlock(world, basePos, 4, 1, 6, baronStone);
		addBlock(world, basePos, 4, 1, 7, baronStone);
		addBlock(world, basePos, 4, 1, 8, baronStone);
		addBlock(world, basePos, 4, 1, 9, baronGround);
		addBlock(world, basePos, 5, 1, 0, baronStone);
		addBlock(world, basePos, 5, 1, 1, baronStone);
		addBlock(world, basePos, 5, 1, 2, baronStone);
		addBlock(world, basePos, 5, 1, 3, baronStone);
		addBlock(world, basePos, 5, 1, 4, baronStone);
		addBlock(world, basePos, 5, 1, 5, baronStone);
		addBlock(world, basePos, 5, 1, 6, baronStone);
		addBlock(world, basePos, 5, 1, 7, baronStone);
		addBlock(world, basePos, 5, 1, 8, baronStone);
		addBlock(world, basePos, 5, 1, 9, baronGround);
		addBlock(world, basePos, 6, 1, 0, baronStone);
		addBlock(world, basePos, 6, 1, 1, baronStone);
		addBlock(world, basePos, 6, 1, 2, baronStone);
		addBlock(world, basePos, 6, 1, 3, baronStone);
		addBlock(world, basePos, 6, 1, 4, baronStone);
		addBlock(world, basePos, 6, 1, 5, baronStone);
		addBlock(world, basePos, 6, 1, 6, baronStone);
		addBlock(world, basePos, 6, 1, 7, baronStone);
		addBlock(world, basePos, 6, 1, 8, baronStone);
		addBlock(world, basePos, 7, 1, 0, baronStone);
		addBlock(world, basePos, 7, 1, 1, baronStone);
		addBlock(world, basePos, 7, 1, 2, baronStone);
		addBlock(world, basePos, 7, 1, 3, baronStone);
		addBlock(world, basePos, 7, 1, 4, baronStone);
		addBlock(world, basePos, 7, 1, 5, baronStone);
		addBlock(world, basePos, 1, 2, 5, baronStone);
		addBlock(world, basePos, 1, 2, 6, baronStone);
		addBlock(world, basePos, 2, 2, 2, baronStone);
		addBlock(world, basePos, 2, 2, 3, baronStone);
		addBlock(world, basePos, 2, 2, 4, baronStone);
		addBlock(world, basePos, 2, 2, 5, baronStone);
		addBlock(world, basePos, 2, 2, 6, baronStone);
		addBlock(world, basePos, 2, 2, 7, baronStone);
		addBlock(world, basePos, 2, 2, 8, baronStone);
		addBlock(world, basePos, 3, 2, 1, baronStone);
		addBlock(world, basePos, 3, 2, 2, baronStone);
		addBlock(world, basePos, 3, 2, 3, baronStone);
		addBlock(world, basePos, 3, 2, 4, baronStone);
		addBlock(world, basePos, 3, 2, 5, baronStone);
		addBlock(world, basePos, 3, 2, 6, baronStone);
		addBlock(world, basePos, 3, 2, 7, baronStone);
		addBlock(world, basePos, 3, 2, 8, baronStone);
		addBlock(world, basePos, 4, 2, 1, baronStone);
		addBlock(world, basePos, 4, 2, 2, baronStone);
		addBlock(world, basePos, 4, 2, 3, baronStone);
		addBlock(world, basePos, 4, 2, 4, baronStone);
		addBlock(world, basePos, 4, 2, 5, baronStone);
		addBlock(world, basePos, 4, 2, 6, baronStone);
		addBlock(world, basePos, 4, 2, 7, baronStone);
		addBlock(world, basePos, 4, 2, 8, baronStone);
		addBlock(world, basePos, 5, 2, 1, baronStone);
		addBlock(world, basePos, 5, 2, 2, baronStone);
		addBlock(world, basePos, 5, 2, 3, baronStone);
		addBlock(world, basePos, 5, 2, 4, baronStone);
		addBlock(world, basePos, 5, 2, 5, baronStone);
		addBlock(world, basePos, 5, 2, 6, baronStone);
		addBlock(world, basePos, 5, 2, 7, baronStone);
		addBlock(world, basePos, 5, 2, 8, baronStone);
		addBlock(world, basePos, 6, 2, 0, baronStone);
		addBlock(world, basePos, 6, 2, 1, baronStone);
		addBlock(world, basePos, 6, 2, 2, baronStone);
		addBlock(world, basePos, 6, 2, 3, baronStone);
		addBlock(world, basePos, 6, 2, 4, baronStone);
		addBlock(world, basePos, 6, 2, 5, baronStone);
		addBlock(world, basePos, 6, 2, 6, baronStone);
		addBlock(world, basePos, 6, 2, 7, baronStone);
		addBlock(world, basePos, 6, 2, 8, baronStone);
		addBlock(world, basePos, 7, 2, 0, baronStone);
		addBlock(world, basePos, 7, 2, 1, baronStone);
		addBlock(world, basePos, 7, 2, 2, baronStone);
		addBlock(world, basePos, 2, 3, 2, baronStone);
		addBlock(world, basePos, 2, 3, 3, baronStone);
		addBlock(world, basePos, 2, 3, 4, baronStone);
		addBlock(world, basePos, 2, 3, 5, baronStone);
		addBlock(world, basePos, 2, 3, 6, baronStone);
		addBlock(world, basePos, 2, 3, 7, baronStone);
		addBlock(world, basePos, 2, 3, 8, baronStone);
		addBlock(world, basePos, 3, 3, 1, baronStone);
		addBlock(world, basePos, 3, 3, 2, baronStone);
		addBlock(world, basePos, 3, 3, 3, baronStone);
		addBlock(world, basePos, 3, 3, 4, baronStone);
		addBlock(world, basePos, 3, 3, 5, baronStone);
		addBlock(world, basePos, 3, 3, 6, baronStone);
		addBlock(world, basePos, 3, 3, 7, baronStone);
		addBlock(world, basePos, 3, 3, 8, baronStone);
		addBlock(world, basePos, 4, 3, 1, baronStone);
		addBlock(world, basePos, 4, 3, 2, baronStone);
		addBlock(world, basePos, 4, 3, 3, baronStone);
		addBlock(world, basePos, 4, 3, 4, baronStone);
		addBlock(world, basePos, 4, 3, 5, baronStone);
		addBlock(world, basePos, 4, 3, 6, baronStone);
		addBlock(world, basePos, 4, 3, 7, baronStone);
		addBlock(world, basePos, 4, 3, 8, baronStone);
		addBlock(world, basePos, 5, 3, 1, baronStone);
		addBlock(world, basePos, 5, 3, 2, baronStone);
		addBlock(world, basePos, 5, 3, 3, baronStone);
		addBlock(world, basePos, 5, 3, 4, baronStone);
		addBlock(world, basePos, 5, 3, 5, baronStone);
		addBlock(world, basePos, 5, 3, 6, baronStone);
		addBlock(world, basePos, 5, 3, 7, baronStone);
		addBlock(world, basePos, 5, 3, 8, baronStone);
		addBlock(world, basePos, 6, 3, 1, baronStone);
		addBlock(world, basePos, 6, 3, 2, baronStone);
		addBlock(world, basePos, 6, 3, 3, baronStone);
		addBlock(world, basePos, 6, 3, 4, baronStone);
		addBlock(world, basePos, 6, 3, 5, baronStone);
		addBlock(world, basePos, 6, 3, 6, baronStone);
		addBlock(world, basePos, 6, 3, 7, baronStone);
		addBlock(world, basePos, 6, 3, 8, baronStone);
		addBlock(world, basePos, 2, 4, 1, baronStone);
		addBlock(world, basePos, 2, 4, 2, baronStone);
		addBlock(world, basePos, 2, 4, 3, baronStone);
		addBlock(world, basePos, 2, 4, 4, baronStone);
		addBlock(world, basePos, 2, 4, 5, baronStone);
		addBlock(world, basePos, 2, 4, 6, baronStone);
		addBlock(world, basePos, 2, 4, 7, baronStone);
		addBlock(world, basePos, 2, 4, 8, baronStone);
		addBlock(world, basePos, 3, 4, 1, baronStone);
		addBlock(world, basePos, 3, 4, 2, baronStone);
		addBlock(world, basePos, 3, 4, 3, baronStone);
		addBlock(world, basePos, 3, 4, 4, baronStone);
		addBlock(world, basePos, 3, 4, 5, baronStone);
		addBlock(world, basePos, 3, 4, 6, baronStone);
		addBlock(world, basePos, 3, 4, 7, baronStone);
		addBlock(world, basePos, 3, 4, 8, baronStone);
		addBlock(world, basePos, 4, 4, 1, baronStone);
		addBlock(world, basePos, 4, 4, 2, baronStone);
		addBlock(world, basePos, 4, 4, 3, baronStone);
		addBlock(world, basePos, 4, 4, 4, baronStone);
		addBlock(world, basePos, 4, 4, 5, baronStone);
		addBlock(world, basePos, 4, 4, 6, baronStone);
		addBlock(world, basePos, 4, 4, 7, baronStone);
		addBlock(world, basePos, 4, 4, 8, baronStone);
		addBlock(world, basePos, 5, 4, 1, baronStone);
		addBlock(world, basePos, 5, 4, 2, baronStone);
		addBlock(world, basePos, 5, 4, 3, baronStone);
		addBlock(world, basePos, 5, 4, 4, baronStone);
		addBlock(world, basePos, 5, 4, 5, baronStone);
		addBlock(world, basePos, 5, 4, 6, baronStone);
		addBlock(world, basePos, 5, 4, 7, baronStone);
		addBlock(world, basePos, 5, 4, 8, baronStone);
		addBlock(world, basePos, 6, 4, 1, baronStone);
		addBlock(world, basePos, 6, 4, 2, baronStone);
		addBlock(world, basePos, 6, 4, 3, baronStone);
		addBlock(world, basePos, 6, 4, 4, baronStone);
		addBlock(world, basePos, 6, 4, 5, baronStone);
		addBlock(world, basePos, 6, 4, 6, baronStone);
		addBlock(world, basePos, 6, 4, 7, baronStone);
		addBlock(world, basePos, 6, 4, 8, baronStone);
		addBlock(world, basePos, 2, 5, 1, baronStone);
		addBlock(world, basePos, 2, 5, 2, baronStone);
		addBlock(world, basePos, 2, 5, 3, baronStone);
		addBlock(world, basePos, 2, 5, 4, baronStone);
		addBlock(world, basePos, 2, 5, 5, baronStone);
		addBlock(world, basePos, 2, 5, 6, baronStone);
		addBlock(world, basePos, 2, 5, 7, baronStone);
		addBlock(world, basePos, 2, 5, 8, baronStone);
		addBlock(world, basePos, 3, 5, 1, baronStone);
		addBlock(world, basePos, 3, 5, 2, baronStone);
		addBlock(world, basePos, 3, 5, 3, baronStone);
		addBlock(world, basePos, 3, 5, 4, baronStone);
		addBlock(world, basePos, 3, 5, 5, baronStone);
		addBlock(world, basePos, 3, 5, 6, baronStone);
		addBlock(world, basePos, 3, 5, 7, baronStone);
		addBlock(world, basePos, 3, 5, 8, baronStone);
		addBlock(world, basePos, 4, 5, 1, baronStone);
		addBlock(world, basePos, 4, 5, 2, baronStone);
		addBlock(world, basePos, 4, 5, 3, baronStone);
		addBlock(world, basePos, 4, 5, 4, baronStone);
		addBlock(world, basePos, 4, 5, 5, baronStone);
		addBlock(world, basePos, 4, 5, 6, baronStone);
		addBlock(world, basePos, 4, 5, 7, baronStone);
		addBlock(world, basePos, 4, 5, 8, baronStone);
		addBlock(world, basePos, 5, 5, 1, baronGround);
		addBlock(world, basePos, 5, 5, 2, baronGround);
		addBlock(world, basePos, 5, 5, 3, baronGround);
		addBlock(world, basePos, 5, 5, 4, baronGround);
		addBlock(world, basePos, 5, 5, 5, baronGround);
		addBlock(world, basePos, 5, 5, 6, baronGround);
		addBlock(world, basePos, 5, 5, 7, baronGround);
		addBlock(world, basePos, 5, 5, 8, baronGround);
		addBlock(world, basePos, 6, 5, 1, baronGround);
		addBlock(world, basePos, 6, 5, 2, baronGround);
		addBlock(world, basePos, 6, 5, 3, baronGround);
		addBlock(world, basePos, 6, 5, 4, baronGround);
		addBlock(world, basePos, 6, 5, 5, baronGround);
		addBlock(world, basePos, 6, 5, 6, baronGround);
		addBlock(world, basePos, 6, 5, 7, baronGround);
		addBlock(world, basePos, 6, 5, 8, baronGround);
		addBlock(world, basePos, 2, 6, 1, baronStone);
		addBlock(world, basePos, 2, 6, 2, baronStone);
		addBlock(world, basePos, 2, 6, 3, baronStone);
		addBlock(world, basePos, 2, 6, 4, baronStone);
		addBlock(world, basePos, 2, 6, 5, baronStone);
		addBlock(world, basePos, 2, 6, 6, baronStone);
		addBlock(world, basePos, 2, 6, 7, baronStone);
		addBlock(world, basePos, 2, 6, 8, baronStone);
		addBlock(world, basePos, 3, 6, 1, baronGround);
		addBlock(world, basePos, 3, 6, 2, baronGround);
		addBlock(world, basePos, 3, 6, 3, baronGround);
		addBlock(world, basePos, 3, 6, 4, baronGround);
		addBlock(world, basePos, 3, 6, 5, baronGround);
		addBlock(world, basePos, 3, 6, 6, baronGround);
		addBlock(world, basePos, 3, 6, 7, baronGround);
		addBlock(world, basePos, 3, 6, 8, baronGround);
		addBlock(world, basePos, 4, 6, 1, baronGround);
		addBlock(world, basePos, 4, 6, 2, baronGround);
		addBlock(world, basePos, 4, 6, 3, baronGround);
		addBlock(world, basePos, 4, 6, 4, baronGround);
		addBlock(world, basePos, 4, 6, 5, baronGround);
		addBlock(world, basePos, 4, 6, 6, baronGround);
		addBlock(world, basePos, 4, 6, 7, baronGround);
		addBlock(world, basePos, 4, 6, 8, baronGround);
		addBlock(world, basePos, 2, 7, 1, baronGround);
		addBlock(world, basePos, 2, 7, 2, baronGround);
		addBlock(world, basePos, 2, 7, 3, baronGround);
		addBlock(world, basePos, 2, 7, 4, baronGround);
		addBlock(world, basePos, 2, 7, 5, baronGround);
		addBlock(world, basePos, 2, 7, 6, baronGround);
		addBlock(world, basePos, 2, 7, 7, baronGround);
		addBlock(world, basePos, 2, 7, 8, baronGround);
	}
}
