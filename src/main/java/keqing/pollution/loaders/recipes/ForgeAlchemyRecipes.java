package keqing.pollution.loaders.recipes;

import com.cleanroommc.groovyscript.compat.mods.botania.Botania;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import keqing.gtqtcore.api.unification.GTQTMaterials;
import keqing.pollution.api.recipes.PORecipeMaps;
import keqing.pollution.api.unification.PollutionMaterials;
import keqing.pollution.common.items.PollutionMetaItems;
import net.minecraft.item.ItemStack;

public class ForgeAlchemyRecipes {
	public static void init() {
		alchemy();
	}

	private static void alchemy() {
		//二级贤者之石
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.blackmansus.getFluid(99999))
				.fluidInputs(PollutionMaterials.whitemansus.getFluid(99999))
				.fluidInputs(GTQTMaterials.Magic.getFluid(99999))
				.fluidInputs(PollutionMaterials.dimensional_transforming_agent.getFluid(9999))
				.input(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150)
				.input(OrePrefix.dust, PollutionMaterials.Terrasteel, 64)
				.input(OrePrefix.dust, PollutionMaterials.hyperdimensional_silver, 64)
				.input(OrePrefix.dust, PollutionMaterials.keqinggold, 64)
				.chancedOutput(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getStackForm(), 7500, 0)
				.blastFurnaceTemp(5400)
				.duration(19980)
				.EUt(9999)
				.buildAndRegister();
		//锻炉炼金术配方 三个一组
		//铅锡铁 锌镍钴 铜银金
		//锰钼钕 镓钒铬 锑铍铋
		//铝钛钨 铌钽钇 钍铀钚 赛摩铜炽焰铁法罗钠
		//铂钯钌 铑铱锇 铈铕钐
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Lead.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Tin.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Iron.getFluid(2304), 3333, 500)
				.circuitMeta(1)
				.blastFurnaceTemp(3600)
				.duration(2500)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Zinc.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Nickel.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Cobalt.getFluid(2304), 3333, 500)
				.circuitMeta(2)
				.blastFurnaceTemp(3600)
				.duration(3000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Copper.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Silver.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Gold.getFluid(2304), 3333, 500)
				.circuitMeta(3)
				.blastFurnaceTemp(3600)
				.duration(3500)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Manganese.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Molybdenum.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Neodymium.getFluid(2304), 3333, 500)
				.circuitMeta(4)
				.blastFurnaceTemp(4500)
				.duration(4000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Gallium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Vanadium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Chrome.getFluid(2304), 3333, 500)
				.circuitMeta(5)
				.blastFurnaceTemp(4500)
				.duration(4500)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Antimony.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Beryllium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Bismuth.getFluid(2304), 3333, 500)
				.circuitMeta(6)
				.blastFurnaceTemp(4500)
				.duration(5000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Aluminium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Titanium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Tungsten.getFluid(2304), 3333, 500)
				.circuitMeta(7)
				.blastFurnaceTemp(5400)
				.duration(9000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Niobium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Tantalum.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Yttrium.getFluid(2304), 3333, 500)
				.circuitMeta(8)
				.blastFurnaceTemp(5400)
				.duration(9500)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(Materials.Thorium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Uranium238.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Plutonium241.getFluid(2304), 3333, 500)
				.circuitMeta(9)
				.blastFurnaceTemp(5400)
				.duration(10000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(PollutionMaterials.syrmorite.getFluid(2304), 3333, 500)
				.chancedFluidOutput(PollutionMaterials.octine.getFluid(2304), 3333, 500)
				.chancedOutput(OrePrefix.gem, PollutionMaterials.valonite, 16, 3333, 500)
				.circuitMeta(1)
				.blastFurnaceTemp(5400)
				.duration(10000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.chancedFluidOutput(Materials.Platinum.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Palladium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Ruthenium.getFluid(2304), 3333, 500)
				.circuitMeta(2)
				.blastFurnaceTemp(6300)
				.duration(14000)
				.EUt(30720)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.chancedFluidOutput(Materials.Rhodium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Iridium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Osmium.getFluid(2304), 3333, 500)
				.circuitMeta(3)
				.blastFurnaceTemp(6300)
				.duration(14500)
				.EUt(30720)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.chancedFluidOutput(Materials.Cerium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Europium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(Materials.Samarium.getFluid(2304), 3333, 500)
				.circuitMeta(4)
				.blastFurnaceTemp(6300)
				.duration(15000)
				.EUt(30720)
				.buildAndRegister();

		//要触媒的
		//基础：魔力钢 神秘 漫宿钢 六大合金
		//进阶：超次元秘银 刻金 泰拉钢
		//超级：源质钢 虚空 感知 阿弗纳斯之血 光风霁月琥珀金
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.input(OrePrefix.dust, Materials.Titanium, 4)
				.input(OrePrefix.dust, Materials.Copper, 4)
				.input(OrePrefix.dust, Materials.Lead, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(PollutionMaterials.aertitanium.getFluid(2304), 3333, 500)
				.chancedFluidOutput(PollutionMaterials.terracopper.getFluid(2304), 3333, 500)
				.chancedFluidOutput(PollutionMaterials.ordolead.getFluid(2304), 3333, 500)
				.circuitMeta(20)
				.blastFurnaceTemp(3600)
				.duration(2000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.input(OrePrefix.dust, Materials.Steel, 4)
				.input(OrePrefix.dust, Materials.Silver, 4)
				.input(OrePrefix.dust, Materials.Aluminium, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.chancedFluidOutput(PollutionMaterials.ignissteel.getFluid(2304), 3333, 500)
				.chancedFluidOutput(PollutionMaterials.aquasilver.getFluid(2304), 3333, 500)
				.chancedFluidOutput(PollutionMaterials.perditioaluminium.getFluid(2304), 3333, 500)
				.circuitMeta(20)
				.blastFurnaceTemp(3600)
				.duration(2000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.input(OrePrefix.dust, Materials.Iron, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.fluidOutputs(PollutionMaterials.manasteel.getFluid(2304))
				.circuitMeta(20)
				.blastFurnaceTemp(3600)
				.duration(2500)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.input(OrePrefix.dust, Materials.Steel, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.fluidOutputs(PollutionMaterials.thaumium.getFluid(2304))
				.circuitMeta(21)
				.blastFurnaceTemp(3600)
				.duration(3000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.basic_substrate.getFluid(144))
				.fluidInputs(GTQTMaterials.Magic.getFluid(1000))
				.input(OrePrefix.dust, Materials.StainlessSteel, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_1.getMetaItem(), 1, 150))
				.fluidOutputs(PollutionMaterials.mansussteel.getFluid(2304))
				.circuitMeta(20)
				.blastFurnaceTemp(3600)
				.duration(5000)
				.EUt(1920)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Water.getFluid(16000))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.input(OrePrefix.dust, PollutionMaterials.salismundus, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.fluidOutputs(PollutionMaterials.dimensional_transforming_agent.getFluid(1000))
				.blastFurnaceTemp(4500)
				.duration(2000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(PollutionMaterials.dimensional_transforming_agent.getFluid(42))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.input(OrePrefix.dust, Materials.Silver, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.fluidOutputs(PollutionMaterials.hyperdimensional_silver.getFluid(2304))
				.circuitMeta(20)
				.blastFurnaceTemp(4500)
				.duration(10000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(PollutionMaterials.dimensional_transforming_agent.getFluid(42))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.input(OrePrefix.dust, Materials.Gold, 4)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.fluidOutputs(PollutionMaterials.keqinggold.getFluid(2304))
				.circuitMeta(20)
				.blastFurnaceTemp(4500)
				.duration(10000)
				.EUt(7680)
				.buildAndRegister();
		PORecipeMaps.FORGE_ALCHEMY_RECIPES.recipeBuilder()
				.fluidInputs(PollutionMaterials.advanced_substrate.getFluid(144))
				.fluidInputs(PollutionMaterials.dimensional_transforming_agent.getFluid(42))
				.fluidInputs(GTQTMaterials.Magic.getFluid(4000))
				.input(OrePrefix.dust, PollutionMaterials.mansussteel, 2)
				.input(OrePrefix.dust, PollutionMaterials.manasteel, 2)
				.notConsumable(new ItemStack(PollutionMetaItems.STONE_OF_PHILOSOPHER_2.getMetaItem(), 1, 151))
				.fluidOutputs(PollutionMaterials.Terrasteel.getFluid(2304))
				.circuitMeta(20)
				.blastFurnaceTemp(4500)
				.duration(15000)
				.EUt(7680)
				.buildAndRegister();
	}
}