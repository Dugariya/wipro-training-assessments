class Person {
	
    protected String name;

    Person(String name){
      this.name=name;

    }

    public String getName(){
    	return name;
    }
 //   @Override
   public String toString(){

    	   return "Person [name ="+name+"]";
    	    }


	
}