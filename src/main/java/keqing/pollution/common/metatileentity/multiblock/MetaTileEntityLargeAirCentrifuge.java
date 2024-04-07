package keqing.pollution.common.metatileentity.multiblock;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Material;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.blocks.BlockTurbineCasing;
import gregtech.common.blocks.MetaBlocks;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;
import keqing.pollution.api.metatileentity.POMultiblockAbility;
import keqing.pollution.api.metatileentity.PORecipeMapMultiblockController;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import static keqing.pollution.api.unification.PollutionMaterials.infused_air;

public class MetaTileEntityLargeAirCentrifuge extends PORecipeMapMultiblockController {

    public MetaTileEntityLargeAirCentrifuge(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, new RecipeMap[] {RecipeMaps.CENTRIFUGE_RECIPES, RecipeMaps.THERMAL_CENTRIFUGE_RECIPES});
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new MetaTileEntityLargeAirCentrifuge(this.metaTileEntityId);
    }

    @Override
    protected  BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("BXXXB", "XXXXX", "BXXXB")
                .aisle("XXXXX", "XAGAX", "XXXXX")
                .aisle("XXXXX", "XGAGX", "XXXXX")
                .aisle("XXXXX", "XAGAX", "XXXXX")
                .aisle("BXXXB", "XXSXX", "BXFXB")
                .where('S', selfPredicate())
                .where('B', any())
                .where('A', air())
                .where('X', states(getCasingState()).setMinGlobalLimited(40).or(autoAbilities()))
                .where('G', states(getCasingState2()))
//                .where('F', abilities(MultiblockAbility.IMPORT_FLUIDS).setMaxGlobalLimited(4).setPreviewCount(1))
//                .where('D', abilities(MultiblockAbility.EXPORT_FLUIDS).setMaxGlobalLimited(4).setPreviewCount(1))
                .where('F', abilities(POMultiblockAbility.VIS_HATCH).setMaxGlobalLimited(1).setPreviewCount(1))
//                .where('I', abilities(MultiblockAbility.IMPORT_ITEMS).setMaxGlobalLimited(1).setPreviewCount(1))
//                .where('O', abilities(MultiblockAbility.EXPORT_ITEMS).setMaxGlobalLimited(1).setPreviewCount(1))
//                .where('E', abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(1))
                .build();
    }

    @Override
    public Material getMaterial()
    {
        return infused_air;
    }

    private static IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.VIBRATION_SAFE_CASING);
    }

    private static IBlockState getCasingState2() {
        return MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STEEL_TURBINE_CASING);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GCYMTextures.VIBRATION_SAFE_CASING;
    }

    @Override
    protected  OrientedOverlayRenderer getFrontOverlay() {
        return GCYMTextures.LARGE_CENTRIFUGE_OVERLAY;
    }

    @Override
    public boolean canBeDistinct() {
        return true;
    }

}
