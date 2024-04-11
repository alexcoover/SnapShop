/**
 * Replaces each pixel with a pixel of the opposite value generating a negative image.
 */
public class Negative implements Filter
{
	public void filter(PixelImage pi)
	{
		Pixel[][] data = pi.getData();
		
		for (int row = 0; row < pi.getHeight(); row++) {
			for (int col = 0; col < pi.getWidth(); col++) {
				Pixel pixel = data[row][col];
				int negativeRed = 255 - pixel.red;
				int negativeBlue = 255 - pixel.blue;
				int negativeGreen = 255 - pixel.green;
				
				data[row][col] = new Pixel(negativeRed, negativeBlue, negativeGreen);
			}
		}
		pi.setData(data);
	}
	
}
