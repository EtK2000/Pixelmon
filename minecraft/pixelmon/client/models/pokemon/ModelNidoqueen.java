// Date: 5/20/2013 10:20:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.ModuleTailBasic;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelNidoqueen extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelNidoqueen()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 3, 0);
    
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0, -8, -5);
      PixelmonModelRenderer jawmid = new PixelmonModelRenderer(this, 72, 0);
      jawmid.addBox(-4F, -2F, -9.2F, 8, 3, 5);
      jawmid.setTextureSize(128, 64);
      jawmid.mirror = true;
      setRotation(jawmid, 0.3839724F, 0F, 0F);
      PixelmonModelRenderer jawback = new PixelmonModelRenderer(this, 70, 1);
      jawback.addBox(-5.5F, -2F, -5.2F, 11, 3, 3);
      jawback.setTextureSize(128, 64);
      jawback.mirror = true;
      setRotation(jawback, 0.418879F, 0F, 0F);
      PixelmonModelRenderer spikeheadtop = new PixelmonModelRenderer(this, 84, 32);
      spikeheadtop.addBox(-0.5F, -1.5F, -11F, 1, 1, 5);
      spikeheadtop.setTextureSize(128, 64);
      spikeheadtop.mirror = true;
      setRotation(spikeheadtop, -1.134464F, 0F, 0F);
      PixelmonModelRenderer leftmuzzle = new PixelmonModelRenderer(this, 92, 19);
      leftmuzzle.addBox(6F, -2.7F, -7.3F, 3, 2, 5);
      leftmuzzle.setTextureSize(128, 64);
      leftmuzzle.mirror = true;
      setRotation(leftmuzzle, 0.4014257F, 0.6370452F, 0.0523599F);
      PixelmonModelRenderer leftearback = new PixelmonModelRenderer(this, 63, 29);
      leftearback.addBox(1.9F, -11F, -3.8F, 3, 6, 7);
      leftearback.setTextureSize(128, 64);
      leftearback.mirror = true;
      setRotation(leftearback, -0.6283185F, 0.7504916F, 0.0872665F);
      PixelmonModelRenderer lefteartip = new PixelmonModelRenderer(this, 63, 29);
      lefteartip.addBox(1.9F, -13F, -2.6F, 3, 2, 5);
      lefteartip.setTextureSize(128, 64);
      lefteartip.mirror = true;
      setRotation(lefteartip, -0.6283185F, 0.7504916F, 0.0872665F);
      PixelmonModelRenderer rightearback = new PixelmonModelRenderer(this, 63, 29);
      rightearback.addBox(-5.1F, -11F, -3.8F, 3, 6, 7);
      rightearback.setTextureSize(128, 64);
      rightearback.mirror = true;
      setRotation(rightearback, -0.6283185F, -0.7504916F, -0.0872665F);
      PixelmonModelRenderer righteartip = new PixelmonModelRenderer(this, 63, 29);
      righteartip.addBox(-5.1F, -13F, -2.6F, 3, 2, 5);
      righteartip.setTextureSize(128, 64);
      righteartip.mirror = true;
      setRotation(righteartip, -0.6283185F, -0.7504916F, -0.0872665F);
      PixelmonModelRenderer spikeheadbottom = new PixelmonModelRenderer(this, 85, 35);
      spikeheadbottom.addBox(-0.5F, 2.8F, -10.2F, 1, 1, 4);
      spikeheadbottom.setTextureSize(128, 64);
      spikeheadbottom.mirror = true;
      setRotation(spikeheadbottom, -1.53589F, 0F, 0F);
      PixelmonModelRenderer jawhinge = new PixelmonModelRenderer(this, 70, 1);
      jawhinge.addBox(-6F, -4F, -3.2F, 12, 4, 3);
      jawhinge.setTextureSize(128, 64);
      jawhinge.mirror = true;
      setRotation(jawhinge, 0.8203047F, 0F, 0F);
      PixelmonModelRenderer leftmuzzleback = new PixelmonModelRenderer(this, 90, 17);
      leftmuzzleback.addBox(3.2F, -4.1F, -6.5F, 3, 2, 7);
      leftmuzzleback.setTextureSize(128, 64);
      leftmuzzleback.mirror = true;
      setRotation(leftmuzzleback, 0.4363323F, 0.122173F, 0.0610865F);
      PixelmonModelRenderer leftheadside = new PixelmonModelRenderer(this, 114, 0);
      leftheadside.addBox(5.8F, -5.3F, -5F, 1, 4, 6);
      leftheadside.setTextureSize(128, 64);
      leftheadside.mirror = true;
      setRotation(leftheadside, 0.5061455F, 0.2443461F, -0.3665191F);
      PixelmonModelRenderer leftnose = new PixelmonModelRenderer(this, 106, 9);
      leftnose.addBox(8.5F, -1.5F, -7.7F, 1, 2, 4);
      leftnose.setTextureSize(128, 64);
      leftnose.mirror = true;
      setRotation(leftnose, 0.5585054F, 0.837758F, -0.2792527F);
      PixelmonModelRenderer lefteye = new PixelmonModelRenderer(this, 104, 4);
      lefteye.addBox(6.3F, -2.4F, -6F, 2, 2, 3);
      lefteye.setTextureSize(128, 64);
      lefteye.mirror = true;
      setRotation(lefteye, 0.5585054F, 0.5759587F, -0.3490659F);
      PixelmonModelRenderer leftbrow = new PixelmonModelRenderer(this, 104, 1);
      leftbrow.addBox(6F, -7.9F, -4.2F, 1, 2, 4);
      leftbrow.setTextureSize(128, 64);
      leftbrow.mirror = true;
      setRotation(leftbrow, 0.8028515F, 0.4014257F, -0.0174533F);
      PixelmonModelRenderer rightmuzzleback = new PixelmonModelRenderer(this, 90, 17);
      rightmuzzleback.addBox(-6.2F, -4.1F, -6.3F, 3, 2, 7);
      rightmuzzleback.setTextureSize(128, 64);
      rightmuzzleback.mirror = true;
      setRotation(rightmuzzleback, 0.4363323F, -0.122173F, -0.0610865F);
      PixelmonModelRenderer skullback = new PixelmonModelRenderer(this, 80, 27);
      skullback.addBox(-4F, -8.1F, -2.6F, 8, 1, 3);
      skullback.setTextureSize(128, 64);
      skullback.mirror = true;
      setRotation(skullback, 0.1570796F, 0F, 0F);
      PixelmonModelRenderer muzzlefront = new PixelmonModelRenderer(this, 94, 10);
      muzzlefront.addBox(-2.49F, -5.6F, -11.2F, 5, 2, 1);
      muzzlefront.setTextureSize(128, 64);
      muzzlefront.mirror = true;
      setRotation(muzzlefront, 0.5585054F, 0F, 0F);
      PixelmonModelRenderer forehead = new PixelmonModelRenderer(this, 80, 26);
      forehead.addBox(-3.5F, -10.3F, -5.7F, 7, 2, 4);
      forehead.setTextureSize(128, 64);
      forehead.mirror = true;
      setRotation(forehead, 0.9180432F, 0F, 0F);
      PixelmonModelRenderer righteye = new PixelmonModelRenderer(this, 104, 4);
      righteye.addBox(-8.3F, -2.4F, -6F, 2, 2, 3);
      righteye.setTextureSize(128, 64);
      righteye.mirror = true;
      setRotation(righteye, 0.5585054F, -0.5759587F, 0.3490659F);
      PixelmonModelRenderer skull = new PixelmonModelRenderer(this, 79, 26);
      skull.addBox(-3.5F, -8.5F, -4.4F, 7, 2, 4);
      skull.setTextureSize(128, 64);
      skull.mirror = true;
      setRotation(skull, 0.418879F, 0F, 0F);
      PixelmonModelRenderer rightnose = new PixelmonModelRenderer(this, 106, 9);
      rightnose.addBox(-9.5F, -1.5F, -7.7F, 1, 2, 4);
      rightnose.setTextureSize(128, 64);
      rightnose.mirror = true;
      setRotation(rightnose, 0.5585054F, -0.837758F, 0.2792527F);
      PixelmonModelRenderer rightmuzzle = new PixelmonModelRenderer(this, 92, 19);
      rightmuzzle.addBox(-9F, -2.7F, -7.3F, 3, 2, 5);
      rightmuzzle.setTextureSize(128, 64);
      rightmuzzle.mirror = true;
      setRotation(rightmuzzle, 0.4363323F, -0.6370452F, -0.0523599F);
      PixelmonModelRenderer nosetip = new PixelmonModelRenderer(this, 95, 10);
      nosetip.addBox(-1.5F, -3.2F, -12F, 3, 3, 1);
      nosetip.setTextureSize(128, 64);
      nosetip.mirror = true;
      setRotation(nosetip, 0.3490659F, 0F, 0F);
      PixelmonModelRenderer rightheadside = new PixelmonModelRenderer(this, 114, 0);
      rightheadside.addBox(-6.8F, -5.3F, -5F, 1, 4, 6);
      rightheadside.setTextureSize(128, 64);
      rightheadside.mirror = true;
      setRotation(rightheadside, 0.5061455F, -0.2443461F, 0.3665191F);
      PixelmonModelRenderer chin = new PixelmonModelRenderer(this, 78, 2);
      chin.addBox(-2.5F, 0F, -11.2F, 5, 2, 2);
      chin.setTextureSize(128, 64);
      chin.mirror = true;
      setRotation(chin, 0.1570796F, 0F, 0F);
      PixelmonModelRenderer rightbrow = new PixelmonModelRenderer(this, 103, 1);
      rightbrow.addBox(-7F, -7.9F, -4.2F, 1, 2, 4);
      rightbrow.setTextureSize(128, 64);
      rightbrow.mirror = true;
      setRotation(rightbrow, 0.8028515F, -0.4014257F, 0.0174533F);
      PixelmonModelRenderer foreheadcurve = new PixelmonModelRenderer(this, 81, 28);
      foreheadcurve.addBox(-3.5F, -9.1F, -5F, 7, 2, 2);
      foreheadcurve.setTextureSize(128, 64);
      foreheadcurve.mirror = true;
      setRotation(foreheadcurve, 0.5759587F, 0F, 0F);
      PixelmonModelRenderer nosebridge = new PixelmonModelRenderer(this, 82, 26);
      nosebridge.addBox(-2.5F, -11.7F, -4.5F, 5, 2, 3);
      nosebridge.setTextureSize(128, 64);
      nosebridge.mirror = true;
      setRotation(nosebridge, 1.291544F, 0F, 0F);
      PixelmonModelRenderer righteartransparent = new PixelmonModelRenderer(this, 63, 8);
      righteartransparent.addBox(-6.2F, -17F, -4.5F, 1, 13, 8);
      righteartransparent.setTextureSize(128, 64);
      righteartransparent.mirror = true;
      setRotation(righteartransparent, -0.6283185F, -0.7504916F, -0.0872665F);
      PixelmonModelRenderer lefteartransparent = new PixelmonModelRenderer(this, 63, 8);
      lefteartransparent.addBox(4F, -17F, -4.5F, 1, 13, 8);
      lefteartransparent.setTextureSize(128, 64);
      lefteartransparent.mirror = true;
      setRotation(lefteartransparent, -0.6283185F, 0.7504916F, 0.0872665F);
      PixelmonModelRenderer hornbottom = new PixelmonModelRenderer(this, 85, 35);
      hornbottom.addBox(-1F, 4.8F, -12.6F, 2, 1, 4);
      hornbottom.setTextureSize(128, 64);
      hornbottom.mirror = true;
      setRotation(hornbottom, -0.7330383F, 0F, 0F);
      PixelmonModelRenderer horntop = new PixelmonModelRenderer(this, 84, 32);
      horntop.addBox(-1F, -0.5F, -14F, 2, 1, 5);
      horntop.setTextureSize(128, 64);
      horntop.mirror = true;
      setRotation(horntop, -0.3316126F, 0F, 0F);
      Head.addChild(jawmid);
      Head.addChild(jawback);
      Head.addChild(spikeheadtop);
      Head.addChild(leftmuzzle);
      Head.addChild(leftearback);
      Head.addChild(lefteartip);
      Head.addChild(rightearback);
      Head.addChild(righteartip);
      Head.addChild(spikeheadbottom);
      Head.addChild(jawhinge);
      Head.addChild(leftmuzzleback);
      Head.addChild(leftheadside);
      Head.addChild(leftnose);
      Head.addChild(lefteye);
      Head.addChild(leftbrow);
      Head.addChild(rightmuzzleback);
      Head.addChild(skullback);
      Head.addChild(muzzlefront);
      Head.addChild(forehead);
      Head.addChild(righteye);
      Head.addChild(skull);
      Head.addChild(rightnose);
      Head.addChild(rightmuzzle);
      Head.addChild(nosetip);
      Head.addChild(rightheadside);
      Head.addChild(chin);
      Head.addChild(rightbrow);
      Head.addChild(foreheadcurve);
      Head.addChild(nosebridge);
      Head.addChild(righteartransparent);
      Head.addChild(lefteartransparent);
      Head.addChild(hornbottom);
      Head.addChild(horntop);
      Body.addChild(Head);
     
      
      
      
      PixelmonModelRenderer  bellyleft = new PixelmonModelRenderer(this, 23, 50);
      bellyleft.addBox(8.2F, 6F, -4.5F, 2, 5, 7);
      bellyleft.setTextureSize(128, 64);
      bellyleft.mirror = true;
      setRotation(bellyleft, 0F, 0.3926991F, 0F);
      PixelmonModelRenderer  necktop = new PixelmonModelRenderer(this, 5, 5);
      necktop.addBox(-4.5F, -15.9F, 3.7F, 9, 4, 3);
      necktop.setTextureSize(128, 64);
      necktop.mirror = true;
      setRotation(necktop, 0.7330383F, 0F, 0F);
      PixelmonModelRenderer  neck = new PixelmonModelRenderer(this, 3, 2);
      neck.addBox(-5.5F, -13F, -2.7F, 11, 6, 8);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, 0.6108652F, 0F, 0F);
      PixelmonModelRenderer  bellyfront = new PixelmonModelRenderer(this, 5, 54);
      bellyfront.addBox(-3F, 6F, -9.5F, 6, 8, 1);
      bellyfront.setTextureSize(128, 64);
      bellyfront.mirror = true;
      setRotation(bellyfront, 0F, 0F, 0F);
      PixelmonModelRenderer  bellyright = new PixelmonModelRenderer(this, 23, 50);
      bellyright.addBox(-10F, 6F, -4.3F, 2, 5, 7);
      bellyright.setTextureSize(128, 64);
      bellyright.mirror = true;
      setRotation(bellyright, 0F, -0.3926991F, 0F);
      PixelmonModelRenderer  glutright = new PixelmonModelRenderer(this, 0, 0);
      glutright.addBox(-8.5F, 6F, -1.5F, 1, 8, 8);
      glutright.setTextureSize(128, 64);
      glutright.mirror = true;
      setRotation(glutright, 0F, 0.1396263F, 0F);
      PixelmonModelRenderer  leftflank = new PixelmonModelRenderer(this, 4, 0);
      leftflank.addBox(8.3F, -0.5F, -0.5F, 4, 5, 8);
      leftflank.setTextureSize(128, 64);
      leftflank.mirror = true;
      setRotation(leftflank, 0F, 0.0174533F, 0.5410521F);
      PixelmonModelRenderer  bellyfrontright = new PixelmonModelRenderer(this, 0, 54);
      bellyfrontright.addBox(-5.4F, 6F, -9.7F, 5, 8, 1);
      bellyfrontright.setTextureSize(128, 64);
      bellyfrontright.mirror = true;
      setRotation(bellyfrontright, 0F, 0.2530727F, 0F);
      PixelmonModelRenderer  bellyfrontleft = new PixelmonModelRenderer(this, 11, 54);
      bellyfrontleft.addBox(0.6F, 6F, -9.7F, 5, 8, 1);
      bellyfrontleft.setTextureSize(128, 64);
      bellyfrontleft.mirror = true;
      setRotation(bellyfrontleft, 0F, -0.2530727F, 0F);
      PixelmonModelRenderer  rightchestsideup = new PixelmonModelRenderer(this, 4, 45);
      rightchestsideup.addBox(-9.18F, -4.5F, -4.2F, 4, 2, 3);
      rightchestsideup.setTextureSize(128, 64);
      rightchestsideup.mirror = true;
      setRotation(rightchestsideup, 0.5890486F, -0.3926991F, 0.0349066F);
      PixelmonModelRenderer  backlowerlats = new PixelmonModelRenderer(this, 1, 0);
      backlowerlats.addBox(-7F, -4.4F, -4.8F, 14, 6, 10);
      backlowerlats.setTextureSize(128, 64);
      backlowerlats.mirror = true;
      setRotation(backlowerlats, 0.567232F, 0F, 0F);
      PixelmonModelRenderer  leftchestsidedown = new PixelmonModelRenderer(this, 2, 41);
      leftchestsidedown.addBox(5.2F, -2F, -4.5F, 4, 4, 3);
      leftchestsidedown.setTextureSize(128, 64);
      leftchestsidedown.mirror = true;
      setRotation(leftchestsidedown, 0.3926991F, 0.3926991F, -0.0349066F);
      PixelmonModelRenderer  backtail = new PixelmonModelRenderer(this, 2, 1);
      backtail.addBox(-7.5F, 3.8F, -1.5F, 15, 7, 7);
      backtail.setTextureSize(128, 64);
      backtail.mirror = true;
      setRotation(backtail, 0.4276057F, 0F, 0F);
      PixelmonModelRenderer  leftchestsideup = new PixelmonModelRenderer(this, 4, 45);
      leftchestsideup.addBox(5.21F, -4.5F, -4.2F, 4, 2, 3);
      leftchestsideup.setTextureSize(128, 64);
      leftchestsideup.mirror = true;
      setRotation(leftchestsideup, 0.5890486F, 0.3926991F, -0.0349066F);
      PixelmonModelRenderer  bellybottom = new PixelmonModelRenderer(this, 0, 58);
      bellybottom.addBox(-6F, 9.5F, -13F, 12, 2, 4);
      bellybottom.setTextureSize(128, 64);
      bellybottom.mirror = true;
      setRotation(bellybottom, 0.3926991F, 0F, 0F);
      PixelmonModelRenderer  leftchestinside = new PixelmonModelRenderer(this, 5, 44);
      leftchestinside.addBox(1.5F, -3.5F, -9.7F, 2, 5, 2);
      leftchestinside.setTextureSize(128, 64);
      leftchestinside.mirror = true;
      setRotation(leftchestinside, 0.3577925F, 0F, -0.2617994F);
      PixelmonModelRenderer  chestslope = new PixelmonModelRenderer(this, 5, 51);
      chestslope.addBox(-3F, -0.5F, -9F, 6, 5, 1);
      chestslope.setTextureSize(128, 64);
      chestslope.mirror = true;
      setRotation(chestslope, 0F, 0F, 0F);
      PixelmonModelRenderer  bellytopright = new PixelmonModelRenderer(this, 0, 51);
      bellytopright.addBox(-5.3F, 5.3F, -6.9F, 5, 4, 2);
      bellytopright.setTextureSize(128, 64);
      bellytopright.mirror = true;
      setRotation(bellytopright, -0.3926991F, 0.2879793F, -0.0349066F);
      PixelmonModelRenderer  bellytopmid = new PixelmonModelRenderer(this, 5, 51);
      bellytopmid.addBox(-3F, 5.2F, -6.5F, 6, 4, 1);
      bellytopmid.setTextureSize(128, 64);
      bellytopmid.mirror = true;
      setRotation(bellytopmid, -0.3926991F, 0F, 0F);
      PixelmonModelRenderer  backmid = new PixelmonModelRenderer(this, 0, 0);
      backmid.addBox(-7.49F, 0F, -6.5F, 15, 6, 12);
      backmid.setTextureSize(128, 64);
      backmid.mirror = true;
      setRotation(backmid, 0.3054326F, 0F, 0F);
      PixelmonModelRenderer  rightflank = new PixelmonModelRenderer(this, 4, 0);
      rightflank.addBox(-11.7F, -0.5F, -0.5F, 4, 5, 8);
      rightflank.setTextureSize(128, 64);
      rightflank.mirror = true;
      setRotation(rightflank, 0F, -0.0174533F, -0.5410521F);
      PixelmonModelRenderer  gluteleft = new PixelmonModelRenderer(this, 0, 0);
      gluteleft.addBox(7.5F, 6F, -1.5F, 1, 8, 8);
      gluteleft.setTextureSize(128, 64);
      gluteleft.mirror = true;
      setRotation(gluteleft, 0F, -0.1396263F, 0F);
      PixelmonModelRenderer  bellytopleft = new PixelmonModelRenderer(this, 11, 51);
      bellytopleft.addBox(0.4F, 5.3F, -6.9F, 5, 4, 2);
      bellytopleft.setTextureSize(128, 64);
      bellytopleft.mirror = true;
      setRotation(bellytopleft, -0.3926991F, -0.2879793F, 0.0349066F);
      PixelmonModelRenderer  neckslopefront = new PixelmonModelRenderer(this, 8, 18);
      neckslopefront.addBox(-5.5F, -3.2F, -8.4F, 11, 6, 1);
      neckslopefront.setTextureSize(128, 64);
      neckslopefront.mirror = true;
      setRotation(neckslopefront, -0.3926991F, 0F, 0F);
      PixelmonModelRenderer  backupperlats = new PixelmonModelRenderer(this, 5, 5);
      backupperlats.addBox(-6.99F, -7F, 2.3F, 14, 3, 3);
      backupperlats.setTextureSize(128, 64);
      backupperlats.mirror = true;
      setRotation(backupperlats, 0.5934119F, 0F, 0F);
      PixelmonModelRenderer  bodytailbase = new PixelmonModelRenderer(this, 0, 0);
      bodytailbase.addBox(-7.5F, 4.4F, 2.5F, 15, 10, 9);
      bodytailbase.setTextureSize(128, 64);
      bodytailbase.mirror = true;
      setRotation(bodytailbase, -0.2268928F, 0F, 0F);
      PixelmonModelRenderer  spikeneck = new PixelmonModelRenderer(this, 58, 0);
      spikeneck.addBox(-1F, -14.5F, -12.5F, 1, 7, 5);
      spikeneck.setTextureSize(128, 64);
      spikeneck.mirror = true;
      setRotation(spikeneck, -0.6108652F, 0F, 0F);
      PixelmonModelRenderer  spiketrapezoids = new PixelmonModelRenderer(this, 58, 0);
      spiketrapezoids.addBox(-1F, -13.5F, -7.5F, 1, 9, 5);
      spiketrapezoids.setTextureSize(128, 64);
      spiketrapezoids.mirror = true;
      setRotation(spiketrapezoids, -0.8726646F, 0F, 0F);
      PixelmonModelRenderer spikemidback = new PixelmonModelRenderer(this, 58, 0);
      spikemidback.addBox(-1F, -13.5F, -2.5F, 1, 9, 5);
      spikemidback.setTextureSize(128, 64);
      spikemidback.mirror = true;
      setRotation(spikemidback, -1.012291F, 0F, 0F);
      PixelmonModelRenderer spikelowerback = new PixelmonModelRenderer(this, 58, 0);
      spikelowerback.addBox(-1F, -14F, 3.5F, 1, 9, 5);
      spikelowerback.setTextureSize(128, 64);
      spikelowerback.mirror = true;
      setRotation(spikelowerback, -1.064651F, 0F, 0F);
      PixelmonModelRenderer rightchestsidedown = new PixelmonModelRenderer(this, 4, 44);
      rightchestsidedown.addBox(-9.2F, -2F, -4.5F, 4, 4, 3);
      rightchestsidedown.setTextureSize(128, 64);
      rightchestsidedown.mirror = true;
      setRotation(rightchestsidedown, 0.3926991F, -0.3926991F, 0.0349066F);
      PixelmonModelRenderer leftchestmidup = new PixelmonModelRenderer(this, 7, 43);
      leftchestmidup.addBox(7.5F, -4.7F, -0.5F, 2, 2, 4);
      leftchestmidup.setTextureSize(128, 64);
      leftchestmidup.mirror = true;
      setRotation(leftchestmidup, 0.3926991F, 1.108284F, 0.3665191F);
      PixelmonModelRenderer leftchestmiddown = new PixelmonModelRenderer(this, 7, 42);
      leftchestmiddown.addBox(7.8F, -2.7F, -0.9F, 2, 4, 4);
      leftchestmiddown.setTextureSize(128, 64);
      leftchestmiddown.mirror = true;
      setRotation(leftchestmiddown, 0.3403392F, 1.090831F, 0.296706F);
      PixelmonModelRenderer rightchestmidup = new PixelmonModelRenderer(this, 7, 42);
      rightchestmidup.addBox(-9.5F, -4.7F, -0.5F, 2, 2, 4);
      rightchestmidup.setTextureSize(128, 64);
      rightchestmidup.mirror = true;
      setRotation(rightchestmidup, 0.3926991F, -1.108284F, -0.3665191F);
      PixelmonModelRenderer rightchestmiddown = new PixelmonModelRenderer(this, 7, 42);
      rightchestmiddown.addBox(-9.8F, -2.7F, -0.9F, 2, 4, 4);
      rightchestmiddown.setTextureSize(128, 64);
      rightchestmiddown.mirror = true;
      setRotation(rightchestmiddown, 0.3403392F, -1.090831F, -0.296706F);
      PixelmonModelRenderer rightchestinside = new PixelmonModelRenderer(this, 8, 44);
      rightchestinside.addBox(-3.5F, -3.5F, -9.72F, 2, 5, 2);
      rightchestinside.setTextureSize(128, 64);
      rightchestinside.mirror = true;
      setRotation(rightchestinside, 0.3577925F, 0F, 0.2617994F);
      Body.addChild(bellyleft);
      Body.addChild(necktop);
      Body.addChild(neck);
      Body.addChild(bellyfront);
      Body.addChild(bellyright);
      Body.addChild(glutright);
      Body.addChild(leftflank);
      Body.addChild(bellyfrontright);
      Body.addChild(bellyfrontleft);
      Body.addChild(rightchestsideup);
      Body.addChild(backlowerlats);
      Body.addChild(leftchestsidedown);
      Body.addChild(backtail);
      Body.addChild(leftchestsideup);
      Body.addChild(bellybottom);
      Body.addChild(leftchestinside);
      Body.addChild(chestslope);
      Body.addChild(bellytopright);
      Body.addChild(bellytopmid);
      Body.addChild(backmid);
      Body.addChild(rightflank);
      Body.addChild(gluteleft);
      Body.addChild(bellytopleft);
      Body.addChild(neckslopefront);
      Body.addChild(backupperlats);
      Body.addChild(bodytailbase);
      Body.addChild(spikeneck);
      Body.addChild(spiketrapezoids);
      Body.addChild(spikemidback);
      Body.addChild(spikelowerback);
      Body.addChild(rightchestsidedown);
      Body.addChild(leftchestmidup);
      Body.addChild(leftchestmiddown);
      Body.addChild(rightchestmidup);
      Body.addChild(rightchestmiddown);
      Body.addChild(rightchestinside);
      
      
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(7, -4, -4);
      PixelmonModelRenderer  leftshoulderin = new PixelmonModelRenderer(this, 24, 19);
      leftshoulderin.addBox(-1.5F, -3F, -2.5F, 4, 6, 6);
      leftshoulderin.setTextureSize(128, 64);
      leftshoulderin.mirror = true;
      setRotation(leftshoulderin, -0.2443461F, -0.1570796F, 0.3141593F);
      PixelmonModelRenderer  leftbottomclaw = new PixelmonModelRenderer(this, 38, 62);
      leftbottomclaw.addBox(16.4F, 1F, 8.5F, 2, 1, 1);
      leftbottomclaw.setTextureSize(128, 64);
      leftbottomclaw.mirror = true;
      setRotation(leftbottomclaw, 0.3839724F, 0.8028515F, 1.37881F);
      PixelmonModelRenderer  lefttopclaw = new PixelmonModelRenderer(this, 38, 62);
      lefttopclaw.addBox(16.4F, -2.6F, 8.5F, 2, 1, 1);
      lefttopclaw.setTextureSize(128, 64);
      lefttopclaw.mirror = true;
      setRotation(lefttopclaw, 0.3839724F, 0.8028515F, 1.37881F);
      PixelmonModelRenderer  leftthumbclaw = new PixelmonModelRenderer(this, 38, 62);
      leftthumbclaw.addBox(15.4F, -3.8F, 6.5F, 2, 1, 1);
      leftthumbclaw.setTextureSize(128, 64);
      leftthumbclaw.mirror = true;
      setRotation(leftthumbclaw, 0.3839724F, 0.8028515F, 1.37881F);
      PixelmonModelRenderer  lefthand = new PixelmonModelRenderer(this, 41, 45);
      lefthand.addBox(10.4F, -2.8F, 5.5F, 6, 5, 4);
      lefthand.setTextureSize(128, 64);
      lefthand.mirror = true;
      setRotation(lefthand, 0.3839724F, 0.8028515F, 1.37881F);
      PixelmonModelRenderer  leftforearm = new PixelmonModelRenderer(this, 41, 47);
      leftforearm.addBox(7.5F, -3.5F, 4.5F, 4, 5, 5);
      leftforearm.setTextureSize(128, 64);
      leftforearm.mirror = true;
      setRotation(leftforearm, 0.3839724F, 0.7330383F, 1.37881F);
      PixelmonModelRenderer  leftarm = new PixelmonModelRenderer(this, 37, 31);
      leftarm.addBox(2.4F, -2F, 0F, 8, 4, 3);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0.3839724F, 0.1047198F, 0.9773844F);
      PixelmonModelRenderer  leftshoulderout = new PixelmonModelRenderer(this, 45, 19);
      leftshoulderout.addBox(1.5F, -3.5F, -2.5F, 2, 6, 6);
      leftshoulderout.setTextureSize(128, 64);
      leftshoulderout.mirror = true;
      setRotation(leftshoulderout, -0.2138028F, -0.1570796F, 0.5235988F);
      LeftArm.addChild(leftshoulderin);
      LeftArm.addChild(leftbottomclaw);
      LeftArm.addChild(lefttopclaw);
      LeftArm.addChild(leftthumbclaw);
      LeftArm.addChild(lefthand);
      LeftArm.addChild(leftforearm);
      LeftArm.addChild(leftarm);
      LeftArm.addChild(leftshoulderout);
      Body.addChild(LeftArm);
     
      
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-7, -4, -4);
      PixelmonModelRenderer rightshoulderin = new PixelmonModelRenderer(this, 43, 19);
      rightshoulderin.addBox(-2.5F, -3F, -2.5F, 4, 6, 6);
      rightshoulderin.setTextureSize(128, 64);
      rightshoulderin.mirror = true;
      setRotation(rightshoulderin, -0.2443461F, 0.1570796F, -0.3141593F);
      PixelmonModelRenderer righthand = new PixelmonModelRenderer(this, 41, 45);
      righthand.addBox(-16.6F, -2.8F, 6.033333F, 6, 5, 4);
      righthand.setTextureSize(128, 64);
      righthand.mirror = true;
      setRotation(righthand, 0.3839724F, -0.8028515F, -1.37881F);
      PixelmonModelRenderer righttopclaw = new PixelmonModelRenderer(this, 38, 62);
      righttopclaw.addBox(-18.6F, -2.6F, 8.5F, 2, 1, 1);
      righttopclaw.setTextureSize(128, 64);
      righttopclaw.mirror = true;
      setRotation(righttopclaw, 0.3839724F, -0.8028515F, -1.37881F);
      PixelmonModelRenderer rightthumbclaw = new PixelmonModelRenderer(this, 38, 62);
      rightthumbclaw.addBox(-17.6F, -3.8F, 6.5F, 2, 1, 1);
      rightthumbclaw.setTextureSize(128, 64);
      rightthumbclaw.mirror = true;
      setRotation(rightthumbclaw, 0.3839724F, -0.8028515F, -1.37881F);
      PixelmonModelRenderer rightforearm = new PixelmonModelRenderer(this, 41, 47);
      rightforearm.addBox(-11.5F, -3.5F, 4.5F, 4, 5, 5);
      rightforearm.setTextureSize(128, 64);
      rightforearm.mirror = true;
      setRotation(rightforearm, 0.3839724F, -0.7330383F, -1.37881F);
      PixelmonModelRenderer rightarm = new PixelmonModelRenderer(this, 37, 31);
      rightarm.addBox(-10.4F, -2F, 0F, 8, 4, 3);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0.3839724F, -0.1047198F, -0.9773844F);
      PixelmonModelRenderer rightbottomclaw = new PixelmonModelRenderer(this, 38, 62);
      rightbottomclaw.addBox(-18.6F, 1F, 8.5F, 2, 1, 1);
      rightbottomclaw.setTextureSize(128, 64);
      rightbottomclaw.mirror = true;
      setRotation(rightbottomclaw, 0.3839724F, -0.8028515F, -1.37881F);
      PixelmonModelRenderer rightshoulderout = new PixelmonModelRenderer(this, 17, 19);
      rightshoulderout.addBox(-3.5F, -3.5F, -2.5F, 2, 6, 6);
      rightshoulderout.setTextureSize(128, 64);
      rightshoulderout.mirror = true;
      setRotation(rightshoulderout, -0.2138028F, 0.1570796F, -0.5235988F);
      RightArm.addChild(rightshoulderin);
      RightArm.addChild(righthand);
      RightArm.addChild(righttopclaw);
      RightArm.addChild(rightthumbclaw);
      RightArm.addChild(rightforearm);
      RightArm.addChild(rightarm);
      RightArm.addChild(rightbottomclaw);
      RightArm.addChild(rightshoulderout);
      Body.addChild(RightArm);
     
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(8, 10, -4);
      PixelmonModelRenderer lefttoeinnerclaw = new PixelmonModelRenderer(this, 45, 59);
      lefttoeinnerclaw.addBox(-1F, 8F, -7.9F, 1, 1, 3);
      lefttoeinnerclaw.setTextureSize(128, 64);
      lefttoeinnerclaw.mirror = true;
      setRotation(lefttoeinnerclaw, 0.2094395F, -0.2181662F, 0F);
      PixelmonModelRenderer lefttoeinner = new PixelmonModelRenderer(this, 46, 57);
      lefttoeinner.addBox(-1.5F, 8.5F, -4.7F, 2, 2, 1);
      lefttoeinner.setTextureSize(128, 64);
      lefttoeinner.mirror = true;
      setRotation(lefttoeinner, 0F, -0.2181662F, 0F);
      PixelmonModelRenderer lefttoeouterclaw = new PixelmonModelRenderer(this, 45, 59);
      lefttoeouterclaw.addBox(4F, 8F, -7.9F, 1, 1, 3);
      lefttoeouterclaw.setTextureSize(128, 64);
      lefttoeouterclaw.mirror = true;
      setRotation(lefttoeouterclaw, 0.2094395F, -0.2181662F, 0F);
      PixelmonModelRenderer leftfoot = new PixelmonModelRenderer(this, 54, 52);
      leftfoot.addBox(-1.5F, 8F, -3.7F, 7, 3, 9);
      leftfoot.setTextureSize(128, 64);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, -0.2181662F, 0F);
      PixelmonModelRenderer lefttoeouter = new PixelmonModelRenderer(this, 46, 57);
      lefttoeouter.addBox(3.5F, 8.5F, -4.7F, 2, 2, 1);
      lefttoeouter.setTextureSize(128, 64);
      lefttoeouter.mirror = true;
      setRotation(lefttoeouter, 0F, -0.2181662F, 0F);
      PixelmonModelRenderer leftcalf = new PixelmonModelRenderer(this, 57, 47);
      leftcalf.addBox(-1F, 2.644444F, -3.2F, 6, 7, 7);
      leftcalf.setTextureSize(128, 64);
      leftcalf.mirror = true;
      setRotation(leftcalf, 0.1919862F, -0.2181662F, 0F);
      PixelmonModelRenderer leftthigh = new PixelmonModelRenderer(this, 0, 21);
      leftthigh.addBox(-2F, -1F, -4.4F, 6, 7, 11);
      leftthigh.setTextureSize(128, 64);
      leftthigh.mirror = true;
      setRotation(leftthigh, 0.5585054F, -0.3403392F, -0.0959931F);
      LeftLeg.addChild(lefttoeinnerclaw);
      LeftLeg.addChild(lefttoeinner);
      LeftLeg.addChild(lefttoeouterclaw);
      LeftLeg.addChild(leftfoot);
      LeftLeg.addChild(lefttoeouter);
      LeftLeg.addChild(leftcalf);
      LeftLeg.addChild(leftthigh);
      Body.addChild(LeftLeg);
      
      
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-8, 10, -4);
      PixelmonModelRenderer  righttoeouter = new PixelmonModelRenderer(this, 46, 57);
      righttoeouter.addBox(-5.5F, 8.5F, -4.7F, 2, 2, 1);
      righttoeouter.setTextureSize(128, 64);
      righttoeouter.mirror = true;
      setRotation(righttoeouter, 0F, 0.2181662F, 0F);
      PixelmonModelRenderer  righttoeinner = new PixelmonModelRenderer(this, 45, 59);
      righttoeinner.addBox(0F, 8F, -7.9F, 1, 1, 3);
      righttoeinner.setTextureSize(128, 64);
      righttoeinner.mirror = true;
      setRotation(righttoeinner, 0.2094395F, 0.2181662F, 0F);
      PixelmonModelRenderer  rightfoot = new PixelmonModelRenderer(this, 54, 52);
      rightfoot.addBox(-5.5F, 8F, -3.7F, 7, 3, 9);
      rightfoot.setTextureSize(128, 64);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0.2181662F, 0F);
      PixelmonModelRenderer  rightcalf = new PixelmonModelRenderer(this, 57, 47);
      rightcalf.addBox(-5F, 2.644444F, -3.2F, 6, 7, 7);
      rightcalf.setTextureSize(128, 64);
      rightcalf.mirror = true;
      setRotation(rightcalf, 0.1919862F, 0.2181662F, 0F);
      PixelmonModelRenderer  rightbigtoe = new PixelmonModelRenderer(this, 46, 57);
      rightbigtoe.addBox(-0.5F, 8.5F, -4.7F, 2, 2, 1);
      rightbigtoe.setTextureSize(128, 64);
      rightbigtoe.mirror = true;
      setRotation(rightbigtoe, 0F, 0.2181662F, 0F);
      PixelmonModelRenderer  rightthigh = new PixelmonModelRenderer(this, 0, 21);
      rightthigh.addBox(-4F, -1F, -4.4F, 6, 7, 11);
      rightthigh.setTextureSize(128, 64);
      rightthigh.mirror = true;
      setRotation(rightthigh, 0.5585054F, 0.3403392F, 0.0959931F);
      PixelmonModelRenderer  righttoeouterclaw = new PixelmonModelRenderer(this, 45, 59);
      righttoeouterclaw.addBox(-5F, 8F, -7.9F, 1, 1, 3);
      righttoeouterclaw.setTextureSize(128, 64);
      righttoeouterclaw.mirror = true;
      setRotation(righttoeouterclaw, 0.2094395F, 0.2181662F, 0F);
      RightLeg.addChild(righttoeouter);
      RightLeg.addChild(righttoeinner);
      RightLeg.addChild(rightfoot);
      RightLeg.addChild(rightcalf);
      RightLeg.addChild(rightbigtoe);
      RightLeg.addChild(rightthigh);
      RightLeg.addChild(righttoeouterclaw);
      Body.addChild(RightLeg);
     
      
      PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
      Tail.setRotationPoint(0, 12, 11);
      PixelmonModelRenderer tailpart3 = new PixelmonModelRenderer(this, 116, 12);
      tailpart3.addBox(-1.5F, 0.5F, 13F, 3, 4, 3);
      tailpart3.setTextureSize(128, 64);
      tailpart3.mirror = true;
      setRotation(tailpart3, 0.2268928F, 0F, 0F);
      PixelmonModelRenderer tailtip = new PixelmonModelRenderer(this, 119, 13);
      tailtip.addBox(-1F, 1.5F, 15.8F, 2, 3, 1);
      tailtip.setTextureSize(128, 64);
      tailtip.mirror = true;
      setRotation(tailtip, 0.2792527F, 0F, 0F);
      PixelmonModelRenderer tailpart2 = new PixelmonModelRenderer(this, 104, 19);
      tailpart2.addBox(-3F, -1F, 7.3F, 6, 6, 6);
      tailpart2.setTextureSize(128, 64);
      tailpart2.mirror = true;
      setRotation(tailpart2, 0.1396263F, 0F, 0F);
      PixelmonModelRenderer tailpart1 = new PixelmonModelRenderer(this, 98, 31);
      tailpart1.addBox(-4.5F, -3F, 2F, 9, 8, 6);
      tailpart1.setTextureSize(128, 64);
      tailpart1.mirror = true;
      setRotation(tailpart1, -0.0523599F, 0F, 0F);
      PixelmonModelRenderer tailbase = new PixelmonModelRenderer(this, 86, 45);
      tailbase.addBox(-6F, -4.5F, -6.7F, 12, 10, 9);
      tailbase.setTextureSize(128, 64);
      tailbase.mirror = true;
      setRotation(tailbase, -0.1396263F, 0F, 0F);
      PixelmonModelRenderer spiketail = new PixelmonModelRenderer(this, 59, 0);
      spiketail.addBox(-1F, -10.5F, 0.5F, 1, 7, 4);
      spiketail.setTextureSize(128, 64);
      spiketail.mirror = true;
      setRotation(spiketail, -0.5934119F, 0F, 0F);
      Tail.addChild(tailpart3);
      Tail.addChild(tailtip);
      Tail.addChild(tailpart2);
      Tail.addChild(tailpart1);
      Tail.addChild(tailbase);
      Tail.addChild(spiketail);
      Body.addChild(Tail);
      
      ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 1, 0.5F);
      ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 1, 0.5F);
      
      ModuleHead headModule = new ModuleHead(Head);
		
		float legspeed = 0.5F;
		float legRotationLimit = 1.0F;
		
		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleTailBasic tailModule = new ModuleTailBasic(Tail, .2F, .05F, legspeed);
		
		skeleton = new SkeletonBiped(Body, headModule, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule, tailModule);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
