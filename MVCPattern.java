class MVCPattern  
{ 
    public static void main(String[] args)  
    { 
        Employee model  = retriveEmployeeFromDatabase(); 
  
        EmployeeView view = new EmployeeView(); 
  
        EmployeeController controller = new EmployeeController(model, view); 
  
        controller.updateView(); 
  
        controller.setEmployeeName("Vikram Sharma"); 
  
        controller.updateView(); 
    } 
  
    private static Employee retriveEmployeeFromDatabase() 
    { 
        Employee employee = new Employee(); 
        employee.setEmployeeID("0122SC"); 
        employee.setFirstName("savan"); 
		employee.setLastName("danish"); 
		employee.setGender("Male"); 
		employee.setHireDate("12/4/2000"); 
		employee.setSalary(20000); 
        return employee; 
    } 
      
} 