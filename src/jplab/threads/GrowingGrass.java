package jplab.threads;

public class GrowingGrass implements Runnable
{
    private ResourceGrid rG;
    private int growFrequency;
    private int growAmount;

    // ************************************************ KONSTRUKTOR
    public GrowingGrass(int growAmount, int growFrequency, ResourceGrid rG)
    {
        this.rG = rG;
        this.growAmount = growAmount;
        this.growFrequency = growFrequency;
    }

    // ************************************************ RUN
    public void run()
    {

        try
        {

            while(true)
            {
                GrowGrass();
                Thread.sleep(growFrequency);

            }

        }
        catch(InterruptedException e)
        {

        }
    }

    // ************************************************ ROSNIĘCIE TRAWY
    private void GrowGrass()
    {

        for (int i = 0; i < rG.getHeight(); i++)
        {
            for (int j = 0; j < rG.getWidth(); j++)
            {
                synchronized (rG.grassCells[i][j])
                {
                    if (rG.grassCells[i][j].getGrassSize() < 10)
                    {
                        rG.grassCells[i][j].addGrass(growAmount);
                    }
                }


            }
        }


    }
}
