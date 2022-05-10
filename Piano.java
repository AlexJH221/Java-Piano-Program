import java.awt.*;
import java.applet.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Piano extends Applet
{
	int xCoord, yCoord, addX, addY;
	boolean firstPaint, gardnerMode;
	File sound;

	public void init()
	{
		firstPaint = true;
		gardnerMode = false;
	}
	
	public static void PlaySound(File Sound)
	{
		try
		{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/Integer.MAX_VALUE);
		}catch(Exception e)
		{
			
		}
	}
	
	public void paint(Graphics g)
	{
		Image piano = getImage(getDocumentBase(),"piano.jpg");
		g.drawImage(piano, 0, 0, this);
		g.drawRect(50, 525, 150, 50);
		g.fillRect(250, 525, 150, 50);
		g.setColor(Color.green);
		
		if(firstPaint)
			firstPaint = false;
		else
			g.fillRect(xCoord,yCoord,addX,addY);
	}
	
	public boolean mouseDown(Event e, int x, int y)
	{
		if(x >= 50 && x <= 200 && y >= 525 && y <= 575)
		{
			if(gardnerMode == true)
				gardnerMode = false;
			else
				gardnerMode = true;
		}
		
		if(x >= 250 && x <= 400 && y >= 525 && y <= 575)
		{
			xCoord = 250;
			yCoord = 525;
			addX = 150;
			addY = 50;
			sound = new File("Megalovania.wav");
			PlaySound(sound);
			repaint();
		}
		
		if(!gardnerMode)
		{
			if(y >= 215 && y <= 348)
			{
				if(x >= 3 && x <= 75)  //C3
				{
					xCoord = 3;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("C3.wav");
					PlaySound(sound);
					repaint();
				}	
							
				if(x >= 78 && x <= 152)  //D3
				{
					xCoord = 78;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("D3.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 153 && x <= 228)  //E3
				{
					xCoord = 153;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("E3.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 230 && x <= 305)  //F3
				{
					xCoord = 230;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("F3.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 305 && x <= 380)  //G3
				{
					xCoord = 305;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("G3.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 381 && x <= 454)  //A3
				{
					xCoord = 381;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("A3.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 456 && x <= 529)  //B3
				{
					xCoord = 456;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("B3.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 531 && x <= 606)  //C4
				{
					xCoord = 531;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("C4.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 608 && x <= 682)  //D4
				{
					xCoord = 608;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("D4.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 684 && x <= 758)  //E4
				{
					xCoord = 684;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("E4.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 759 && x <= 833)  //F4
				{
					xCoord = 759;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("F4.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 835 && x <= 909)  //G4
				{
					xCoord = 835;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("G4.wav");	
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 911 && x <= 984)  //A4
				{
					xCoord = 911;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("A4.wav");
					PlaySound(sound);
					repaint();	
				}		
		
				if(x >= 986 && x <= 1059)  //B4
				{
					xCoord = 986;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("B4.wav");
					PlaySound(sound);
					repaint();	
				}
			
				if(x >= 1062 && x <= 1135)  //C5
				{
					xCoord = 1062;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("C5.wav");
					PlaySound(sound);	
					repaint();	
				}	
	
				if(x >= 1138 && x <= 1212)  //D5
				{
					xCoord = 1138;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("D5.wav");
					PlaySound(sound);
					repaint();	
				}
	
				if(x >= 1214 && x <= 1288)  //E5
				{
					xCoord = 1214;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("E5.wav");
					PlaySound(sound);
					repaint();	
				}	
			
				if(x >= 1289 && x <= 1362)  //F5
				{
					xCoord = 1289;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("F5.wav");
					PlaySound(sound);
					repaint();	
				}	
								
				if(x >= 1364 && x <= 1440)  //G5
				{
					xCoord = 1364;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("G5.wav");
					PlaySound(sound);
					repaint();	
				}	
							
				if(x >= 1442 && x <= 1514)  //A5
				{
					xCoord = 1442;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("A5.wav");
					PlaySound(sound);
					repaint();	
				}	
					
				if(x >= 1517 && x <= 1593)  //B5
				{
					xCoord = 1517;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("B5.wav");
					PlaySound(sound);
					repaint();	
				}
			}
			else if(y <= 214)
			{
				if(x >= 55 && x <= 102)  //Db3
				{
					xCoord = 55;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Db3.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 130 && x <= 177)  //Eb3
				{
					xCoord = 130;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Eb3.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 280 && x <= 327)  //Gb3
				{
					xCoord = 280;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Gb3.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 355 && x <= 402)  //Ab3
				{
					xCoord = 355;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Ab3.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 432 && x <= 479)  //Bb3
				{
					xCoord = 432;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Bb3.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 584 && x <= 631)  //Db4
				{
					xCoord = 584;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Db4.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 658 && x <= 705)  //Eb4
				{
					xCoord = 658;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Eb4.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 811 && x <= 858)  //Gb4
				{
					xCoord = 811;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Gb4.wav");
					PlaySound(sound);
					repaint();	
				}	
				
				if(x >= 886 && x <= 933)  //Ab4
				{
					xCoord = 886;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Ab4.wav");
					PlaySound(sound);
					repaint();	
				}
			
				if(x >= 961 && x <= 1008)  //Bb4
				{
					xCoord = 961;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Bb4.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1115 && x <= 1162)  //Db5
				{
					xCoord = 1115;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Db5.wav");
					PlaySound(sound);
					repaint();	
				}
					
				if(x >= 1189 && x <= 1236)  //Eb5
				{
					xCoord = 1189;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Eb5.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1338 && x <= 1385)  //Gb5
				{
					xCoord = 1338;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Gb5.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1416 && x <= 1463)  //Ab5
				{
					xCoord = 1416;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Ab5.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1491 && x <= 1538)  //Bb5
				{
					xCoord = 1491;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("Bb5.wav");
					PlaySound(sound);
					repaint();	
				}
			}
		}
		else
		{
			if(y >= 215 && y <= 348)
			{
				if(x >= 3 && x <= 75)
				{
					xCoord = 3;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("get.wav");
					PlaySound(sound);
					repaint();
				}	
							
				if(x >= 78 && x <= 152)
				{
					xCoord = 78;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("roasted.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 153 && x <= 228)
				{
					xCoord = 153;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("I.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 230 && x <= 305)
				{
					xCoord = 230;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("already.wav");
					PlaySound(sound);
					repaint();
				}
			
				if(x >= 305 && x <= 380)
				{
					xCoord = 305;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("said.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 381 && x <= 454)
				{
					xCoord = 381;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("it.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 456 && x <= 529)
				{
					xCoord = 456;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("four.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 531 && x <= 606)
				{
					xCoord = 531;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("tea.wav");
					PlaySound(sound);
					repaint();
				}
				
				if(x >= 608 && x <= 682)
				{
					xCoord = 608;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("times.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 684 && x <= 758)
				{
					xCoord = 684;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("stop.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 759 && x <= 833)
				{
					xCoord = 759;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("playing.wav");
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 835 && x <= 909)
				{
					xCoord = 835;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("games.wav");	
					PlaySound(sound);
					repaint();
				}
		
				if(x >= 911 && x <= 984)
				{
					xCoord = 911;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("dab.wav");
					PlaySound(sound);
					repaint();	
				}		
		
				if(x >= 986 && x <= 1059)
				{
					xCoord = 986;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("on.wav");
					PlaySound(sound);
					repaint();	
				}
			
				if(x >= 1062 && x <= 1135)
				{
					xCoord = 1062;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("the.wav");
					PlaySound(sound);	
					repaint();	
				}	
	
				if(x >= 1138 && x <= 1212)
				{
					xCoord = 1138;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("haters.wav");
					PlaySound(sound);
					repaint();	
				}
	
				if(x >= 1214 && x <= 1288)
				{
					xCoord = 1214;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("I.wav");
					PlaySound(sound);
					repaint();	
				}	
			
				if(x >= 1289 && x <= 1362)
				{
					xCoord = 1289;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("love.wav");
					PlaySound(sound);
					repaint();	
				}	
								
				if(x >= 1364 && x <= 1440)
				{
					xCoord = 1364;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("texas.wav");
					PlaySound(sound);
					repaint();	
				}	
							
				if(x >= 1442 && x <= 1514)
				{
					xCoord = 1442;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("longhorns.wav");
					PlaySound(sound);
					repaint();	
				}	
					
				if(x >= 1517 && x <= 1593)
				{
					xCoord = 1517;
					yCoord = 215;
					addX = 75;
					addY = 133;
					sound = new File("alabama.wav");
					PlaySound(sound);
					repaint();	
				}
			}
			else if(y <= 214)
			{
				if(x >= 55 && x <= 102)
				{
					xCoord = 55;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("fort.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 130 && x <= 177)
				{
					xCoord = 130;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("night.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 280 && x <= 327)
				{
					xCoord = 280;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("mother.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 355 && x <= 402)
				{
					xCoord = 355;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("beep.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 432 && x <= 479)
				{
					xCoord = 432;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("oof.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 584 && x <= 631)
				{
					xCoord = 584;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("welcome.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 658 && x <= 705)
				{
					xCoord = 658;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("to.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 811 && x <= 858)
				{
					xCoord = 811;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("gardner.wav");
					PlaySound(sound);
					repaint();	
				}	
				
				if(x >= 886 && x <= 933)
				{
					xCoord = 886;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("mode.wav");
					PlaySound(sound);
					repaint();	
				}
			
				if(x >= 961 && x <= 1008)
				{
					xCoord = 961;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("do.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1115 && x <= 1162)
				{
					xCoord = 1115;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("you.wav");
					PlaySound(sound);
					repaint();	
				}
					
				if(x >= 1189 && x <= 1236)
				{
					xCoord = 1189;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("wanna.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1338 && x <= 1385)
				{
					xCoord = 1338;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("build.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1416 && x <= 1463)
				{
					xCoord = 1416;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("a.wav");
					PlaySound(sound);
					repaint();	
				}
				
				if(x >= 1491 && x <= 1538)
				{
					xCoord = 1491;
					yCoord = 0;
					addX = 47;
					addY = 214;
					sound = new File("snowman.wav");
					PlaySound(sound);
					repaint();	
				}
			}
		}
			
		return true;
		
	}
}