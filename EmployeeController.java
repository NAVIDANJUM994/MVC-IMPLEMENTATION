class EmployeeController  
{ 
    private Employee model; 
    private EmployeeView view; 
  
    public EmployeeController(Employee model, EmployeetView view) 
    { 
        this.model = model; 
        this.view = view; 
    } 
  
  
    public void setEmployeeID(String EmployeeID) 
    { 
        model.setEmployeeID(EmployeeID);         
    } 
  
    public String getEmployeeID() 
    { 
        return model.getEmployeeID();         
    } 
  
  
    public void setEmployeeFirstName(String Firstname) 
    { 
        model.setFirstName(Firstname);         
    } 
  
    public String getEmployeeName() 
    { 
        return model.getFirstName();         
    } 
  
  
    public void setEmployeeLastName(String Lastname) 
    { 
        model.setLastName(Lastname);         
    } 
  
    public String getEmployeeLastName() 
    { 
        return model.getLastName();         
    } 
  
   
    public void setEmployeeGender(String Gender) 
    { 
        model.setRollNo(Gender);         
    } 
  
    public String getEmployeeGender() 
    { 
        return model.getGender();         
    } 
	
	
	public void setEmployeeHigherDate(String HireDate) 
    { 
        model.setHireDate(HireDate);         
    } 
  
    public String getEmployeeHigherDate() 
    { 
        return model.getHigherDate();         
    } 
	
	
	public void setEmployeeSalary(String Salary) 
    { 
        model.setSalary(Salary);         
    } 
  
    public String getEmployeeSalary() 
    { 
        return model.getSalary();         
    } 
  
    public void updateView() 
    {                 
        view.printEmployeeDetails(model.getEmployeeID(), model.getFirstName(), model.getFirstName(), model.getLastName(), model.getGender(), model.getHigherDate(),model.getSalary()); 
    }     
} 
  