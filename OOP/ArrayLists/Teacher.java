public class Teacher extends Person
{
    private int school;
    private boolean eeSupervisor;
    private boolean ppSupervisor;
    
    public Teacher(int id, String name, String phone)
    {
        super.setID(id);
        super.setName(name);
        super.setPhone(phone);
        this.school = 0;
        this.eeSupervisor = false;
        this.ppSupervisor = false;
    }

    public Teacher(int id, String name, String phone,
            int school, char ee, char pp)
    {
        super.setID(id);
        super.setName(name);
        super.setPhone(phone);
        this.setSchool(school);
        this.setEESupervisor(ee);
        this.setPPSupervisor(pp);
    }

	public int getID()
	{	return super.getID();
	}

	public void setID(int id)
	{	super.setID(id);
	}

	public String getName()
	{	return super.getName();
	}

	public void setName(String name)
	{	super.setName(name);
	}

	public String getPhone()
	{	return super.getPhone();
	}

	public void setPhone(String phone)
	{	super.setPhone(phone);
	}
	
    public String getSchool()
    {	String s = "";
		switch(this.school)
		{	case 1: s = "Kindy"; break;
			case 2: s = "ES"; break;
			case 3: s = "MS"; break;
			case 4: s = "HS"; break;
			default:s = "unassigned"; break;
		}
		return s;
    }

    public int getSchoolCode()
    {	return this.school;
    }

    public void setSchool(int school)
    {	
        this.school = school;
    }
    
    public boolean isEESupervisor()
    {	return eeSupervisor;
    }

    public String getEESupervisor()
    {	if( this.eeSupervisor )
		{	return "Yes";
		}
		return "No";
    }

    public void setEESupervisor(char eeSupervisor)
    {	eeSupervisor = Character.toLowerCase(eeSupervisor);
		boolean ee = false;
		if( eeSupervisor == 'y' )
		{	ee = true;
		}
		this.eeSupervisor = ee;
    }

    public boolean isPPSupervisor()
    {	return ppSupervisor;
    }

    public String getPPSupervisor()
    {	if( this.ppSupervisor )
		{	return "Yes";
		}
		return "No";
    }
    public void setPPSupervisor(char ppSupervisor)
    {	ppSupervisor = Character.toLowerCase(ppSupervisor);
		boolean pp = false;
		if( ppSupervisor == 'y' )
		{	pp = true;
		}
		this.ppSupervisor = pp;
    }

	public String toString()
	{	String output = "Teacher ID    : " + this.getID();
		output = output + "\nTeacher name  : " + this.getName();
		output = output + "\nPhone number  : " + this.getPhone();
		output = output + "\nSchool        : " + this.getSchool();
		output = output + "\nSupervising EE: " + this.getEESupervisor();
		output = output + "\nSupervising PP: " + this.getPPSupervisor();
		output = output + "\n";
		return output;
	}
    
}
