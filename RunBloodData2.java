import java.util.*;
public class RunBloodData2
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    BloodData BlodTyp = new BloodData ();
    
         System.out.print ("Enter the BloodType: ");
            String bdtype = in.nextLine ().toUpperCase();
             BlodTyp.setBloodData (bdtype);
         System.out.print ("Enter the Rhfactor: ");
            String rhfact = in.nextLine ();
             BlodTyp.setRhFactor (rhfact);
             
    if ("".equals (bdtype) || "".equals (rhfact))
      {
	BloodData bd = new BloodData ();
	  bd.display ();
      }
    else
      {
	BlodTyp.display ();
      }
  }
}

class BloodData
{
  private String BloodType;
  private String rhFactor;
  public BloodData ()
  {
    BloodType = "O";
    rhFactor = "+";
  }


  public void setBloodData (String Bt)
  {
    this.BloodType = Bt;
  }
  public void setRhFactor (String Rf)
  {
    this.rhFactor = Rf;
  }
  public String getBloodData ()
  {
    return BloodType;
  }
  public String getRhFactor ()
  {
    return rhFactor;
  }
  public void display ()
  {
    System.out.println (BloodType + rhFactor + " " + "is added to the blood bank.");
  }
}

