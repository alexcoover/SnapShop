// Write your short report here (-2 if there is no report)

/**
 * A class to configure the SnapShop application
 *
 * @author Alex Coover
 * @version 08/10/23
 * @report:
 * I began this project by reading the project requirements, then reading through all of
 * the classes, then reading the project requirements, then back to the classes. At some point
 * I understood what the goal was and I was happy to see that the heavy lifting was already
 * done for me. The vertical filter was a simple modification of the existing horizontal filter,
 * and the negative filter is simple.
 * 
 * The first filter I thought of adding was a pixel sorting filter because I think it looks cool.
 * At the moment I'm unsure if I will have the time to make it.
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("D:\\Codes\\Java\\bg12.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");


    // add your other filters below
    theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
    theShop.addFilter(new Negative(), "Negative");
  }
}
