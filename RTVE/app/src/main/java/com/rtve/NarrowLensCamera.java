package com.rtve;

/**
 * Created by Matt on 10/10/2015.
 */
public class NarrowLensCamera extends Camera
{
   public NarrowLensCamera(String name)
   {
      super(name);
   }

   @Override
   public String toString()
   {
      return super.toString() + "\n(Narrow Lens)";
   }
}
