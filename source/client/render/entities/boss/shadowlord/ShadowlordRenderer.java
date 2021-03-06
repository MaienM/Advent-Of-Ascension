package net.tslat.aoa3.client.render.entities.boss.shadowlord;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.gui.render.BossBarRenderer;
import net.tslat.aoa3.client.model.entities.boss.shadowlord.ModelShadowlord;
import net.tslat.aoa3.entity.boss.shadowlord.EntityShadowlord;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class ShadowlordRenderer extends RenderLiving<EntityShadowlord> {
	private final ResourceLocation texture;

	public ShadowlordRenderer(RenderManager renderManager, final ResourceLocation texture) {
		super(renderManager, new ModelShadowlord(), EntityShadowlord.entityWidth / 3);
		this.texture = texture;
	}

	@Override
	protected void preRenderCallback(EntityShadowlord entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(6, 6, 6);
	}

	@Override
	public void doRender(EntityShadowlord entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (x + y + z != 0)
			BossBarRenderer.boss = entity;
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityShadowlord corallus) {
		return texture;
	}
}