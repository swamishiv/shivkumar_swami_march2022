
// Assighnment 06


class PersonDemo
{
   String name;
   Integer age;
   String pan;
   String gender;
   Long aadhar;
   String city;
   String state;
   Integer pincode;
   
   public PersonDemo( String name, Integer age, String pan, String gender,
                     Long aadhar, String city, String state, Integer pincode)
					  {
						  this.name=name; this.age=age; this.pan=pan; this.gender=gender;
						  this.aadhar=aadhar; this.city=city; this.state=state; this.pincode=pincode;
						  
					  }
					  
	@Override
	public String toString()
	{
		return  this.name+" "+this.age+" "+this.pan+" "+this.gender+" "+this.aadhar+" "+this.city+" "+this.state+" "+this.pincode;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o instanceof PersonDemo)
		{   PersonDemo temp = (PersonDemo)o;
			if(this.name.equals(temp.name)&&this.age.equals(temp.age)&&this.pan.equals(temp.pan)&&this.gender.equals(temp.gender)
				&& this.aadhar.equals(temp.aadhar)&& this.city.equals(temp.city)&& this.state.equals(temp.state)&&
			this.pincode.equals(temp.pincode))
			{
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int num = 17;
		num = num + num*this.name.hashCode();
		num = num + num*this.age.hashCode();
		num = num + num*this.pan.hashCode();
		num = num + num*this.gender.hashCode();
		num = num + num*this.aadhar.hashCode();
		num = num + num*this.city.hashCode();
		num = num + num*this.state.hashCode();
		num = num + num*this.pincode.hashCode();
		
		return num;
	}
	
	
   public static void main(String args[])
   {
	   PersonDemo p1 = new PersonDemo("SHIV",26,"IBKPS3022H","Male",123456781234L,"Udgir","MH",413517);
	   PersonDemo p2 = new PersonDemo("SHIV",26,"IBKPS3022H","Male",123456781234L,"Udgir","MH",413517);
	   PersonDemo p3 = new PersonDemo("SHIVKUMAR",26,"IBKPS4521H","Male",432187654321L,"Latur","MH",413521);
	   
	   System.out.println(p1);
	   System.out.println(p2);
	   System.out.println(p3);
	   
	   System.out.println(p1.equals(p2));
	   System.out.println(p2.equals(p3));
	  
	   System.out.println(p1.hashCode());
	   System.out.println(p2.hashCode());
	   System.out.println(p3.hashCode());
	   
	   
   }
}