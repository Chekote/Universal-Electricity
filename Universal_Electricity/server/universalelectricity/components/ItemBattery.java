package net.minecraft.src.universalelectricity.components;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.universalelectricity.UEElectricItem;

public class ItemBattery extends UEElectricItem implements ITextureProvider
{
    public ItemBattery(int par1, int par2)
    {
        super(par1);
        this.iconIndex = par2;
        this.setItemName("Battery");
    }
    
    /**
     * This function is called to get the electricity maximum capacity in this item
     * @return - The amount of electricity maximum capacity
     */
    @Override
	public int getElectricityCapacity()
    {
    	return 15000;
    }
    
    /**
	 * Can this item give out electricity when placed in an tile entity? Electric items like batteries
	 * should be able to produce electricity (if they are rechargable).
	 * @return - True or False.
	 */
    @Override
	public boolean canProduceElectricity()
	{
		return true;
	}
    
    /**
     * This function is called to get the maximum transfer rate this electric item can recieve per tick
     * @return - The amount of electricity maximum capacity
     */
    @Override
	public int getTransferRate()
    {
    	return 100;
    }

	@Override
	public String getTextureFile()
	{
		return UCItem.textureFile;
	}

	@Override
	public int getVolts()
	{
		return 20;
	}
}
